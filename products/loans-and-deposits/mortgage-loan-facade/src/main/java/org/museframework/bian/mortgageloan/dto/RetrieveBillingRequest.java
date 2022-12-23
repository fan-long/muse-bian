package org.museframework.bian.mortgageloan.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class RetrieveBillingRequest {
    @MetaField
    private String mortgageloanid;

    @MetaField
    private String billingid;

    public void setMortgageloanid(String mortgageloanid) {
        this.mortgageloanid = mortgageloanid;
    }

    public String getMortgageloanid() {
        return mortgageloanid;
    }

    public void setBillingid(String billingid) {
        this.billingid = billingid;
    }

    public String getBillingid() {
        return billingid;
    }
}