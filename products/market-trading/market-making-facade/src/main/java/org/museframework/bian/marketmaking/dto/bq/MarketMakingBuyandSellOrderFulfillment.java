/*The configuration and execution of Market Making Security Traded Position Fulfillment arrangement within the Market Making Security Traded Position Fulfillment*/
package org.museframework.bian.marketmaking.dto.bq;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto
public class MarketMakingBuyandSellOrderFulfillment {
    /*The required status/situation prior to the implementation of the feature*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Condition preconditions;

    /*The timing and key actions/milestones involved in completing the fulfillment feature instance*/
    @MetaField(0)
    private String schedule;

    /*The Market Making Buy and Sell Order Fulfillment specific Business Service*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.BusinessService businessService;

    /*The completion status and any triggered/dependent actions once the feature instance has been fulfilled*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Condition postconditions;

    /*Reference to Market Making Buy and Sell Order Fulfillment*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.FinancialFacility marketMakingFacilityReference;

    /*Reference to Market Making Buy and Sell Order Fulfillment*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object marketMakingBuyandSellOrderFulfillmentReference;

    /*The type of Market Making Buy and Sell Order Fulfillment*/
    @MetaField(0)
    private String marketMakingBuyandSellOrderFulfillmentType;

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

    public void setMarketMakingBuyandSellOrderFulfillmentReference(org.museframework.bian.classes.Object marketMakingBuyandSellOrderFulfillmentReference) {
        this.marketMakingBuyandSellOrderFulfillmentReference = marketMakingBuyandSellOrderFulfillmentReference;
    }

    public org.museframework.bian.classes.Object getMarketMakingBuyandSellOrderFulfillmentReference() {
        return marketMakingBuyandSellOrderFulfillmentReference;
    }

    public void setMarketMakingBuyandSellOrderFulfillmentType(String marketMakingBuyandSellOrderFulfillmentType) {
        this.marketMakingBuyandSellOrderFulfillmentType = marketMakingBuyandSellOrderFulfillmentType;
    }

    public String getMarketMakingBuyandSellOrderFulfillmentType() {
        return marketMakingBuyandSellOrderFulfillmentType;
    }
}