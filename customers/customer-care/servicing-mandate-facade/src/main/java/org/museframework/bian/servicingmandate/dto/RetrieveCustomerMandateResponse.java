package org.museframework.bian.servicingmandate.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class RetrieveCustomerMandateResponse {
    @MetaField(ref=true)
    private org.museframework.bian.servicingmandate.dto.bq.CustomerMandate customerMandate;

    public void setCustomerMandate(org.museframework.bian.servicingmandate.dto.bq.CustomerMandate customerMandate) {
        this.customerMandate = customerMandate;
    }

    public org.museframework.bian.servicingmandate.dto.bq.CustomerMandate getCustomerMandate() {
        return customerMandate;
    }
}