package org.museframework.bian.dealerdesk.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class ExecuteDealerDeskTradingAssignmentandLimitsFunctionRequest {
    @MetaField
    private String dealerdeskid;

    @MetaField
    private String dealerdesktradingassignmentandlimitsfunctionid;

    @MetaField(ref=true)
    private org.museframework.bian.dealerdesk.dto.bq.DealerDeskTradingAssignmentandLimitsFunction dealerDeskTradingAssignmentandLimitsFunction;

    public void setDealerdeskid(String dealerdeskid) {
        this.dealerdeskid = dealerdeskid;
    }

    public String getDealerdeskid() {
        return dealerdeskid;
    }

    public void setDealerdesktradingassignmentandlimitsfunctionid(String dealerdesktradingassignmentandlimitsfunctionid) {
        this.dealerdesktradingassignmentandlimitsfunctionid = dealerdesktradingassignmentandlimitsfunctionid;
    }

    public String getDealerdesktradingassignmentandlimitsfunctionid() {
        return dealerdesktradingassignmentandlimitsfunctionid;
    }

    public void setDealerDeskTradingAssignmentandLimitsFunction(org.museframework.bian.dealerdesk.dto.bq.DealerDeskTradingAssignmentandLimitsFunction dealerDeskTradingAssignmentandLimitsFunction) {
        this.dealerDeskTradingAssignmentandLimitsFunction = dealerDeskTradingAssignmentandLimitsFunction;
    }

    public org.museframework.bian.dealerdesk.dto.bq.DealerDeskTradingAssignmentandLimitsFunction getDealerDeskTradingAssignmentandLimitsFunction() {
        return dealerDeskTradingAssignmentandLimitsFunction;
    }
}