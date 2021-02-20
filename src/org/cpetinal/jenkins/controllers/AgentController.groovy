package org.cpetinal.jenkins.controllers


/**
 * This Global pipeline controller to manage the agent interaction
 * @author cpetinal
 */
class AgentController {

    /** The Jenkins pipeline Context*/
    def pipelineContext

    /**
     * The agent Controller Constructor
     */
    AgentController (){

    }

    /**
     * This method inicialice the Angent Controller Context
     * @param pipelineContext
     * @autor cpetinal
     */
    void init(def pipelineContext){
        this.pipelineContext = pipelineContext
    }

    /**
     * Get the executed Agent.
     * @return
     */
    String getAgent(){
        return "master"
    }

    /**
     * Get the configured timeOut
     * @return
     */
    def getTimeOut(){
        if (this.pipelineContext.env.BRANCH_NAME == 'develop') {
            return 10
        } else{
            return 5
        }
    }

}
