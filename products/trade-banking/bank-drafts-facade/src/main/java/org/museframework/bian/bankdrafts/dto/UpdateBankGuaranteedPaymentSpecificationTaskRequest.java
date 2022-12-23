package org.museframework.bian.bankdrafts.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class UpdateBankGuaranteedPaymentSpecificationTaskRequest {
    @MetaField
    private String bankdraftsid;

    @MetaField
    private String bankguaranteedpaymentspecificationtaskid;

    @MetaField(ref=true)
    private org.museframework.bian.bankdrafts.dto.bq.BankGuaranteedPaymentSpecificationTask bankGuaranteedPaymentSpecificationTask;

    public void setBankdraftsid(String bankdraftsid) {
        this.bankdraftsid = bankdraftsid;
    }

    public String getBankdraftsid() {
        return bankdraftsid;
    }

    public void setBankguaranteedpaymentspecificationtaskid(String bankguaranteedpaymentspecificationtaskid) {
        this.bankguaranteedpaymentspecificationtaskid = bankguaranteedpaymentspecificationtaskid;
    }

    public String getBankguaranteedpaymentspecificationtaskid() {
        return bankguaranteedpaymentspecificationtaskid;
    }

    public void setBankGuaranteedPaymentSpecificationTask(org.museframework.bian.bankdrafts.dto.bq.BankGuaranteedPaymentSpecificationTask bankGuaranteedPaymentSpecificationTask) {
        this.bankGuaranteedPaymentSpecificationTask = bankGuaranteedPaymentSpecificationTask;
    }

    public org.museframework.bian.bankdrafts.dto.bq.BankGuaranteedPaymentSpecificationTask getBankGuaranteedPaymentSpecificationTask() {
        return bankGuaranteedPaymentSpecificationTask;
    }
}