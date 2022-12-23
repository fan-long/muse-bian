package org.museframework.bian.proquaass.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class RetrieveFunctionalConsistencyChecksResponse {
    @MetaField(ref=true)
    private org.museframework.bian.proquaass.dto.bq.FunctionalConsistencyChecks functionalConsistencyChecks;

    public void setFunctionalConsistencyChecks(org.museframework.bian.proquaass.dto.bq.FunctionalConsistencyChecks functionalConsistencyChecks) {
        this.functionalConsistencyChecks = functionalConsistencyChecks;
    }

    public org.museframework.bian.proquaass.dto.bq.FunctionalConsistencyChecks getFunctionalConsistencyChecks() {
        return functionalConsistencyChecks;
    }
}