/*A course of action must be followed to execute the procedure. 

Worksteps as Behaviour Qualifier Type: The main worksteps to be followed in the execution of the procedure*/
package org.museframework.bian.classes;

public class Workstep {
    /**/
    private String workstepResult;

    /*A Classification value that distinguishes between the type of workstep undertaken within Procedure*/
    private String workstepType;

    /**/
    private String workstepDescription;

    /**/
    private String workstepDateTime;

    /**/
    private String workstepStatus;

    public void setWorkstepResult(String workstepResult) {
        this.workstepResult = workstepResult;
    }

    public String getWorkstepResult() {
        return workstepResult;
    }

    public void setWorkstepType(String workstepType) {
        this.workstepType = workstepType;
    }

    public String getWorkstepType() {
        return workstepType;
    }

    public void setWorkstepDescription(String workstepDescription) {
        this.workstepDescription = workstepDescription;
    }

    public String getWorkstepDescription() {
        return workstepDescription;
    }

    public void setWorkstepDateTime(String workstepDateTime) {
        this.workstepDateTime = workstepDateTime;
    }

    public String getWorkstepDateTime() {
        return workstepDateTime;
    }

    public void setWorkstepStatus(String workstepStatus) {
        this.workstepStatus = workstepStatus;
    }

    public String getWorkstepStatus() {
        return workstepStatus;
    }
}