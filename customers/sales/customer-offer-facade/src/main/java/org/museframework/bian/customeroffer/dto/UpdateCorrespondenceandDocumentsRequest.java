package org.museframework.bian.customeroffer.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class UpdateCorrespondenceandDocumentsRequest {
    @MetaField
    private String customerofferid;

    @MetaField
    private String correspondenceanddocumentsid;

    @MetaField(ref=true)
    private org.museframework.bian.customeroffer.dto.bq.CorrespondenceandDocuments correspondenceandDocuments;

    public void setCustomerofferid(String customerofferid) {
        this.customerofferid = customerofferid;
    }

    public String getCustomerofferid() {
        return customerofferid;
    }

    public void setCorrespondenceanddocumentsid(String correspondenceanddocumentsid) {
        this.correspondenceanddocumentsid = correspondenceanddocumentsid;
    }

    public String getCorrespondenceanddocumentsid() {
        return correspondenceanddocumentsid;
    }

    public void setCorrespondenceandDocuments(org.museframework.bian.customeroffer.dto.bq.CorrespondenceandDocuments correspondenceandDocuments) {
        this.correspondenceandDocuments = correspondenceandDocuments;
    }

    public org.museframework.bian.customeroffer.dto.bq.CorrespondenceandDocuments getCorrespondenceandDocuments() {
        return correspondenceandDocuments;
    }
}