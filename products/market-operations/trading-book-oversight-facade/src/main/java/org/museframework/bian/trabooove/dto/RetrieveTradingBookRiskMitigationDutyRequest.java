package org.museframework.bian.trabooove.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class RetrieveTradingBookRiskMitigationDutyRequest {
    @MetaField
    private String tradingbookoversightid;

    @MetaField
    private String tradingbookriskmitigationdutyid;

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
}