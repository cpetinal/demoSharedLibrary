#!groovy
import groovy.transform.Field
import org.cpetinal.jenkins.controllers.AgentController
import org.cpetinal.jenkins.controllers.DoUTController

@Field
AgentController agentController = new AgentController()

@Field
DoUTController utController = new DoUTController()

def call() {

    agentController.init(this)
    utController.init(this)
    stage(utController.STAGE_NAME) {
        node(agentController.getAgent()) {
            timeout(agentController.timeOut()) {
                echo "starting UT"
                utController.executeUT()
            }
        }
    }
}