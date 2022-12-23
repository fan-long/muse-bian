package org.museframework.bian.accountrecovery.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class UpdateWritedownResponse {
    @MetaField(ref=true)
    private org.museframework.bian.accountrecovery.dto.bq.Writedown writedown;

    public void setWritedown(org.museframework.bian.accountrecovery.dto.bq.Writedown writedown) {
        this.writedown = writedown;
    }

    public org.museframework.bian.accountrecovery.dto.bq.Writedown getWritedown() {
        return writedown;
    }
}