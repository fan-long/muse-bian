package org.museframework.bian.corporatetreasury.dto;

public class UpdateSecuritizationResponse {
    private org.museframework.bian.corporatetreasury.dto.bq.Securitization securitization;

    public void setSecuritization(org.museframework.bian.corporatetreasury.dto.bq.Securitization securitization) {
        this.securitization = securitization;
    }

    public org.museframework.bian.corporatetreasury.dto.bq.Securitization getSecuritization() {
        return securitization;
    }
}