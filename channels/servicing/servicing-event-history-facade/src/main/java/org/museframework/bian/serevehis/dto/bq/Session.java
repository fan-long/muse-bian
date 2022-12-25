/*A collection of the events/transactions recorded by the log

Examples: Customer life event, Servicing event*/
package org.museframework.bian.serevehis.dto.bq;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

//refer to BOClass org.museframework.bian.classes.Session
@MetaDto
public class Session {
    /*The start and duration of the dialogue*/
    @MetaField(0)
    private String sessionStartEndTime;

    /*Reference to the complete contact record for the customer contact*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object customerContactReference;

    /*The type of channel device involved in the session exchange (e.g. web, phone, chat, video, VOIP, face to face at a branch - note there can be concurrent sessions within a single customer contact)*/
    @MetaField(0)
    private String sessionMechanism;

    /*Lists if a specific servicing facility is used during the session)*/
    @MetaField(0)
    private String servicingFacilityType;

    /*The session dialogue log of actions is returned to SD-Contact Handler and added to the contact record*/
    @MetaField(0)
    private String sessionDialogueRecord;

    /*The general type of customer exchange (e.g. verified customer, anonymous contact, topic - used to structure/script dialogue)*/
    @MetaField(0)
    private String sessionDialogueType;

    /*In cases a prompt or script can provided to structure the interaction for self-service and assisted interactions*/
    @MetaField(0)
    private String sessionDialogueScript;

    /*Reference to a dialogue log that is built up*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object sessionDialogueLogReference;

    /*The dialogue log, used for training and root cause analysis etc.  (e.g. click-stream, video/audio recording)*/
    @MetaField(0)
    private String sessionDialogueLog;

    /*The outcome of the dialogue (e.g. customer satisfied, on-ward routing, hang-up)*/
    @MetaField(0)
    private String sessionDialogueResult;

    public void setSessionStartEndTime(String sessionStartEndTime) {
        this.sessionStartEndTime = sessionStartEndTime;
    }

    public String getSessionStartEndTime() {
        return sessionStartEndTime;
    }

    public void setCustomerContactReference(org.museframework.bian.classes.Object customerContactReference) {
        this.customerContactReference = customerContactReference;
    }

    public org.museframework.bian.classes.Object getCustomerContactReference() {
        return customerContactReference;
    }

    public void setSessionMechanism(String sessionMechanism) {
        this.sessionMechanism = sessionMechanism;
    }

    public String getSessionMechanism() {
        return sessionMechanism;
    }

    public void setServicingFacilityType(String servicingFacilityType) {
        this.servicingFacilityType = servicingFacilityType;
    }

    public String getServicingFacilityType() {
        return servicingFacilityType;
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