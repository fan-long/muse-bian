package org.museframework.bian.positionmanagement.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class RetrieveTransactionApplicationRequest {
    @MetaField
    private String positionmanagementid;

    @MetaField
    private String transactionapplicationid;

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
}