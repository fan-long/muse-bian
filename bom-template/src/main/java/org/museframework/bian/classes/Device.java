/*An item created to serve a particular need, such as a credit card, a smart phone, an electronic signature, an electronic key, etc.

A device is a physical resource (material and non human resources) to serve a particular need. 

*/
package org.museframework.bian.classes;

public class Device {
    /**/
    private String deviceIdentification;

    /*Reference to the device type of the device

A device has the characteristics of the device type it belongs to possibly specified
e.g. a device of the type "cheque book" will have cheques. The device specifies how many and what the number range is.
e.g. an electronic banking app consists of software modules, the device specifies what version 

*/
    private org.museframework.bian.enumerations.Devicetypevalues deviceType;

    /*Property of a device relevant for its use.

A device has the characteristics of the device type it belongs to,possibly specified
e.g. . a device of the type "cheque book" will have cheques. The device specifies how many and what the number range is.
e.g. an electronic banking app consists of software modules, the device specifies what version 
*/
    private String deviceProperty;

    /*An element of the device that can be used independently and is individually identified

e.g. a cheque in a chequebook*/
    private String deviceElement;

    /*The life cycle stage of a device

e.g. active, defect*/
    private String deviceStatus;

    /**/
    private String deviceVersion;

    /**/
    private String deviceDateTime;

    /**/
    private String deviceDescription;

    public void setDeviceIdentification(String deviceIdentification) {
        this.deviceIdentification = deviceIdentification;
    }

    public String getDeviceIdentification() {
        return deviceIdentification;
    }

    public void setDeviceType(org.museframework.bian.enumerations.Devicetypevalues deviceType) {
        this.deviceType = deviceType;
    }

    public org.museframework.bian.enumerations.Devicetypevalues getDeviceType() {
        return deviceType;
    }

    public void setDeviceProperty(String deviceProperty) {
        this.deviceProperty = deviceProperty;
    }

    public String getDeviceProperty() {
        return deviceProperty;
    }

    public void setDeviceElement(String deviceElement) {
        this.deviceElement = deviceElement;
    }

    public String getDeviceElement() {
        return deviceElement;
    }

    public void setDeviceStatus(String deviceStatus) {
        this.deviceStatus = deviceStatus;
    }

    public String getDeviceStatus() {
        return deviceStatus;
    }

    public void setDeviceVersion(String deviceVersion) {
        this.deviceVersion = deviceVersion;
    }

    public String getDeviceVersion() {
        return deviceVersion;
    }

    public void setDeviceDateTime(String deviceDateTime) {
        this.deviceDateTime = deviceDateTime;
    }

    public String getDeviceDateTime() {
        return deviceDateTime;
    }

    public void setDeviceDescription(String deviceDescription) {
        this.deviceDescription = deviceDescription;
    }

    public String getDeviceDescription() {
        return deviceDescription;
    }
}