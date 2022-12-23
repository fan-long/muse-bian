package org.museframework.bian.bankdrafts.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class NotifyBearerDocumentCreationandRegistrationTaskResponse {
    @MetaField(ref=true)
    private org.museframework.bian.bankdrafts.dto.bq.BearerDocumentCreationandRegistrationTask bearerDocumentCreationandRegistrationTask;

    public void setBearerDocumentCreationandRegistrationTask(org.museframework.bian.bankdrafts.dto.bq.BearerDocumentCreationandRegistrationTask bearerDocumentCreationandRegistrationTask) {
        this.bearerDocumentCreationandRegistrationTask = bearerDocumentCreationandRegistrationTask;
    }

    public org.museframework.bian.bankdrafts.dto.bq.BearerDocumentCreationandRegistrationTask getBearerDocumentCreationandRegistrationTask() {
        return bearerDocumentCreationandRegistrationTask;
    }
}