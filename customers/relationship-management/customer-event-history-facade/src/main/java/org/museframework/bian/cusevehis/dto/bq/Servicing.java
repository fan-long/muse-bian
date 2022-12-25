/*A collection of the events/transactions recorded by the log

Examples: Customer life event, Servicing event*/
package org.museframework.bian.cusevehis.dto.bq;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto
public class Servicing {
    /*The type of event (e.g. self-service, assisted)*/
    @MetaField(0)
    private String customerServicingEventType;

    /*Reference to a contact event log*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object customerContactRecordReference;

    /*Reference to the types or instances of products/services being serviced if provided*/
    @MetaField(0)
    private String accessedProductandService;

    /*The channel and device used in the servicing event*/
    @MetaField(0)
    private String channelDeviceType;

    /*The given purpose for the customer servicing action*/
    @MetaField(0)
    private String contactPurpose;

    /*The captured result of the servicing event*/
    @MetaField(0)
    private String contactResult;

    /*Employees involved in recording the event*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object employeeUnitReference;

    /*The details of the event (in a suitable format)*/
    @MetaField(0)
    private String customerServicingEventRecord;

    /*Date and time and the location the event was captured*/
    @MetaField(0)
    private String dateTimeLocation;

    public void setCustomerServicingEventType(String customerServicingEventType) {
        this.customerServicingEventType = customerServicingEventType;
    }

    public String getCustomerServicingEventType() {
        return customerServicingEventType;
    }

    public void setCustomerContactRecordReference(org.museframework.bian.classes.Object customerContactRecordReference) {
        this.customerContactRecordReference = customerContactRecordReference;
    }

    public org.museframework.bian.classes.Object getCustomerContactRecordReference() {
        return customerContactRecordReference;
    }

    public void setAccessedProductandService(String accessedProductandService) {
        this.accessedProductandService = accessedProductandService;
    }

    public String getAccessedProductandService() {
        return accessedProductandService;
    }

    public void setChannelDeviceType(String channelDeviceType) {
        this.channelDeviceType = channelDeviceType;
    }

    public String getChannelDeviceType() {
        return channelDeviceType;
    }

    public void setContactPurpose(String contactPurpose) {
        this.contactPurpose = contactPurpose;
    }

    public String getContactPurpose() {
        return contactPurpose;
    }

    public void setContactResult(String contactResult) {
        this.contactResult = contactResult;
    }

    public String getContactResult() {
        return contactResult;
    }

    public void setEmployeeUnitReference(org.museframework.bian.classes.Object employeeUnitReference) {
        this.employeeUnitReference = employeeUnitReference;
    }

    public org.museframework.bian.classes.Object getEmployeeUnitReference() {
        return employeeUnitReference;
    }

    public void setCustomerServicingEventRecord(String customerServicingEventRecord) {
        this.customerServicingEventRecord = customerServicingEventRecord;
    }

    public String getCustomerServicingEventRecord() {
        return customerServicingEventRecord;
    }

    public void setDateTimeLocation(String dateTimeLocation) {
        this.dateTimeLocation = dateTimeLocation;
    }

    public String getDateTimeLocation() {
        return dateTimeLocation;
    }
}