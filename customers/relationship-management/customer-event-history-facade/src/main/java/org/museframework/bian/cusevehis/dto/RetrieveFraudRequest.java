package org.museframework.bian.cusevehis.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class RetrieveFraudRequest {
    @MetaField
    private String customereventhistoryid;

    @MetaField
    private String fraudid;

    public void setCustomereventhistoryid(String customereventhistoryid) {
        this.customereventhistoryid = customereventhistoryid;
    }

    public String getCustomereventhistoryid() {
        return customereventhistoryid;
    }

    public void setFraudid(String fraudid) {
        this.fraudid = fraudid;
    }

    public String getFraudid() {
        return fraudid;
    }
}