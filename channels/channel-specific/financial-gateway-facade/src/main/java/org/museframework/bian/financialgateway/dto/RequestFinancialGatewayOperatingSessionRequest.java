package org.museframework.bian.financialgateway.dto;

public class RequestFinancialGatewayOperatingSessionRequest {
    private String financialgatewayid;

    private org.museframework.bian.financialgateway.dto.cr.FinancialGatewayOperatingSession financialGatewayOperatingSession;

    public void setFinancialgatewayid(String financialgatewayid) {
        this.financialgatewayid = financialgatewayid;
    }

    public String getFinancialgatewayid() {
        return financialgatewayid;
    }

    public void setFinancialGatewayOperatingSession(org.museframework.bian.financialgateway.dto.cr.FinancialGatewayOperatingSession financialGatewayOperatingSession) {
        this.financialGatewayOperatingSession = financialGatewayOperatingSession;
    }

    public org.museframework.bian.financialgateway.dto.cr.FinancialGatewayOperatingSession getFinancialGatewayOperatingSession() {
        return financialGatewayOperatingSession;
    }
}