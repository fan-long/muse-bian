/*The collection of operational serivces/functions offered by the operational facility

Examples: messages, capture, routines*/
package org.museframework.bian.customerworkbench.dto.bq;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto
public class Contact {
    /*Logged duration of the contact*/
    @MetaField
    private String contactStartEndTime;

    /*Local record of page/service access as appropriate*/
    @MetaField
    private String contactActivityLog;

    public void setContactStartEndTime(String contactStartEndTime) {
        this.contactStartEndTime = contactStartEndTime;
    }

    public String getContactStartEndTime() {
        return contactStartEndTime;
    }

    public void setContactActivityLog(String contactActivityLog) {
        this.contactActivityLog = contactActivityLog;
    }

    public String getContactActivityLog() {
        return contactActivityLog;
    }
}