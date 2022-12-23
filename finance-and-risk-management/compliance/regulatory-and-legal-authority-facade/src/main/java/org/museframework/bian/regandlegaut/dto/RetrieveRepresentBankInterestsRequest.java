package org.museframework.bian.regandlegaut.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class RetrieveRepresentBankInterestsRequest {
    @MetaField
    private String regulatoryandlegalauthorityid;

    @MetaField
    private String representbankinterestsid;

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
}