package org.museframework.bian.collections.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class RetrieveCollectionsAccountUpdateRequest {
    @MetaField
    private String collectionsid;

    @MetaField
    private String collectionsaccountupdateid;

    public void setCollectionsid(String collectionsid) {
        this.collectionsid = collectionsid;
    }

    public String getCollectionsid() {
        return collectionsid;
    }

    public void setCollectionsaccountupdateid(String collectionsaccountupdateid) {
        this.collectionsaccountupdateid = collectionsaccountupdateid;
    }

    public String getCollectionsaccountupdateid() {
        return collectionsaccountupdateid;
    }
}