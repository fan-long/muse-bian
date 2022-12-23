package org.museframework.bian.tradesettlement.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class RetrieveMarketTradeCashSettlementWorkstepRequest {
    @MetaField
    private String tradesettlementid;

    @MetaField
    private String markettradecashsettlementworkstepid;

    public void setTradesettlementid(String tradesettlementid) {
        this.tradesettlementid = tradesettlementid;
    }

    public String getTradesettlementid() {
        return tradesettlementid;
    }

    public void setMarkettradecashsettlementworkstepid(String markettradecashsettlementworkstepid) {
        this.markettradecashsettlementworkstepid = markettradecashsettlementworkstepid;
    }

    public String getMarkettradecashsettlementworkstepid() {
        return markettradecashsettlementworkstepid;
    }
}