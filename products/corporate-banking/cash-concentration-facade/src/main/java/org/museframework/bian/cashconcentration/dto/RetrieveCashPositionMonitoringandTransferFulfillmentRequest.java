package org.museframework.bian.cashconcentration.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class RetrieveCashPositionMonitoringandTransferFulfillmentRequest {
    @MetaField
    private String cashconcentrationid;

    @MetaField
    private String cashpositionmonitoringandtransferfulfillmentid;

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
}