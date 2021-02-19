package org.cpetinal.jenkins.controllers

import org.cpetinal.jenkins.tools.JenkinsTool

class DoPublishController {

    final String STAGE_NAME = "publish"

    def pipelineContext

    JenkinsTool jenkinsTool

    DoPublishController(){

    }

    void init(def pipelineContext){
        this.pipelineContext = pipelineContext
        this.jenkinsTool = new JenkinsTool(pipelineContext)
    }

    void publish(String artifact){
        this.jenkinsTool.archiveArtifact(artifact)
    }

}
