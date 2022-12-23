package org.museframework.bian.positionmanagement.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class UpdateTransactionApplicationRequest {
    @MetaField
    private String positionmanagementid;

    @MetaField
    private String transactionapplicationid;

    @MetaField(ref=true)
    private org.museframework.bian.positionmanagement.dto.bq.TransactionApplication transactionApplication;

    public void setPositionmanagementid(String positionmanagementid) {
        this.positionmanagementid = positionmanagementid;
    }

    public String getPositionmanagementid() {
        return positionmanagementid;
    }

    public void setTransactionapplicationid(String transactionapplicationid) {
        this.transactionapplicationid = transactionapplicationid;
    }

    public String getTransactionapplicationid() {
        return transactionapplicationid;
    }

    public void setTransactionApplication(org.museframework.bian.positionmanagement.dto.bq.TransactionApplication transactionApplication) {
        this.transactionApplication = transactionApplication;
    }

    public org.museframework.bian.positionmanagement.dto.bq.TransactionApplication getTransactionApplication() {
        return transactionApplication;
    }
}