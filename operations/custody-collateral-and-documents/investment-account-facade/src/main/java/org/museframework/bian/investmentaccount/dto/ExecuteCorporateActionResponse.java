package org.museframework.bian.investmentaccount.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class ExecuteCorporateActionResponse {
    @MetaField(ref=true)
    private org.museframework.bian.investmentaccount.dto.bq.CorporateAction corporateAction;

    public void setCorporateAction(org.museframework.bian.investmentaccount.dto.bq.CorporateAction corporateAction) {
        this.corporateAction = corporateAction;
    }

    public org.museframework.bian.investmentaccount.dto.bq.CorporateAction getCorporateAction() {
        return corporateAction;
    }
}