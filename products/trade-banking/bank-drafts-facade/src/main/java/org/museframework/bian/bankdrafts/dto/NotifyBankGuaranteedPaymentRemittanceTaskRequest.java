package org.museframework.bian.bankdrafts.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class NotifyBankGuaranteedPaymentRemittanceTaskRequest {
    @MetaField
    private String bankdraftsid;

    @MetaField
    private String bankguaranteedpaymentremittancetaskid;

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
}