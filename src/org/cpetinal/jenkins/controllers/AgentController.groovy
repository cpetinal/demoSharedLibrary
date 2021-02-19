package org.cpetinal.jenkins.controllers

class AgentController {

    def pipelineContext

    AgentController (def pipelineContext){
        this.pipelineContext = pipelineContext
    }

    getAgent(){
        return "master"
    }

    getTimeOut(){
        if (this.pipelineContext.env.BRANCH_NAME == 'develop') {
            return 10
        } else{
            return 5
        }
    }

}
