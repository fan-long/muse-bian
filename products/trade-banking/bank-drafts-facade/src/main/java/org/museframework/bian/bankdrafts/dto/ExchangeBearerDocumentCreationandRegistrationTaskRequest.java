package org.museframework.bian.bankdrafts.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class ExchangeBearerDocumentCreationandRegistrationTaskRequest {
    @MetaField
    private String bankdraftsid;

    @MetaField
    private String bearerdocumentcreationandregistrationtaskid;

    @MetaField(ref=true)
    private org.museframework.bian.bankdrafts.dto.bq.BearerDocumentCreationandRegistrationTask bearerDocumentCreationandRegistrationTask;

    public void setBankdraftsid(String bankdraftsid) {
        this.bankdraftsid = bankdraftsid;
    }

    public String getBankdraftsid() {
        return bankdraftsid;
    }

    public void setBearerdocumentcreationandregistrationtaskid(String bearerdocumentcreationandregistrationtaskid) {
        this.bearerdocumentcreationandregistrationtaskid = bearerdocumentcreationandregistrationtaskid;
    }

    public String getBearerdocumentcreationandregistrationtaskid() {
        return bearerdocumentcreationandregistrationtaskid;
    }

    public void setBearerDocumentCreationandRegistrationTask(org.museframework.bian.bankdrafts.dto.bq.BearerDocumentCreationandRegistrationTask bearerDocumentCreationandRegistrationTask) {
        this.bearerDocumentCreationandRegistrationTask = bearerDocumentCreationandRegistrationTask;
    }

    public org.museframework.bian.bankdrafts.dto.bq.BearerDocumentCreationandRegistrationTask getBearerDocumentCreationandRegistrationTask() {
        return bearerDocumentCreationandRegistrationTask;
    }
}