package org.museframework.bian.fraudresolution.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class InitiateFraudResolutionProcedureResponse {
    @MetaField(ref=true)
    private org.museframework.bian.fraudresolution.dto.cr.FraudResolutionProcedure fraudResolutionProcedure;

    public void setFraudResolutionProcedure(org.museframework.bian.fraudresolution.dto.cr.FraudResolutionProcedure fraudResolutionProcedure) {
        this.fraudResolutionProcedure = fraudResolutionProcedure;
    }

    public org.museframework.bian.fraudresolution.dto.cr.FraudResolutionProcedure getFraudResolutionProcedure() {
        return fraudResolutionProcedure;
    }
}