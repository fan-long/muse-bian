package org.museframework.bian.merchantrelations.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class RetrieveOperationalTermRequest {
    @MetaField
    private String merchantrelationsid;

    @MetaField
    private String operationaltermid;

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
}