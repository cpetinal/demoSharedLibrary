package org.cpetinal.jenkins.tools

class GitTools {

    def pipelineContext

    GitTools(def pipelineContext){
        this.pipelineContext = pipelineContext
    }

    void gitClone(String credentials, String repoLocation){
        this.pipelineContext.git(branch: "develop" , credentialsId: 'token2', url: 'https://github.com/cpetinal/CoolGame.git')
    }
}
