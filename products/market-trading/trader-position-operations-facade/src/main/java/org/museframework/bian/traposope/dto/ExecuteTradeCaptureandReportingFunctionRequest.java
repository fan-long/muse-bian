package org.museframework.bian.traposope.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class ExecuteTradeCaptureandReportingFunctionRequest {
    @MetaField
    private String traderpositionoperationsid;

    @MetaField
    private String tradecaptureandreportingfunctionid;

    @MetaField(ref=true)
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