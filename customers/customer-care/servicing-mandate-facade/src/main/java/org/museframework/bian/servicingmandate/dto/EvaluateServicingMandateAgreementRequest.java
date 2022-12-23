package org.museframework.bian.servicingmandate.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class EvaluateServicingMandateAgreementRequest {
    @MetaField(ref=true)
    private org.museframework.bian.servicingmandate.dto.cr.ServicingMandateAgreement servicingMandateAgreement;

    public void setServicingMandateAgreement(org.museframework.bian.servicingmandate.dto.cr.ServicingMandateAgreement servicingMandateAgreement) {
        this.servicingMandateAgreement = servicingMandateAgreement;
    }

    public org.museframework.bian.servicingmandate.dto.cr.ServicingMandateAgreement getServicingMandateAgreement() {
        return servicingMandateAgreement;
    }
}