package org.cpetinal.jenkins.tools

import org.cpetinal.jenkins.Exceptions.MakeToolException

class MakeTool {

    final String BUILD_COMMAND = "make compile"

    def pipelineContext

    MakeTool(def pipelineContext){
        this.pipelineContext = pipelineContext
    }

    void build(){
        this.pipelineContext.sh (BUILD_COMMAND)
    }

    void ut(){
        //TODO: create a make UT call
        //dummy exception to emulate UT fail
        new MakeToolException("there are test error review it", "UT")
    }
}
