package org.museframework.bian.assetsecuritization.dto;

public class UpdateSecuritizationResponse {
    private org.museframework.bian.assetsecuritization.dto.bq.Securitization securitization;

    public void setSecuritization(org.museframework.bian.assetsecuritization.dto.bq.Securitization securitization) {
        this.securitization = securitization;
    }

    public org.museframework.bian.assetsecuritization.dto.bq.Securitization getSecuritization() {
        return securitization;
    }
}