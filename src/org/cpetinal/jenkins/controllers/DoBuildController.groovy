package org.cpetinal.jenkins.controllers

import org.cpetinal.jenkins.tools.MakeTool

class DoBuildController {

    final String STAGE_NAME = "Build"

    MakeTool makeTool

    def pipelineContext

    DoBuildController(){

    }

    void init(def pipelineContext){
        this.pipelineContext = pipelineContext
        this.makeTool = new MakeTool(this.pipelineContext)

    }

    void build(){
        makeTool.build()
    }

}
