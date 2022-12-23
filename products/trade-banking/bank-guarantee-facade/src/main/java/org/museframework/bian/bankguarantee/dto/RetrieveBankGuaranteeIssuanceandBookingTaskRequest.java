package org.museframework.bian.bankguarantee.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class RetrieveBankGuaranteeIssuanceandBookingTaskRequest {
    @MetaField
    private String bankguaranteeid;

    @MetaField
    private String bankguaranteeissuanceandbookingtaskid;

    public void setBankguaranteeid(String bankguaranteeid) {
        this.bankguaranteeid = bankguaranteeid;
    }

    public String getBankguaranteeid() {
        return bankguaranteeid;
    }

    public void setBankguaranteeissuanceandbookingtaskid(String bankguaranteeissuanceandbookingtaskid) {
        this.bankguaranteeissuanceandbookingtaskid = bankguaranteeissuanceandbookingtaskid;
    }

    public String getBankguaranteeissuanceandbookingtaskid() {
        return bankguaranteeissuanceandbookingtaskid;
    }
}