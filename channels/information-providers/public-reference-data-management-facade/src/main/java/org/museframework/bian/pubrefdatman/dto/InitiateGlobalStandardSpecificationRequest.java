package org.museframework.bian.pubrefdatman.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class InitiateGlobalStandardSpecificationRequest {
    @MetaField(ref=true)
    private org.museframework.bian.pubrefdatman.dto.cr.GlobalStandardSpecification globalStandardSpecification;

    public void setGlobalStandardSpecification(org.museframework.bian.pubrefdatman.dto.cr.GlobalStandardSpecification globalStandardSpecification) {
        this.globalStandardSpecification = globalStandardSpecification;
    }

    public org.museframework.bian.pubrefdatman.dto.cr.GlobalStandardSpecification getGlobalStandardSpecification() {
        return globalStandardSpecification;
    }
}