/**/
package org.museframework.bian.loan.dto.bq;

public class Restructuring {
    /*Description of the restructuring required*/
    private String restructuringTask;

    /*Definition of issue to resolve and the restructuring solution with associated changes to loan terms and the assessed impact*/
    private String restructuringEvaluation;

    /*Calculated loss/costs of restructuring*/
    private String restructuringWriteDown;

    public void setRestructuringTask(String restructuringTask) {
        this.restructuringTask = restructuringTask;
    }

    public String getRestructuringTask() {
        return restructuringTask;
    }

    public void setRestructuringEvaluation(String restructuringEvaluation) {
        this.restructuringEvaluation = restructuringEvaluation;
    }

    public String getRestructuringEvaluation() {
        return restructuringEvaluation;
    }

    public void setRestructuringWriteDown(String restructuringWriteDown) {
        this.restructuringWriteDown = restructuringWriteDown;
    }

    public String getRestructuringWriteDown() {
        return restructuringWriteDown;
    }
}