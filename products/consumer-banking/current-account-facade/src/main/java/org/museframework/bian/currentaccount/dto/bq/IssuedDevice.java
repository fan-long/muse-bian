/**/
package org.museframework.bian.currentaccount.dto.bq;

public class IssuedDevice extends org.museframework.bian.classes.IssuedDevice {
    /*A property of the issued device/inventory (e.g. card, checkbook, pay-in slip)*/
    private String issuedInventoryType;

    /*Definition of the inventory item, including processing and handling guidelines and rules*/
    private String issuedInventoryDescription;

    /*Definition of the processing option and impact (e.g. lost check handling)*/
    private String issuedInventoryOptionDefinition;

    /*The processing option setting*/
    private String issuedInventoryOptionSetting;

    /*Tracked property of the issued device/inventory (e.g. issued check numbers)*/
    private String issuedInventoryPropertyType;

    /*The tracked values associated with an issued device/inventory item*/
    private String issuedInventoryPropertyValue;

    /*The tracked status of the device/inventory item (e.g. active, suspended, cancelled)*/
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