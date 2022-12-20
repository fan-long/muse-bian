package org.museframework.bian.collections.dto;

public class RetrieveCollectionsAccountUpdateResponse {
    private org.museframework.bian.collections.dto.bq.CollectionsAccountUpdate collectionsAccountUpdate;

    public void setCollectionsAccountUpdate(org.museframework.bian.collections.dto.bq.CollectionsAccountUpdate collectionsAccountUpdate) {
        this.collectionsAccountUpdate = collectionsAccountUpdate;
    }

    public org.museframework.bian.collections.dto.bq.CollectionsAccountUpdate getCollectionsAccountUpdate() {
        return collectionsAccountUpdate;
    }
}