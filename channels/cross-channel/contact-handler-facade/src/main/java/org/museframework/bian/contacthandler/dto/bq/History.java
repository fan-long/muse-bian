/*The collection of operational serivces/functions offered by the operational facility

Examples: messages, capture, routines*/
package org.museframework.bian.contacthandler.dto.bq;

public class History {
    /*The task updates the channel activity history to reflect the contact*/
    private String historyTaskRecord;

    public void setHistoryTaskRecord(String historyTaskRecord) {
        this.historyTaskRecord = historyTaskRecord;
    }

    public String getHistoryTaskRecord() {
        return historyTaskRecord;
    }
}