/*Maintain the terms and conditions that apply to a commercial relationship within Sub Custodian Agreement.

*/
package org.museframework.bian.subcusagr.dto.cr;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

//refer to BOClass org.museframework.bian.classes.SubCustodianAgreement
@MetaDto
public class SubCustodianAgreement {
    /*A Classification value that distinguishes between Options defined within Sub Custodian Agreement*/
    @MetaField(0)
    private String subCustodianAgreementParameterType;

    /*A selected optional feature in a product, identified by Parameter Type*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Feature subCustodianAgreementSelectedOption;

    /*A Classification value that distinguishes between the subject matters of Sub Custodian Agreement*/
    @MetaField(ref=true)
    private org.museframework.bian.enumerations.Agreementtypevalues subCustodianAgreementType;

    /*An unique reference to an item or an occurrence of Sub Custodian Agreement*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Agreement subCustodianAgreementReference;

    /*Request to discharge Sub Custodian Agreement*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Instruction subCustodianAgreementDischargeRequest;

    /*Timetable to discharge Sub Custodian Agreement*/
    @MetaField(0)
    private String subCustodianAgreementDischargeSchedule;

    /*The status of Sub Custodian Agreement*/
    @MetaField(0)
    private String subCustodianAgreementStatus;

    /*Party who is involved in Sub Custodian Agreement*/
    @MetaField(0)
    private String subCustodianAgreementAssociatedParty;

    /*Reference to the customer who is involved in Sub Custodian Agreement*/
    @MetaField(0)
    private String subCustodianAgreementCustomerReference;

    /*Liability or duty to do something under the terms of Sub Custodian Agreement*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Arrangement subCustodianAgreementObligation;

    /*Right to do something under the terms of Sub Custodian Agreement*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Arrangement subCustodianAgreementEntitlement;

    /*Reference to the regulation which is defined in Sub Custodian Agreement*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.RuleSet subCustodianAgreementRegulationReference;

    /*A Classification that distinguishes between the regularity domains of Sub Custodian Agreement*/
    @MetaField(0)
    private String subCustodianAgreementRegulationType;

    /*Reference to the jurisdiction that is assigned to Sub Custodian Agreement in case of legal dispute.*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Jurisdiction subCustodianAgreementJurisdiction;

    /*Reference to the account which is linked to Sub Custodian Agreement

A characteristic of agreement which refers to its involved account to specify the account that will be used to register for the transactions in position keeping management.*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Account subCustodianAgreementAccountReference;

    /*The subject matter of  Sub Custodian Agreement*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object subCustodianAgreementSubjectMatter;

    /*Reference to the product which is linked to Sub Custodian Agreement

Comment: 
A characteristic of agreement which refers to its related products that are sold by agreement.*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.BankingProduct subCustodianAgreementProductReference;

    /*Reference to the agreement that is related to Sub Custodian Agreement*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Agreement subCustodianAgreementAssociatedAgreementReference;

    public void setSubCustodianAgreementParameterType(String subCustodianAgreementParameterType) {
        this.subCustodianAgreementParameterType = subCustodianAgreementParameterType;
    }

    public String getSubCustodianAgreementParameterType() {
        return subCustodianAgreementParameterType;
    }

    public void setSubCustodianAgreementSelectedOption(org.museframework.bian.classes.Feature subCustodianAgreementSelectedOption) {
        this.subCustodianAgreementSelectedOption = subCustodianAgreementSelectedOption;
    }

    public org.museframework.bian.classes.Feature getSubCustodianAgreementSelectedOption() {
        return subCustodianAgreementSelectedOption;
    }

    public void setSubCustodianAgreementType(org.museframework.bian.enumerations.Agreementtypevalues subCustodianAgreementType) {
        this.subCustodianAgreementType = subCustodianAgreementType;
    }

    public org.museframework.bian.enumerations.Agreementtypevalues getSubCustodianAgreementType() {
        return subCustodianAgreementType;
    }

    public void setSubCustodianAgreementReference(org.museframework.bian.classes.Agreement subCustodianAgreementReference) {
        this.subCustodianAgreementReference = subCustodianAgreementReference;
    }

    public org.museframework.bian.classes.Agreement getSubCustodianAgreementReference() {
        return subCustodianAgreementReference;
    }

    public void setSubCustodianAgreementDischargeRequest(org.museframework.bian.classes.Instruction subCustodianAgreementDischargeRequest) {
        this.subCustodianAgreementDischargeRequest = subCustodianAgreementDischargeRequest;
    }

    public org.museframework.bian.classes.Instruction getSubCustodianAgreementDischargeRequest() {
        return subCustodianAgreementDischargeRequest;
    }

    public void setSubCustodianAgreementDischargeSchedule(String subCustodianAgreementDischargeSchedule) {
        this.subCustodianAgreementDischargeSchedule = subCustodianAgreementDischargeSchedule;
    }

    public String getSubCustodianAgreementDischargeSchedule() {
        return subCustodianAgreementDischargeSchedule;
    }

    public void setSubCustodianAgreementStatus(String subCustodianAgreementStatus) {
        this.subCustodianAgreementStatus = subCustodianAgreementStatus;
    }

    public String getSubCustodianAgreementStatus() {
        return subCustodianAgreementStatus;
    }

    public void setSubCustodianAgreementAssociatedParty(String subCustodianAgreementAssociatedParty) {
        this.subCustodianAgreementAssociatedParty = subCustodianAgreementAssociatedParty;
    }

    public String getSubCustodianAgreementAssociatedParty() {
        return subCustodianAgreementAssociatedParty;
    }

    public void setSubCustodianAgreementCustomerReference(String subCustodianAgreementCustomerReference) {
        this.subCustodianAgreementCustomerReference = subCustodianAgreementCustomerReference;
    }

    public String getSubCustodianAgreementCustomerReference() {
        return subCustodianAgreementCustomerReference;
    }

    public void setSubCustodianAgreementObligation(org.museframework.bian.classes.Arrangement subCustodianAgreementObligation) {
        this.subCustodianAgreementObligation = subCustodianAgreementObligation;
    }

    public org.museframework.bian.classes.Arrangement getSubCustodianAgreementObligation() {
        return subCustodianAgreementObligation;
    }

    public void setSubCustodianAgreementEntitlement(org.museframework.bian.classes.Arrangement subCustodianAgreementEntitlement) {
        this.subCustodianAgreementEntitlement = subCustodianAgreementEntitlement;
    }

    public org.museframework.bian.classes.Arrangement getSubCustodianAgreementEntitlement() {
        return subCustodianAgreementEntitlement;
    }

    public void setSubCustodianAgreementRegulationReference(org.museframework.bian.classes.RuleSet subCustodianAgreementRegulationReference) {
        this.subCustodianAgreementRegulationReference = subCustodianAgreementRegulationReference;
    }

    public org.museframework.bian.classes.RuleSet getSubCustodianAgreementRegulationReference() {
        return subCustodianAgreementRegulationReference;
    }

    public void setSubCustodianAgreementRegulationType(String subCustodianAgreementRegulationType) {
        this.subCustodianAgreementRegulationType = subCustodianAgreementRegulationType;
    }

    public String getSubCustodianAgreementRegulationType() {
        return subCustodianAgreementRegulationType;
    }

    public void setSubCustodianAgreementJurisdiction(org.museframework.bian.classes.Jurisdiction subCustodianAgreementJurisdiction) {
        this.subCustodianAgreementJurisdiction = subCustodianAgreementJurisdiction;
    }

    public org.museframework.bian.classes.Jurisdiction getSubCustodianAgreementJurisdiction() {
        return subCustodianAgreementJurisdiction;
    }

    public void setSubCustodianAgreementAccountReference(org.museframework.bian.classes.Account subCustodianAgreementAccountReference) {
        this.subCustodianAgreementAccountReference = subCustodianAgreementAccountReference;
    }

    public org.museframework.bian.classes.Account getSubCustodianAgreementAccountReference() {
        return subCustodianAgreementAccountReference;
    }

    public void setSubCustodianAgreementSubjectMatter(org.museframework.bian.classes.Object subCustodianAgreementSubjectMatter) {
        this.subCustodianAgreementSubjectMatter = subCustodianAgreementSubjectMatter;
    }

    public org.museframework.bian.classes.Object getSubCustodianAgreementSubjectMatter() {
        return subCustodianAgreementSubjectMatter;
    }

    public void setSubCustodianAgreementProductReference(org.museframework.bian.classes.BankingProduct subCustodianAgreementProductReference) {
        this.subCustodianAgreementProductReference = subCustodianAgreementProductReference;
    }

    public org.museframework.bian.classes.BankingProduct getSubCustodianAgreementProductReference() {
        return subCustodianAgreementProductReference;
    }

    public void setSubCustodianAgreementAssociatedAgreementReference(org.museframework.bian.classes.Agreement subCustodianAgreementAssociatedAgreementReference) {
        this.subCustodianAgreementAssociatedAgreementReference = subCustodianAgreementAssociatedAgreementReference;
    }

    public org.museframework.bian.classes.Agreement getSubCustodianAgreementAssociatedAgreementReference() {
        return subCustodianAgreementAssociatedAgreementReference;
    }
}