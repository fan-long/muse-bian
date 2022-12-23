package org.museframework.bian.assandliaman.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class CreateTransactionAlignmentRequest {
    @MetaField
    private String assetandliabilitymanagementid;

    @MetaField
    private String transactionalignmentid;

    @MetaField(ref=true)
    private org.museframework.bian.assandliaman.dto.bq.TransactionAlignment transactionAlignment;

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

    public void setTransactionAlignment(org.museframework.bian.assandliaman.dto.bq.TransactionAlignment transactionAlignment) {
        this.transactionAlignment = transactionAlignment;
    }

    public org.museframework.bian.assandliaman.dto.bq.TransactionAlignment getTransactionAlignment() {
        return transactionAlignment;
    }
}