/**/
package org.museframework.bian.issdevadm.dto.bq;

public class ChequesAssignment {
    /*Cheque template (e.g. customer account/branch reference, print image/personalization)*/
    private String issuedDeviceTemplateValues;

    /*The delivery address for distribution*/
    private String issueLocation;

    /*The tracked sequence numbering (e.g. cheque number range issued)*/
    private String sequenceNumber;

    public void setIssuedDeviceTemplateValues(String issuedDeviceTemplateValues) {
        this.issuedDeviceTemplateValues = issuedDeviceTemplateValues;
    }

    public String getIssuedDeviceTemplateValues() {
        return issuedDeviceTemplateValues;
    }

    public void setIssueLocation(String issueLocation) {
        this.issueLocation = issueLocation;
    }

    public String getIssueLocation() {
        return issueLocation;
    }

    public void setSequenceNumber(String sequenceNumber) {
        this.sequenceNumber = sequenceNumber;
    }

    public String getSequenceNumber() {
        return sequenceNumber;
    }
}