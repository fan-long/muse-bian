/*Arrangement on the provision and use of product instruments.*/
package org.museframework.bian.classes;

public class DeviceArrangement {
    /*The actions that can be taken by using the device(type) to which the arrangement refers to.*/
    private Action deviceFunctionality;

    public void setDeviceFunctionality(Action deviceFunctionality) {
        this.deviceFunctionality = deviceFunctionality;
    }

    public Action getDeviceFunctionality() {
        return deviceFunctionality;
    }
}