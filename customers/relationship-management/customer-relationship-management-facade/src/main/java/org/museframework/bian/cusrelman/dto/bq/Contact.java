/*A collection of one or more responsibilities or tasks under management

Examples: Relationship development, Troubleshooting*/
package org.museframework.bian.cusrelman.dto.bq;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto
public class Contact {
    /*Records the timing, purpose, details and impact of customer contacts*/
    @MetaField(0)
    private String customerRelationshipContactHistory;

    /*The schedule of past and planned customer contacts*/
    @MetaField(0)
    private String customerRelationshipContactSchedule;

    /*The record of a customer contact*/
    @MetaField(0)
    private String customerRelationshipContactRecord;

    /*The date time and location of the contact*/
    @MetaField(0)
    private String customerRelationshipContactDate;

    /*Reference to the employee(s) in attendance*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object employeeReference;

    /*The reason and or purpose for the contact (e.g. review, issue, product sales, advice, customer enquiry)*/
    @MetaField(0)
    private String customerRelationshipContactType;

    /*The result of the contact, including follow up tasks*/
    @MetaField(0)
    private String customerRelationshipContactResult;

    public void setCustomerRelationshipContactHistory(String customerRelationshipContactHistory) {
        this.customerRelationshipContactHistory = customerRelationshipContactHistory;
    }

    public String getCustomerRelationshipContactHistory() {
        return customerRelationshipContactHistory;
    }

    public void setCustomerRelationshipContactSchedule(String customerRelationshipContactSchedule) {
        this.customerRelationshipContactSchedule = customerRelationshipContactSchedule;
    }

    public String getCustomerRelationshipContactSchedule() {
        return customerRelationshipContactSchedule;
    }

    public void setCustomerRelationshipContactRecord(String customerRelationshipContactRecord) {
        this.customerRelationshipContactRecord = customerRelationshipContactRecord;
    }

    public String getCustomerRelationshipContactRecord() {
        return customerRelationshipContactRecord;
    }

    public void setCustomerRelationshipContactDate(String customerRelationshipContactDate) {
        this.customerRelationshipContactDate = customerRelationshipContactDate;
    }

    public String getCustomerRelationshipContactDate() {
        return customerRelationshipContactDate;
    }

    public void setEmployeeReference(org.museframework.bian.classes.Object employeeReference) {
        this.employeeReference = employeeReference;
    }

    public org.museframework.bian.classes.Object getEmployeeReference() {
        return employeeReference;
    }

    public void setCustomerRelationshipContactType(String customerRelationshipContactType) {
        this.customerRelationshipContactType = customerRelationshipContactType;
    }

    public String getCustomerRelationshipContactType() {
        return customerRelationshipContactType;
    }

    public void setCustomerRelationshipContactResult(String customerRelationshipContactResult) {
        this.customerRelationshipContactResult = customerRelationshipContactResult;
    }

    public String getCustomerRelationshipContactResult() {
        return customerRelationshipContactResult;
    }
}