/*Fulfill any scheduled and ad-hoc obligations under a service arrangement, most typically for a financial product or facility  within Product Combination. 
Example: Perform the scheduled (e.g. statements, standing orders) and ad-hoc/requested (e.g. balance inquiries, fund transfers) fulfillment tasks for a customer current account facility.*/
package org.museframework.bian.productcombination.dto.cr;

public class ProductCombinationFacility {
    /*A Classification value that distinguishes between arrangements according to the type of business services within Product Combination Arrangement*/
    private String productCombinationFacilityParameterType;

    /*A selected optional business service as subject matter of Product Combination Arrangement*/
    private String productCombinationFacilitySelectedOption;

    /*The type of Product Combination Arrangement*/
    private String productCombinationFacilityType;

    /*Reference to Product Combination Arrangement*/
    private org.museframework.bian.classes.Object productCombinationFacilityReference;

    /*Timetable to fulfill Product Combination Arrangement*/
    private String productCombinationFacilitySchedule;

    /*The status of Product Combination Arrangement*/
    private String productCombinationFacilityStatus;

    /*The curreny which is arranged in Product Combination Arrangement*/
    private String productCombinationFacilityCurrency;

    /*Reference to the regulation which is defined in Product Combination Arrangement*/
    private org.museframework.bian.classes.Object productCombinationFacilityRegulationReference;

    /*A Classification that distinguishes between the regularity domains of Product Combination Arrangement*/
    private String productCombinationFacilityRegulationType;

    /*Reference to the jurisdiction that is assigned to Product Combination Arrangement in case of legal dispute.*/
    private String productCombinationFacilityJurisdiction;

    /*The financial accounting unit into which the financial events, with regard to the origination and fulfillment of the agreement in the context of Product Combination Arrangement, are entered.*/
    private String productCombinationFacilityBookingLocation;

    /*The type of account which is linked to Product Combination Arrangement*/
    private String productCombinationFacilityAccountType;

    /*Reference to the account which is linked to Product Combination Arrangement*/
    private org.museframework.bian.classes.Object productCombinationFacilityAccountReference;

    public void setProductCombinationFacilityParameterType(String productCombinationFacilityParameterType) {
        this.productCombinationFacilityParameterType = productCombinationFacilityParameterType;
    }

    public String getProductCombinationFacilityParameterType() {
        return productCombinationFacilityParameterType;
    }

    public void setProductCombinationFacilitySelectedOption(String productCombinationFacilitySelectedOption) {
        this.productCombinationFacilitySelectedOption = productCombinationFacilitySelectedOption;
    }

    public String getProductCombinationFacilitySelectedOption() {
        return productCombinationFacilitySelectedOption;
    }

    public void setProductCombinationFacilityType(String productCombinationFacilityType) {
        this.productCombinationFacilityType = productCombinationFacilityType;
    }

    public String getProductCombinationFacilityType() {
        return productCombinationFacilityType;
    }

    public void setProductCombinationFacilityReference(org.museframework.bian.classes.Object productCombinationFacilityReference) {
        this.productCombinationFacilityReference = productCombinationFacilityReference;
    }

    public org.museframework.bian.classes.Object getProductCombinationFacilityReference() {
        return productCombinationFacilityReference;
    }

    public void setProductCombinationFacilitySchedule(String productCombinationFacilitySchedule) {
        this.productCombinationFacilitySchedule = productCombinationFacilitySchedule;
    }

    public String getProductCombinationFacilitySchedule() {
        return productCombinationFacilitySchedule;
    }

    public void setProductCombinationFacilityStatus(String productCombinationFacilityStatus) {
        this.productCombinationFacilityStatus = productCombinationFacilityStatus;
    }

    public String getProductCombinationFacilityStatus() {
        return productCombinationFacilityStatus;
    }

    public void setProductCombinationFacilityCurrency(String productCombinationFacilityCurrency) {
        this.productCombinationFacilityCurrency = productCombinationFacilityCurrency;
    }

    public String getProductCombinationFacilityCurrency() {
        return productCombinationFacilityCurrency;
    }

    public void setProductCombinationFacilityRegulationReference(org.museframework.bian.classes.Object productCombinationFacilityRegulationReference) {
        this.productCombinationFacilityRegulationReference = productCombinationFacilityRegulationReference;
    }

    public org.museframework.bian.classes.Object getProductCombinationFacilityRegulationReference() {
        return productCombinationFacilityRegulationReference;
    }

    public void setProductCombinationFacilityRegulationType(String productCombinationFacilityRegulationType) {
        this.productCombinationFacilityRegulationType = productCombinationFacilityRegulationType;
    }

    public String getProductCombinationFacilityRegulationType() {
        return productCombinationFacilityRegulationType;
    }

    public void setProductCombinationFacilityJurisdiction(String productCombinationFacilityJurisdiction) {
        this.productCombinationFacilityJurisdiction = productCombinationFacilityJurisdiction;
    }

    public String getProductCombinationFacilityJurisdiction() {
        return productCombinationFacilityJurisdiction;
    }

    public void setProductCombinationFacilityBookingLocation(String productCombinationFacilityBookingLocation) {
        this.productCombinationFacilityBookingLocation = productCombinationFacilityBookingLocation;
    }

    public String getProductCombinationFacilityBookingLocation() {
        return productCombinationFacilityBookingLocation;
    }

    public void setProductCombinationFacilityAccountType(String productCombinationFacilityAccountType) {
        this.productCombinationFacilityAccountType = productCombinationFacilityAccountType;
    }

    public String getProductCombinationFacilityAccountType() {
        return productCombinationFacilityAccountType;
    }

    public void setProductCombinationFacilityAccountReference(org.museframework.bian.classes.Object productCombinationFacilityAccountReference) {
        this.productCombinationFacilityAccountReference = productCombinationFacilityAccountReference;
    }

    public org.museframework.bian.classes.Object getProductCombinationFacilityAccountReference() {
        return productCombinationFacilityAccountReference;
    }
}