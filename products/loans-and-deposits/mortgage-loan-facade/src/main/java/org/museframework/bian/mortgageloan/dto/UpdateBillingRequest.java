package org.museframework.bian.mortgageloan.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class UpdateBillingRequest {
    @MetaField
    private String mortgageloanid;

    @MetaField
    private String billingid;

    @MetaField(ref=true)
    private org.museframework.bian.mortgageloan.dto.bq.Billing billing;

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

    public void setBilling(org.museframework.bian.mortgageloan.dto.bq.Billing billing) {
        this.billing = billing;
    }

    public org.museframework.bian.mortgageloan.dto.bq.Billing getBilling() {
        return billing;
    }
}