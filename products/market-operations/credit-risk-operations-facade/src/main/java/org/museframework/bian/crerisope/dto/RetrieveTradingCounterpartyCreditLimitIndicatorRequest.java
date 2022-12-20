package org.museframework.bian.crerisope.dto;

public class RetrieveTradingCounterpartyCreditLimitIndicatorRequest {
    private String creditriskoperationsid;

    private String tradingcounterpartycreditlimitindicatorid;

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
}