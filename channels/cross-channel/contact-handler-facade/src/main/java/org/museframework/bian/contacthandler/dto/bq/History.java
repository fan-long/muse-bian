/*The collection of operational serivces/functions offered by the operational facility

Examples: messages, capture, routines*/
package org.museframework.bian.contacthandler.dto.bq;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto
public class History {
    /*The task updates the channel activity history to reflect the contact*/
    @MetaField(0)
    private String historyTaskRecord;

    public void setHistoryTaskRecord(String historyTaskRecord) {
        this.historyTaskRecord = historyTaskRecord;
    }

    public String getHistoryTaskRecord() {
        return historyTaskRecord;
    }
}