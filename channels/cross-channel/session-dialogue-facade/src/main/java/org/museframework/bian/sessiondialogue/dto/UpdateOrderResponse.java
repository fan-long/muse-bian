package org.museframework.bian.sessiondialogue.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class UpdateOrderResponse {
    @MetaField(ref=true)
    private org.museframework.bian.sessiondialogue.dto.bq.Order order;

    public void setOrder(org.museframework.bian.sessiondialogue.dto.bq.Order order) {
        this.order = order;
    }

    public org.museframework.bian.sessiondialogue.dto.bq.Order getOrder() {
        return order;
    }
}