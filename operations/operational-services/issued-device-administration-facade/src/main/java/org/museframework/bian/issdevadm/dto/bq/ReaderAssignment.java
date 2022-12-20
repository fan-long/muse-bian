/**/
package org.museframework.bian.issdevadm.dto.bq;

public class ReaderAssignment {
    /*Serial number or other unique identifier*/
    private String issuedReaderDeviceSerialNumber;

    /*Operating system version for smart devices*/
    private String versionNumber;

    /*The delivery address or tracked location if appropriate*/
    private String issueLocation;

    /*The reader configuration or set-up details as appropriate*/
    private String issuedDeviceConfiguration;

    /*The timing and frequency of access/use - includes errors for fraud detection*/
    private String usageLog;

    public void setIssuedReaderDeviceSerialNumber(String issuedReaderDeviceSerialNumber) {
        this.issuedReaderDeviceSerialNumber = issuedReaderDeviceSerialNumber;
    }

    public String getIssuedReaderDeviceSerialNumber() {
        return issuedReaderDeviceSerialNumber;
    }

    public void setVersionNumber(String versionNumber) {
        this.versionNumber = versionNumber;
    }

    public String getVersionNumber() {
        return versionNumber;
    }

    public void setIssueLocation(String issueLocation) {
        this.issueLocation = issueLocation;
    }

    public String getIssueLocation() {
        return issueLocation;
    }

    public void setIssuedDeviceConfiguration(String issuedDeviceConfiguration) {
        this.issuedDeviceConfiguration = issuedDeviceConfiguration;
    }

    public String getIssuedDeviceConfiguration() {
        return issuedDeviceConfiguration;
    }

    public void setUsageLog(String usageLog) {
        this.usageLog = usageLog;
    }

    public String getUsageLog() {
        return usageLog;
    }
}