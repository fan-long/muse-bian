package org.museframework.bian.secfaipro.dto;

public class RequestSecurityTradingFailsProcedureRequest {
    private String securitiesfailsprocessingid;

    private org.museframework.bian.secfaipro.dto.cr.SecurityTradingFailsProcedure securityTradingFailsProcedure;

    public void setSecuritiesfailsprocessingid(String securitiesfailsprocessingid) {
        this.securitiesfailsprocessingid = securitiesfailsprocessingid;
    }

    public String getSecuritiesfailsprocessingid() {
        return securitiesfailsprocessingid;
    }

    public void setSecurityTradingFailsProcedure(org.museframework.bian.secfaipro.dto.cr.SecurityTradingFailsProcedure securityTradingFailsProcedure) {
        this.securityTradingFailsProcedure = securityTradingFailsProcedure;
    }

    public org.museframework.bian.secfaipro.dto.cr.SecurityTradingFailsProcedure getSecurityTradingFailsProcedure() {
        return securityTradingFailsProcedure;
    }
}