package org.museframework.bian.financialgateway.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class RetrieveFinancialGatewayOperatingSessionRequest {
    @MetaField
    private String financialgatewayid;

    public void setFinancialgatewayid(String financialgatewayid) {
        this.financialgatewayid = financialgatewayid;
    }

    public String getFinancialgatewayid() {
        return financialgatewayid;
    }
}