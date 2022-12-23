package org.museframework.bian.procamexe.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class UpdateCandidateSelectionResponse {
    @MetaField(ref=true)
    private org.museframework.bian.procamexe.dto.bq.CandidateSelection candidateSelection;

    public void setCandidateSelection(org.museframework.bian.procamexe.dto.bq.CandidateSelection candidateSelection) {
        this.candidateSelection = candidateSelection;
    }

    public org.museframework.bian.procamexe.dto.bq.CandidateSelection getCandidateSelection() {
        return candidateSelection;
    }
}