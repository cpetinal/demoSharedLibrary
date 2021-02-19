package org.cpetinal.jenkins.tools

class GitTool {

    def pipelineContext

    GitTool(def pipelineContext){
        this.pipelineContext = pipelineContext
    }

    void gitClone(String credentials, String repoLocation, def branch = "master"){
        this.pipelineContext.git(branch: "${branch}" , credentialsId: "${credentials}", url: "${repoLocation}")
    }
}
