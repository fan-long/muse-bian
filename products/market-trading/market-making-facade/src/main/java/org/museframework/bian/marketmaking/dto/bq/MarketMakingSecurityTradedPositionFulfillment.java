/*The configuration and execution of Market Making Security Traded Position Fulfillment arrangement within the Market Making Security Traded Position Fulfillment*/
package org.museframework.bian.marketmaking.dto.bq;

public class MarketMakingSecurityTradedPositionFulfillment {
    /*The required status/situation prior to the implementation of the feature*/
    private org.museframework.bian.classes.Condition preconditions;

    /*The timing and key actions/milestones involved in completing the fulfillment feature instance*/
    private String schedule;

    /*The Market Making Security Traded Position Fulfillment specific Business Service*/
    private org.museframework.bian.classes.BusinessService businessService;

    /*The completion status and any triggered/dependent actions once the feature instance has been fulfilled*/
    private org.museframework.bian.classes.Condition postconditions;

    /*Reference to Market Making Security Traded Position Fulfillment*/
    private org.museframework.bian.classes.FinancialFacility marketMakingFacilityReference;

    /*Reference to Market Making Security Traded Position Fulfillment*/
    private org.museframework.bian.classes.Object marketMakingSecurityTradedPositionFulfillmentReference;

    /*The type of Market Making Security Traded Position Fulfillment*/
    private String marketMakingSecurityTradedPositionFulfillmentType;

    public void setPreconditions(org.museframework.bian.classes.Condition preconditions) {
        this.preconditions = preconditions;
    }

    public org.museframework.bian.classes.Condition getPreconditions() {
        return preconditions;
    }

    public void setSchedule(String schedule) {
        this.schedule = schedule;
    }

    public String getSchedule() {
        return schedule;
    }

    public void setBusinessService(org.museframework.bian.classes.BusinessService businessService) {
        this.businessService = businessService;
    }

    public org.museframework.bian.classes.BusinessService getBusinessService() {
        return businessService;
    }

    public void setPostconditions(org.museframework.bian.classes.Condition postconditions) {
        this.postconditions = postconditions;
    }

    public org.museframework.bian.classes.Condition getPostconditions() {
        return postconditions;
    }

    public void setMarketMakingFacilityReference(org.museframework.bian.classes.FinancialFacility marketMakingFacilityReference) {
        this.marketMakingFacilityReference = marketMakingFacilityReference;
    }

    public org.museframework.bian.classes.FinancialFacility getMarketMakingFacilityReference() {
        return marketMakingFacilityReference;
    }

    public void setMarketMakingSecurityTradedPositionFulfillmentReference(org.museframework.bian.classes.Object marketMakingSecurityTradedPositionFulfillmentReference) {
        this.marketMakingSecurityTradedPositionFulfillmentReference = marketMakingSecurityTradedPositionFulfillmentReference;
    }

    public org.museframework.bian.classes.Object getMarketMakingSecurityTradedPositionFulfillmentReference() {
        return marketMakingSecurityTradedPositionFulfillmentReference;
    }

    public void setMarketMakingSecurityTradedPositionFulfillmentType(String marketMakingSecurityTradedPositionFulfillmentType) {
        this.marketMakingSecurityTradedPositionFulfillmentType = marketMakingSecurityTradedPositionFulfillmentType;
    }

    public String getMarketMakingSecurityTradedPositionFulfillmentType() {
        return marketMakingSecurityTradedPositionFulfillmentType;
    }
}