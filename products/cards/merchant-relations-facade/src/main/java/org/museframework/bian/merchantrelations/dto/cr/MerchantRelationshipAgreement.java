/*Maintain the terms and conditions that apply to a commercial relationship within Merchant Relations.

*/
package org.museframework.bian.merchantrelations.dto.cr;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

//refer to BOClass org.museframework.bian.classes.MerchantRelationshipAgreement
@MetaDto
public class MerchantRelationshipAgreement {
    /*A Classification value that distinguishes between Options defined within Merchant Relationship Agreement*/
    @MetaField
    private String merchantRelationshipAgreementParameterType;

    /*A selected optional feature in a product, identified by Parameter Type*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Feature merchantRelationshipAgreementSelectedOption;

    /*A Classification value that distinguishes between the subject matters of Merchant Relationship Agreement*/
    @MetaField(ref=true)
    private org.museframework.bian.enumerations.Agreementtypevalues merchantRelationshipAgreementType;

    /*An unique reference to an item or an occurrence of Merchant Relationship Agreement*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Agreement merchantRelationshipAgreementReference;

    /*Request to discharge Merchant Relationship Agreement*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Instruction merchantRelationshipAgreementDischargeRequest;

    /*Timetable to discharge Merchant Relationship Agreement*/
    @MetaField
    private String merchantRelationshipAgreementDischargeSchedule;

    /*The status of Merchant Relationship Agreement*/
    @MetaField
    private String merchantRelationshipAgreementStatus;

    /*Party who is involved in Merchant Relationship Agreement*/
    @MetaField
    private String merchantRelationshipAgreementAssociatedParty;

    /*Reference to the customer who is involved in Merchant Relationship Agreement*/
    @MetaField
    private String merchantRelationshipAgreementCustomerReference;

    /*Liability or duty to do something under the terms of Merchant Relationship Agreement*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Arrangement merchantRelationshipAgreementObligation;

    /*Right to do something under the terms of Merchant Relationship Agreement*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Arrangement merchantRelationshipAgreementEntitlement;

    /*Reference to the regulation which is defined in Merchant Relationship Agreement*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.RuleSet merchantRelationshipAgreementRegulationReference;

    /*A Classification that distinguishes between the regularity domains of Merchant Relationship Agreement*/
    @MetaField
    private String merchantRelationshipAgreementRegulationType;

    /*Reference to the jurisdiction that is assigned to Merchant Relationship Agreement in case of legal dispute.*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Jurisdiction merchantRelationshipAgreementJurisdiction;

    /*Reference to the account which is linked to Merchant Relationship Agreement

A characteristic of agreement which refers to its involved account to specify the account that will be used to register for the transactions in position keeping management.*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Account merchantRelationshipAgreementAccountReference;

    /*The subject matter of  Merchant Relationship Agreement*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object merchantRelationshipAgreementSubjectMatter;

    /*Reference to the product which is linked to Merchant Relationship Agreement

Comment: 
A characteristic of agreement which refers to its related products that are sold by agreement.*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.BankingProduct merchantRelationshipAgreementProductReference;

    /*Reference to the agreement that is related to Merchant Relationship Agreement*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Agreement merchantRelationshipAgreementAssociatedAgreementReference;

    public void setMerchantRelationshipAgreementParameterType(String merchantRelationshipAgreementParameterType) {
        this.merchantRelationshipAgreementParameterType = merchantRelationshipAgreementParameterType;
    }

    public String getMerchantRelationshipAgreementParameterType() {
        return merchantRelationshipAgreementParameterType;
    }

    public void setMerchantRelationshipAgreementSelectedOption(org.museframework.bian.classes.Feature merchantRelationshipAgreementSelectedOption) {
        this.merchantRelationshipAgreementSelectedOption = merchantRelationshipAgreementSelectedOption;
    }

    public org.museframework.bian.classes.Feature getMerchantRelationshipAgreementSelectedOption() {
        return merchantRelationshipAgreementSelectedOption;
    }

    public void setMerchantRelationshipAgreementType(org.museframework.bian.enumerations.Agreementtypevalues merchantRelationshipAgreementType) {
        this.merchantRelationshipAgreementType = merchantRelationshipAgreementType;
    }

    public org.museframework.bian.enumerations.Agreementtypevalues getMerchantRelationshipAgreementType() {
        return merchantRelationshipAgreementType;
    }

    public void setMerchantRelationshipAgreementReference(org.museframework.bian.classes.Agreement merchantRelationshipAgreementReference) {
        this.merchantRelationshipAgreementReference = merchantRelationshipAgreementReference;
    }

    public org.museframework.bian.classes.Agreement getMerchantRelationshipAgreementReference() {
        return merchantRelationshipAgreementReference;
    }

    public void setMerchantRelationshipAgreementDischargeRequest(org.museframework.bian.classes.Instruction merchantRelationshipAgreementDischargeRequest) {
        this.merchantRelationshipAgreementDischargeRequest = merchantRelationshipAgreementDischargeRequest;
    }

    public org.museframework.bian.classes.Instruction getMerchantRelationshipAgreementDischargeRequest() {
        return merchantRelationshipAgreementDischargeRequest;
    }

    public void setMerchantRelationshipAgreementDischargeSchedule(String merchantRelationshipAgreementDischargeSchedule) {
        this.merchantRelationshipAgreementDischargeSchedule = merchantRelationshipAgreementDischargeSchedule;
    }

    public String getMerchantRelationshipAgreementDischargeSchedule() {
        return merchantRelationshipAgreementDischargeSchedule;
    }

    public void setMerchantRelationshipAgreementStatus(String merchantRelationshipAgreementStatus) {
        this.merchantRelationshipAgreementStatus = merchantRelationshipAgreementStatus;
    }

    public String getMerchantRelationshipAgreementStatus() {
        return merchantRelationshipAgreementStatus;
    }

    public void setMerchantRelationshipAgreementAssociatedParty(String merchantRelationshipAgreementAssociatedParty) {
        this.merchantRelationshipAgreementAssociatedParty = merchantRelationshipAgreementAssociatedParty;
    }

    public String getMerchantRelationshipAgreementAssociatedParty() {
        return merchantRelationshipAgreementAssociatedParty;
    }

    public void setMerchantRelationshipAgreementCustomerReference(String merchantRelationshipAgreementCustomerReference) {
        this.merchantRelationshipAgreementCustomerReference = merchantRelationshipAgreementCustomerReference;
    }

    public String getMerchantRelationshipAgreementCustomerReference() {
        return merchantRelationshipAgreementCustomerReference;
    }

    public void setMerchantRelationshipAgreementObligation(org.museframework.bian.classes.Arrangement merchantRelationshipAgreementObligation) {
        this.merchantRelationshipAgreementObligation = merchantRelationshipAgreementObligation;
    }

    public org.museframework.bian.classes.Arrangement getMerchantRelationshipAgreementObligation() {
        return merchantRelationshipAgreementObligation;
    }

    public void setMerchantRelationshipAgreementEntitlement(org.museframework.bian.classes.Arrangement merchantRelationshipAgreementEntitlement) {
        this.merchantRelationshipAgreementEntitlement = merchantRelationshipAgreementEntitlement;
    }

    public org.museframework.bian.classes.Arrangement getMerchantRelationshipAgreementEntitlement() {
        return merchantRelationshipAgreementEntitlement;
    }

    public void setMerchantRelationshipAgreementRegulationReference(org.museframework.bian.classes.RuleSet merchantRelationshipAgreementRegulationReference) {
        this.merchantRelationshipAgreementRegulationReference = merchantRelationshipAgreementRegulationReference;
    }

    public org.museframework.bian.classes.RuleSet getMerchantRelationshipAgreementRegulationReference() {
        return merchantRelationshipAgreementRegulationReference;
    }

    public void setMerchantRelationshipAgreementRegulationType(String merchantRelationshipAgreementRegulationType) {
        this.merchantRelationshipAgreementRegulationType = merchantRelationshipAgreementRegulationType;
    }

    public String getMerchantRelationshipAgreementRegulationType() {
        return merchantRelationshipAgreementRegulationType;
    }

    public void setMerchantRelationshipAgreementJurisdiction(org.museframework.bian.classes.Jurisdiction merchantRelationshipAgreementJurisdiction) {
        this.merchantRelationshipAgreementJurisdiction = merchantRelationshipAgreementJurisdiction;
    }

    public org.museframework.bian.classes.Jurisdiction getMerchantRelationshipAgreementJurisdiction() {
        return merchantRelationshipAgreementJurisdiction;
    }

    public void setMerchantRelationshipAgreementAccountReference(org.museframework.bian.classes.Account merchantRelationshipAgreementAccountReference) {
        this.merchantRelationshipAgreementAccountReference = merchantRelationshipAgreementAccountReference;
    }

    public org.museframework.bian.classes.Account getMerchantRelationshipAgreementAccountReference() {
        return merchantRelationshipAgreementAccountReference;
    }

    public void setMerchantRelationshipAgreementSubjectMatter(org.museframework.bian.classes.Object merchantRelationshipAgreementSubjectMatter) {
        this.merchantRelationshipAgreementSubjectMatter = merchantRelationshipAgreementSubjectMatter;
    }

    public org.museframework.bian.classes.Object getMerchantRelationshipAgreementSubjectMatter() {
        return merchantRelationshipAgreementSubjectMatter;
    }

    public void setMerchantRelationshipAgreementProductReference(org.museframework.bian.classes.BankingProduct merchantRelationshipAgreementProductReference) {
        this.merchantRelationshipAgreementProductReference = merchantRelationshipAgreementProductReference;
    }

    public org.museframework.bian.classes.BankingProduct getMerchantRelationshipAgreementProductReference() {
        return merchantRelationshipAgreementProductReference;
    }

    public void setMerchantRelationshipAgreementAssociatedAgreementReference(org.museframework.bian.classes.Agreement merchantRelationshipAgreementAssociatedAgreementReference) {
        this.merchantRelationshipAgreementAssociatedAgreementReference = merchantRelationshipAgreementAssociatedAgreementReference;
    }

    public org.museframework.bian.classes.Agreement getMerchantRelationshipAgreementAssociatedAgreementReference() {
        return merchantRelationshipAgreementAssociatedAgreementReference;
    }
}