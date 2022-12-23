package org.museframework.bian.chaactana.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class ExecuteCustomerFraudResponse {
    @MetaField(ref=true)
    private org.museframework.bian.chaactana.dto.bq.CustomerFraud customerFraud;

    public void setCustomerFraud(org.museframework.bian.chaactana.dto.bq.CustomerFraud customerFraud) {
        this.customerFraud = customerFraud;
    }

    public org.museframework.bian.chaactana.dto.bq.CustomerFraud getCustomerFraud() {
        return customerFraud;
    }
}