package org.museframework.bian.assandliaman.dto;

public class RetrieveTransactionAlignmentRequest {
    private String assetandliabilitymanagementid;

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