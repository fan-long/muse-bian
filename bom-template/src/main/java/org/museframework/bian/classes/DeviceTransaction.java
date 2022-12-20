/*The usage of a device

e.g. the issuance of a cheque from a chequebook, the logon to an e-banking application, the usage of a digipass*/
package org.museframework.bian.classes;

public class DeviceTransaction {
    /*Reference to an element of a device used in a Device Transaction */
    private String deviceTransactionUsedElement;

    /*The amount the device is used for

e.g. amount on cheque, amount on card transaction*/
    private String deviceUsageAmount;

    public void setDeviceTransactionUsedElement(String deviceTransactionUsedElement) {
        this.deviceTransactionUsedElement = deviceTransactionUsedElement;
    }

    public String getDeviceTransactionUsedElement() {
        return deviceTransactionUsedElement;
    }

    public void setDeviceUsageAmount(String deviceUsageAmount) {
        this.deviceUsageAmount = deviceUsageAmount;
    }

    public String getDeviceUsageAmount() {
        return deviceUsageAmount;
    }
}