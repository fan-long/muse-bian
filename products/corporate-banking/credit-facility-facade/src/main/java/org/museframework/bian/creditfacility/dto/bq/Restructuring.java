/*The product features/services available with a financical facility*/
package org.museframework.bian.creditfacility.dto.bq;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto
public class Restructuring {
    /*Description of the restructuring required*/
    @MetaField(0)
    private String restructuringTask;

    /*Definition of issue to resolve and the restructuring solution with associated changes to the credit facility terms and the assessed impact*/
    @MetaField(0)
    private String restructuringEvaluation;

    /*Calculated loss/costs of restructuring the credit facility*/
    @MetaField(0)
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