package org.museframework.bian.collections.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class UpdateCollectionsAccountUpdateRequest {
    @MetaField
    private String collectionsid;

    @MetaField
    private String collectionsaccountupdateid;

    @MetaField(ref=true)
    private org.museframework.bian.collections.dto.bq.CollectionsAccountUpdate collectionsAccountUpdate;

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

    public void setCollectionsAccountUpdate(org.museframework.bian.collections.dto.bq.CollectionsAccountUpdate collectionsAccountUpdate) {
        this.collectionsAccountUpdate = collectionsAccountUpdate;
    }

    public org.museframework.bian.collections.dto.bq.CollectionsAccountUpdate getCollectionsAccountUpdate() {
        return collectionsAccountUpdate;
    }
}