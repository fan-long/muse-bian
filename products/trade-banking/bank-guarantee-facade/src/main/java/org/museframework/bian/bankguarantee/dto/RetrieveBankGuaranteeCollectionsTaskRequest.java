package org.museframework.bian.bankguarantee.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class RetrieveBankGuaranteeCollectionsTaskRequest {
    @MetaField
    private String bankguaranteeid;

    @MetaField
    private String bankguaranteecollectionstaskid;

    public void setBankguaranteeid(String bankguaranteeid) {
        this.bankguaranteeid = bankguaranteeid;
    }

    public String getBankguaranteeid() {
        return bankguaranteeid;
    }

    public void setBankguaranteecollectionstaskid(String bankguaranteecollectionstaskid) {
        this.bankguaranteecollectionstaskid = bankguaranteecollectionstaskid;
    }

    public String getBankguaranteecollectionstaskid() {
        return bankguaranteecollectionstaskid;
    }
}