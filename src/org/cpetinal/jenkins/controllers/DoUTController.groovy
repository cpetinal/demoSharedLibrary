package org.cpetinal.jenkins.controllers

import org.cpetinal.jenkins.Exceptions.MakeToolException
import org.cpetinal.jenkins.tools.GitTools
import org.cpetinal.jenkins.tools.MakeTool

class DoUTController {

    final String STAGE_NAME = "doUT"

    def pipelineContext

    MakeTool makeTool = new MakeTool()

    DoUTController (){

    }

    void init (def pipelineContext){
        this.pipelineContext = pipelineContext
    }

    void executeUT (){
        try {
            this.makeTool.ut()
        }catch (MakeToolException ex){
            if (ex.task.equals("ut")){
                this.pipelineContext.echo ("Warning Yoy need pass to production deployment")
                this.pipelineContext.currentBuild.result = 'UNSTABLE'
            }
        }
    }
}
