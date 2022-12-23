package org.museframework.bian.customeroffer.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class RetrieveCorrespondenceandDocumentsRequest {
    @MetaField
    private String customerofferid;

    @MetaField
    private String correspondenceanddocumentsid;

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
}