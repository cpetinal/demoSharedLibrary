package org.cpetinal.jenkins.controllers

import org.cpetinal.jenkins.Exceptions.MakeToolException
import org.cpetinal.jenkins.tools.MakeTool

/**
 * This is the DoUTController script
 * @author cpetinal
 */
class DoUTController {

    /** The Stage Name Contant */
    final String STAGE_NAME = "doUT"

    /** The Jenkins pipeline Context*/
    def pipelineContext

    /** The makeTool Variable */
    MakeTool makeTool = new MakeTool()

    /** The doUTController */
    DoUTController (){

    }

    /**
     * This method inicialice the DoUTController Pipeline context and tools
     * @param pipelineContext
     */
    void init (def pipelineContext){
        this.pipelineContext = pipelineContext
    }

    /**
     * The task to execute the unit Test
     */
    void executeUT (){
        try {
            this.makeTool.ut()
        }catch (MakeToolException ex){
            if (ex.task.equals("UT")){
                this.pipelineContext.echo ("Warning Yoy need pass to production deployment")
                this.pipelineContext.currentBuild.result = 'UNSTABLE'
            }
        }
    }
}
