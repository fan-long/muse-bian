/*Operate equipment and/or a largely automated facility within Customer Workbench. */
package org.museframework.bian.customerworkbench.dto.cr;

public class CustomerWorkbenchOperatingSession {
    /*The customer running the workbench device*/
    private org.museframework.bian.classes.Object customerReference;

    /*The type of user device (e.g. mobile, laptop, workstation )*/
    private String customerWorkbenchDeviceType;

    /*Reference to device properties used to identify the device  (e.g. URL, ANI, serial number)*/
    private String customerWorkbenchDeviceRegistration;

    /*The make of the device if known*/
    private String customerWorkbenchDeviceManufacturer;

    /*The operating system type and version (use to match downloaded software)*/
    private String customerWorkbenchDeviceOperatingSystemVersionNumber;

    /*The bank's access permissions (e.g. local storage access, administrator permissions, system download permission)*/
    private String customerWorkbenchDeviceAccessPermissions;

    /*Details of the local bank applications*/
    private String installedBankApplicationType;

    /*The version number(s) of device resident bank software*/
    private String installedBankApplicationVersionNumber;

    /*The last update date time stamp for local bank software*/
    private String lastUpdateDateTime;

    public void setCustomerReference(org.museframework.bian.classes.Object customerReference) {
        this.customerReference = customerReference;
    }

    public org.museframework.bian.classes.Object getCustomerReference() {
        return customerReference;
    }

    public void setCustomerWorkbenchDeviceType(String customerWorkbenchDeviceType) {
        this.customerWorkbenchDeviceType = customerWorkbenchDeviceType;
    }

    public String getCustomerWorkbenchDeviceType() {
        return customerWorkbenchDeviceType;
    }

    public void setCustomerWorkbenchDeviceRegistration(String customerWorkbenchDeviceRegistration) {
        this.customerWorkbenchDeviceRegistration = customerWorkbenchDeviceRegistration;
    }

    public String getCustomerWorkbenchDeviceRegistration() {
        return customerWorkbenchDeviceRegistration;
    }

    public void setCustomerWorkbenchDeviceManufacturer(String customerWorkbenchDeviceManufacturer) {
        this.customerWorkbenchDeviceManufacturer = customerWorkbenchDeviceManufacturer;
    }

    public String getCustomerWorkbenchDeviceManufacturer() {
        return customerWorkbenchDeviceManufacturer;
    }

    public void setCustomerWorkbenchDeviceOperatingSystemVersionNumber(String customerWorkbenchDeviceOperatingSystemVersionNumber) {
        this.customerWorkbenchDeviceOperatingSystemVersionNumber = customerWorkbenchDeviceOperatingSystemVersionNumber;
    }

    public String getCustomerWorkbenchDeviceOperatingSystemVersionNumber() {
        return customerWorkbenchDeviceOperatingSystemVersionNumber;
    }

    public void setCustomerWorkbenchDeviceAccessPermissions(String customerWorkbenchDeviceAccessPermissions) {
        this.customerWorkbenchDeviceAccessPermissions = customerWorkbenchDeviceAccessPermissions;
    }

    public String getCustomerWorkbenchDeviceAccessPermissions() {
        return customerWorkbenchDeviceAccessPermissions;
    }

    public void setInstalledBankApplicationType(String installedBankApplicationType) {
        this.installedBankApplicationType = installedBankApplicationType;
    }

    public String getInstalledBankApplicationType() {
        return installedBankApplicationType;
    }

    public void setInstalledBankApplicationVersionNumber(String installedBankApplicationVersionNumber) {
        this.installedBankApplicationVersionNumber = installedBankApplicationVersionNumber;
    }

    public String getInstalledBankApplicationVersionNumber() {
        return installedBankApplicationVersionNumber;
    }

    public void setLastUpdateDateTime(String lastUpdateDateTime) {
        this.lastUpdateDateTime = lastUpdateDateTime;
    }

    public String getLastUpdateDateTime() {
        return lastUpdateDateTime;
    }
}