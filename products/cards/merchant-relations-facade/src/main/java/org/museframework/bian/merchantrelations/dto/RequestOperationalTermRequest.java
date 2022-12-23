package org.museframework.bian.merchantrelations.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class RequestOperationalTermRequest {
    @MetaField
    private String merchantrelationsid;

    @MetaField
    private String operationaltermid;

    @MetaField(ref=true)
    private org.museframework.bian.merchantrelations.dto.bq.OperationalTerm operationalTerm;

    public void setMerchantrelationsid(String merchantrelationsid) {
        this.merchantrelationsid = merchantrelationsid;
    }

    public String getMerchantrelationsid() {
        return merchantrelationsid;
    }

    public void setOperationaltermid(String operationaltermid) {
        this.operationaltermid = operationaltermid;
    }

    public String getOperationaltermid() {
        return operationaltermid;
    }

    public void setOperationalTerm(org.museframework.bian.merchantrelations.dto.bq.OperationalTerm operationalTerm) {
        this.operationalTerm = operationalTerm;
    }

    public org.museframework.bian.merchantrelations.dto.bq.OperationalTerm getOperationalTerm() {
        return operationalTerm;
    }
}