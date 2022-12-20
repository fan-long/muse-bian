package org.museframework.bian.corporatelease.dto;

public class RetrieveAdministerResponse {
    private org.museframework.bian.corporatelease.dto.bq.Administer administer;

    public void setAdminister(org.museframework.bian.corporatelease.dto.bq.Administer administer) {
        this.administer = administer;
    }

    public org.museframework.bian.corporatelease.dto.bq.Administer getAdminister() {
        return administer;
    }
}