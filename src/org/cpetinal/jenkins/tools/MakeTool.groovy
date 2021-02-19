package org.cpetinal.jenkins.tools

import org.cpetinal.jenkins.Exceptions.MakeToolException

class MakeTool {

    final String BUILD_COMMAND = "make compile"

    def pipelineContext

    MakeTool(def pipelineContext){
        this.pipelineContext = pipelineContext
    }

    build(){
        this.pipelineContext.sh (BUILD_COMMAND)
    }
}
