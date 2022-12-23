package org.museframework.bian.cardcase.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class UpdateChargebackRequest {
    @MetaField
    private String cardcaseid;

    @MetaField
    private String chargebackid;

    @MetaField(ref=true)
    private org.museframework.bian.cardcase.dto.bq.Chargeback chargeback;

    public void setCardcaseid(String cardcaseid) {
        this.cardcaseid = cardcaseid;
    }

    public String getCardcaseid() {
        return cardcaseid;
    }

    public void setChargebackid(String chargebackid) {
        this.chargebackid = chargebackid;
    }

    public String getChargebackid() {
        return chargebackid;
    }

    public void setChargeback(org.museframework.bian.cardcase.dto.bq.Chargeback chargeback) {
        this.chargeback = chargeback;
    }

    public org.museframework.bian.cardcase.dto.bq.Chargeback getChargeback() {
        return chargeback;
    }
}