/*Fulfill any scheduled and ad-hoc obligations under a service arrangement, most typically for a financial product or facility within Corporate Payroll Services. */
package org.museframework.bian.corpayser.dto.cr;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto
public class EmployeePaymentServicesFacility {
    /*A Classification value that distinguishes between arrangements according to the type of business services within Employee Payment Services Facility*/
    @MetaField(0)
    private String employeePaymentServicesFacilityParameterType;

    /*A selected optional product feature as subject matter of Employee Payment Services Facility*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Feature employeePaymentServicesFacilitySelectedOption;

    /*The status of Employee Payment Services Facility*/
    @MetaField(0)
    private String employeePaymentServicesFacilityStatus;

    /*Reference to the party who is involved in Employee Payment Services Facility*/
    @MetaField(0)
    private String employeePaymentServicesFacilityAssociatedParty;

    /*The curreny which is arranged in Employee Payment Services Facility*/
    @MetaField(0)
    private String employeePaymentServicesFacilityCurrency;

    /*Reference to the regulation which is defined in Employee Payment Services Facility*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.RuleSet employeePaymentServicesFacilityRegulationReference;

    /*A Classification that distinguishes between the regularity domains of Employee Payment Services Facility*/
    @MetaField(0)
    private String employeePaymentServicesFacilityRegulationType;

    /*Reference to the jurisdiction that is assigned to Employee Payment Services Facility in case of legal dispute.*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Jurisdiction employeePaymentServicesFacilityJurisdiction;

    /*The financial accounting unit into which the financial events, with regard to the origination and fulfillment of the agreement in the context of Employee Payment Services Facility, are entered.*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.BusinessUnit employeePaymentServicesFacilityBookingLocation;

    /*Reference to the account which is linked to Employee Payment Services Facility*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Account employeePaymentServicesFacilityAccountReference;

    /*Reference to the customer who is involved in Employee Payment Services Facility*/
    @MetaField(0)
    private String employeePaymentServicesFacilityCustomerReference;

    /*The position of Employee Payment Services Facility*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Position employeePaymentServicesFacilityPosition;

    /*Reference to the product which is linked to Employee Payment Services Facility*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.BankingProduct employeePaymentServicesFacilityProductReference;

    /*Reference to the limitation related to the position of Employee Payment Services Facility*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.LimitArrangement employeePaymentServicesFacilityPositionLimit;

    /*An unique reference to an item or an occurrence of Employee Payment Services Facility*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.FinancialFacility employeePaymentServicesFacilityReference;

    public void setEmployeePaymentServicesFacilityParameterType(String employeePaymentServicesFacilityParameterType) {
        this.employeePaymentServicesFacilityParameterType = employeePaymentServicesFacilityParameterType;
    }

    public String getEmployeePaymentServicesFacilityParameterType() {
        return employeePaymentServicesFacilityParameterType;
    }

    public void setEmployeePaymentServicesFacilitySelectedOption(org.museframework.bian.classes.Feature employeePaymentServicesFacilitySelectedOption) {
        this.employeePaymentServicesFacilitySelectedOption = employeePaymentServicesFacilitySelectedOption;
    }

    public org.museframework.bian.classes.Feature getEmployeePaymentServicesFacilitySelectedOption() {
        return employeePaymentServicesFacilitySelectedOption;
    }

    public void setEmployeePaymentServicesFacilityStatus(String employeePaymentServicesFacilityStatus) {
        this.employeePaymentServicesFacilityStatus = employeePaymentServicesFacilityStatus;
    }

    public String getEmployeePaymentServicesFacilityStatus() {
        return employeePaymentServicesFacilityStatus;
    }

    public void setEmployeePaymentServicesFacilityAssociatedParty(String employeePaymentServicesFacilityAssociatedParty) {
        this.employeePaymentServicesFacilityAssociatedParty = employeePaymentServicesFacilityAssociatedParty;
    }

    public String getEmployeePaymentServicesFacilityAssociatedParty() {
        return employeePaymentServicesFacilityAssociatedParty;
    }

    public void setEmployeePaymentServicesFacilityCurrency(String employeePaymentServicesFacilityCurrency) {
        this.employeePaymentServicesFacilityCurrency = employeePaymentServicesFacilityCurrency;
    }

    public String getEmployeePaymentServicesFacilityCurrency() {
        return employeePaymentServicesFacilityCurrency;
    }

    public void setEmployeePaymentServicesFacilityRegulationReference(org.museframework.bian.classes.RuleSet employeePaymentServicesFacilityRegulationReference) {
        this.employeePaymentServicesFacilityRegulationReference = employeePaymentServicesFacilityRegulationReference;
    }

    public org.museframework.bian.classes.RuleSet getEmployeePaymentServicesFacilityRegulationReference() {
        return employeePaymentServicesFacilityRegulationReference;
    }

    public void setEmployeePaymentServicesFacilityRegulationType(String employeePaymentServicesFacilityRegulationType) {
        this.employeePaymentServicesFacilityRegulationType = employeePaymentServicesFacilityRegulationType;
    }

    public String getEmployeePaymentServicesFacilityRegulationType() {
        return employeePaymentServicesFacilityRegulationType;
    }

    public void setEmployeePaymentServicesFacilityJurisdiction(org.museframework.bian.classes.Jurisdiction employeePaymentServicesFacilityJurisdiction) {
        this.employeePaymentServicesFacilityJurisdiction = employeePaymentServicesFacilityJurisdiction;
    }

    public org.museframework.bian.classes.Jurisdiction getEmployeePaymentServicesFacilityJurisdiction() {
        return employeePaymentServicesFacilityJurisdiction;
    }

    public void setEmployeePaymentServicesFacilityBookingLocation(org.museframework.bian.classes.BusinessUnit employeePaymentServicesFacilityBookingLocation) {
        this.employeePaymentServicesFacilityBookingLocation = employeePaymentServicesFacilityBookingLocation;
    }

    public org.museframework.bian.classes.BusinessUnit getEmployeePaymentServicesFacilityBookingLocation() {
        return employeePaymentServicesFacilityBookingLocation;
    }

    public void setEmployeePaymentServicesFacilityAccountReference(org.museframework.bian.classes.Account employeePaymentServicesFacilityAccountReference) {
        this.employeePaymentServicesFacilityAccountReference = employeePaymentServicesFacilityAccountReference;
    }

    public org.museframework.bian.classes.Account getEmployeePaymentServicesFacilityAccountReference() {
        return employeePaymentServicesFacilityAccountReference;
    }

    public void setEmployeePaymentServicesFacilityCustomerReference(String employeePaymentServicesFacilityCustomerReference) {
        this.employeePaymentServicesFacilityCustomerReference = employeePaymentServicesFacilityCustomerReference;
    }

    public String getEmployeePaymentServicesFacilityCustomerReference() {
        return employeePaymentServicesFacilityCustomerReference;
    }

    public void setEmployeePaymentServicesFacilityPosition(org.museframework.bian.classes.Position employeePaymentServicesFacilityPosition) {
        this.employeePaymentServicesFacilityPosition = employeePaymentServicesFacilityPosition;
    }

    public org.museframework.bian.classes.Position getEmployeePaymentServicesFacilityPosition() {
        return employeePaymentServicesFacilityPosition;
    }

    public void setEmployeePaymentServicesFacilityProductReference(org.museframework.bian.classes.BankingProduct employeePaymentServicesFacilityProductReference) {
        this.employeePaymentServicesFacilityProductReference = employeePaymentServicesFacilityProductReference;
    }

    public org.museframework.bian.classes.BankingProduct getEmployeePaymentServicesFacilityProductReference() {
        return employeePaymentServicesFacilityProductReference;
    }

    public void setEmployeePaymentServicesFacilityPositionLimit(org.museframework.bian.classes.LimitArrangement employeePaymentServicesFacilityPositionLimit) {
        this.employeePaymentServicesFacilityPositionLimit = employeePaymentServicesFacilityPositionLimit;
    }

    public org.museframework.bian.classes.LimitArrangement getEmployeePaymentServicesFacilityPositionLimit() {
        return employeePaymentServicesFacilityPositionLimit;
    }

    public void setEmployeePaymentServicesFacilityReference(org.museframework.bian.classes.FinancialFacility employeePaymentServicesFacilityReference) {
        this.employeePaymentServicesFacilityReference = employeePaymentServicesFacilityReference;
    }

    public org.museframework.bian.classes.FinancialFacility getEmployeePaymentServicesFacilityReference() {
        return employeePaymentServicesFacilityReference;
    }
}