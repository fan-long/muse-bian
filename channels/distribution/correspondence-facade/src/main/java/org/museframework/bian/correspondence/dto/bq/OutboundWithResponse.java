/*The collection of operational serivces/functions offered by the operational facility

Examples: messages, capture, routines*/
package org.museframework.bian.correspondence.dto.bq;

public class OutboundWithResponse {
    /*Date when the response expected. This can result in chasing activities and notification to the sending unit*/
    private String responseDueDate;

    /*Reference to the inbound correspondence received that has been matched to the outbound message*/
    private org.museframework.bian.classes.Object responseCorrespondenceReference;

    /*Content of the inbound correspondence*/
    private String responseCorrespondenceRecord;

    public void setResponseDueDate(String responseDueDate) {
        this.responseDueDate = responseDueDate;
    }

    public String getResponseDueDate() {
        return responseDueDate;
    }

    public void setResponseCorrespondenceReference(org.museframework.bian.classes.Object responseCorrespondenceReference) {
        this.responseCorrespondenceReference = responseCorrespondenceReference;
    }

    public org.museframework.bian.classes.Object getResponseCorrespondenceReference() {
        return responseCorrespondenceReference;
    }

    public void setResponseCorrespondenceRecord(String responseCorrespondenceRecord) {
        this.responseCorrespondenceRecord = responseCorrespondenceRecord;
    }

    public String getResponseCorrespondenceRecord() {
        return responseCorrespondenceRecord;
    }
}