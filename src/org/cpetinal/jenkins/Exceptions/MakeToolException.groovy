package org.cpetinal.jenkins.Exceptions

/**
 * The specific MakeToolException. This class manage the Exception
 * Caused by the MakeTool Class
 *
 * @Autor cpetinal
 */
class MakeToolException extends Exception{

    /** This field represent the task that causes the exception*/
    String task

    /**
    * This is the MakeToolException Constructor
    * @param msg
    * @param task
    */
    MakeToolException (msg, task){
        super(msg)
        this.task = task
    }
}
