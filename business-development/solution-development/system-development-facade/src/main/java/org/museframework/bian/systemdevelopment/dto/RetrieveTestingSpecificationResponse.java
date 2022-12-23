package org.museframework.bian.systemdevelopment.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class RetrieveTestingSpecificationResponse {
    @MetaField(ref=true)
    private org.museframework.bian.systemdevelopment.dto.bq.TestingSpecification testingSpecification;

    public void setTestingSpecification(org.museframework.bian.systemdevelopment.dto.bq.TestingSpecification testingSpecification) {
        this.testingSpecification = testingSpecification;
    }

    public org.museframework.bian.systemdevelopment.dto.bq.TestingSpecification getTestingSpecification() {
        return testingSpecification;
    }
}