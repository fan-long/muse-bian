package org.museframework.bian.cusevehis.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class CaptureFraudRequest {
    @MetaField
    private String customereventhistoryid;

    @MetaField
    private String fraudid;

    @MetaField(ref=true)
    private org.museframework.bian.cusevehis.dto.bq.Fraud fraud;

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

    public void setFraud(org.museframework.bian.cusevehis.dto.bq.Fraud fraud) {
        this.fraud = fraud;
    }

    public org.museframework.bian.cusevehis.dto.bq.Fraud getFraud() {
        return fraud;
    }
}