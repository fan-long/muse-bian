package org.museframework.bian.financialgateway.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class InitiateFinancialGatewayOperatingSessionRequest {
    @MetaField(ref=true)
    private org.museframework.bian.financialgateway.dto.cr.FinancialGatewayOperatingSession financialGatewayOperatingSession;

    public void setFinancialGatewayOperatingSession(org.museframework.bian.financialgateway.dto.cr.FinancialGatewayOperatingSession financialGatewayOperatingSession) {
        this.financialGatewayOperatingSession = financialGatewayOperatingSession;
    }

    public org.museframework.bian.financialgateway.dto.cr.FinancialGatewayOperatingSession getFinancialGatewayOperatingSession() {
        return financialGatewayOperatingSession;
    }
}