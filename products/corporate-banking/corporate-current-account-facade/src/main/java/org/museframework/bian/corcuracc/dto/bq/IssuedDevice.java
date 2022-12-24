/**/
package org.museframework.bian.corcuracc.dto.bq;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

//refer to BOClass org.museframework.bian.classes.IssuedDevice
@MetaDto
public class IssuedDevice {
    /*The type of issued device/inventory (e.g. checkbook, pay-in slip)*/
    @MetaField
    private String issuedDeviceType;

    /*Definition of the inventory item, including processing and handling guidelines and rules*/
    @MetaField
    private String issuedDeviceDescription;

    /*Definition of the processing option and impact (e.g. lost check handling)*/
    @MetaField
    private String issuedDeviceOptionDefinition;

    /*The processing option setting*/
    @MetaField
    private String issuedDeviceOptionSetting;

    /*A property of the issued device/inventory (e.g. card, checkbook, pay-in slip)*/
    @MetaField
    private String issuedDeviceProperty;

    /*Tracked property of the issued device/inventory (e.g. issued check numbers)*/
    @MetaField
    private String issuedDevicePropertyType;

    /*The tracked values associated with an issued device/inventory item*/
    @MetaField
    private String issuedDevicePropertyValue;

    /*The tracked status of the device/inventory item (e.g. active, suspended, cancelled)*/
    @MetaField
    private String issuedDeviceStatus;

    public void setIssuedDeviceType(String issuedDeviceType) {
        this.issuedDeviceType = issuedDeviceType;
    }

    public String getIssuedDeviceType() {
        return issuedDeviceType;
    }

    public void setIssuedDeviceDescription(String issuedDeviceDescription) {
        this.issuedDeviceDescription = issuedDeviceDescription;
    }

    public String getIssuedDeviceDescription() {
        return issuedDeviceDescription;
    }

    public void setIssuedDeviceOptionDefinition(String issuedDeviceOptionDefinition) {
        this.issuedDeviceOptionDefinition = issuedDeviceOptionDefinition;
    }

    public String getIssuedDeviceOptionDefinition() {
        return issuedDeviceOptionDefinition;
    }

    public void setIssuedDeviceOptionSetting(String issuedDeviceOptionSetting) {
        this.issuedDeviceOptionSetting = issuedDeviceOptionSetting;
    }

    public String getIssuedDeviceOptionSetting() {
        return issuedDeviceOptionSetting;
    }

    public void setIssuedDeviceProperty(String issuedDeviceProperty) {
        this.issuedDeviceProperty = issuedDeviceProperty;
    }

    public String getIssuedDeviceProperty() {
        return issuedDeviceProperty;
    }

    public void setIssuedDevicePropertyType(String issuedDevicePropertyType) {
        this.issuedDevicePropertyType = issuedDevicePropertyType;
    }

    public String getIssuedDevicePropertyType() {
        return issuedDevicePropertyType;
    }

    public void setIssuedDevicePropertyValue(String issuedDevicePropertyValue) {
        this.issuedDevicePropertyValue = issuedDevicePropertyValue;
    }

    public String getIssuedDevicePropertyValue() {
        return issuedDevicePropertyValue;
    }

    public void setIssuedDeviceStatus(String issuedDeviceStatus) {
        this.issuedDeviceStatus = issuedDeviceStatus;
    }

    public String getIssuedDeviceStatus() {
        return issuedDeviceStatus;
    }
}