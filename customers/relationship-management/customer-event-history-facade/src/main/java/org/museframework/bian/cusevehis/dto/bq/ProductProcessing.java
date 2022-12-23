/*A collection of the events/transactions recorded by the log

Examples: Customer life event, Servicing event*/
package org.museframework.bian.cusevehis.dto.bq;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto
public class ProductProcessing {
    /*Reference to the specific product instance being processed*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object productInstanceReference;

    /*The type of event (e.g. payment initiation, statement request)*/
    @MetaField
    private String productActionEventType;

    /*Details of the processing activity if available*/
    @MetaField
    private String productActionEventDescription;

    /*Outcome of the processing action if available*/
    @MetaField
    private String productActionEventResult;

    /*Employees involved in recording the event*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object employeeUnitReference;

    /*The details of the event (in a suitable format)*/
    @MetaField
    private String customerProductandServiceEventRecord;

    /*Date and time and the location the event was captured*/
    @MetaField
    private String dateTimeLocation;

    public void setProductInstanceReference(org.museframework.bian.classes.Object productInstanceReference) {
        this.productInstanceReference = productInstanceReference;
    }

    public org.museframework.bian.classes.Object getProductInstanceReference() {
        return productInstanceReference;
    }

    public void setProductActionEventType(String productActionEventType) {
        this.productActionEventType = productActionEventType;
    }

    public String getProductActionEventType() {
        return productActionEventType;
    }

    public void setProductActionEventDescription(String productActionEventDescription) {
        this.productActionEventDescription = productActionEventDescription;
    }

    public String getProductActionEventDescription() {
        return productActionEventDescription;
    }

    public void setProductActionEventResult(String productActionEventResult) {
        this.productActionEventResult = productActionEventResult;
    }

    public String getProductActionEventResult() {
        return productActionEventResult;
    }

    public void setEmployeeUnitReference(org.museframework.bian.classes.Object employeeUnitReference) {
        this.employeeUnitReference = employeeUnitReference;
    }

    public org.museframework.bian.classes.Object getEmployeeUnitReference() {
        return employeeUnitReference;
    }

    public void setCustomerProductandServiceEventRecord(String customerProductandServiceEventRecord) {
        this.customerProductandServiceEventRecord = customerProductandServiceEventRecord;
    }

    public String getCustomerProductandServiceEventRecord() {
        return customerProductandServiceEventRecord;
    }

    public void setDateTimeLocation(String dateTimeLocation) {
        this.dateTimeLocation = dateTimeLocation;
    }

    public String getDateTimeLocation() {
        return dateTimeLocation;
    }
}