package org.museframework.bian.corpayser.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class NotifyCorporatePayrollPaymentsFulfillmentRequest {
    @MetaField
    private String corporatepayrollservicesid;

    @MetaField
    private String corporatepayrollpaymentsfulfillmentid;

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
}