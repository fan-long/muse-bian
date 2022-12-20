package org.museframework.bian.assandliaman.dto;

public class RequestTransactionAlignmentRequest {
    private String assetandliabilitymanagementid;

    private String transactionalignmentid;

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