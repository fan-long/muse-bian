/*A collection of information feeds/measures that can be used to track the status of one or more items/entitites

Examples: Composite position, Customer alert*/
package org.museframework.bian.issdevtra.dto.bq;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto
public class InternalNotification {
    /*Provided reference to the target issued device*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object issuedDeviceReference;

    /*Type of issued device being notified*/
    @MetaField(0)
    private String issuedDeviceType;

    /*Reference to the associated customer if applicable*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object customerReference;

    /*Reference to the associated product instance if appropriate*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object productInstanceReference;

    /*The details of the status update (e.g. reported lost or stolen device, device broken)*/
    @MetaField(0)
    private String statusUpdateDetails;

    /*The response to the status update request (e.g. update processed)*/
    @MetaField(0)
    private String statusUpdateResult;

    /*Key dates and times associated with the notification*/
    @MetaField(0)
    private String date;

    public void setIssuedDeviceReference(org.museframework.bian.classes.Object issuedDeviceReference) {
        this.issuedDeviceReference = issuedDeviceReference;
    }

    public org.museframework.bian.classes.Object getIssuedDeviceReference() {
        return issuedDeviceReference;
    }

    public void setIssuedDeviceType(String issuedDeviceType) {
        this.issuedDeviceType = issuedDeviceType;
    }

    public String getIssuedDeviceType() {
        return issuedDeviceType;
    }

    public void setCustomerReference(org.museframework.bian.classes.Object customerReference) {
        this.customerReference = customerReference;
    }

    public org.museframework.bian.classes.Object getCustomerReference() {
        return customerReference;
    }

    public void setProductInstanceReference(org.museframework.bian.classes.Object productInstanceReference) {
        this.productInstanceReference = productInstanceReference;
    }

    public org.museframework.bian.classes.Object getProductInstanceReference() {
        return productInstanceReference;
    }

    public void setStatusUpdateDetails(String statusUpdateDetails) {
        this.statusUpdateDetails = statusUpdateDetails;
    }

    public String getStatusUpdateDetails() {
        return statusUpdateDetails;
    }

    public void setStatusUpdateResult(String statusUpdateResult) {
        this.statusUpdateResult = statusUpdateResult;
    }

    public String getStatusUpdateResult() {
        return statusUpdateResult;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getDate() {
        return date;
    }
}