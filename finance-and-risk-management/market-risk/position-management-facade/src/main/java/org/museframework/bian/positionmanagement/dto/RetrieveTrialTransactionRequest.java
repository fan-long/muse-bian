package org.museframework.bian.positionmanagement.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class RetrieveTrialTransactionRequest {
    @MetaField
    private String positionmanagementid;

    @MetaField
    private String trialtransactionid;

    public void setPositionmanagementid(String positionmanagementid) {
        this.positionmanagementid = positionmanagementid;
    }

    public String getPositionmanagementid() {
        return positionmanagementid;
    }

    public void setTrialtransactionid(String trialtransactionid) {
        this.trialtransactionid = trialtransactionid;
    }

    public String getTrialtransactionid() {
        return trialtransactionid;
    }
}