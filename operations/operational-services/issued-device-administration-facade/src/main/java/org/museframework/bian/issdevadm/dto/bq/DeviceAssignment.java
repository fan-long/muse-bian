/**/
package org.museframework.bian.issdevadm.dto.bq;

public class DeviceAssignment {
    /*Serial number or other unique identifier*/
    private String issuedDeviceSerialNumber;

    /*Operating system version for smart devices*/
    private String versionNumber;

    /*Used for device personalization*/
    private org.museframework.bian.classes.Object customerCustomizationReference;

    /*Details how device and replacements are distributed (e.g. mail, courier, collect at branch, kiosk)*/
    private String deliverymethod;

    /*The delivery address or tracked location if appropriate*/
    private String issueLocation;

    /*Device stored values such as mag strip/chip settings*/
    private String issuedDeviceConfiguration;

    /*The timing and frequency of access/use - includes errors for fraud detection*/
    private String usageLog;

    public void setIssuedDeviceSerialNumber(String issuedDeviceSerialNumber) {
        this.issuedDeviceSerialNumber = issuedDeviceSerialNumber;
    }

    public String getIssuedDeviceSerialNumber() {
        return issuedDeviceSerialNumber;
    }

    public void setVersionNumber(String versionNumber) {
        this.versionNumber = versionNumber;
    }

    public String getVersionNumber() {
        return versionNumber;
    }

    public void setCustomerCustomizationReference(org.museframework.bian.classes.Object customerCustomizationReference) {
        this.customerCustomizationReference = customerCustomizationReference;
    }

    public org.museframework.bian.classes.Object getCustomerCustomizationReference() {
        return customerCustomizationReference;
    }

    public void setDeliverymethod(String deliverymethod) {
        this.deliverymethod = deliverymethod;
    }

    public String getDeliverymethod() {
        return deliverymethod;
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