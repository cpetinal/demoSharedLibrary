package org.cpetinal.jenkins.tools

class GitTools {

    def pipelineContext

    GitTools(def pipelineContext){
        this.pipelineContext = pipelineContext
    }

    void gitClone(String credentials, String repoLocation, String branch = "master"){
        this.pipelineContext.git(branch: "${branch}" , credentialsId: "${credentials}", url: "${repoLocation}")
    }
}
