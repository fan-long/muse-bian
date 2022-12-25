/*Fulfill any scheduled and ad-hoc obligations under a service arrangement, most typically for a financial product or facility within Project Finance. */
package org.museframework.bian.projectfinance.dto.cr;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto
public class ProjectFinanceFacility {
    /*A Classification value that distinguishes between arrangements according to the type of business services within Project Finance Facility*/
    @MetaField(0)
    private String projectFinanceFacilityParameterType;

    /*A selected optional product feature as subject matter of Project Finance Facility*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Feature projectFinanceFacilitySelectedOption;

    /*The status of Project Finance Facility*/
    @MetaField(0)
    private String projectFinanceFacilityStatus;

    /*Reference to the party who is involved in Project Finance Facility*/
    @MetaField(0)
    private String projectFinanceFacilityAssociatedParty;

    /*The curreny which is arranged in Project Finance Facility*/
    @MetaField(0)
    private String projectFinanceFacilityCurrency;

    /*Reference to the regulation which is defined in Project Finance Facility*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.RuleSet projectFinanceFacilityRegulationReference;

    /*A Classification that distinguishes between the regularity domains of Project Finance Facility*/
    @MetaField(0)
    private String projectFinanceFacilityRegulationType;

    /*Reference to the jurisdiction that is assigned to Project Finance Facility in case of legal dispute.*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Jurisdiction projectFinanceFacilityJurisdiction;

    /*The financial accounting unit into which the financial events, with regard to the origination and fulfillment of the agreement in the context of Project Finance Facility, are entered.*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.BusinessUnit projectFinanceFacilityBookingLocation;

    /*Reference to the account which is linked to Project Finance Facility*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Account projectFinanceFacilityAccountReference;

    /*Reference to the customer who is involved in Project Finance Facility*/
    @MetaField(0)
    private String projectFinanceFacilityCustomerReference;

    /*The position of Project Finance Facility*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Position projectFinanceFacilityPosition;

    /*Reference to the product which is linked to Project Finance Facility*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.BankingProduct projectFinanceFacilityProductReference;

    /*Reference to the limitation related to the position of Project Finance Facility*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.LimitArrangement projectFinanceFacilityPositionLimit;

    /*An unique reference to an item or an occurrence of Project Finance Facility*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.FinancialFacility projectFinanceFacilityReference;

    public void setProjectFinanceFacilityParameterType(String projectFinanceFacilityParameterType) {
        this.projectFinanceFacilityParameterType = projectFinanceFacilityParameterType;
    }

    public String getProjectFinanceFacilityParameterType() {
        return projectFinanceFacilityParameterType;
    }

    public void setProjectFinanceFacilitySelectedOption(org.museframework.bian.classes.Feature projectFinanceFacilitySelectedOption) {
        this.projectFinanceFacilitySelectedOption = projectFinanceFacilitySelectedOption;
    }

    public org.museframework.bian.classes.Feature getProjectFinanceFacilitySelectedOption() {
        return projectFinanceFacilitySelectedOption;
    }

    public void setProjectFinanceFacilityStatus(String projectFinanceFacilityStatus) {
        this.projectFinanceFacilityStatus = projectFinanceFacilityStatus;
    }

    public String getProjectFinanceFacilityStatus() {
        return projectFinanceFacilityStatus;
    }

    public void setProjectFinanceFacilityAssociatedParty(String projectFinanceFacilityAssociatedParty) {
        this.projectFinanceFacilityAssociatedParty = projectFinanceFacilityAssociatedParty;
    }

    public String getProjectFinanceFacilityAssociatedParty() {
        return projectFinanceFacilityAssociatedParty;
    }

    public void setProjectFinanceFacilityCurrency(String projectFinanceFacilityCurrency) {
        this.projectFinanceFacilityCurrency = projectFinanceFacilityCurrency;
    }

    public String getProjectFinanceFacilityCurrency() {
        return projectFinanceFacilityCurrency;
    }

    public void setProjectFinanceFacilityRegulationReference(org.museframework.bian.classes.RuleSet projectFinanceFacilityRegulationReference) {
        this.projectFinanceFacilityRegulationReference = projectFinanceFacilityRegulationReference;
    }

    public org.museframework.bian.classes.RuleSet getProjectFinanceFacilityRegulationReference() {
        return projectFinanceFacilityRegulationReference;
    }

    public void setProjectFinanceFacilityRegulationType(String projectFinanceFacilityRegulationType) {
        this.projectFinanceFacilityRegulationType = projectFinanceFacilityRegulationType;
    }

    public String getProjectFinanceFacilityRegulationType() {
        return projectFinanceFacilityRegulationType;
    }

    public void setProjectFinanceFacilityJurisdiction(org.museframework.bian.classes.Jurisdiction projectFinanceFacilityJurisdiction) {
        this.projectFinanceFacilityJurisdiction = projectFinanceFacilityJurisdiction;
    }

    public org.museframework.bian.classes.Jurisdiction getProjectFinanceFacilityJurisdiction() {
        return projectFinanceFacilityJurisdiction;
    }

    public void setProjectFinanceFacilityBookingLocation(org.museframework.bian.classes.BusinessUnit projectFinanceFacilityBookingLocation) {
        this.projectFinanceFacilityBookingLocation = projectFinanceFacilityBookingLocation;
    }

    public org.museframework.bian.classes.BusinessUnit getProjectFinanceFacilityBookingLocation() {
        return projectFinanceFacilityBookingLocation;
    }

    public void setProjectFinanceFacilityAccountReference(org.museframework.bian.classes.Account projectFinanceFacilityAccountReference) {
        this.projectFinanceFacilityAccountReference = projectFinanceFacilityAccountReference;
    }

    public org.museframework.bian.classes.Account getProjectFinanceFacilityAccountReference() {
        return projectFinanceFacilityAccountReference;
    }

    public void setProjectFinanceFacilityCustomerReference(String projectFinanceFacilityCustomerReference) {
        this.projectFinanceFacilityCustomerReference = projectFinanceFacilityCustomerReference;
    }

    public String getProjectFinanceFacilityCustomerReference() {
        return projectFinanceFacilityCustomerReference;
    }

    public void setProjectFinanceFacilityPosition(org.museframework.bian.classes.Position projectFinanceFacilityPosition) {
        this.projectFinanceFacilityPosition = projectFinanceFacilityPosition;
    }

    public org.museframework.bian.classes.Position getProjectFinanceFacilityPosition() {
        return projectFinanceFacilityPosition;
    }

    public void setProjectFinanceFacilityProductReference(org.museframework.bian.classes.BankingProduct projectFinanceFacilityProductReference) {
        this.projectFinanceFacilityProductReference = projectFinanceFacilityProductReference;
    }

    public org.museframework.bian.classes.BankingProduct getProjectFinanceFacilityProductReference() {
        return projectFinanceFacilityProductReference;
    }

    public void setProjectFinanceFacilityPositionLimit(org.museframework.bian.classes.LimitArrangement projectFinanceFacilityPositionLimit) {
        this.projectFinanceFacilityPositionLimit = projectFinanceFacilityPositionLimit;
    }

    public org.museframework.bian.classes.LimitArrangement getProjectFinanceFacilityPositionLimit() {
        return projectFinanceFacilityPositionLimit;
    }

    public void setProjectFinanceFacilityReference(org.museframework.bian.classes.FinancialFacility projectFinanceFacilityReference) {
        this.projectFinanceFacilityReference = projectFinanceFacilityReference;
    }

    public org.museframework.bian.classes.FinancialFacility getProjectFinanceFacilityReference() {
        return projectFinanceFacilityReference;
    }
}