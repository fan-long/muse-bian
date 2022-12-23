package org.museframework.bian.cashconcentration.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class UpdateCashPositionMonitoringandTransferFulfillmentResponse {
    @MetaField(ref=true)
    private org.museframework.bian.cashconcentration.dto.bq.CashPositionMonitoringandTransferFulfillment cashPositionMonitoringandTransferFulfillment;

    public void setCashPositionMonitoringandTransferFulfillment(org.museframework.bian.cashconcentration.dto.bq.CashPositionMonitoringandTransferFulfillment cashPositionMonitoringandTransferFulfillment) {
        this.cashPositionMonitoringandTransferFulfillment = cashPositionMonitoringandTransferFulfillment;
    }

    public org.museframework.bian.cashconcentration.dto.bq.CashPositionMonitoringandTransferFulfillment getCashPositionMonitoringandTransferFulfillment() {
        return cashPositionMonitoringandTransferFulfillment;
    }
}