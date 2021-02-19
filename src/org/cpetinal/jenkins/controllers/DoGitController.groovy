package org.cpetinal.jenkins.controllers

import org.cpetinal.jenkins.tools.GitTool

class DoGitController {

    final String STAGE_NAME = "git"

    def pipelineContext

    GitTool gitTools

    DoGitController(){

    }

    void init (def pipelineContext){
        this.pipelineContext = pipelineContext
        this.gitTools = new GitTool(this.pipelineContext)
    }

    void cloneproject (String credentials, String repoLocation){
        this.gitTools.gitClone(credentials, repoLocation, this.pipelineContext.env.BRANCH_NAME)
    }

}
