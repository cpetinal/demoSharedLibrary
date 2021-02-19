package org.cpetinal.jenkins.controllers

import org.cpetinal.jenkins.tools.GitTools

class DoGitController {

    final String STAGE_NAME = "git"

    def pipelineContext

    GitTools gitTools

    DoGitController(){

    }

    void init (def pipelineContext){
        this.pipelineContext = pipelineContext
        this.gitTools = new GitTools(this.pipelineContext)
    }

    void cloneproject (String credentials, String repoLocation){
        this.gitTools.gitClone(credentials, repoLocation)
    }

}
