package org.museframework.bian.traposope.dto;

public class RequestTradeCaptureandReportingFunctionRequest {
    private String traderpositionoperationsid;

    private String tradecaptureandreportingfunctionid;

    private org.museframework.bian.traposope.dto.bq.TradeCaptureandReportingFunction tradeCaptureandReportingFunction;

    public void setTraderpositionoperationsid(String traderpositionoperationsid) {
        this.traderpositionoperationsid = traderpositionoperationsid;
    }

    public String getTraderpositionoperationsid() {
        return traderpositionoperationsid;
    }

    public void setTradecaptureandreportingfunctionid(String tradecaptureandreportingfunctionid) {
        this.tradecaptureandreportingfunctionid = tradecaptureandreportingfunctionid;
    }

    public String getTradecaptureandreportingfunctionid() {
        return tradecaptureandreportingfunctionid;
    }

    public void setTradeCaptureandReportingFunction(org.museframework.bian.traposope.dto.bq.TradeCaptureandReportingFunction tradeCaptureandReportingFunction) {
        this.tradeCaptureandReportingFunction = tradeCaptureandReportingFunction;
    }

    public org.museframework.bian.traposope.dto.bq.TradeCaptureandReportingFunction getTradeCaptureandReportingFunction() {
        return tradeCaptureandReportingFunction;
    }
}