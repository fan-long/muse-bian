/*The product features/services available with a financical facility*/
package org.museframework.bian.creditfacility.dto.bq;

public class Restructuring {
    /*Description of the restructuring required*/
    private String restructuringTask;

    /*Definition of issue to resolve and the restructuring solution with associated changes to the credit facility terms and the assessed impact*/
    private String restructuringEvaluation;

    /*Calculated loss/costs of restructuring the credit facility*/
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