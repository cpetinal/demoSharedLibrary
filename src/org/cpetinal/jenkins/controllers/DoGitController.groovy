package org.cpetinal.jenkins.controllers

import org.cpetinal.jenkins.tools.GitTool

/**
 * This is the DoGitController script
 * @author cpetinal
 */
class DoGitController {

    /** The Stage Name Contant */
    final String STAGE_NAME = "git"

    /** The Jenkins pipeline Context*/
    def pipelineContext

    /** the Git Tools variable */
    GitTool gitTools

    /** The doGitController constructor */
    DoGitController(){

    }

    /**
     * This method inicialice the DoGitController Pipeline context and tools
     * @param pipelineContext
     */
    void init (def pipelineContext){
        this.pipelineContext = pipelineContext
        this.gitTools = new GitTool(this.pipelineContext)
    }

    /**
     * This method manage the git clone operation
     * @param credentials - Jenkins Credentials Id
     * @param repoLocation - Git repo Location
     */
    void cloneproject (String credentials, String repoLocation){
        this.gitTools.gitClone(credentials, repoLocation, this.pipelineContext.env.BRANCH_NAME)
    }

}
