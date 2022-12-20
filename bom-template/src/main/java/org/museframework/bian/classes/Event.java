/*Something that happens, has happened, can happen or is planned to happen.*/
package org.museframework.bian.classes;

public class Event {
    /**/
    private String eventType;

    /**/
    private String eventDateTime;

    /**/
    private String eventDescription;

    /**/
    private String eventSource;

    /**/
    private String eventLocation;

    /**/
    private String eventAction;

    /**/
    private String eventStatus;

    /**/
    private String eventValue;

    /**/
    private String eventValidityPeriod;

    /**/
    private String eventIdentification;

    public void setEventType(String eventType) {
        this.eventType = eventType;
    }

    public String getEventType() {
        return eventType;
    }

    public void setEventDateTime(String eventDateTime) {
        this.eventDateTime = eventDateTime;
    }

    public String getEventDateTime() {
        return eventDateTime;
    }

    public void setEventDescription(String eventDescription) {
        this.eventDescription = eventDescription;
    }

    public String getEventDescription() {
        return eventDescription;
    }

    public void setEventSource(String eventSource) {
        this.eventSource = eventSource;
    }

    public String getEventSource() {
        return eventSource;
    }

    public void setEventLocation(String eventLocation) {
        this.eventLocation = eventLocation;
    }

    public String getEventLocation() {
        return eventLocation;
    }

    public void setEventAction(String eventAction) {
        this.eventAction = eventAction;
    }

    public String getEventAction() {
        return eventAction;
    }

    public void setEventStatus(String eventStatus) {
        this.eventStatus = eventStatus;
    }

    public String getEventStatus() {
        return eventStatus;
    }

    public void setEventValue(String eventValue) {
        this.eventValue = eventValue;
    }

    public String getEventValue() {
        return eventValue;
    }

    public void setEventValidityPeriod(String eventValidityPeriod) {
        this.eventValidityPeriod = eventValidityPeriod;
    }

    public String getEventValidityPeriod() {
        return eventValidityPeriod;
    }

    public void setEventIdentification(String eventIdentification) {
        this.eventIdentification = eventIdentification;
    }

    public String getEventIdentification() {
        return eventIdentification;
    }
}