/*All kind of verifications 

Examples: Password verification*/
package org.museframework.bian.cardauthorization.dto.bq;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto
public class DeviceCheck {
    /*The security code associated with the issued device*/
    @MetaField
    private String issuedDeviceSecurityCode;

    /*The cryptogram associated with issued device*/
    @MetaField
    private String issuedDeviceCryptogram;

    /*The CVV number is a further mechanism for authenticating the device*/
    @MetaField
    private String issuedDeviceCVV;

    /*The Bank Identification Number (BIN) is verified to be valid*/
    @MetaField
    private String issuedDeviceBIN;

    /*A property of the device checked using a specific algorithm (e.g. the Luhn algorithm)*/
    @MetaField
    private String issuedDeviceCheckDigit;

    /*A check of the expiry date*/
    @MetaField
    private String issuedDeviceValidThrough;

    /*The result of the device properties check*/
    @MetaField
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