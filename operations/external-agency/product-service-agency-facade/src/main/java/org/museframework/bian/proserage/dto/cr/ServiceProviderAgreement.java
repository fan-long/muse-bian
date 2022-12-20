/*Maintain the terms and conditions that apply to a commercial relationship within Product Service Agency.

*/
package org.museframework.bian.proserage.dto.cr;

public class ServiceProviderAgreement extends org.museframework.bian.classes.ServiceProviderAgreement {
    /*A Classification value that distinguishes between Options defined within Service Provider Agreement*/
    private String serviceProviderAgreementParameterType;

    /*A selected optional feature in a product, identified by Parameter Type*/
    private org.museframework.bian.classes.Feature serviceProviderAgreementSelectedOption;

    /*A Classification value that distinguishes between the subject matters of Service Provider Agreement*/
    private org.museframework.bian.enumerations.Agreementtypevalues serviceProviderAgreementType;

    /*An unique reference to an item or an occurrence of Service Provider Agreement*/
    private org.museframework.bian.classes.Agreement serviceProviderAgreementReference;

    /*Request to discharge Service Provider Agreement*/
    private org.museframework.bian.classes.Instruction serviceProviderAgreementDischargeRequest;

    /*Timetable to discharge Service Provider Agreement*/
    private String serviceProviderAgreementDischargeSchedule;

    /*The status of Service Provider Agreement*/
    private String serviceProviderAgreementStatus;

    /*Party who is involved in Service Provider Agreement*/
    private String serviceProviderAgreementAssociatedParty;

    /*Reference to the customer who is involved in Service Provider Agreement*/
    private String serviceProviderAgreementCustomerReference;

    /*Liability or duty to do something under the terms of Service Provider Agreement*/
    private org.museframework.bian.classes.Arrangement serviceProviderAgreementObligation;

    /*Right to do something under the terms of Service Provider Agreement*/
    private org.museframework.bian.classes.Arrangement serviceProviderAgreementEntitlement;

    /*Reference to the regulation which is defined in Service Provider Agreement*/
    private org.museframework.bian.classes.RuleSet serviceProviderAgreementRegulationReference;

    /*A Classification that distinguishes between the regularity domains of Service Provider Agreement*/
    private String serviceProviderAgreementRegulationType;

    /*Reference to the jurisdiction that is assigned to Service Provider Agreement in case of legal dispute.*/
    private org.museframework.bian.classes.Jurisdiction serviceProviderAgreementJurisdiction;

    /*Reference to the account which is linked to Service Provider Agreement

A characteristic of agreement which refers to its involved account to specify the account that will be used to register for the transactions in position keeping management.*/
    private org.museframework.bian.classes.Account serviceProviderAgreementAccountReference;

    /*The subject matter of  Service Provider Agreement*/
    private org.museframework.bian.classes.Object serviceProviderAgreementSubjectMatter;

    /*Reference to the product which is linked to Service Provider Agreement

Comment: 
A characteristic of agreement which refers to its related products that are sold by agreement.*/
    private org.museframework.bian.classes.BankingProduct serviceProviderAgreementProductReference;

    /*Reference to the agreement that is related to Service Provider Agreement*/
    private org.museframework.bian.classes.Agreement serviceProviderAgreementAssociatedAgreementReference;

    public void setServiceProviderAgreementParameterType(String serviceProviderAgreementParameterType) {
        this.serviceProviderAgreementParameterType = serviceProviderAgreementParameterType;
    }

    public String getServiceProviderAgreementParameterType() {
        return serviceProviderAgreementParameterType;
    }

    public void setServiceProviderAgreementSelectedOption(org.museframework.bian.classes.Feature serviceProviderAgreementSelectedOption) {
        this.serviceProviderAgreementSelectedOption = serviceProviderAgreementSelectedOption;
    }

    public org.museframework.bian.classes.Feature getServiceProviderAgreementSelectedOption() {
        return serviceProviderAgreementSelectedOption;
    }

    public void setServiceProviderAgreementType(org.museframework.bian.enumerations.Agreementtypevalues serviceProviderAgreementType) {
        this.serviceProviderAgreementType = serviceProviderAgreementType;
    }

    public org.museframework.bian.enumerations.Agreementtypevalues getServiceProviderAgreementType() {
        return serviceProviderAgreementType;
    }

    public void setServiceProviderAgreementReference(org.museframework.bian.classes.Agreement serviceProviderAgreementReference) {
        this.serviceProviderAgreementReference = serviceProviderAgreementReference;
    }

    public org.museframework.bian.classes.Agreement getServiceProviderAgreementReference() {
        return serviceProviderAgreementReference;
    }

    public void setServiceProviderAgreementDischargeRequest(org.museframework.bian.classes.Instruction serviceProviderAgreementDischargeRequest) {
        this.serviceProviderAgreementDischargeRequest = serviceProviderAgreementDischargeRequest;
    }

    public org.museframework.bian.classes.Instruction getServiceProviderAgreementDischargeRequest() {
        return serviceProviderAgreementDischargeRequest;
    }

    public void setServiceProviderAgreementDischargeSchedule(String serviceProviderAgreementDischargeSchedule) {
        this.serviceProviderAgreementDischargeSchedule = serviceProviderAgreementDischargeSchedule;
    }

    public String getServiceProviderAgreementDischargeSchedule() {
        return serviceProviderAgreementDischargeSchedule;
    }

    public void setServiceProviderAgreementStatus(String serviceProviderAgreementStatus) {
        this.serviceProviderAgreementStatus = serviceProviderAgreementStatus;
    }

    public String getServiceProviderAgreementStatus() {
        return serviceProviderAgreementStatus;
    }

    public void setServiceProviderAgreementAssociatedParty(String serviceProviderAgreementAssociatedParty) {
        this.serviceProviderAgreementAssociatedParty = serviceProviderAgreementAssociatedParty;
    }

    public String getServiceProviderAgreementAssociatedParty() {
        return serviceProviderAgreementAssociatedParty;
    }

    public void setServiceProviderAgreementCustomerReference(String serviceProviderAgreementCustomerReference) {
        this.serviceProviderAgreementCustomerReference = serviceProviderAgreementCustomerReference;
    }

    public String getServiceProviderAgreementCustomerReference() {
        return serviceProviderAgreementCustomerReference;
    }

    public void setServiceProviderAgreementObligation(org.museframework.bian.classes.Arrangement serviceProviderAgreementObligation) {
        this.serviceProviderAgreementObligation = serviceProviderAgreementObligation;
    }

    public org.museframework.bian.classes.Arrangement getServiceProviderAgreementObligation() {
        return serviceProviderAgreementObligation;
    }

    public void setServiceProviderAgreementEntitlement(org.museframework.bian.classes.Arrangement serviceProviderAgreementEntitlement) {
        this.serviceProviderAgreementEntitlement = serviceProviderAgreementEntitlement;
    }

    public org.museframework.bian.classes.Arrangement getServiceProviderAgreementEntitlement() {
        return serviceProviderAgreementEntitlement;
    }

    public void setServiceProviderAgreementRegulationReference(org.museframework.bian.classes.RuleSet serviceProviderAgreementRegulationReference) {
        this.serviceProviderAgreementRegulationReference = serviceProviderAgreementRegulationReference;
    }

    public org.museframework.bian.classes.RuleSet getServiceProviderAgreementRegulationReference() {
        return serviceProviderAgreementRegulationReference;
    }

    public void setServiceProviderAgreementRegulationType(String serviceProviderAgreementRegulationType) {
        this.serviceProviderAgreementRegulationType = serviceProviderAgreementRegulationType;
    }

    public String getServiceProviderAgreementRegulationType() {
        return serviceProviderAgreementRegulationType;
    }

    public void setServiceProviderAgreementJurisdiction(org.museframework.bian.classes.Jurisdiction serviceProviderAgreementJurisdiction) {
        this.serviceProviderAgreementJurisdiction = serviceProviderAgreementJurisdiction;
    }

    public org.museframework.bian.classes.Jurisdiction getServiceProviderAgreementJurisdiction() {
        return serviceProviderAgreementJurisdiction;
    }

    public void setServiceProviderAgreementAccountReference(org.museframework.bian.classes.Account serviceProviderAgreementAccountReference) {
        this.serviceProviderAgreementAccountReference = serviceProviderAgreementAccountReference;
    }

    public org.museframework.bian.classes.Account getServiceProviderAgreementAccountReference() {
        return serviceProviderAgreementAccountReference;
    }

    public void setServiceProviderAgreementSubjectMatter(org.museframework.bian.classes.Object serviceProviderAgreementSubjectMatter) {
        this.serviceProviderAgreementSubjectMatter = serviceProviderAgreementSubjectMatter;
    }

    public org.museframework.bian.classes.Object getServiceProviderAgreementSubjectMatter() {
        return serviceProviderAgreementSubjectMatter;
    }

    public void setServiceProviderAgreementProductReference(org.museframework.bian.classes.BankingProduct serviceProviderAgreementProductReference) {
        this.serviceProviderAgreementProductReference = serviceProviderAgreementProductReference;
    }

    public org.museframework.bian.classes.BankingProduct getServiceProviderAgreementProductReference() {
        return serviceProviderAgreementProductReference;
    }

    public void setServiceProviderAgreementAssociatedAgreementReference(org.museframework.bian.classes.Agreement serviceProviderAgreementAssociatedAgreementReference) {
        this.serviceProviderAgreementAssociatedAgreementReference = serviceProviderAgreementAssociatedAgreementReference;
    }

    public org.museframework.bian.classes.Agreement getServiceProviderAgreementAssociatedAgreementReference() {
        return serviceProviderAgreementAssociatedAgreementReference;
    }
}