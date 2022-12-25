/*A collection of the events/transactions recorded by the log

Examples: Customer life event, Servicing event*/
package org.museframework.bian.cusevehis.dto.bq;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto
public class Relationship {
    /**/
    @MetaField(0)
    private String customerRelationshipEventType;

    /**/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object employeeUnitReference;

    /**/
    @MetaField(0)
    private String customerRelationshipEventRecord;

    /**/
    @MetaField(0)
    private String customerRelationshipEventAction;

    /**/
    @MetaField(0)
    private String dateTimeLocation;

    public void setCustomerRelationshipEventType(String customerRelationshipEventType) {
        this.customerRelationshipEventType = customerRelationshipEventType;
    }

    public String getCustomerRelationshipEventType() {
        return customerRelationshipEventType;
    }

    public void setEmployeeUnitReference(org.museframework.bian.classes.Object employeeUnitReference) {
        this.employeeUnitReference = employeeUnitReference;
    }

    public org.museframework.bian.classes.Object getEmployeeUnitReference() {
        return employeeUnitReference;
    }

    public void setCustomerRelationshipEventRecord(String customerRelationshipEventRecord) {
        this.customerRelationshipEventRecord = customerRelationshipEventRecord;
    }

    public String getCustomerRelationshipEventRecord() {
        return customerRelationshipEventRecord;
    }

    public void setCustomerRelationshipEventAction(String customerRelationshipEventAction) {
        this.customerRelationshipEventAction = customerRelationshipEventAction;
    }

    public String getCustomerRelationshipEventAction() {
        return customerRelationshipEventAction;
    }

    public void setDateTimeLocation(String dateTimeLocation) {
        this.dateTimeLocation = dateTimeLocation;
    }

    public String getDateTimeLocation() {
        return dateTimeLocation;
    }
}