package org.museframework.bian.assandliaman.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class RetrieveTransactionAlignmentRequest {
    @MetaField
    private String assetandliabilitymanagementid;

    @MetaField
    private String transactionalignmentid;

    public void setAssetandliabilitymanagementid(String assetandliabilitymanagementid) {
        this.assetandliabilitymanagementid = assetandliabilitymanagementid;
    }

    public String getAssetandliabilitymanagementid() {
        return assetandliabilitymanagementid;
    }

    public void setTransactionalignmentid(String transactionalignmentid) {
        this.transactionalignmentid = transactionalignmentid;
    }

    public String getTransactionalignmentid() {
        return transactionalignmentid;
    }
}