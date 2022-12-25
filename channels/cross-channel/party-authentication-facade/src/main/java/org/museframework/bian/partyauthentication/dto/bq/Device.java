/*All kind of verifications 

Examples: Password verification*/
package org.museframework.bian.partyauthentication.dto.bq;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

//refer to BOClass org.museframework.bian.classes.Device
@MetaDto
public class Device {
    /*Reference to the device being used for authentication*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object authenticationDeviceReference;

    /*Property of the device being used to authenticate (e.g. phone number, URL)*/
    @MetaField(0)
    private String authenticationDevicePropertyValue;

    /*Reference to the customer issued device*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object issuedDeviceInstanceReference;

    /*The registered customer device properties - maintained by SD-Issued Device Administration*/
    @MetaField(0)
    private String issuedDevicePropertyValue;

    /*The result of the device check*/
    @MetaField(0)
    private String deviceTestResult;

    public void setAuthenticationDeviceReference(org.museframework.bian.classes.Object authenticationDeviceReference) {
        this.authenticationDeviceReference = authenticationDeviceReference;
    }

    public org.museframework.bian.classes.Object getAuthenticationDeviceReference() {
        return authenticationDeviceReference;
    }

    public void setAuthenticationDevicePropertyValue(String authenticationDevicePropertyValue) {
        this.authenticationDevicePropertyValue = authenticationDevicePropertyValue;
    }

    public String getAuthenticationDevicePropertyValue() {
        return authenticationDevicePropertyValue;
    }

    public void setIssuedDeviceInstanceReference(org.museframework.bian.classes.Object issuedDeviceInstanceReference) {
        this.issuedDeviceInstanceReference = issuedDeviceInstanceReference;
    }

    public org.museframework.bian.classes.Object getIssuedDeviceInstanceReference() {
        return issuedDeviceInstanceReference;
    }

    public void setIssuedDevicePropertyValue(String issuedDevicePropertyValue) {
        this.issuedDevicePropertyValue = issuedDevicePropertyValue;
    }

    public String getIssuedDevicePropertyValue() {
        return issuedDevicePropertyValue;
    }

    public void setDeviceTestResult(String deviceTestResult) {
        this.deviceTestResult = deviceTestResult;
    }

    public String getDeviceTestResult() {
        return deviceTestResult;
    }
}