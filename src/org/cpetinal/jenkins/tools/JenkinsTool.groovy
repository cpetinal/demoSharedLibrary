package org.cpetinal.jenkins.tools

class JenkinsTool {

    def pipelineContext

    JenkinsTool(def pipelineContext){
        this.pipelineContext = pipelineContext
    }

    void archiveArtifact(String artifact){
        this.pipelineContext.archiveArtifacts (artifacts: "${artifact}", fingerprint: true)
    }
}
