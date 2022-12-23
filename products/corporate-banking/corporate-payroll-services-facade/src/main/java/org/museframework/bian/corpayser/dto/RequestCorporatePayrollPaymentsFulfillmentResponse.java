package org.museframework.bian.corpayser.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class RequestCorporatePayrollPaymentsFulfillmentResponse {
    @MetaField(ref=true)
    private org.museframework.bian.corpayser.dto.bq.CorporatePayrollPaymentsFulfillment corporatePayrollPaymentsFulfillment;

    public void setCorporatePayrollPaymentsFulfillment(org.museframework.bian.corpayser.dto.bq.CorporatePayrollPaymentsFulfillment corporatePayrollPaymentsFulfillment) {
        this.corporatePayrollPaymentsFulfillment = corporatePayrollPaymentsFulfillment;
    }

    public org.museframework.bian.corpayser.dto.bq.CorporatePayrollPaymentsFulfillment getCorporatePayrollPaymentsFulfillment() {
        return corporatePayrollPaymentsFulfillment;
    }
}