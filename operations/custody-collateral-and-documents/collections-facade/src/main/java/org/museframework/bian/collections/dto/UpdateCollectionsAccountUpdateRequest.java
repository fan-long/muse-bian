package org.museframework.bian.collections.dto;

public class UpdateCollectionsAccountUpdateRequest {
    private String collectionsid;

    private String collectionsaccountupdateid;

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