package org.cpetinal.jenkins.Exceptions

class MakeToolException extends Exception{

    String task

    MakeToolException (msg, task){
        super(msg)
        this.task = task
    }
}
