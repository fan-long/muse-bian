/*Complete work tasks following a defined procedure in support of general office activities and product and service delivery within Session Dialogue. */
package org.museframework.bian.sessiondialogue.dto.cr;

public class CustomerContactSessionProcedure extends org.museframework.bian.classes.CustomerContactSessionProcedure {
    /*Reference to the customer (can be extracted from Contact Record or provided by customer)*/
    private org.museframework.bian.classes.Object customerReference;

    /*Reference to the servicing agent*/
    private org.museframework.bian.classes.Object employeeReference;

    /*Reference to the servicing location/desk for assisted customer exchanges*/
    private org.museframework.bian.classes.Object servicingPositionReference;

    /*The type of channel device involved in the session exchange (e.g. web, phone, chat, video, VOIP, face to face at a branch - note there can be concurrent sessions within a single customer contact)*/
    private String sessionMechanism;

    /*The start and duration of the dialogue*/
    private String sessionStartEndTime;

    /*The session dialogue log of actions is returned to SD-Contact Handler and added to the contact record*/
    private String sessionDialogueRecord;

    /*The general type of customer exchange (e.g. verified customer, anonymous contact, topic - used to structure/script dialogue)*/
    private String sessionDialogueType;

    /*In cases a prompt or script can provided to structure the interaction for self-service and assisted interactions*/
    private String sessionDialogueScript;

    /*Reference to a dialogue log that is built up*/
    private org.museframework.bian.classes.Object sessionDialogueLogReference;

    /*The dialogue log, used for training and root cause analysis etc.  (e.g. click-stream, video/audio recording)*/
    private String sessionDialogueLog;

    /*The outcome of the dialogue (e.g. customer satisfied, on-ward routing, hang-up)*/
    private String sessionDialogueResult;

    public void setCustomerReference(org.museframework.bian.classes.Object customerReference) {
        this.customerReference = customerReference;
    }

    public org.museframework.bian.classes.Object getCustomerReference() {
        return customerReference;
    }

    public void setEmployeeReference(org.museframework.bian.classes.Object employeeReference) {
        this.employeeReference = employeeReference;
    }

    public org.museframework.bian.classes.Object getEmployeeReference() {
        return employeeReference;
    }

    public void setServicingPositionReference(org.museframework.bian.classes.Object servicingPositionReference) {
        this.servicingPositionReference = servicingPositionReference;
    }

    public org.museframework.bian.classes.Object getServicingPositionReference() {
        return servicingPositionReference;
    }

    public void setSessionMechanism(String sessionMechanism) {
        this.sessionMechanism = sessionMechanism;
    }

    public String getSessionMechanism() {
        return sessionMechanism;
    }

    public void setSessionStartEndTime(String sessionStartEndTime) {
        this.sessionStartEndTime = sessionStartEndTime;
    }

    public String getSessionStartEndTime() {
        return sessionStartEndTime;
    }

    public void setSessionDialogueRecord(String sessionDialogueRecord) {
        this.sessionDialogueRecord = sessionDialogueRecord;
    }

    public String getSessionDialogueRecord() {
        return sessionDialogueRecord;
    }

    public void setSessionDialogueType(String sessionDialogueType) {
        this.sessionDialogueType = sessionDialogueType;
    }

    public String getSessionDialogueType() {
        return sessionDialogueType;
    }

    public void setSessionDialogueScript(String sessionDialogueScript) {
        this.sessionDialogueScript = sessionDialogueScript;
    }

    public String getSessionDialogueScript() {
        return sessionDialogueScript;
    }

    public void setSessionDialogueLogReference(org.museframework.bian.classes.Object sessionDialogueLogReference) {
        this.sessionDialogueLogReference = sessionDialogueLogReference;
    }

    public org.museframework.bian.classes.Object getSessionDialogueLogReference() {
        return sessionDialogueLogReference;
    }

    public void setSessionDialogueLog(String sessionDialogueLog) {
        this.sessionDialogueLog = sessionDialogueLog;
    }

    public String getSessionDialogueLog() {
        return sessionDialogueLog;
    }

    public void setSessionDialogueResult(String sessionDialogueResult) {
        this.sessionDialogueResult = sessionDialogueResult;
    }

    public String getSessionDialogueResult() {
        return sessionDialogueResult;
    }
}