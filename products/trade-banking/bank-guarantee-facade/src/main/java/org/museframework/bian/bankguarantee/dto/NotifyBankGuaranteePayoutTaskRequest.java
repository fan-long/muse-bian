package org.museframework.bian.bankguarantee.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class NotifyBankGuaranteePayoutTaskRequest {
    @MetaField
    private String bankguaranteeid;

    @MetaField
    private String bankguaranteepayouttaskid;

    public void setBankguaranteeid(String bankguaranteeid) {
        this.bankguaranteeid = bankguaranteeid;
    }

    public String getBankguaranteeid() {
        return bankguaranteeid;
    }

    public void setBankguaranteepayouttaskid(String bankguaranteepayouttaskid) {
        this.bankguaranteepayouttaskid = bankguaranteepayouttaskid;
    }

    public String getBankguaranteepayouttaskid() {
        return bankguaranteepayouttaskid;
    }
}