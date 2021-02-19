package org.cpetinal.jenkins.controllers

import org.cpetinal.jenkins.tools.MakeTool

class DoBuildController {

    final String STAGE_NAME = "Build"

    MakeTool makeTool

    def pipelineContext

    DoBuildController(def pipelineContext){
        this.pipelineContext = pipelineContext
    }

    init(){
        this.makeTool = new MakeTool(this.pipelineContext)
    }

    build(){
        makeTool.build()
    }

}
