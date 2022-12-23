package org.museframework.bian.syndicatedloan.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class UpdateSyndicateAssemblyResponse {
    @MetaField(ref=true)
    private org.museframework.bian.syndicatedloan.dto.bq.SyndicateAssembly syndicateAssembly;

    public void setSyndicateAssembly(org.museframework.bian.syndicatedloan.dto.bq.SyndicateAssembly syndicateAssembly) {
        this.syndicateAssembly = syndicateAssembly;
    }

    public org.museframework.bian.syndicatedloan.dto.bq.SyndicateAssembly getSyndicateAssembly() {
        return syndicateAssembly;
    }
}