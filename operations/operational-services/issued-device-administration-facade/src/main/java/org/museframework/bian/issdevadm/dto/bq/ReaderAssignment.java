/**/
package org.museframework.bian.issdevadm.dto.bq;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto
public class ReaderAssignment {
    /*Serial number or other unique identifier*/
    @MetaField(0)
    private String issuedReaderDeviceSerialNumber;

    /*Operating system version for smart devices*/
    @MetaField(0)
    private String versionNumber;

    /*The delivery address or tracked location if appropriate*/
    @MetaField(0)
    private String issueLocation;

    /*The reader configuration or set-up details as appropriate*/
    @MetaField(0)
    private String issuedDeviceConfiguration;

    /*The timing and frequency of access/use - includes errors for fraud detection*/
    @MetaField(0)
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