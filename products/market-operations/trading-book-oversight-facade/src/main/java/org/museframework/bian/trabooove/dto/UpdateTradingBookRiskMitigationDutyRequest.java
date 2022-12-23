package org.museframework.bian.trabooove.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class UpdateTradingBookRiskMitigationDutyRequest {
    @MetaField
    private String tradingbookoversightid;

    @MetaField
    private String tradingbookriskmitigationdutyid;

    @MetaField(ref=true)
    private org.museframework.bian.trabooove.dto.bq.TradingBookRiskMitigationDuty tradingBookRiskMitigationDuty;

    public void setTradingbookoversightid(String tradingbookoversightid) {
        this.tradingbookoversightid = tradingbookoversightid;
    }

    public String getTradingbookoversightid() {
        return tradingbookoversightid;
    }

    public void setTradingbookriskmitigationdutyid(String tradingbookriskmitigationdutyid) {
        this.tradingbookriskmitigationdutyid = tradingbookriskmitigationdutyid;
    }

    public String getTradingbookriskmitigationdutyid() {
        return tradingbookriskmitigationdutyid;
    }

    public void setTradingBookRiskMitigationDuty(org.museframework.bian.trabooove.dto.bq.TradingBookRiskMitigationDuty tradingBookRiskMitigationDuty) {
        this.tradingBookRiskMitigationDuty = tradingBookRiskMitigationDuty;
    }

    public org.museframework.bian.trabooove.dto.bq.TradingBookRiskMitigationDuty getTradingBookRiskMitigationDuty() {
        return tradingBookRiskMitigationDuty;
    }
}