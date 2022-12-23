package org.museframework.bian.trabooove.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class NotifyTradingBookAnalysisandReportingDutyRequest {
    @MetaField
    private String tradingbookoversightid;

    @MetaField
    private String tradingbookanalysisandreportingdutyid;

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
}