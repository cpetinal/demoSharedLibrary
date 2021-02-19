#!groovy
import groovy.transform.Field
import org.cpetinal.jenkins.controllers.AgentController
import org.cpetinal.jenkins.controllers.DoBuildController



@Field
DoBuildController doBuildController = new DoBuildController()

@Field
AgentController agentController = new AgentController()

def call(def map = [:]) {

    doBuildController.init(this)
    stage(doBuildController.STAGE_NAME) {
        node(agentController.getAgent()) {
            timeout(agentController.timeOut()) {
                echo "starting Build Stage"
                doBuildController.build()
            }
        }
    }
}