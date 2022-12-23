package org.museframework.bian.termdeposit.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class UpdatePaymentsRequest {
    @MetaField
    private String termdepositid;

    @MetaField
    private String paymentsid;

    @MetaField(ref=true)
    private org.museframework.bian.termdeposit.dto.bq.Payments payments;

    public void setTermdepositid(String termdepositid) {
        this.termdepositid = termdepositid;
    }

    public String getTermdepositid() {
        return termdepositid;
    }

    public void setPaymentsid(String paymentsid) {
        this.paymentsid = paymentsid;
    }

    public String getPaymentsid() {
        return paymentsid;
    }

    public void setPayments(org.museframework.bian.termdeposit.dto.bq.Payments payments) {
        this.payments = payments;
    }

    public org.museframework.bian.termdeposit.dto.bq.Payments getPayments() {
        return payments;
    }
}