package org.museframework.bian.cardcase.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class UpdateArbitrationRequest {
    @MetaField
    private String cardcaseid;

    @MetaField
    private String arbitrationid;

    @MetaField(ref=true)
    private org.museframework.bian.cardcase.dto.bq.Arbitration arbitration;

    public void setCardcaseid(String cardcaseid) {
        this.cardcaseid = cardcaseid;
    }

    public String getCardcaseid() {
        return cardcaseid;
    }

    public void setArbitrationid(String arbitrationid) {
        this.arbitrationid = arbitrationid;
    }

    public String getArbitrationid() {
        return arbitrationid;
    }

    public void setArbitration(org.museframework.bian.cardcase.dto.bq.Arbitration arbitration) {
        this.arbitration = arbitration;
    }

    public org.museframework.bian.cardcase.dto.bq.Arbitration getArbitration() {
        return arbitration;
    }
}