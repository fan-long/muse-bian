/*Maintain the terms and conditions that apply to a commercial relationship within Customer Proposition.

*/
package org.museframework.bian.customerproposition.dto.cr;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

//refer to BOClass org.museframework.bian.classes.CustomerPropositionAgreement
@MetaDto
public class CustomerPropositionAgreement {
    /*A Classification value that distinguishes between Options defined within Customer Proposition Agreement*/
    @MetaField
    private String customerPropositionAgreementParameterType;

    /*A selected optional feature in a product, identified by Parameter Type*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Feature customerPropositionAgreementSelectedOption;

    /*A Classification value that distinguishes between the subject matters of Customer Proposition Agreement*/
    @MetaField(ref=true)
    private org.museframework.bian.enumerations.Agreementtypevalues customerPropositionAgreementType;

    /*An unique reference to an item or an occurrence of Customer Proposition Agreement*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Agreement customerPropositionAgreementReference;

    /*Request to discharge Customer Proposition Agreement*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Instruction customerPropositionAgreementDischargeRequest;

    /*Timetable to discharge Customer Proposition Agreement*/
    @MetaField
    private String customerPropositionAgreementDischargeSchedule;

    /*The status of Customer Proposition Agreement*/
    @MetaField
    private String customerPropositionAgreementStatus;

    /*Party who is involved in Customer Proposition Agreement*/
    @MetaField
    private String customerPropositionAgreementAssociatedParty;

    /*Reference to the customer who is involved in Customer Proposition Agreement*/
    @MetaField
    private String customerPropositionAgreementCustomerReference;

    /*Liability or duty to do something under the terms of Customer Proposition Agreement*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Arrangement customerPropositionAgreementObligation;

    /*Right to do something under the terms of Customer Proposition Agreement*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Arrangement customerPropositionAgreementEntitlement;

    /*Reference to the regulation which is defined in Customer Proposition Agreement*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.RuleSet customerPropositionAgreementRegulationReference;

    /*A Classification that distinguishes between the regularity domains of Customer Proposition Agreement*/
    @MetaField
    private String customerPropositionAgreementRegulationType;

    /*Reference to the jurisdiction that is assigned to Customer Proposition Agreement in case of legal dispute.*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Jurisdiction customerPropositionAgreementJurisdiction;

    /*Reference to the account which is linked to Customer Proposition Agreement

A characteristic of agreement which refers to its involved account to specify the account that will be used to register for the transactions in position keeping management.*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Account customerPropositionAgreementAccountReference;

    /*The subject matter of  Customer Proposition Agreement*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object customerPropositionAgreementSubjectMatter;

    /*Reference to the product which is linked to Customer Proposition Agreement

Comment: 
A characteristic of agreement which refers to its related products that are sold by agreement.*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.BankingProduct customerPropositionAgreementProductReference;

    /*Reference to the agreement that is related to Customer Proposition Agreement*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Agreement customerPropositionAgreementAssociatedAgreementReference;

    public void setCustomerPropositionAgreementParameterType(String customerPropositionAgreementParameterType) {
        this.customerPropositionAgreementParameterType = customerPropositionAgreementParameterType;
    }

    public String getCustomerPropositionAgreementParameterType() {
        return customerPropositionAgreementParameterType;
    }

    public void setCustomerPropositionAgreementSelectedOption(org.museframework.bian.classes.Feature customerPropositionAgreementSelectedOption) {
        this.customerPropositionAgreementSelectedOption = customerPropositionAgreementSelectedOption;
    }

    public org.museframework.bian.classes.Feature getCustomerPropositionAgreementSelectedOption() {
        return customerPropositionAgreementSelectedOption;
    }

    public void setCustomerPropositionAgreementType(org.museframework.bian.enumerations.Agreementtypevalues customerPropositionAgreementType) {
        this.customerPropositionAgreementType = customerPropositionAgreementType;
    }

    public org.museframework.bian.enumerations.Agreementtypevalues getCustomerPropositionAgreementType() {
        return customerPropositionAgreementType;
    }

    public void setCustomerPropositionAgreementReference(org.museframework.bian.classes.Agreement customerPropositionAgreementReference) {
        this.customerPropositionAgreementReference = customerPropositionAgreementReference;
    }

    public org.museframework.bian.classes.Agreement getCustomerPropositionAgreementReference() {
        return customerPropositionAgreementReference;
    }

    public void setCustomerPropositionAgreementDischargeRequest(org.museframework.bian.classes.Instruction customerPropositionAgreementDischargeRequest) {
        this.customerPropositionAgreementDischargeRequest = customerPropositionAgreementDischargeRequest;
    }

    public org.museframework.bian.classes.Instruction getCustomerPropositionAgreementDischargeRequest() {
        return customerPropositionAgreementDischargeRequest;
    }

    public void setCustomerPropositionAgreementDischargeSchedule(String customerPropositionAgreementDischargeSchedule) {
        this.customerPropositionAgreementDischargeSchedule = customerPropositionAgreementDischargeSchedule;
    }

    public String getCustomerPropositionAgreementDischargeSchedule() {
        return customerPropositionAgreementDischargeSchedule;
    }

    public void setCustomerPropositionAgreementStatus(String customerPropositionAgreementStatus) {
        this.customerPropositionAgreementStatus = customerPropositionAgreementStatus;
    }

    public String getCustomerPropositionAgreementStatus() {
        return customerPropositionAgreementStatus;
    }

    public void setCustomerPropositionAgreementAssociatedParty(String customerPropositionAgreementAssociatedParty) {
        this.customerPropositionAgreementAssociatedParty = customerPropositionAgreementAssociatedParty;
    }

    public String getCustomerPropositionAgreementAssociatedParty() {
        return customerPropositionAgreementAssociatedParty;
    }

    public void setCustomerPropositionAgreementCustomerReference(String customerPropositionAgreementCustomerReference) {
        this.customerPropositionAgreementCustomerReference = customerPropositionAgreementCustomerReference;
    }

    public String getCustomerPropositionAgreementCustomerReference() {
        return customerPropositionAgreementCustomerReference;
    }

    public void setCustomerPropositionAgreementObligation(org.museframework.bian.classes.Arrangement customerPropositionAgreementObligation) {
        this.customerPropositionAgreementObligation = customerPropositionAgreementObligation;
    }

    public org.museframework.bian.classes.Arrangement getCustomerPropositionAgreementObligation() {
        return customerPropositionAgreementObligation;
    }

    public void setCustomerPropositionAgreementEntitlement(org.museframework.bian.classes.Arrangement customerPropositionAgreementEntitlement) {
        this.customerPropositionAgreementEntitlement = customerPropositionAgreementEntitlement;
    }

    public org.museframework.bian.classes.Arrangement getCustomerPropositionAgreementEntitlement() {
        return customerPropositionAgreementEntitlement;
    }

    public void setCustomerPropositionAgreementRegulationReference(org.museframework.bian.classes.RuleSet customerPropositionAgreementRegulationReference) {
        this.customerPropositionAgreementRegulationReference = customerPropositionAgreementRegulationReference;
    }

    public org.museframework.bian.classes.RuleSet getCustomerPropositionAgreementRegulationReference() {
        return customerPropositionAgreementRegulationReference;
    }

    public void setCustomerPropositionAgreementRegulationType(String customerPropositionAgreementRegulationType) {
        this.customerPropositionAgreementRegulationType = customerPropositionAgreementRegulationType;
    }

    public String getCustomerPropositionAgreementRegulationType() {
        return customerPropositionAgreementRegulationType;
    }

    public void setCustomerPropositionAgreementJurisdiction(org.museframework.bian.classes.Jurisdiction customerPropositionAgreementJurisdiction) {
        this.customerPropositionAgreementJurisdiction = customerPropositionAgreementJurisdiction;
    }

    public org.museframework.bian.classes.Jurisdiction getCustomerPropositionAgreementJurisdiction() {
        return customerPropositionAgreementJurisdiction;
    }

    public void setCustomerPropositionAgreementAccountReference(org.museframework.bian.classes.Account customerPropositionAgreementAccountReference) {
        this.customerPropositionAgreementAccountReference = customerPropositionAgreementAccountReference;
    }

    public org.museframework.bian.classes.Account getCustomerPropositionAgreementAccountReference() {
        return customerPropositionAgreementAccountReference;
    }

    public void setCustomerPropositionAgreementSubjectMatter(org.museframework.bian.classes.Object customerPropositionAgreementSubjectMatter) {
        this.customerPropositionAgreementSubjectMatter = customerPropositionAgreementSubjectMatter;
    }

    public org.museframework.bian.classes.Object getCustomerPropositionAgreementSubjectMatter() {
        return customerPropositionAgreementSubjectMatter;
    }

    public void setCustomerPropositionAgreementProductReference(org.museframework.bian.classes.BankingProduct customerPropositionAgreementProductReference) {
        this.customerPropositionAgreementProductReference = customerPropositionAgreementProductReference;
    }

    public org.museframework.bian.classes.BankingProduct getCustomerPropositionAgreementProductReference() {
        return customerPropositionAgreementProductReference;
    }

    public void setCustomerPropositionAgreementAssociatedAgreementReference(org.museframework.bian.classes.Agreement customerPropositionAgreementAssociatedAgreementReference) {
        this.customerPropositionAgreementAssociatedAgreementReference = customerPropositionAgreementAssociatedAgreementReference;
    }

    public org.museframework.bian.classes.Agreement getCustomerPropositionAgreementAssociatedAgreementReference() {
        return customerPropositionAgreementAssociatedAgreementReference;
    }
}