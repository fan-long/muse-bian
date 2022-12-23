package org.museframework.bian.corpayser.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class ExecuteCorporatePayrollPaymentsFulfillmentRequest {
    @MetaField
    private String corporatepayrollservicesid;

    @MetaField
    private String corporatepayrollpaymentsfulfillmentid;

    @MetaField(ref=true)
    private org.museframework.bian.corpayser.dto.bq.CorporatePayrollPaymentsFulfillment corporatePayrollPaymentsFulfillment;

    public void setCorporatepayrollservicesid(String corporatepayrollservicesid) {
        this.corporatepayrollservicesid = corporatepayrollservicesid;
    }

    public String getCorporatepayrollservicesid() {
        return corporatepayrollservicesid;
    }

    public void setCorporatepayrollpaymentsfulfillmentid(String corporatepayrollpaymentsfulfillmentid) {
        this.corporatepayrollpaymentsfulfillmentid = corporatepayrollpaymentsfulfillmentid;
    }

    public String getCorporatepayrollpaymentsfulfillmentid() {
        return corporatepayrollpaymentsfulfillmentid;
    }

    public void setCorporatePayrollPaymentsFulfillment(org.museframework.bian.corpayser.dto.bq.CorporatePayrollPaymentsFulfillment corporatePayrollPaymentsFulfillment) {
        this.corporatePayrollPaymentsFulfillment = corporatePayrollPaymentsFulfillment;
    }

    public org.museframework.bian.corpayser.dto.bq.CorporatePayrollPaymentsFulfillment getCorporatePayrollPaymentsFulfillment() {
        return corporatePayrollPaymentsFulfillment;
    }
}