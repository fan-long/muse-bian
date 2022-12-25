/*A collection of the events/transactions recorded by the log

Examples: Customer life event, Servicing event*/
package org.museframework.bian.cusevehis.dto.bq;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto
public class Life {
    /*The type of event  (e.g. marriage/divorce, relocation, birth, graduation)*/
    @MetaField(0)
    private String customerLifeEventType;

    /*Reference to a contact event log*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object customerContactRecordReference;

    /*Employees involved in capturing the event*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object employeeUnitReference;

    /*The details of the event (in a suitable format)*/
    @MetaField(0)
    private String customerLifeEventRecord;

    /*Date and time and the location the event was captured*/
    @MetaField(0)
    private String dateTimeLocation;

    public void setCustomerLifeEventType(String customerLifeEventType) {
        this.customerLifeEventType = customerLifeEventType;
    }

    public String getCustomerLifeEventType() {
        return customerLifeEventType;
    }

    public void setCustomerContactRecordReference(org.museframework.bian.classes.Object customerContactRecordReference) {
        this.customerContactRecordReference = customerContactRecordReference;
    }

    public org.museframework.bian.classes.Object getCustomerContactRecordReference() {
        return customerContactRecordReference;
    }

    public void setEmployeeUnitReference(org.museframework.bian.classes.Object employeeUnitReference) {
        this.employeeUnitReference = employeeUnitReference;
    }

    public org.museframework.bian.classes.Object getEmployeeUnitReference() {
        return employeeUnitReference;
    }

    public void setCustomerLifeEventRecord(String customerLifeEventRecord) {
        this.customerLifeEventRecord = customerLifeEventRecord;
    }

    public String getCustomerLifeEventRecord() {
        return customerLifeEventRecord;
    }

    public void setDateTimeLocation(String dateTimeLocation) {
        this.dateTimeLocation = dateTimeLocation;
    }

    public String getDateTimeLocation() {
        return dateTimeLocation;
    }
}