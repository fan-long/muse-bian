/*An operational service or function supported within the Market Order Initiation Function for doing Market Order Initiation Function*/
package org.museframework.bian.etradingworkbench.dto.bq;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto
public class MarketOrderInitiationFunction {
    /*The required status/situation and or tasks that need to be completed prior to the invocation of the feature*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Condition preconditions;

    /*The schedule and timing of the function*/
    @MetaField
    private String schedule;

    /*The Market Order Initiation Function specific Business Service*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.BusinessService businessService;

    /*Reference to Market Order Initiation Function*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Session eTradingWorkbenchOperatingSessionReference;

    /*Reference to Market Order Initiation Function*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Function marketOrderInitiationFunctionReference;

    /*The type of Market Order Initiation Function*/
    @MetaField
    private String marketOrderInitiationFunctionType;

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

    public void seteTradingWorkbenchOperatingSessionReference(org.museframework.bian.classes.Session eTradingWorkbenchOperatingSessionReference) {
        this.eTradingWorkbenchOperatingSessionReference = eTradingWorkbenchOperatingSessionReference;
    }

    public org.museframework.bian.classes.Session geteTradingWorkbenchOperatingSessionReference() {
        return eTradingWorkbenchOperatingSessionReference;
    }

    public void setMarketOrderInitiationFunctionReference(org.museframework.bian.classes.Function marketOrderInitiationFunctionReference) {
        this.marketOrderInitiationFunctionReference = marketOrderInitiationFunctionReference;
    }

    public org.museframework.bian.classes.Function getMarketOrderInitiationFunctionReference() {
        return marketOrderInitiationFunctionReference;
    }

    public void setMarketOrderInitiationFunctionType(String marketOrderInitiationFunctionType) {
        this.marketOrderInitiationFunctionType = marketOrderInitiationFunctionType;
    }

    public String getMarketOrderInitiationFunctionType() {
        return marketOrderInitiationFunctionType;
    }
}