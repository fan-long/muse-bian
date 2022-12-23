package org.museframework.bian.merchandisingloan.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class UpdatePaymentsRequest {
    @MetaField
    private String merchandisingloanid;

    @MetaField
    private String paymentsid;

    @MetaField(ref=true)
    private org.museframework.bian.merchandisingloan.dto.bq.Payments payments;

    public void setMerchandisingloanid(String merchandisingloanid) {
        this.merchandisingloanid = merchandisingloanid;
    }

    public String getMerchandisingloanid() {
        return merchandisingloanid;
    }

    public void setPaymentsid(String paymentsid) {
        this.paymentsid = paymentsid;
    }

    public String getPaymentsid() {
        return paymentsid;
    }

    public void setPayments(org.museframework.bian.merchandisingloan.dto.bq.Payments payments) {
        this.payments = payments;
    }

    public org.museframework.bian.merchandisingloan.dto.bq.Payments getPayments() {
        return payments;
    }
}