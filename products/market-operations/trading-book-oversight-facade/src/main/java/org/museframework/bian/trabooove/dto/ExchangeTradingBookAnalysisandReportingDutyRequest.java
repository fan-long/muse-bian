package org.museframework.bian.trabooove.dto;

public class ExchangeTradingBookAnalysisandReportingDutyRequest {
    private String tradingbookoversightid;

    private String tradingbookanalysisandreportingdutyid;

    private org.museframework.bian.trabooove.dto.bq.TradingBookAnalysisandReportingDuty tradingBookAnalysisandReportingDuty;

    public void setTradingbookoversightid(String tradingbookoversightid) {
        this.tradingbookoversightid = tradingbookoversightid;
    }

    public String getTradingbookoversightid() {
        return tradingbookoversightid;
    }

    public void setTradingbookanalysisandreportingdutyid(String tradingbookanalysisandreportingdutyid) {
        this.tradingbookanalysisandreportingdutyid = tradingbookanalysisandreportingdutyid;
    }

    public String getTradingbookanalysisandreportingdutyid() {
        return tradingbookanalysisandreportingdutyid;
    }

    public void setTradingBookAnalysisandReportingDuty(org.museframework.bian.trabooove.dto.bq.TradingBookAnalysisandReportingDuty tradingBookAnalysisandReportingDuty) {
        this.tradingBookAnalysisandReportingDuty = tradingBookAnalysisandReportingDuty;
    }

    public org.museframework.bian.trabooove.dto.bq.TradingBookAnalysisandReportingDuty getTradingBookAnalysisandReportingDuty() {
        return tradingBookAnalysisandReportingDuty;
    }
}