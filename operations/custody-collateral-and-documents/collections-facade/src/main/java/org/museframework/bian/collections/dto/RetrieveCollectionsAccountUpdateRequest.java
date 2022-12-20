package org.museframework.bian.collections.dto;

public class RetrieveCollectionsAccountUpdateRequest {
    private String collectionsid;

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