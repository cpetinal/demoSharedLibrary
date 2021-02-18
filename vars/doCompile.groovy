#!groovy
import groovy.transform.Field

@Field
String STAGE_NAME="compile"

def call(def map = [:]) {

    stage(STAGE_NAME) {
        node("master") {
            timeout(agentController.timeOut) {
                echo "compile"
            }
        }
    }
}