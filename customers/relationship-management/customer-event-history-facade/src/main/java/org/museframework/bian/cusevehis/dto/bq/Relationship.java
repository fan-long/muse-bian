/*A collection of the events/transactions recorded by the log

Examples: Customer life event, Servicing event*/
package org.museframework.bian.cusevehis.dto.bq;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto
public class Relationship {
    /**/
    @MetaField
    private String customerRelationshipEventType;

    /**/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object employeeUnitReference;

    /**/
    @MetaField
    private String customerRelationshipEventRecord;

    /**/
    @MetaField
    private String customerRelationshipEventAction;

    /**/
    @MetaField
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