#!groovy
import groovy.transform.Field
import org.cpetinal.jenkins.controllers.AgentController
import org.cpetinal.jenkins.controllers.DoPublishController
import org.cpetinal.jenkins.controllers.DoUTController

@Field
AgentController agentController = new AgentController()

@Field
DoPublishController publishController = new DoPublishController()

def call(String artifact) {

    agentController.init(this)
    publishController.init(this)
    stage(publishController.STAGE_NAME) {
        node("master") {
            timeout(agentController.timeOut()) {
                echo "starting publish"
                publishController.publish(artifact)
            }
        }
    }
}
