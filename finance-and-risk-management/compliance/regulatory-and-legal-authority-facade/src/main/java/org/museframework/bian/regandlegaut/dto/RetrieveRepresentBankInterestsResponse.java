package org.museframework.bian.regandlegaut.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class RetrieveRepresentBankInterestsResponse {
    @MetaField(ref=true)
    private org.museframework.bian.regandlegaut.dto.bq.RepresentBankInterests representBankInterests;

    public void setRepresentBankInterests(org.museframework.bian.regandlegaut.dto.bq.RepresentBankInterests representBankInterests) {
        this.representBankInterests = representBankInterests;
    }

    public org.museframework.bian.regandlegaut.dto.bq.RepresentBankInterests getRepresentBankInterests() {
        return representBankInterests;
    }
}