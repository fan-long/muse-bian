/*Maintain the terms and conditions that apply to a commercial relationship within Commission Agreement.
Example: Define and maintain the terms govering the contratcual relationship with a customer.*/
package org.museframework.bian.commissionagreement.dto.cr;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto
public class EmployeeCommissionAgreement {
    /*A Classification  value that distinguishes between Options defined within Employee Commission Agreement*/
    @MetaField
    private String employeeCommissionAgreementParameterType;

    /*A selected optional feature in a product, identified by Parameter Type*/
    @MetaField
    private String employeeCommissionAgreementSelectedOption;

    /*A Classification value that distinguishes between the subject matters of Employee Commission Agreement*/
    @MetaField
    private String employeeCommissionAgreementType;

    /*Reference to Employee Commission Agreement*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object employeeCommissionAgreementReference;

    /*Request to discharge Employee Commission Agreement*/
    @MetaField
    private String employeeCommissionAgreementRequest;

    /*Timetable to discharge Employee Commission Agreement*/
    @MetaField
    private String employeeCommissionAgreementSchedule;

    /*The status of Employee Commission Agreement discharging*/
    @MetaField
    private String employeeCommissionAgreementStatus;

    /*Reference to the party who is involved in Employee Commission Agreement*/
    @MetaField
    private String employeeCommissionAgreementAssociatedParty;

    /*Reference to the customer who is involved in Employee Commission Agreement*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object employeeCommissionAgreementCustomerReference;

    /*Liability or duty to do something under the terms of Employee Commission Agreement*/
    @MetaField
    private String employeeCommissionAgreementObligation;

    /*Right to do something under the terms of Employee Commission Agreement*/
    @MetaField
    private String employeeCommissionAgreementEntitlement;

    /*Reference to the regulation which is defined in Employee Commission Agreement*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object employeeCommissionAgreementRegulationReference;

    /*A Classification that distinguishes between the regularity domains of Employee Commission Agreement*/
    @MetaField
    private String employeeCommissionAgreementRegulationType;

    /*Reference to the jurisdiction that is assigned to Employee Commission Agreement in case of legal dispute.*/
    @MetaField
    private String employeeCommissionAgreementJurisdiction;

    /*Reference to the account which is linked to Employee Commission Agreement*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object employeeCommissionAgreementAccountReference;

    public void setEmployeeCommissionAgreementParameterType(String employeeCommissionAgreementParameterType) {
        this.employeeCommissionAgreementParameterType = employeeCommissionAgreementParameterType;
    }

    public String getEmployeeCommissionAgreementParameterType() {
        return employeeCommissionAgreementParameterType;
    }

    public void setEmployeeCommissionAgreementSelectedOption(String employeeCommissionAgreementSelectedOption) {
        this.employeeCommissionAgreementSelectedOption = employeeCommissionAgreementSelectedOption;
    }

    public String getEmployeeCommissionAgreementSelectedOption() {
        return employeeCommissionAgreementSelectedOption;
    }

    public void setEmployeeCommissionAgreementType(String employeeCommissionAgreementType) {
        this.employeeCommissionAgreementType = employeeCommissionAgreementType;
    }

    public String getEmployeeCommissionAgreementType() {
        return employeeCommissionAgreementType;
    }

    public void setEmployeeCommissionAgreementReference(org.museframework.bian.classes.Object employeeCommissionAgreementReference) {
        this.employeeCommissionAgreementReference = employeeCommissionAgreementReference;
    }

    public org.museframework.bian.classes.Object getEmployeeCommissionAgreementReference() {
        return employeeCommissionAgreementReference;
    }

    public void setEmployeeCommissionAgreementRequest(String employeeCommissionAgreementRequest) {
        this.employeeCommissionAgreementRequest = employeeCommissionAgreementRequest;
    }

    public String getEmployeeCommissionAgreementRequest() {
        return employeeCommissionAgreementRequest;
    }

    public void setEmployeeCommissionAgreementSchedule(String employeeCommissionAgreementSchedule) {
        this.employeeCommissionAgreementSchedule = employeeCommissionAgreementSchedule;
    }

    public String getEmployeeCommissionAgreementSchedule() {
        return employeeCommissionAgreementSchedule;
    }

    public void setEmployeeCommissionAgreementStatus(String employeeCommissionAgreementStatus) {
        this.employeeCommissionAgreementStatus = employeeCommissionAgreementStatus;
    }

    public String getEmployeeCommissionAgreementStatus() {
        return employeeCommissionAgreementStatus;
    }

    public void setEmployeeCommissionAgreementAssociatedParty(String employeeCommissionAgreementAssociatedParty) {
        this.employeeCommissionAgreementAssociatedParty = employeeCommissionAgreementAssociatedParty;
    }

    public String getEmployeeCommissionAgreementAssociatedParty() {
        return employeeCommissionAgreementAssociatedParty;
    }

    public void setEmployeeCommissionAgreementCustomerReference(org.museframework.bian.classes.Object employeeCommissionAgreementCustomerReference) {
        this.employeeCommissionAgreementCustomerReference = employeeCommissionAgreementCustomerReference;
    }

    public org.museframework.bian.classes.Object getEmployeeCommissionAgreementCustomerReference() {
        return employeeCommissionAgreementCustomerReference;
    }

    public void setEmployeeCommissionAgreementObligation(String employeeCommissionAgreementObligation) {
        this.employeeCommissionAgreementObligation = employeeCommissionAgreementObligation;
    }

    public String getEmployeeCommissionAgreementObligation() {
        return employeeCommissionAgreementObligation;
    }

    public void setEmployeeCommissionAgreementEntitlement(String employeeCommissionAgreementEntitlement) {
        this.employeeCommissionAgreementEntitlement = employeeCommissionAgreementEntitlement;
    }

    public String getEmployeeCommissionAgreementEntitlement() {
        return employeeCommissionAgreementEntitlement;
    }

    public void setEmployeeCommissionAgreementRegulationReference(org.museframework.bian.classes.Object employeeCommissionAgreementRegulationReference) {
        this.employeeCommissionAgreementRegulationReference = employeeCommissionAgreementRegulationReference;
    }

    public org.museframework.bian.classes.Object getEmployeeCommissionAgreementRegulationReference() {
        return employeeCommissionAgreementRegulationReference;
    }

    public void setEmployeeCommissionAgreementRegulationType(String employeeCommissionAgreementRegulationType) {
        this.employeeCommissionAgreementRegulationType = employeeCommissionAgreementRegulationType;
    }

    public String getEmployeeCommissionAgreementRegulationType() {
        return employeeCommissionAgreementRegulationType;
    }

    public void setEmployeeCommissionAgreementJurisdiction(String employeeCommissionAgreementJurisdiction) {
        this.employeeCommissionAgreementJurisdiction = employeeCommissionAgreementJurisdiction;
    }

    public String getEmployeeCommissionAgreementJurisdiction() {
        return employeeCommissionAgreementJurisdiction;
    }

    public void setEmployeeCommissionAgreementAccountReference(org.museframework.bian.classes.Object employeeCommissionAgreementAccountReference) {
        this.employeeCommissionAgreementAccountReference = employeeCommissionAgreementAccountReference;
    }

    public org.museframework.bian.classes.Object getEmployeeCommissionAgreementAccountReference() {
        return employeeCommissionAgreementAccountReference;
    }
}