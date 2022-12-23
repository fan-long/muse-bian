package org.museframework.bian.trabooove.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class RequestTradingBookAnalysisandReportingDutyRequest {
    @MetaField
    private String tradingbookoversightid;

    @MetaField
    private String tradingbookanalysisandreportingdutyid;

    @MetaField(ref=true)
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