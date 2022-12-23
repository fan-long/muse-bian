package org.museframework.bian.proquaass.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class UpdateUsabilityChecksResponse {
    @MetaField(ref=true)
    private org.museframework.bian.proquaass.dto.bq.UsabilityChecks usabilityChecks;

    public void setUsabilityChecks(org.museframework.bian.proquaass.dto.bq.UsabilityChecks usabilityChecks) {
        this.usabilityChecks = usabilityChecks;
    }

    public org.museframework.bian.proquaass.dto.bq.UsabilityChecks getUsabilityChecks() {
        return usabilityChecks;
    }
}