package org.museframework.bian.subcusagr.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class RetrieveRegulatoryTermResponse {
    @MetaField(ref=true)
    private org.museframework.bian.subcusagr.dto.bq.RegulatoryTerm regulatoryTerm;

    public void setRegulatoryTerm(org.museframework.bian.subcusagr.dto.bq.RegulatoryTerm regulatoryTerm) {
        this.regulatoryTerm = regulatoryTerm;
    }

    public org.museframework.bian.subcusagr.dto.bq.RegulatoryTerm getRegulatoryTerm() {
        return regulatoryTerm;
    }
}