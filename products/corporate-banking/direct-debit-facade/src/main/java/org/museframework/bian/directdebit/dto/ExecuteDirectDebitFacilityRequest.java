package org.museframework.bian.directdebit.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class ExecuteDirectDebitFacilityRequest {
    @MetaField
    private String directdebitid;

    @MetaField(ref=true)
    private org.museframework.bian.directdebit.dto.cr.DirectDebitFacility directDebitFacility;

    public void setDirectdebitid(String directdebitid) {
        this.directdebitid = directdebitid;
    }

    public String getDirectdebitid() {
        return directdebitid;
    }

    public void setDirectDebitFacility(org.museframework.bian.directdebit.dto.cr.DirectDebitFacility directDebitFacility) {
        this.directDebitFacility = directDebitFacility;
    }

    public org.museframework.bian.directdebit.dto.cr.DirectDebitFacility getDirectDebitFacility() {
        return directDebitFacility;
    }
}