package org.museframework.bian.bankdrafts.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class NotifyBearerDocumentCreationandRegistrationTaskRequest {
    @MetaField
    private String bankdraftsid;

    @MetaField
    private String bearerdocumentcreationandregistrationtaskid;

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
}