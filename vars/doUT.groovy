#!groovy
import groovy.transform.Field

@Field
String STAGE_NAME="Unit Test"

def call(def map = [:]) {

    stage(STAGE_NAME) {
        node("master") {
            timeout(agentController.timeOut) {
                echo "Unit Test"
            }
        }
    }
}