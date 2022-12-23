package org.museframework.bian.corcuracc.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class ExecutePaymentsRequest {
    @MetaField
    private String corporatecurrentaccountid;

    @MetaField
    private String paymentsid;

    @MetaField(ref=true)
    private org.museframework.bian.corcuracc.dto.bq.Payments payments;

    public void setCorporatecurrentaccountid(String corporatecurrentaccountid) {
        this.corporatecurrentaccountid = corporatecurrentaccountid;
    }

    public String getCorporatecurrentaccountid() {
        return corporatecurrentaccountid;
    }

    public void setPaymentsid(String paymentsid) {
        this.paymentsid = paymentsid;
    }

    public String getPaymentsid() {
        return paymentsid;
    }

    public void setPayments(org.museframework.bian.corcuracc.dto.bq.Payments payments) {
        this.payments = payments;
    }

    public org.museframework.bian.corcuracc.dto.bq.Payments getPayments() {
        return payments;
    }
}