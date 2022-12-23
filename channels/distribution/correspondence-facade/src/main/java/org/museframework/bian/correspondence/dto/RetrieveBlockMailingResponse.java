package org.museframework.bian.correspondence.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class RetrieveBlockMailingResponse {
    @MetaField(ref=true)
    private org.museframework.bian.correspondence.dto.bq.BlockMailing blockMailing;

    public void setBlockMailing(org.museframework.bian.correspondence.dto.bq.BlockMailing blockMailing) {
        this.blockMailing = blockMailing;
    }

    public org.museframework.bian.correspondence.dto.bq.BlockMailing getBlockMailing() {
        return blockMailing;
    }
}