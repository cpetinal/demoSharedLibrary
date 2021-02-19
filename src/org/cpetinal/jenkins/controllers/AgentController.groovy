package org.cpetinal.jenkins.controllers

class AgentController {

    def pipelineContext

    AgentController (){

    }

    void init(def pipelineContext){
        this.pipelineContext = pipelineContext
    }

    String getAgent(){
        return "master"
    }

    def getTimeOut(){
        if (this.pipelineContext.env.BRANCH_NAME == 'develop') {
            return 10
        } else{
            return 5
        }
    }

}
