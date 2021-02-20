package org.cpetinal.jenkins.controllers

import org.cpetinal.jenkins.tools.JenkinsTool
import org.cpetinal.jenkins.tools.MakeTool

/**
 * This is the doBuildController script
 * @author cpetinal
 */
class DoBuildController {

    /** The Stage name */
    final String STAGE_NAME = "Build"

    /** The makeTool variable */
    MakeTool makeTool

    /** The JenkinsTool variable */
    JenkinsTool jenkinsTool

    /** The Jenkins pipeline Context*/
    def pipelineContext

    /** doBuildController constructor */
    DoBuildController(){

    }

    /**
     * This method inicialice the DoBuildController Pipeline context and tools
     * @param pipelineContext
     */
    void init(def pipelineContext){
        this.pipelineContext = pipelineContext
        this.makeTool = new MakeTool(this.pipelineContext)
        this.jenkinsTool = new JenkinsTool(this.pipelineContext)

    }

    /**
     * This method build and publish the artifact
     * @param artifactName: This is the artifact relative path from Jenkins workspace folder
     * to publish
     *
     */
    void build(String artifactName){
        this.makeTool.build()
        this.publish(artifactName)
    }

    /**
     * This is the private publish method
     * @param artifact
     */
    private void publish(String artifact){
        this.jenkinsTool.archiveArtifact(artifact)
    }

}
