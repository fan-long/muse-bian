/**/
package org.museframework.bian.currentaccount.dto.bq;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

//refer to BOClass org.museframework.bian.classes.IssuedDevice
@MetaDto
public class IssuedDevice {
    /*A property of the issued device/inventory (e.g. card, checkbook, pay-in slip)*/
    @MetaField(0)
    private String issuedInventoryType;

    /*Definition of the inventory item, including processing and handling guidelines and rules*/
    @MetaField(0)
    private String issuedInventoryDescription;

    /*Definition of the processing option and impact (e.g. lost check handling)*/
    @MetaField(0)
    private String issuedInventoryOptionDefinition;

    /*The processing option setting*/
    @MetaField(0)
    private String issuedInventoryOptionSetting;

    /*Tracked property of the issued device/inventory (e.g. issued check numbers)*/
    @MetaField(0)
    private String issuedInventoryPropertyType;

    /*The tracked values associated with an issued device/inventory item*/
    @MetaField(0)
    private String issuedInventoryPropertyValue;

    /*The tracked status of the device/inventory item (e.g. active, suspended, cancelled)*/
    @MetaField(0)
    private String issuedInventoryStatus;

    public void setIssuedInventoryType(String issuedInventoryType) {
        this.issuedInventoryType = issuedInventoryType;
    }

    public String getIssuedInventoryType() {
        return issuedInventoryType;
    }

    public void setIssuedInventoryDescription(String issuedInventoryDescription) {
        this.issuedInventoryDescription = issuedInventoryDescription;
    }

    public String getIssuedInventoryDescription() {
        return issuedInventoryDescription;
    }

    public void setIssuedInventoryOptionDefinition(String issuedInventoryOptionDefinition) {
        this.issuedInventoryOptionDefinition = issuedInventoryOptionDefinition;
    }

    public String getIssuedInventoryOptionDefinition() {
        return issuedInventoryOptionDefinition;
    }

    public void setIssuedInventoryOptionSetting(String issuedInventoryOptionSetting) {
        this.issuedInventoryOptionSetting = issuedInventoryOptionSetting;
    }

    public String getIssuedInventoryOptionSetting() {
        return issuedInventoryOptionSetting;
    }

    public void setIssuedInventoryPropertyType(String issuedInventoryPropertyType) {
        this.issuedInventoryPropertyType = issuedInventoryPropertyType;
    }

    public String getIssuedInventoryPropertyType() {
        return issuedInventoryPropertyType;
    }

    public void setIssuedInventoryPropertyValue(String issuedInventoryPropertyValue) {
        this.issuedInventoryPropertyValue = issuedInventoryPropertyValue;
    }

    public String getIssuedInventoryPropertyValue() {
        return issuedInventoryPropertyValue;
    }

    public void setIssuedInventoryStatus(String issuedInventoryStatus) {
        this.issuedInventoryStatus = issuedInventoryStatus;
    }

    public String getIssuedInventoryStatus() {
        return issuedInventoryStatus;
    }
}