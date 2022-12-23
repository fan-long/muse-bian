package org.museframework.bian.customerposition.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class CaptureCreditRequest {
    @MetaField
    private String customerpositionid;

    @MetaField
    private String creditid;

    @MetaField(ref=true)
    private org.museframework.bian.customerposition.dto.bq.Credit credit;

    public void setCustomerpositionid(String customerpositionid) {
        this.customerpositionid = customerpositionid;
    }

    public String getCustomerpositionid() {
        return customerpositionid;
    }

    public void setCreditid(String creditid) {
        this.creditid = creditid;
    }

    public String getCreditid() {
        return creditid;
    }

    public void setCredit(org.museframework.bian.customerposition.dto.bq.Credit credit) {
        this.credit = credit;
    }

    public org.museframework.bian.customerposition.dto.bq.Credit getCredit() {
        return credit;
    }
}