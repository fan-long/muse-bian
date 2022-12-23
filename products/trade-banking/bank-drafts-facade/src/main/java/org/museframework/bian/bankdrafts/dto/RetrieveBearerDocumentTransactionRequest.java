package org.museframework.bian.bankdrafts.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class RetrieveBearerDocumentTransactionRequest {
    @MetaField
    private String bankdraftsid;

    public void setBankdraftsid(String bankdraftsid) {
        this.bankdraftsid = bankdraftsid;
    }

    public String getBankdraftsid() {
        return bankdraftsid;
    }
}