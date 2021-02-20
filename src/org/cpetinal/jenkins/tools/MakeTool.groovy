package org.cpetinal.jenkins.tools

import org.cpetinal.jenkins.Exceptions.MakeToolException

/**
 * This is the Make Tool Class to do all the make operations
 */
class MakeTool {

    /** This is the constant Make compile operation */
    final String BUILD_COMMAND = "make compile"

    /** The Jenkins pipeline Context*/
    def pipelineContext

    /** This is the MakeTool Constuctor */
    MakeTool(def pipelineContext){
        this.pipelineContext = pipelineContext
    }

    /**
     * This is the make build Operation
     */
    void build(){
        this.pipelineContext.sh (BUILD_COMMAND)
    }

    /**
     * This is the Make ut operation
     * @warning This method is not finished We will emulate the desired Behaviour to
     * Continue with the practice
     */
    void ut(){
        //TODO: create a make UT call
        //dummy exception to emulate UT fail
        throw new MakeToolException("there are test error review it", "UT")
    }
}
