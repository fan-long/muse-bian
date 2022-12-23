package org.museframework.bian.merchandisingloan.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class UpdateBillingRequest {
    @MetaField
    private String merchandisingloanid;

    @MetaField
    private String billingid;

    @MetaField(ref=true)
    private org.museframework.bian.merchandisingloan.dto.bq.Billing billing;

    public void setMerchandisingloanid(String merchandisingloanid) {
        this.merchandisingloanid = merchandisingloanid;
    }

    public String getMerchandisingloanid() {
        return merchandisingloanid;
    }

    public void setBillingid(String billingid) {
        this.billingid = billingid;
    }

    public String getBillingid() {
        return billingid;
    }

    public void setBilling(org.museframework.bian.merchandisingloan.dto.bq.Billing billing) {
        this.billing = billing;
    }

    public org.museframework.bian.merchandisingloan.dto.bq.Billing getBilling() {
        return billing;
    }
}