package org.museframework.bian.bankdrafts.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class NotifyBankGuaranteedPaymentSpecificationTaskRequest {
    @MetaField
    private String bankdraftsid;

    @MetaField
    private String bankguaranteedpaymentspecificationtaskid;

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
}