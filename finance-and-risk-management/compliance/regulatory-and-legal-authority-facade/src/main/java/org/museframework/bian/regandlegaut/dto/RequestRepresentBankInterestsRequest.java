package org.museframework.bian.regandlegaut.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class RequestRepresentBankInterestsRequest {
    @MetaField
    private String regulatoryandlegalauthorityid;

    @MetaField
    private String representbankinterestsid;

    @MetaField(ref=true)
    private org.museframework.bian.regandlegaut.dto.bq.RepresentBankInterests representBankInterests;

    public void setRegulatoryandlegalauthorityid(String regulatoryandlegalauthorityid) {
        this.regulatoryandlegalauthorityid = regulatoryandlegalauthorityid;
    }

    public String getRegulatoryandlegalauthorityid() {
        return regulatoryandlegalauthorityid;
    }

    public void setRepresentbankinterestsid(String representbankinterestsid) {
        this.representbankinterestsid = representbankinterestsid;
    }

    public String getRepresentbankinterestsid() {
        return representbankinterestsid;
    }

    public void setRepresentBankInterests(org.museframework.bian.regandlegaut.dto.bq.RepresentBankInterests representBankInterests) {
        this.representBankInterests = representBankInterests;
    }

    public org.museframework.bian.regandlegaut.dto.bq.RepresentBankInterests getRepresentBankInterests() {
        return representBankInterests;
    }
}