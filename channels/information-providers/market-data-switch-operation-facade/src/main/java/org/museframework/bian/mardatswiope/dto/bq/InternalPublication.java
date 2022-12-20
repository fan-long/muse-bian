/*The collection of operational serivces/functions offered by the operational facility

Examples: messages, capture, routines*/
package org.museframework.bian.mardatswiope.dto.bq;

public class InternalPublication {
    /*Reference to internal sources of published information (e.g. bank rates)*/
    private org.museframework.bian.classes.Object internalInformationFeedServiceReference;

    /*Defines the range of internally published information services/pages*/
    private String internalInformationFeedServiceProfile;

    /*Reference to 'live' internal pages of information that is published*/
    private org.museframework.bian.classes.Object internalInformationFeedServiceRecordReference;

    /*This is the internally generated information that is distributed over the switch*/
    private String internalInformationFeedServiceRecord;

    public void setInternalInformationFeedServiceReference(org.museframework.bian.classes.Object internalInformationFeedServiceReference) {
        this.internalInformationFeedServiceReference = internalInformationFeedServiceReference;
    }

    public org.museframework.bian.classes.Object getInternalInformationFeedServiceReference() {
        return internalInformationFeedServiceReference;
    }

    public void setInternalInformationFeedServiceProfile(String internalInformationFeedServiceProfile) {
        this.internalInformationFeedServiceProfile = internalInformationFeedServiceProfile;
    }

    public String getInternalInformationFeedServiceProfile() {
        return internalInformationFeedServiceProfile;
    }

    public void setInternalInformationFeedServiceRecordReference(org.museframework.bian.classes.Object internalInformationFeedServiceRecordReference) {
        this.internalInformationFeedServiceRecordReference = internalInformationFeedServiceRecordReference;
    }

    public org.museframework.bian.classes.Object getInternalInformationFeedServiceRecordReference() {
        return internalInformationFeedServiceRecordReference;
    }

    public void setInternalInformationFeedServiceRecord(String internalInformationFeedServiceRecord) {
        this.internalInformationFeedServiceRecord = internalInformationFeedServiceRecord;
    }

    public String getInternalInformationFeedServiceRecord() {
        return internalInformationFeedServiceRecord;
    }
}