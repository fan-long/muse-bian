package org.museframework.bian.chelocbox.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class ExchangeCheckClearingandSettlementFulfillmentRequest {
    @MetaField
    private String chequelockboxid;

    @MetaField
    private String checkclearingandsettlementfulfillmentid;

    @MetaField(ref=true)
    private org.museframework.bian.chelocbox.dto.bq.CheckClearingandSettlementFulfillment checkClearingandSettlementFulfillment;

    public void setChequelockboxid(String chequelockboxid) {
        this.chequelockboxid = chequelockboxid;
    }

    public String getChequelockboxid() {
        return chequelockboxid;
    }

    public void setCheckclearingandsettlementfulfillmentid(String checkclearingandsettlementfulfillmentid) {
        this.checkclearingandsettlementfulfillmentid = checkclearingandsettlementfulfillmentid;
    }

    public String getCheckclearingandsettlementfulfillmentid() {
        return checkclearingandsettlementfulfillmentid;
    }

    public void setCheckClearingandSettlementFulfillment(org.museframework.bian.chelocbox.dto.bq.CheckClearingandSettlementFulfillment checkClearingandSettlementFulfillment) {
        this.checkClearingandSettlementFulfillment = checkClearingandSettlementFulfillment;
    }

    public org.museframework.bian.chelocbox.dto.bq.CheckClearingandSettlementFulfillment getCheckClearingandSettlementFulfillment() {
        return checkClearingandSettlementFulfillment;
    }
}