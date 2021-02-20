package org.cpetinal.jenkins.controllers

import org.cpetinal.jenkins.tools.JenkinsTool

/**
 * This is the DoPublishController script
 * @author cpetinal
 */
class DoPublishController {

    /** The Stage Name Contant */
    final String STAGE_NAME = "publish"

    /** The Jenkins pipeline Context */
    def pipelineContext

    /** This is the Jenkins Tool variable */
    JenkinsTool jenkinsTool

    /** The doPublishController contructor */
    DoPublishController(){

    }

    /**
     * This method inicialice the DoPublishController Pipeline context and tools
     * @param pipelineContext
     */
    void init(def pipelineContext){
        this.pipelineContext = pipelineContext
        this.jenkinsTool = new JenkinsTool(pipelineContext)
    }

    /**
     * This method manage the publish operation
     * @param artifact - Artifact that you want to publish
     */
    void publish(String artifact){
        this.jenkinsTool.archiveArtifact(artifact)
    }

}
