package org.museframework.bian.fraudresolution.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class UpdateFraudResolutionProcedureRequest {
    @MetaField
    private String fraudresolutionid;

    @MetaField(ref=true)
    private org.museframework.bian.fraudresolution.dto.cr.FraudResolutionProcedure fraudResolutionProcedure;

    public void setFraudresolutionid(String fraudresolutionid) {
        this.fraudresolutionid = fraudresolutionid;
    }

    public String getFraudresolutionid() {
        return fraudresolutionid;
    }

    public void setFraudResolutionProcedure(org.museframework.bian.fraudresolution.dto.cr.FraudResolutionProcedure fraudResolutionProcedure) {
        this.fraudResolutionProcedure = fraudResolutionProcedure;
    }

    public org.museframework.bian.fraudresolution.dto.cr.FraudResolutionProcedure getFraudResolutionProcedure() {
        return fraudResolutionProcedure;
    }
}