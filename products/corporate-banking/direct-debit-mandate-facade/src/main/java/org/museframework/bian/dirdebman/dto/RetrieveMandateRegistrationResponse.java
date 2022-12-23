package org.museframework.bian.dirdebman.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class RetrieveMandateRegistrationResponse {
    @MetaField(ref=true)
    private org.museframework.bian.dirdebman.dto.bq.MandateRegistration mandateRegistration;

    public void setMandateRegistration(org.museframework.bian.dirdebman.dto.bq.MandateRegistration mandateRegistration) {
        this.mandateRegistration = mandateRegistration;
    }

    public org.museframework.bian.dirdebman.dto.bq.MandateRegistration getMandateRegistration() {
        return mandateRegistration;
    }
}