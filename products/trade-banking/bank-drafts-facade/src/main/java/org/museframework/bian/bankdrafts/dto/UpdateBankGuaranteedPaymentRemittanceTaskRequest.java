package org.museframework.bian.bankdrafts.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class UpdateBankGuaranteedPaymentRemittanceTaskRequest {
    @MetaField
    private String bankdraftsid;

    @MetaField
    private String bankguaranteedpaymentremittancetaskid;

    @MetaField(ref=true)
    private org.museframework.bian.bankdrafts.dto.bq.BankGuaranteedPaymentRemittanceTask bankGuaranteedPaymentRemittanceTask;

    public void setBankdraftsid(String bankdraftsid) {
        this.bankdraftsid = bankdraftsid;
    }

    public String getBankdraftsid() {
        return bankdraftsid;
    }

    public void setBankguaranteedpaymentremittancetaskid(String bankguaranteedpaymentremittancetaskid) {
        this.bankguaranteedpaymentremittancetaskid = bankguaranteedpaymentremittancetaskid;
    }

    public String getBankguaranteedpaymentremittancetaskid() {
        return bankguaranteedpaymentremittancetaskid;
    }

    public void setBankGuaranteedPaymentRemittanceTask(org.museframework.bian.bankdrafts.dto.bq.BankGuaranteedPaymentRemittanceTask bankGuaranteedPaymentRemittanceTask) {
        this.bankGuaranteedPaymentRemittanceTask = bankGuaranteedPaymentRemittanceTask;
    }

    public org.museframework.bian.bankdrafts.dto.bq.BankGuaranteedPaymentRemittanceTask getBankGuaranteedPaymentRemittanceTask() {
        return bankGuaranteedPaymentRemittanceTask;
    }
}