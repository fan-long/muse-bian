package org.museframework.bian.sessiondialogue.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class RetrieveSalesResponse {
    @MetaField(ref=true)
    private org.museframework.bian.sessiondialogue.dto.bq.Sales sales;

    public void setSales(org.museframework.bian.sessiondialogue.dto.bq.Sales sales) {
        this.sales = sales;
    }

    public org.museframework.bian.sessiondialogue.dto.bq.Sales getSales() {
        return sales;
    }
}