package org.museframework.bian.crerisope.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class ExecuteTradingCounterpartyCreditLimitIndicatorRequest {
    @MetaField
    private String creditriskoperationsid;

    @MetaField
    private String tradingcounterpartycreditlimitindicatorid;

    @MetaField(ref=true)
    private org.museframework.bian.crerisope.dto.bq.TradingCounterpartyCreditLimitIndicator tradingCounterpartyCreditLimitIndicator;

    public void setCreditriskoperationsid(String creditriskoperationsid) {
        this.creditriskoperationsid = creditriskoperationsid;
    }

    public String getCreditriskoperationsid() {
        return creditriskoperationsid;
    }

    public void setTradingcounterpartycreditlimitindicatorid(String tradingcounterpartycreditlimitindicatorid) {
        this.tradingcounterpartycreditlimitindicatorid = tradingcounterpartycreditlimitindicatorid;
    }

    public String getTradingcounterpartycreditlimitindicatorid() {
        return tradingcounterpartycreditlimitindicatorid;
    }

    public void setTradingCounterpartyCreditLimitIndicator(org.museframework.bian.crerisope.dto.bq.TradingCounterpartyCreditLimitIndicator tradingCounterpartyCreditLimitIndicator) {
        this.tradingCounterpartyCreditLimitIndicator = tradingCounterpartyCreditLimitIndicator;
    }

    public org.museframework.bian.crerisope.dto.bq.TradingCounterpartyCreditLimitIndicator getTradingCounterpartyCreditLimitIndicator() {
        return tradingCounterpartyCreditLimitIndicator;
    }
}