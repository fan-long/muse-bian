package org.museframework.bian.mortgageloan.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class InitiatePaymentsRequest {
    @MetaField
    private String mortgageloanid;

    @MetaField
    private String paymentsid;

    @MetaField(ref=true)
    private org.museframework.bian.mortgageloan.dto.bq.Payments payments;

    public void setMortgageloanid(String mortgageloanid) {
        this.mortgageloanid = mortgageloanid;
    }

    public String getMortgageloanid() {
        return mortgageloanid;
    }

    public void setPaymentsid(String paymentsid) {
        this.paymentsid = paymentsid;
    }

    public String getPaymentsid() {
        return paymentsid;
    }

    public void setPayments(org.museframework.bian.mortgageloan.dto.bq.Payments payments) {
        this.payments = payments;
    }

    public org.museframework.bian.mortgageloan.dto.bq.Payments getPayments() {
        return payments;
    }
}