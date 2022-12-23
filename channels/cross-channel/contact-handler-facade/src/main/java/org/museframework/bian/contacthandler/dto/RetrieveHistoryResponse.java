package org.museframework.bian.contacthandler.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class RetrieveHistoryResponse {
    @MetaField(ref=true)
    private org.museframework.bian.contacthandler.dto.bq.History history;

    public void setHistory(org.museframework.bian.contacthandler.dto.bq.History history) {
        this.history = history;
    }

    public org.museframework.bian.contacthandler.dto.bq.History getHistory() {
        return history;
    }
}