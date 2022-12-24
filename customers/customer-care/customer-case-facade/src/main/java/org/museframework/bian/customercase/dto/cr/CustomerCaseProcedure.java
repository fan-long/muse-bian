/*Complete work tasks following a defined procedure in support of general office activities and product and service delivery within Customer Case. */
package org.museframework.bian.customercase.dto.cr;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

//refer to BOClass org.museframework.bian.classes.CustomerCaseProcedure
@MetaDto
public class CustomerCaseProcedure {
    /*The type of case being processed including any supporting narrative (e.g. disputed charges, suspected account fraud, stolen device, change of status)*/
    @MetaField
    private String customerCaseType;

    /*Reference to a specific product instance associated with the case*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object productInstanceReference;

    /*The customer raising the case*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object customerReference;

    /*Reference to the complete contact record assembled during the contact where the case was raised if appropriate*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object customerContactRecordReference;

    /*Reference to one or more product transactions associated with the case*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object productTransactionReference;

    /*The complete transaction record for transactions associated with the case (detailed attribute breakdown not included)*/
    @MetaField
    private String productTransactionRecord;

    /*Reference to the physical address or electronic venue the customer case was detected*/
    @MetaField
    private String caseLocation;

    /*The date and time when the case was initiated*/
    @MetaField
    private String date;

    /*Employees involved in capturing the case*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object employeeBusinessUnitReference;

    /*The case processing schedule including key tasks and dates for resolution (target and actual dates/times )*/
    @MetaField
    private String customerCaseResolutionSchedule;

    public void setCustomerCaseType(String customerCaseType) {
        this.customerCaseType = customerCaseType;
    }

    public String getCustomerCaseType() {
        return customerCaseType;
    }

    public void setProductInstanceReference(org.museframework.bian.classes.Object productInstanceReference) {
        this.productInstanceReference = productInstanceReference;
    }

    public org.museframework.bian.classes.Object getProductInstanceReference() {
        return productInstanceReference;
    }

    public void setCustomerReference(org.museframework.bian.classes.Object customerReference) {
        this.customerReference = customerReference;
    }

    public org.museframework.bian.classes.Object getCustomerReference() {
        return customerReference;
    }

    public void setCustomerContactRecordReference(org.museframework.bian.classes.Object customerContactRecordReference) {
        this.customerContactRecordReference = customerContactRecordReference;
    }

    public org.museframework.bian.classes.Object getCustomerContactRecordReference() {
        return customerContactRecordReference;
    }

    public void setProductTransactionReference(org.museframework.bian.classes.Object productTransactionReference) {
        this.productTransactionReference = productTransactionReference;
    }

    public org.museframework.bian.classes.Object getProductTransactionReference() {
        return productTransactionReference;
    }

    public void setProductTransactionRecord(String productTransactionRecord) {
        this.productTransactionRecord = productTransactionRecord;
    }

    public String getProductTransactionRecord() {
        return productTransactionRecord;
    }

    public void setCaseLocation(String caseLocation) {
        this.caseLocation = caseLocation;
    }

    public String getCaseLocation() {
        return caseLocation;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getDate() {
        return date;
    }

    public void setEmployeeBusinessUnitReference(org.museframework.bian.classes.Object employeeBusinessUnitReference) {
        this.employeeBusinessUnitReference = employeeBusinessUnitReference;
    }

    public org.museframework.bian.classes.Object getEmployeeBusinessUnitReference() {
        return employeeBusinessUnitReference;
    }

    public void setCustomerCaseResolutionSchedule(String customerCaseResolutionSchedule) {
        this.customerCaseResolutionSchedule = customerCaseResolutionSchedule;
    }

    public String getCustomerCaseResolutionSchedule() {
        return customerCaseResolutionSchedule;
    }
}