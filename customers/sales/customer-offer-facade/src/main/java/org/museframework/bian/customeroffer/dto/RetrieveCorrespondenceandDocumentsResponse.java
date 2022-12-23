package org.museframework.bian.customeroffer.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class RetrieveCorrespondenceandDocumentsResponse {
    @MetaField(ref=true)
    private org.museframework.bian.customeroffer.dto.bq.CorrespondenceandDocuments correspondenceandDocuments;

    public void setCorrespondenceandDocuments(org.museframework.bian.customeroffer.dto.bq.CorrespondenceandDocuments correspondenceandDocuments) {
        this.correspondenceandDocuments = correspondenceandDocuments;
    }

    public org.museframework.bian.customeroffer.dto.bq.CorrespondenceandDocuments getCorrespondenceandDocuments() {
        return correspondenceandDocuments;
    }
}