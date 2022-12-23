package org.museframework.bian.itstaandgui.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class ExchangeITPoliciesandGuidelinesResponse {
    @MetaField(ref=true)
    private org.museframework.bian.itstaandgui.dto.bq.ITPoliciesandGuidelines iTPoliciesandGuidelines;

    public void setiTPoliciesandGuidelines(org.museframework.bian.itstaandgui.dto.bq.ITPoliciesandGuidelines iTPoliciesandGuidelines) {
        this.iTPoliciesandGuidelines = iTPoliciesandGuidelines;
    }

    public org.museframework.bian.itstaandgui.dto.bq.ITPoliciesandGuidelines getiTPoliciesandGuidelines() {
        return iTPoliciesandGuidelines;
    }
}