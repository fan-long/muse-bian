package org.museframework.bian.cusevehis.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class CaptureSalesResponse {
    @MetaField(ref=true)
    private org.museframework.bian.cusevehis.dto.bq.Sales sales;

    public void setSales(org.museframework.bian.cusevehis.dto.bq.Sales sales) {
        this.sales = sales;
    }

    public org.museframework.bian.cusevehis.dto.bq.Sales getSales() {
        return sales;
    }
}