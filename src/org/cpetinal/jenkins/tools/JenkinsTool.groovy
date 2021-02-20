package org.cpetinal.jenkins.tools

/**
 * This is the Jenkins Tool to make all operation with Jenkins environment
 */
class JenkinsTool {

    /** The Jenkins pipeline Context*/
    def pipelineContext

    /** This is the Jenkins Tool Constructor */
    JenkinsTool(def pipelineContext){
        this.pipelineContext = pipelineContext
    }

    /** This is the Jenkins ArchiveArtifact operation */
    void archiveArtifact(String artifact){
        this.pipelineContext.archiveArtifacts (artifacts: "${artifact}", fingerprint: true)
    }
}
