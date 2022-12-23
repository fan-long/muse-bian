package org.museframework.bian.fraudmodel.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class RetrieveFraudModelSpecificationResponse {
    @MetaField(ref=true)
    private org.museframework.bian.fraudmodel.dto.cr.FraudModelSpecification fraudModelSpecification;

    public void setFraudModelSpecification(org.museframework.bian.fraudmodel.dto.cr.FraudModelSpecification fraudModelSpecification) {
        this.fraudModelSpecification = fraudModelSpecification;
    }

    public org.museframework.bian.fraudmodel.dto.cr.FraudModelSpecification getFraudModelSpecification() {
        return fraudModelSpecification;
    }
}