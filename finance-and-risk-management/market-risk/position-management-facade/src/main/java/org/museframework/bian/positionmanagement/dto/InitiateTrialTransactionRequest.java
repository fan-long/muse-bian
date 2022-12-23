package org.museframework.bian.positionmanagement.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class InitiateTrialTransactionRequest {
    @MetaField
    private String positionmanagementid;

    @MetaField
    private String trialtransactionid;

    @MetaField(ref=true)
    private org.museframework.bian.positionmanagement.dto.bq.TrialTransaction trialTransaction;

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

    public void setTrialTransaction(org.museframework.bian.positionmanagement.dto.bq.TrialTransaction trialTransaction) {
        this.trialTransaction = trialTransaction;
    }

    public org.museframework.bian.positionmanagement.dto.bq.TrialTransaction getTrialTransaction() {
        return trialTransaction;
    }
}