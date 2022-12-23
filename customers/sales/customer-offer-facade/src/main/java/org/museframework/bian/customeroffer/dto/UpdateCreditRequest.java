package org.museframework.bian.customeroffer.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class UpdateCreditRequest {
    @MetaField
    private String customerofferid;

    @MetaField
    private String creditid;

    @MetaField(ref=true)
    private org.museframework.bian.customeroffer.dto.bq.Credit credit;

    public void setCustomerofferid(String customerofferid) {
        this.customerofferid = customerofferid;
    }

    public String getCustomerofferid() {
        return customerofferid;
    }

    public void setCreditid(String creditid) {
        this.creditid = creditid;
    }

    public String getCreditid() {
        return creditid;
    }

    public void setCredit(org.museframework.bian.customeroffer.dto.bq.Credit credit) {
        this.credit = credit;
    }

    public org.museframework.bian.customeroffer.dto.bq.Credit getCredit() {
        return credit;
    }
}