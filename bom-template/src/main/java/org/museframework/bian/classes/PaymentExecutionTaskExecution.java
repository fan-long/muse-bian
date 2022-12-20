/**/
package org.museframework.bian.classes;

public class PaymentExecutionTaskExecution {
    /*phase in the execution of a task, 

starting with "requested and ending with "completed" or "failed"*/
    private String taskExecutionStatus;

    public void setTaskExecutionStatus(String taskExecutionStatus) {
        this.taskExecutionStatus = taskExecutionStatus;
    }

    public String getTaskExecutionStatus() {
        return taskExecutionStatus;
    }
}