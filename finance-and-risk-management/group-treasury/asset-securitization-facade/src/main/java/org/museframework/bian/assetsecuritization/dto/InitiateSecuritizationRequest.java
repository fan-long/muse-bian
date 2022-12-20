package org.museframework.bian.assetsecuritization.dto;

public class InitiateSecuritizationRequest {
    private String assetsecuritizationid;

    private String securitizationid;

    private org.museframework.bian.assetsecuritization.dto.bq.Securitization securitization;

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

    public void setSecuritization(org.museframework.bian.assetsecuritization.dto.bq.Securitization securitization) {
        this.securitization = securitization;
    }

    public org.museframework.bian.assetsecuritization.dto.bq.Securitization getSecuritization() {
        return securitization;
    }
}