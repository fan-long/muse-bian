/*A collection of one or more responsibilities or tasks under management

Examples: Relationship development, Troubleshooting*/
package org.museframework.bian.intrelman.dto.bq;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto
public class Contact {
    /*Records the timing, purpose, details and impact of customer contacts*/
    @MetaField(0)
    private String bankRelationshipContactHistory;

    /*The schedule of past and planned customer contacts*/
    @MetaField(0)
    private String bankRelationshipContactSchedule;

    /*The record of a customer contact*/
    @MetaField(0)
    private String bankRelationshipContactRecord;

    /*The date time and location of the contact*/
    @MetaField(0)
    private String bankRelationshipContactDate;

    /*Reference to the employee(s) in attendance*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object employeeReference;

    /*The reason and or purpose for the contact (e.g. review, issue, product sales, advice, customer enquiry)*/
    @MetaField(0)
    private String bankRelationshipContactType;

    /*The result of the contact, including follow up tasks*/
    @MetaField(0)
    private String bankRelationshipContactResult;

    /*Reference to associated documents*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object documentDirectoryEntryInstanceReference;

    public void setBankRelationshipContactHistory(String bankRelationshipContactHistory) {
        this.bankRelationshipContactHistory = bankRelationshipContactHistory;
    }

    public String getBankRelationshipContactHistory() {
        return bankRelationshipContactHistory;
    }

    public void setBankRelationshipContactSchedule(String bankRelationshipContactSchedule) {
        this.bankRelationshipContactSchedule = bankRelationshipContactSchedule;
    }

    public String getBankRelationshipContactSchedule() {
        return bankRelationshipContactSchedule;
    }

    public void setBankRelationshipContactRecord(String bankRelationshipContactRecord) {
        this.bankRelationshipContactRecord = bankRelationshipContactRecord;
    }

    public String getBankRelationshipContactRecord() {
        return bankRelationshipContactRecord;
    }

    public void setBankRelationshipContactDate(String bankRelationshipContactDate) {
        this.bankRelationshipContactDate = bankRelationshipContactDate;
    }

    public String getBankRelationshipContactDate() {
        return bankRelationshipContactDate;
    }

    public void setEmployeeReference(org.museframework.bian.classes.Object employeeReference) {
        this.employeeReference = employeeReference;
    }

    public org.museframework.bian.classes.Object getEmployeeReference() {
        return employeeReference;
    }

    public void setBankRelationshipContactType(String bankRelationshipContactType) {
        this.bankRelationshipContactType = bankRelationshipContactType;
    }

    public String getBankRelationshipContactType() {
        return bankRelationshipContactType;
    }

    public void setBankRelationshipContactResult(String bankRelationshipContactResult) {
        this.bankRelationshipContactResult = bankRelationshipContactResult;
    }

    public String getBankRelationshipContactResult() {
        return bankRelationshipContactResult;
    }

    public void setDocumentDirectoryEntryInstanceReference(org.museframework.bian.classes.Object documentDirectoryEntryInstanceReference) {
        this.documentDirectoryEntryInstanceReference = documentDirectoryEntryInstanceReference;
    }

    public org.museframework.bian.classes.Object getDocumentDirectoryEntryInstanceReference() {
        return documentDirectoryEntryInstanceReference;
    }
}