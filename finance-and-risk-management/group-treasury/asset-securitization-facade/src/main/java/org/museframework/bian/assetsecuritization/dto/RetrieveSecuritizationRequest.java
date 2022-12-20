package org.museframework.bian.assetsecuritization.dto;

public class RetrieveSecuritizationRequest {
    private String assetsecuritizationid;

    private String securitizationid;

    public void setAssetsecuritizationid(String assetsecuritizationid) {
        this.assetsecuritizationid = assetsecuritizationid;
    }

    public String getAssetsecuritizationid() {
        return assetsecuritizationid;
    }

    public void setSecuritizationid(String securitizationid) {
        this.securitizationid = securitizationid;
    }

    public String getSecuritizationid() {
        return securitizationid;
    }
}