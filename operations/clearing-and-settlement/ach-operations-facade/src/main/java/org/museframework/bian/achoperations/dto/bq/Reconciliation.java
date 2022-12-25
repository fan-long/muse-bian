/*The collection of operational serivces/functions offered by the operational facility

Examples: messages, capture, routines*/
package org.museframework.bian.achoperations.dto.bq;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto
public class Reconciliation {
    /*Details of the reconciliation resolution*/
    @MetaField(0)
    private String ACHReconciliationTaskResult;

    public void setACHReconciliationTaskResult(String ACHReconciliationTaskResult) {
        this.ACHReconciliationTaskResult = ACHReconciliationTaskResult;
    }

    public String getACHReconciliationTaskResult() {
        return ACHReconciliationTaskResult;
    }
}