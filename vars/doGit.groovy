import groovy.transform.Field
import org.cpetinal.jenkins.controllers.AgentController
import org.cpetinal.jenkins.controllers.DoBuildController
import org.cpetinal.jenkins.controllers.DoGitController

@Field
AgentController agentController = new AgentController()

@Field
DoGitController gitController = new DoGitController()

def call(String credentials, String repoLocation) {

    agentController.init(this)
    gitController.init(this)
    node{
        stage(gitController.STAGE_NAME) {
            node(agentController.getAgent()) {
                timeout(agentController.timeOut()) {
                    echo "starting git Stage"
                    gitController.cloneproject(credentials,repoLocation)
                }
            }
        }
    }
}
