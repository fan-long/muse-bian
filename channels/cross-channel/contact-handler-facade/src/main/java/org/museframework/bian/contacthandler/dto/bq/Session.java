/*The collection of operational serivces/functions offered by the operational facility

Examples: messages, capture, routines*/
package org.museframework.bian.contacthandler.dto.bq;

public class Session extends org.museframework.bian.classes.Session {
    /*The task updates the contact record activity record fields and handles the interaction with the Contact Dialogue service domain to initiate the servicing session*/
    private String sessionTaskRecord;

    /*An indicator of how the session was concluded (e.g. customer completed, hang-up, further servicing required)*/
    private String sessionResult;

    public void setSessionTaskRecord(String sessionTaskRecord) {
        this.sessionTaskRecord = sessionTaskRecord;
    }

    public String getSessionTaskRecord() {
        return sessionTaskRecord;
    }

    public void setSessionResult(String sessionResult) {
        this.sessionResult = sessionResult;
    }

    public String getSessionResult() {
        return sessionResult;
    }
}