package org.museframework.bian.paymentinitiation.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class RetrieveComplianceResponse {
    @MetaField(ref=true)
    private org.museframework.bian.paymentinitiation.dto.bq.Compliance compliance;

    public void setCompliance(org.museframework.bian.paymentinitiation.dto.bq.Compliance compliance) {
        this.compliance = compliance;
    }

    public org.museframework.bian.paymentinitiation.dto.bq.Compliance getCompliance() {
        return compliance;
    }
}