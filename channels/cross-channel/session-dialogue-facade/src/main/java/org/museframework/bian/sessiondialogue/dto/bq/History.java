/*The main worsteps to be followed in th eexecution of the procedure

Examples: Invoice generation*/
package org.museframework.bian.sessiondialogue.dto.bq;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto
public class History {
    /*Confirmation that the contact session is captured*/
    @MetaField
    private String historyTaskResult;

    public void setHistoryTaskResult(String historyTaskResult) {
        this.historyTaskResult = historyTaskResult;
    }

    public String getHistoryTaskResult() {
        return historyTaskResult;
    }
}