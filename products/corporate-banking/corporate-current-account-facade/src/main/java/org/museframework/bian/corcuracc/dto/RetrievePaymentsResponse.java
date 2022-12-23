package org.museframework.bian.corcuracc.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class RetrievePaymentsResponse {
    @MetaField(ref=true)
    private org.museframework.bian.corcuracc.dto.bq.Payments payments;

    public void setPayments(org.museframework.bian.corcuracc.dto.bq.Payments payments) {
        this.payments = payments;
    }

    public org.museframework.bian.corcuracc.dto.bq.Payments getPayments() {
        return payments;
    }
}