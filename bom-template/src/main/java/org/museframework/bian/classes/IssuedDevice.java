/*The allocation of a device to a party
*/
package org.museframework.bian.classes;

public class IssuedDevice {
    /*The status of an issued device 
e.g. issued but not activated, activate, suspended, retrieved, */
    private String issuedDeviceStatus;

    /*Party to whom the device is issued*/
    private Party issuedDevicePartyReference;

    /*Specific characteristics of an issued device 

e.g. installed software, number-range of cheques, personification of card lay-ou*/
    private String issuedDeviceConfiguration;

    /*Reference to the device that is issued*/
    private Device issuedDeviceReference;

    public void setIssuedDeviceStatus(String issuedDeviceStatus) {
        this.issuedDeviceStatus = issuedDeviceStatus;
    }

    public String getIssuedDeviceStatus() {
        return issuedDeviceStatus;
    }

    public void setIssuedDevicePartyReference(Party issuedDevicePartyReference) {
        this.issuedDevicePartyReference = issuedDevicePartyReference;
    }

    public Party getIssuedDevicePartyReference() {
        return issuedDevicePartyReference;
    }

    public void setIssuedDeviceConfiguration(String issuedDeviceConfiguration) {
        this.issuedDeviceConfiguration = issuedDeviceConfiguration;
    }

    public String getIssuedDeviceConfiguration() {
        return issuedDeviceConfiguration;
    }

    public void setIssuedDeviceReference(Device issuedDeviceReference) {
        this.issuedDeviceReference = issuedDeviceReference;
    }

    public Device getIssuedDeviceReference() {
        return issuedDeviceReference;
    }
}