package org.museframework.bian.customeroffer.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class UpdateAgreementRequest {
    @MetaField
    private String customerofferid;

    @MetaField
    private String agreementid;

    @MetaField(ref=true)
    private org.museframework.bian.customeroffer.dto.bq.Agreement agreement;

    public void setCustomerofferid(String customerofferid) {
        this.customerofferid = customerofferid;
    }

    public String getCustomerofferid() {
        return customerofferid;
    }

    public void setAgreementid(String agreementid) {
        this.agreementid = agreementid;
    }

    public String getAgreementid() {
        return agreementid;
    }

    public void setAgreement(org.museframework.bian.customeroffer.dto.bq.Agreement agreement) {
        this.agreement = agreement;
    }

    public org.museframework.bian.customeroffer.dto.bq.Agreement getAgreement() {
        return agreement;
    }
}