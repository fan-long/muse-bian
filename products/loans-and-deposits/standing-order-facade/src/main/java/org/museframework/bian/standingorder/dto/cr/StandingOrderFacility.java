/*Fulfill any scheduled and ad-hoc obligations under a service arrangement, most typically for a financial product or facility  within Standing Order. 
Example: Perform the scheduled (e.g. statements, standing orders) and ad-hoc/requested (e.g. balance inquiries, fund transfers) fulfillment tasks for a customer current account facility.*/
package org.museframework.bian.standingorder.dto.cr;

public class StandingOrderFacility {
    /*A Classification value that distinguishes between arrangements according to the type of business services within Standing Order Arrangement*/
    private String standingOrderFacilityParameterType;

    /*A selected optional product feature as subject matter of Standing Order Arrangement*/
    private org.museframework.bian.classes.Feature standingOrderFacilitySelectedOption;

    /*Timetable to fulfill Standing Order Arrangement*/
    private String standingOrderFacilityCalendar;

    /*The status of Standing Order Arrangement*/
    private String standingOrderFacilityStatus;

    /*Reference to the party who is involved in Standing Order Arrangement*/
    private String standingOrderFacilityAssociatedParty;

    /*The curreny which is arranged in Standing Order Arrangement*/
    private String standingOrderFacilityCurrency;

    /*Reference to the regulation which is defined in Standing Order Arrangement*/
    private org.museframework.bian.classes.RuleSet standingOrderFacilityRegulationReference;

    /*Reference to the jurisdiction that is assigned to Standing Order Arrangement in case of legal dispute.*/
    private org.museframework.bian.classes.Jurisdiction standingOrderFacilityJurisdiction;

    /*The financial accounting unit into which the financial events, with regard to the origination and fulfillment of the agreement in the context of Standing Order Arrangement, are entered.*/
    private org.museframework.bian.classes.BusinessUnit standingOrderFacilityBookingLocation;

    /*Reference to the account which is linked to Standing Order Arrangement*/
    private org.museframework.bian.classes.Account standingOrderFacilityAccountReference;

    /*Reference to the customer who is involved in Standing Order Arrangement*/
    private String standingOrderFacilityCustomerReference;

    /*The current calculated position*/
    private String standingOrderFacilityPosition;

    /*Reference to the product which is linked to Standing Order Arrangement*/
    private org.museframework.bian.classes.BankingProduct standingOrderFacilityProductReference;

    /**/
    private String standingOrderFacilityPositionLimit;

    /*Reference to account that has to be debited for the standing order fee*/
    private String feeAccountReference;

    /*Reference to counterparty if this is a customer of the bank*/
    private String counterpartyCustomerReference;

    /*Reference to the counterparty account if it is in this bank*/
    private String counterpartyAccountReference;

    /*External number of the account (could be internal or external account) that has to be credited (credit transfer) of debited (request to pay) for the principal amount*/
    private String counterpartyExternalAccountCode;

    /*Principal amount of the standing order*/
    private String principalAmount;

    /*Fee amount charged for the execution of the standing order*/
    private String feeAmount;

    /*Payment details that will be added to the credit transfer or request to pay during execution of the standing order*/
    private String paymentDetailsDescription;

    /*First date on which the standing order will be executed*/
    private String startDate;

    /*Last date on which the standing order will be executed*/
    private String endDate;

    /*Periodicity with which the standing order will be executed, e.g. yearly, quarterly, monthly, weekly, every XX days,…….*/
    private String periodicityDescription;

    /*Day number within the periodicity interval on whch the standing order will be executed, e.g. First, Last, XX*/
    private String dayNumberInPeriodicityDescription;

    public void setStandingOrderFacilityParameterType(String standingOrderFacilityParameterType) {
        this.standingOrderFacilityParameterType = standingOrderFacilityParameterType;
    }

    public String getStandingOrderFacilityParameterType() {
        return standingOrderFacilityParameterType;
    }

    public void setStandingOrderFacilitySelectedOption(org.museframework.bian.classes.Feature standingOrderFacilitySelectedOption) {
        this.standingOrderFacilitySelectedOption = standingOrderFacilitySelectedOption;
    }

    public org.museframework.bian.classes.Feature getStandingOrderFacilitySelectedOption() {
        return standingOrderFacilitySelectedOption;
    }

    public void setStandingOrderFacilityCalendar(String standingOrderFacilityCalendar) {
        this.standingOrderFacilityCalendar = standingOrderFacilityCalendar;
    }

    public String getStandingOrderFacilityCalendar() {
        return standingOrderFacilityCalendar;
    }

    public void setStandingOrderFacilityStatus(String standingOrderFacilityStatus) {
        this.standingOrderFacilityStatus = standingOrderFacilityStatus;
    }

    public String getStandingOrderFacilityStatus() {
        return standingOrderFacilityStatus;
    }

    public void setStandingOrderFacilityAssociatedParty(String standingOrderFacilityAssociatedParty) {
        this.standingOrderFacilityAssociatedParty = standingOrderFacilityAssociatedParty;
    }

    public String getStandingOrderFacilityAssociatedParty() {
        return standingOrderFacilityAssociatedParty;
    }

    public void setStandingOrderFacilityCurrency(String standingOrderFacilityCurrency) {
        this.standingOrderFacilityCurrency = standingOrderFacilityCurrency;
    }

    public String getStandingOrderFacilityCurrency() {
        return standingOrderFacilityCurrency;
    }

    public void setStandingOrderFacilityRegulationReference(org.museframework.bian.classes.RuleSet standingOrderFacilityRegulationReference) {
        this.standingOrderFacilityRegulationReference = standingOrderFacilityRegulationReference;
    }

    public org.museframework.bian.classes.RuleSet getStandingOrderFacilityRegulationReference() {
        return standingOrderFacilityRegulationReference;
    }

    public void setStandingOrderFacilityJurisdiction(org.museframework.bian.classes.Jurisdiction standingOrderFacilityJurisdiction) {
        this.standingOrderFacilityJurisdiction = standingOrderFacilityJurisdiction;
    }

    public org.museframework.bian.classes.Jurisdiction getStandingOrderFacilityJurisdiction() {
        return standingOrderFacilityJurisdiction;
    }

    public void setStandingOrderFacilityBookingLocation(org.museframework.bian.classes.BusinessUnit standingOrderFacilityBookingLocation) {
        this.standingOrderFacilityBookingLocation = standingOrderFacilityBookingLocation;
    }

    public org.museframework.bian.classes.BusinessUnit getStandingOrderFacilityBookingLocation() {
        return standingOrderFacilityBookingLocation;
    }

    public void setStandingOrderFacilityAccountReference(org.museframework.bian.classes.Account standingOrderFacilityAccountReference) {
        this.standingOrderFacilityAccountReference = standingOrderFacilityAccountReference;
    }

    public org.museframework.bian.classes.Account getStandingOrderFacilityAccountReference() {
        return standingOrderFacilityAccountReference;
    }

    public void setStandingOrderFacilityCustomerReference(String standingOrderFacilityCustomerReference) {
        this.standingOrderFacilityCustomerReference = standingOrderFacilityCustomerReference;
    }

    public String getStandingOrderFacilityCustomerReference() {
        return standingOrderFacilityCustomerReference;
    }

    public void setStandingOrderFacilityPosition(String standingOrderFacilityPosition) {
        this.standingOrderFacilityPosition = standingOrderFacilityPosition;
    }

    public String getStandingOrderFacilityPosition() {
        return standingOrderFacilityPosition;
    }

    public void setStandingOrderFacilityProductReference(org.museframework.bian.classes.BankingProduct standingOrderFacilityProductReference) {
        this.standingOrderFacilityProductReference = standingOrderFacilityProductReference;
    }

    public org.museframework.bian.classes.BankingProduct getStandingOrderFacilityProductReference() {
        return standingOrderFacilityProductReference;
    }

    public void setStandingOrderFacilityPositionLimit(String standingOrderFacilityPositionLimit) {
        this.standingOrderFacilityPositionLimit = standingOrderFacilityPositionLimit;
    }

    public String getStandingOrderFacilityPositionLimit() {
        return standingOrderFacilityPositionLimit;
    }

    public void setFeeAccountReference(String feeAccountReference) {
        this.feeAccountReference = feeAccountReference;
    }

    public String getFeeAccountReference() {
        return feeAccountReference;
    }

    public void setCounterpartyCustomerReference(String counterpartyCustomerReference) {
        this.counterpartyCustomerReference = counterpartyCustomerReference;
    }

    public String getCounterpartyCustomerReference() {
        return counterpartyCustomerReference;
    }

    public void setCounterpartyAccountReference(String counterpartyAccountReference) {
        this.counterpartyAccountReference = counterpartyAccountReference;
    }

    public String getCounterpartyAccountReference() {
        return counterpartyAccountReference;
    }

    public void setCounterpartyExternalAccountCode(String counterpartyExternalAccountCode) {
        this.counterpartyExternalAccountCode = counterpartyExternalAccountCode;
    }

    public String getCounterpartyExternalAccountCode() {
        return counterpartyExternalAccountCode;
    }

    public void setPrincipalAmount(String principalAmount) {
        this.principalAmount = principalAmount;
    }

    public String getPrincipalAmount() {
        return principalAmount;
    }

    public void setFeeAmount(String feeAmount) {
        this.feeAmount = feeAmount;
    }

    public String getFeeAmount() {
        return feeAmount;
    }

    public void setPaymentDetailsDescription(String paymentDetailsDescription) {
        this.paymentDetailsDescription = paymentDetailsDescription;
    }

    public String getPaymentDetailsDescription() {
        return paymentDetailsDescription;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setPeriodicityDescription(String periodicityDescription) {
        this.periodicityDescription = periodicityDescription;
    }

    public String getPeriodicityDescription() {
        return periodicityDescription;
    }

    public void setDayNumberInPeriodicityDescription(String dayNumberInPeriodicityDescription) {
        this.dayNumberInPeriodicityDescription = dayNumberInPeriodicityDescription;
    }

    public String getDayNumberInPeriodicityDescription() {
        return dayNumberInPeriodicityDescription;
    }
}