package org.museframework.bian.bankguarantee.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class ExchangeBankGuaranteeIssuanceandBookingTaskRequest {
    @MetaField
    private String bankguaranteeid;

    @MetaField
    private String bankguaranteeissuanceandbookingtaskid;

    @MetaField(ref=true)
    private org.museframework.bian.bankguarantee.dto.bq.BankGuaranteeIssuanceandBookingTask bankGuaranteeIssuanceandBookingTask;

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

    public void setBankGuaranteeIssuanceandBookingTask(org.museframework.bian.bankguarantee.dto.bq.BankGuaranteeIssuanceandBookingTask bankGuaranteeIssuanceandBookingTask) {
        this.bankGuaranteeIssuanceandBookingTask = bankGuaranteeIssuanceandBookingTask;
    }

    public org.museframework.bian.bankguarantee.dto.bq.BankGuaranteeIssuanceandBookingTask getBankGuaranteeIssuanceandBookingTask() {
        return bankGuaranteeIssuanceandBookingTask;
    }
}