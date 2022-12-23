package org.museframework.bian.cardclearing.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class RetrieveMatchingResponse {
    @MetaField(ref=true)
    private org.museframework.bian.cardclearing.dto.bq.Matching matching;

    public void setMatching(org.museframework.bian.cardclearing.dto.bq.Matching matching) {
        this.matching = matching;
    }

    public org.museframework.bian.cardclearing.dto.bq.Matching getMatching() {
        return matching;
    }
}