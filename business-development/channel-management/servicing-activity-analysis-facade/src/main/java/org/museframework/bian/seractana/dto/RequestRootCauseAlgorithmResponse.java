package org.museframework.bian.seractana.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class RequestRootCauseAlgorithmResponse {
    @MetaField(ref=true)
    private org.museframework.bian.seractana.dto.bq.RootCauseAlgorithm rootCauseAlgorithm;

    public void setRootCauseAlgorithm(org.museframework.bian.seractana.dto.bq.RootCauseAlgorithm rootCauseAlgorithm) {
        this.rootCauseAlgorithm = rootCauseAlgorithm;
    }

    public org.museframework.bian.seractana.dto.bq.RootCauseAlgorithm getRootCauseAlgorithm() {
        return rootCauseAlgorithm;
    }
}