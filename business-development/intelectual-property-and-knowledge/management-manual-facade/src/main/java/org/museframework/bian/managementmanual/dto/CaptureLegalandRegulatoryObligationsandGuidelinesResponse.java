package org.museframework.bian.managementmanual.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class CaptureLegalandRegulatoryObligationsandGuidelinesResponse {
    @MetaField(ref=true)
    private org.museframework.bian.managementmanual.dto.bq.LegalandRegulatoryObligationsandGuidelines legalandRegulatoryObligationsandGuidelines;

    public void setLegalandRegulatoryObligationsandGuidelines(org.museframework.bian.managementmanual.dto.bq.LegalandRegulatoryObligationsandGuidelines legalandRegulatoryObligationsandGuidelines) {
        this.legalandRegulatoryObligationsandGuidelines = legalandRegulatoryObligationsandGuidelines;
    }

    public org.museframework.bian.managementmanual.dto.bq.LegalandRegulatoryObligationsandGuidelines getLegalandRegulatoryObligationsandGuidelines() {
        return legalandRegulatoryObligationsandGuidelines;
    }
}