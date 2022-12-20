/*All kind of verifications 

Examples: Password verification*/
package org.museframework.bian.cardauthorization.dto.bq;

public class DeviceCheck {
    /*The security code associated with the issued device*/
    private String issuedDeviceSecurityCode;

    /*The cryptogram associated with issued device*/
    private String issuedDeviceCryptogram;

    /*The CVV number is a further mechanism for authenticating the device*/
    private String issuedDeviceCVV;

    /*The Bank Identification Number (BIN) is verified to be valid*/
    private String issuedDeviceBIN;

    /*A property of the device checked using a specific algorithm (e.g. the Luhn algorithm)*/
    private String issuedDeviceCheckDigit;

    /*A check of the expiry date*/
    private String issuedDeviceValidThrough;

    /*The result of the device properties check*/
    private String issuedDeviceCheckResult;

    public void setIssuedDeviceSecurityCode(String issuedDeviceSecurityCode) {
        this.issuedDeviceSecurityCode = issuedDeviceSecurityCode;
    }

    public String getIssuedDeviceSecurityCode() {
        return issuedDeviceSecurityCode;
    }

    public void setIssuedDeviceCryptogram(String issuedDeviceCryptogram) {
        this.issuedDeviceCryptogram = issuedDeviceCryptogram;
    }

    public String getIssuedDeviceCryptogram() {
        return issuedDeviceCryptogram;
    }

    public void setIssuedDeviceCVV(String issuedDeviceCVV) {
        this.issuedDeviceCVV = issuedDeviceCVV;
    }

    public String getIssuedDeviceCVV() {
        return issuedDeviceCVV;
    }

    public void setIssuedDeviceBIN(String issuedDeviceBIN) {
        this.issuedDeviceBIN = issuedDeviceBIN;
    }

    public String getIssuedDeviceBIN() {
        return issuedDeviceBIN;
    }

    public void setIssuedDeviceCheckDigit(String issuedDeviceCheckDigit) {
        this.issuedDeviceCheckDigit = issuedDeviceCheckDigit;
    }

    public String getIssuedDeviceCheckDigit() {
        return issuedDeviceCheckDigit;
    }

    public void setIssuedDeviceValidThrough(String issuedDeviceValidThrough) {
        this.issuedDeviceValidThrough = issuedDeviceValidThrough;
    }

    public String getIssuedDeviceValidThrough() {
        return issuedDeviceValidThrough;
    }

    public void setIssuedDeviceCheckResult(String issuedDeviceCheckResult) {
        this.issuedDeviceCheckResult = issuedDeviceCheckResult;
    }

    public String getIssuedDeviceCheckResult() {
        return issuedDeviceCheckResult;
    }
}