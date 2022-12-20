package org.museframework.bian.crerisope.dto;

public class RequestTradingCounterpartyCreditLimitIndicatorRequest {
    private String creditriskoperationsid;

    private String tradingcounterpartycreditlimitindicatorid;

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