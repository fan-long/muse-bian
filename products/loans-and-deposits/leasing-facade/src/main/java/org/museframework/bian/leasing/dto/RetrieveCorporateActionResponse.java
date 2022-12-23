package org.museframework.bian.leasing.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class RetrieveCorporateActionResponse {
    @MetaField(ref=true)
    private org.museframework.bian.leasing.dto.bq.CorporateAction corporateAction;

    public void setCorporateAction(org.museframework.bian.leasing.dto.bq.CorporateAction corporateAction) {
        this.corporateAction = corporateAction;
    }

    public org.museframework.bian.leasing.dto.bq.CorporateAction getCorporateAction() {
        return corporateAction;
    }
}