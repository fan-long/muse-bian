/*Maintain the terms and conditions that apply to a commercial relationship within Contractor and Supplier Agreement.

*/
package org.museframework.bian.conandsupagr.dto.cr;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

//refer to BOClass org.museframework.bian.classes.SupplierAgreement
@MetaDto
public class SupplierAgreement {
    /*A Classification value that distinguishes between Options defined within Supplier Agreement*/
    @MetaField
    private String supplierAgreementParameterType;

    /*A selected optional feature in a product, identified by Parameter Type*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Feature supplierAgreementSelectedOption;

    /*A Classification value that distinguishes between the subject matters of Supplier Agreement*/
    @MetaField(ref=true)
    private org.museframework.bian.enumerations.Agreementtypevalues supplierAgreementType;

    /*An unique reference to an item or an occurrence of Supplier Agreement*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Agreement supplierAgreementReference;

    /*Request to discharge Supplier Agreement*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Instruction supplierAgreementDischargeRequest;

    /*Timetable to discharge Supplier Agreement*/
    @MetaField
    private String supplierAgreementDischargeSchedule;

    /*The status of Supplier Agreement*/
    @MetaField
    private String supplierAgreementStatus;

    /*Party who is involved in Supplier Agreement*/
    @MetaField
    private String supplierAgreementAssociatedParty;

    /*Reference to the customer who is involved in Supplier Agreement*/
    @MetaField
    private String supplierAgreementCustomerReference;

    /*Liability or duty to do something under the terms of Supplier Agreement*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Arrangement supplierAgreementObligation;

    /*Right to do something under the terms of Supplier Agreement*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Arrangement supplierAgreementEntitlement;

    /*Reference to the regulation which is defined in Supplier Agreement*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.RuleSet supplierAgreementRegulationReference;

    /*A Classification that distinguishes between the regularity domains of Supplier Agreement*/
    @MetaField
    private String supplierAgreementRegulationType;

    /*Reference to the jurisdiction that is assigned to Supplier Agreement in case of legal dispute.*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Jurisdiction supplierAgreementJurisdiction;

    /*Reference to the account which is linked to Supplier Agreement

A characteristic of agreement which refers to its involved account to specify the account that will be used to register for the transactions in position keeping management.*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Account supplierAgreementAccountReference;

    /*The subject matter of  Supplier Agreement*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object supplierAgreementSubjectMatter;

    /*Reference to the product which is linked to Supplier Agreement

Comment: 
A characteristic of agreement which refers to its related products that are sold by agreement.*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.BankingProduct supplierAgreementProductReference;

    /*Reference to the agreement that is related to Supplier Agreement*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Agreement supplierAgreementAssociatedAgreementReference;

    public void setSupplierAgreementParameterType(String supplierAgreementParameterType) {
        this.supplierAgreementParameterType = supplierAgreementParameterType;
    }

    public String getSupplierAgreementParameterType() {
        return supplierAgreementParameterType;
    }

    public void setSupplierAgreementSelectedOption(org.museframework.bian.classes.Feature supplierAgreementSelectedOption) {
        this.supplierAgreementSelectedOption = supplierAgreementSelectedOption;
    }

    public org.museframework.bian.classes.Feature getSupplierAgreementSelectedOption() {
        return supplierAgreementSelectedOption;
    }

    public void setSupplierAgreementType(org.museframework.bian.enumerations.Agreementtypevalues supplierAgreementType) {
        this.supplierAgreementType = supplierAgreementType;
    }

    public org.museframework.bian.enumerations.Agreementtypevalues getSupplierAgreementType() {
        return supplierAgreementType;
    }

    public void setSupplierAgreementReference(org.museframework.bian.classes.Agreement supplierAgreementReference) {
        this.supplierAgreementReference = supplierAgreementReference;
    }

    public org.museframework.bian.classes.Agreement getSupplierAgreementReference() {
        return supplierAgreementReference;
    }

    public void setSupplierAgreementDischargeRequest(org.museframework.bian.classes.Instruction supplierAgreementDischargeRequest) {
        this.supplierAgreementDischargeRequest = supplierAgreementDischargeRequest;
    }

    public org.museframework.bian.classes.Instruction getSupplierAgreementDischargeRequest() {
        return supplierAgreementDischargeRequest;
    }

    public void setSupplierAgreementDischargeSchedule(String supplierAgreementDischargeSchedule) {
        this.supplierAgreementDischargeSchedule = supplierAgreementDischargeSchedule;
    }

    public String getSupplierAgreementDischargeSchedule() {
        return supplierAgreementDischargeSchedule;
    }

    public void setSupplierAgreementStatus(String supplierAgreementStatus) {
        this.supplierAgreementStatus = supplierAgreementStatus;
    }

    public String getSupplierAgreementStatus() {
        return supplierAgreementStatus;
    }

    public void setSupplierAgreementAssociatedParty(String supplierAgreementAssociatedParty) {
        this.supplierAgreementAssociatedParty = supplierAgreementAssociatedParty;
    }

    public String getSupplierAgreementAssociatedParty() {
        return supplierAgreementAssociatedParty;
    }

    public void setSupplierAgreementCustomerReference(String supplierAgreementCustomerReference) {
        this.supplierAgreementCustomerReference = supplierAgreementCustomerReference;
    }

    public String getSupplierAgreementCustomerReference() {
        return supplierAgreementCustomerReference;
    }

    public void setSupplierAgreementObligation(org.museframework.bian.classes.Arrangement supplierAgreementObligation) {
        this.supplierAgreementObligation = supplierAgreementObligation;
    }

    public org.museframework.bian.classes.Arrangement getSupplierAgreementObligation() {
        return supplierAgreementObligation;
    }

    public void setSupplierAgreementEntitlement(org.museframework.bian.classes.Arrangement supplierAgreementEntitlement) {
        this.supplierAgreementEntitlement = supplierAgreementEntitlement;
    }

    public org.museframework.bian.classes.Arrangement getSupplierAgreementEntitlement() {
        return supplierAgreementEntitlement;
    }

    public void setSupplierAgreementRegulationReference(org.museframework.bian.classes.RuleSet supplierAgreementRegulationReference) {
        this.supplierAgreementRegulationReference = supplierAgreementRegulationReference;
    }

    public org.museframework.bian.classes.RuleSet getSupplierAgreementRegulationReference() {
        return supplierAgreementRegulationReference;
    }

    public void setSupplierAgreementRegulationType(String supplierAgreementRegulationType) {
        this.supplierAgreementRegulationType = supplierAgreementRegulationType;
    }

    public String getSupplierAgreementRegulationType() {
        return supplierAgreementRegulationType;
    }

    public void setSupplierAgreementJurisdiction(org.museframework.bian.classes.Jurisdiction supplierAgreementJurisdiction) {
        this.supplierAgreementJurisdiction = supplierAgreementJurisdiction;
    }

    public org.museframework.bian.classes.Jurisdiction getSupplierAgreementJurisdiction() {
        return supplierAgreementJurisdiction;
    }

    public void setSupplierAgreementAccountReference(org.museframework.bian.classes.Account supplierAgreementAccountReference) {
        this.supplierAgreementAccountReference = supplierAgreementAccountReference;
    }

    public org.museframework.bian.classes.Account getSupplierAgreementAccountReference() {
        return supplierAgreementAccountReference;
    }

    public void setSupplierAgreementSubjectMatter(org.museframework.bian.classes.Object supplierAgreementSubjectMatter) {
        this.supplierAgreementSubjectMatter = supplierAgreementSubjectMatter;
    }

    public org.museframework.bian.classes.Object getSupplierAgreementSubjectMatter() {
        return supplierAgreementSubjectMatter;
    }

    public void setSupplierAgreementProductReference(org.museframework.bian.classes.BankingProduct supplierAgreementProductReference) {
        this.supplierAgreementProductReference = supplierAgreementProductReference;
    }

    public org.museframework.bian.classes.BankingProduct getSupplierAgreementProductReference() {
        return supplierAgreementProductReference;
    }

    public void setSupplierAgreementAssociatedAgreementReference(org.museframework.bian.classes.Agreement supplierAgreementAssociatedAgreementReference) {
        this.supplierAgreementAssociatedAgreementReference = supplierAgreementAssociatedAgreementReference;
    }

    public org.museframework.bian.classes.Agreement getSupplierAgreementAssociatedAgreementReference() {
        return supplierAgreementAssociatedAgreementReference;
    }
}