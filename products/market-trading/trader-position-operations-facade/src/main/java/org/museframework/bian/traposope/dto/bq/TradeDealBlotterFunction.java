/*An operational service or function supported within the Trade Capture and Reporting Function for doing Trade Capture and Reporting Function*/
package org.museframework.bian.traposope.dto.bq;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto
public class TradeDealBlotterFunction {
    /*The required status/situation and or tasks that need to be completed prior to the invocation of the feature*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Condition preconditions;

    /*The schedule and timing of the function*/
    @MetaField(0)
    private String schedule;

    /*The Trade Deal Blotter Function specific Business Service*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.BusinessService businessService;

    /*Reference to Trade Deal Blotter Function*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Session tradedPositionOperatingSessionReference;

    /*Reference to Trade Deal Blotter Function*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Function tradeDealBlotterFunctionReference;

    /*The type of Trade Deal Blotter Function*/
    @MetaField(0)
    private String tradeDealBlotterFunctionType;

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

    public void setTradedPositionOperatingSessionReference(org.museframework.bian.classes.Session tradedPositionOperatingSessionReference) {
        this.tradedPositionOperatingSessionReference = tradedPositionOperatingSessionReference;
    }

    public org.museframework.bian.classes.Session getTradedPositionOperatingSessionReference() {
        return tradedPositionOperatingSessionReference;
    }

    public void setTradeDealBlotterFunctionReference(org.museframework.bian.classes.Function tradeDealBlotterFunctionReference) {
        this.tradeDealBlotterFunctionReference = tradeDealBlotterFunctionReference;
    }

    public org.museframework.bian.classes.Function getTradeDealBlotterFunctionReference() {
        return tradeDealBlotterFunctionReference;
    }

    public void setTradeDealBlotterFunctionType(String tradeDealBlotterFunctionType) {
        this.tradeDealBlotterFunctionType = tradeDealBlotterFunctionType;
    }

    public String getTradeDealBlotterFunctionType() {
        return tradeDealBlotterFunctionType;
    }
}