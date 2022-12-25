/*An operational service or function supported within the Trade Capture and Reporting Function for doing Trade Capture and Reporting Function*/
package org.museframework.bian.traposope.dto.bq;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto
public class TraderTradingPermissionsandLimitsFunction {
    /*The required status/situation and or tasks that need to be completed prior to the invocation of the feature*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Condition preconditions;

    /*The schedule and timing of the function*/
    @MetaField(0)
    private String schedule;

    /*The Trader Trading Permissions and Limits Function specific Business Service*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.BusinessService businessService;

    /*Reference to Trader Trading Permissions and Limits Function*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Session tradedPositionOperatingSessionReference;

    /*Reference to Trader Trading Permissions and Limits Function*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Function traderTradingPermissionsandLimitsFunctionReference;

    /*The type of Trader Trading Permissions and Limits Function*/
    @MetaField(0)
    private String traderTradingPermissionsandLimitsFunctionType;

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

    public void setTraderTradingPermissionsandLimitsFunctionReference(org.museframework.bian.classes.Function traderTradingPermissionsandLimitsFunctionReference) {
        this.traderTradingPermissionsandLimitsFunctionReference = traderTradingPermissionsandLimitsFunctionReference;
    }

    public org.museframework.bian.classes.Function getTraderTradingPermissionsandLimitsFunctionReference() {
        return traderTradingPermissionsandLimitsFunctionReference;
    }

    public void setTraderTradingPermissionsandLimitsFunctionType(String traderTradingPermissionsandLimitsFunctionType) {
        this.traderTradingPermissionsandLimitsFunctionType = traderTradingPermissionsandLimitsFunctionType;
    }

    public String getTraderTradingPermissionsandLimitsFunctionType() {
        return traderTradingPermissionsandLimitsFunctionType;
    }
}