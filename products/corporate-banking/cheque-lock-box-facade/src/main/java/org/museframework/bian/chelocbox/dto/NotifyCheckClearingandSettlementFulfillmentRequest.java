package org.museframework.bian.chelocbox.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class NotifyCheckClearingandSettlementFulfillmentRequest {
    @MetaField
    private String chequelockboxid;

    @MetaField
    private String checkclearingandsettlementfulfillmentid;

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
}