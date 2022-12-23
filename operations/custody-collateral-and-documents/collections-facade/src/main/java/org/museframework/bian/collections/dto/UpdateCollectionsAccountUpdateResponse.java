package org.museframework.bian.collections.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class UpdateCollectionsAccountUpdateResponse {
    @MetaField(ref=true)
    private org.museframework.bian.collections.dto.bq.CollectionsAccountUpdate collectionsAccountUpdate;

    public void setCollectionsAccountUpdate(org.museframework.bian.collections.dto.bq.CollectionsAccountUpdate collectionsAccountUpdate) {
        this.collectionsAccountUpdate = collectionsAccountUpdate;
    }

    public org.museframework.bian.collections.dto.bq.CollectionsAccountUpdate getCollectionsAccountUpdate() {
        return collectionsAccountUpdate;
    }
}