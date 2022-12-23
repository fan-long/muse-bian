package org.museframework.bian.sessiondialogue.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class UpdateHistoryResponse {
    @MetaField(ref=true)
    private org.museframework.bian.sessiondialogue.dto.bq.History history;

    public void setHistory(org.museframework.bian.sessiondialogue.dto.bq.History history) {
        this.history = history;
    }

    public org.museframework.bian.sessiondialogue.dto.bq.History getHistory() {
        return history;
    }
}