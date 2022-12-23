package org.museframework.bian.cashconcentration.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class ExecuteCashPositionMonitoringandTransferFulfillmentRequest {
    @MetaField
    private String cashconcentrationid;

    @MetaField
    private String cashpositionmonitoringandtransferfulfillmentid;

    @MetaField(ref=true)
    private org.museframework.bian.cashconcentration.dto.bq.CashPositionMonitoringandTransferFulfillment cashPositionMonitoringandTransferFulfillment;

    public void setCashconcentrationid(String cashconcentrationid) {
        this.cashconcentrationid = cashconcentrationid;
    }

    public String getCashconcentrationid() {
        return cashconcentrationid;
    }

    public void setCashpositionmonitoringandtransferfulfillmentid(String cashpositionmonitoringandtransferfulfillmentid) {
        this.cashpositionmonitoringandtransferfulfillmentid = cashpositionmonitoringandtransferfulfillmentid;
    }

    public String getCashpositionmonitoringandtransferfulfillmentid() {
        return cashpositionmonitoringandtransferfulfillmentid;
    }

    public void setCashPositionMonitoringandTransferFulfillment(org.museframework.bian.cashconcentration.dto.bq.CashPositionMonitoringandTransferFulfillment cashPositionMonitoringandTransferFulfillment) {
        this.cashPositionMonitoringandTransferFulfillment = cashPositionMonitoringandTransferFulfillment;
    }

    public org.museframework.bian.cashconcentration.dto.bq.CashPositionMonitoringandTransferFulfillment getCashPositionMonitoringandTransferFulfillment() {
        return cashPositionMonitoringandTransferFulfillment;
    }
}