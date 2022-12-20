/*Task to determine the appropriate collections process to follow - based on status/history of the account - e.g. can be an internal collections function or an external agency. */
package org.museframework.bian.classes;

public class CollectionAssignmentWorkstep {
    /*Details of the assignment decision.*/
    private String assignmentDecision;

    /*Work documentation, forms and schedules produced and referenced during the task.*/
    private String workProduct;

    public void setAssignmentDecision(String assignmentDecision) {
        this.assignmentDecision = assignmentDecision;
    }

    public String getAssignmentDecision() {
        return assignmentDecision;
    }

    public void setWorkProduct(String workProduct) {
        this.workProduct = workProduct;
    }

    public String getWorkProduct() {
        return workProduct;
    }
}