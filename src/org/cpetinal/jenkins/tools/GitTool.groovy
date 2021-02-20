package org.cpetinal.jenkins.tools

/**
 * This is the Git Tool to make global git operations
 * @author cpetinal
 */
class GitTool {

    /** The Jenkins pipeline Context*/
    def pipelineContext

    /**
     * This is the GitTool Constructor
     * @param pipelineContext
     */
    GitTool(def pipelineContext){
        this.pipelineContext = pipelineContext
    }

    /**
     * This is The gitClone operation Method
     * @param credentials - The Jenkins Credentials Id
     * @param repoLocation - The remote repo Location
     * @param branch - The desired Branch to Work by default master
     */
    void gitClone(String credentials, String repoLocation, def branch = "master"){
        this.pipelineContext.git(branch: "${branch}" , credentialsId: "${credentials}", url: "${repoLocation}")
    }
}
