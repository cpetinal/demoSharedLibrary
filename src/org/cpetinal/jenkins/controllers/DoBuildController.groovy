package org.cpetinal.jenkins.controllers

import org.cpetinal.jenkins.tools.JenkinsTool
import org.cpetinal.jenkins.tools.MakeTool

class DoBuildController {

    final String STAGE_NAME = "Build"

    MakeTool makeTool

    JenkinsTool jenkinsTool

    def pipelineContext

    DoBuildController(){

    }

    void init(def pipelineContext){
        this.pipelineContext = pipelineContext
        this.makeTool = new MakeTool(this.pipelineContext)
        this.jenkinsTool = new JenkinsTool(this.pipelineContext)

    }

    void build(String artifactName){
        this.makeTool.build()
        this.publish(artifactName)
    }

    private void publish(String artifact){
        this.jenkinsTool.archiveArtifact(artifact)
    }

}
