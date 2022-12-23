package org.museframework.bian.chelocbox.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class NotifyCheckClearingandSettlementFulfillmentResponse {
    @MetaField(ref=true)
    private org.museframework.bian.chelocbox.dto.bq.CheckClearingandSettlementFulfillment checkClearingandSettlementFulfillment;

    public void setCheckClearingandSettlementFulfillment(org.museframework.bian.chelocbox.dto.bq.CheckClearingandSettlementFulfillment checkClearingandSettlementFulfillment) {
        this.checkClearingandSettlementFulfillment = checkClearingandSettlementFulfillment;
    }

    public org.museframework.bian.chelocbox.dto.bq.CheckClearingandSettlementFulfillment getCheckClearingandSettlementFulfillment() {
        return checkClearingandSettlementFulfillment;
    }
}