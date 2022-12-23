/*An operational service or function supported within the Market Order Initiation Function for doing Market Order Initiation Function*/
package org.museframework.bian.etradingworkbench.dto.bq;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto
public class MarketOrderQuotationFunction {
    /*The required status/situation and or tasks that need to be completed prior to the invocation of the feature*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Condition preconditions;

    /*The schedule and timing of the function*/
    @MetaField
    private String schedule;

    /*The Market Order Quotation Function specific Business Service*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.BusinessService businessService;

    /*Reference to Market Order Quotation Function*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Session eTradingWorkbenchOperatingSessionReference;

    /*Reference to Market Order Quotation Function*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Function marketOrderQuotationFunctionReference;

    /*The type of Market Order Quotation Function*/
    @MetaField
    private String marketOrderQuotationFunctionType;

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

    public void setMarketOrderQuotationFunctionReference(org.museframework.bian.classes.Function marketOrderQuotationFunctionReference) {
        this.marketOrderQuotationFunctionReference = marketOrderQuotationFunctionReference;
    }

    public org.museframework.bian.classes.Function getMarketOrderQuotationFunctionReference() {
        return marketOrderQuotationFunctionReference;
    }

    public void setMarketOrderQuotationFunctionType(String marketOrderQuotationFunctionType) {
        this.marketOrderQuotationFunctionType = marketOrderQuotationFunctionType;
    }

    public String getMarketOrderQuotationFunctionType() {
        return marketOrderQuotationFunctionType;
    }
}