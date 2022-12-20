/*An event that is happened or will be happened during the assignment session of the a sales specialist support service*/
package org.museframework.bian.classes;

public class SalesSpecialistSupportAssignmentSessionEvent {
    /**/
    private String assignmentSessionEventResult;

    /**/
    private String assignmentSessionEventDateTime;

    /**/
    private String assignmentSessionEventAppliedFee;

    public void setAssignmentSessionEventResult(String assignmentSessionEventResult) {
        this.assignmentSessionEventResult = assignmentSessionEventResult;
    }

    public String getAssignmentSessionEventResult() {
        return assignmentSessionEventResult;
    }

    public void setAssignmentSessionEventDateTime(String assignmentSessionEventDateTime) {
        this.assignmentSessionEventDateTime = assignmentSessionEventDateTime;
    }

    public String getAssignmentSessionEventDateTime() {
        return assignmentSessionEventDateTime;
    }

    public void setAssignmentSessionEventAppliedFee(String assignmentSessionEventAppliedFee) {
        this.assignmentSessionEventAppliedFee = assignmentSessionEventAppliedFee;
    }

    public String getAssignmentSessionEventAppliedFee() {
        return assignmentSessionEventAppliedFee;
    }
}