/*A collection of information feeds/measures that can be used to track the status of one or more items/entitites

Examples: Composite position, Customer alert*/
package org.museframework.bian.issdevtra.dto.bq;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto
public class ExternalReport {
    /*Is the record of the information notified by the IP that can reference a single device notification or a batch file covering multiple devices*/
    @MetaField
    private String informationFeedServiceContentRecord;

    /*Provided reference to the target issued device in the form defined by the IP*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object issuedDeviceReference;

    /*Type of issued device being notified in the form defined by the IP*/
    @MetaField
    private String issuedDeviceType;

    /*Reference to the associated customer in the form defined by the IP*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object customerReference;

    /*Reference to the associated product instance in the form defined by the IP*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object productInstanceReference;

    /*The details of the status update (e.g. reported lost or stolen device, device broken)*/
    @MetaField
    private String statusUpdateDetails;

    /*The response to the status update request (e.g. update processed)*/
    @MetaField
    private String statusUpdateResult;

    /*Key dates and times associated with the external notification*/
    @MetaField
    private String date;

    public void setInformationFeedServiceContentRecord(String informationFeedServiceContentRecord) {
        this.informationFeedServiceContentRecord = informationFeedServiceContentRecord;
    }

    public String getInformationFeedServiceContentRecord() {
        return informationFeedServiceContentRecord;
    }

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