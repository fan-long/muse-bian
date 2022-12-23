package org.museframework.bian.customeroffer.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class UpdateDisclosuresResponse {
    @MetaField(ref=true)
    private org.museframework.bian.customeroffer.dto.bq.Disclosures disclosures;

    public void setDisclosures(org.museframework.bian.customeroffer.dto.bq.Disclosures disclosures) {
        this.disclosures = disclosures;
    }

    public org.museframework.bian.customeroffer.dto.bq.Disclosures getDisclosures() {
        return disclosures;
    }
}