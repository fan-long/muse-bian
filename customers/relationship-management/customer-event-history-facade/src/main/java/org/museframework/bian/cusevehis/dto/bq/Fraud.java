/*A collection of the events/transactions recorded by the log

Examples: Customer life event, Servicing event*/
package org.museframework.bian.cusevehis.dto.bq;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto
public class Fraud extends org.museframework.bian.classes.Fraud {
    /*The type of event  (e.g. stolen card, disputed transaction)*/
    @MetaField
    private String customerFraudCaseEventType;

    /*Reference to a contact event log*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object customerContactRecordReference;

    /*Reference to the types or instances of products/services being serviced if provided*/
    @MetaField
    private String accessedProductandService;

    /*Employees involved in recording the fraud case*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object employeeUnitReference;

    /*Reference to the fraud case processing the analysis and response*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object fraudCaseReference;

    /*Date and time and the location the event was captured*/
    @MetaField
    private String dateTimeLocation;

    public void setCustomerFraudCaseEventType(String customerFraudCaseEventType) {
        this.customerFraudCaseEventType = customerFraudCaseEventType;
    }

    public String getCustomerFraudCaseEventType() {
        return customerFraudCaseEventType;
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

    public void setEmployeeUnitReference(org.museframework.bian.classes.Object employeeUnitReference) {
        this.employeeUnitReference = employeeUnitReference;
    }

    public org.museframework.bian.classes.Object getEmployeeUnitReference() {
        return employeeUnitReference;
    }

    public void setFraudCaseReference(org.museframework.bian.classes.Object fraudCaseReference) {
        this.fraudCaseReference = fraudCaseReference;
    }

    public org.museframework.bian.classes.Object getFraudCaseReference() {
        return fraudCaseReference;
    }

    public void setDateTimeLocation(String dateTimeLocation) {
        this.dateTimeLocation = dateTimeLocation;
    }

    public String getDateTimeLocation() {
        return dateTimeLocation;
    }
}