package org.museframework.bian.assetsecuritization.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class InitiateSelectionResponse {
    @MetaField(ref=true)
    private org.museframework.bian.assetsecuritization.dto.bq.Selection selection;

    public void setSelection(org.museframework.bian.assetsecuritization.dto.bq.Selection selection) {
        this.selection = selection;
    }

    public org.museframework.bian.assetsecuritization.dto.bq.Selection getSelection() {
        return selection;
    }
}