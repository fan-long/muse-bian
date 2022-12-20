package org.museframework.bian.leasing.dto;

public class InitiateCorporateActionResponse {
    private org.museframework.bian.leasing.dto.bq.CorporateAction corporateAction;

    public void setCorporateAction(org.museframework.bian.leasing.dto.bq.CorporateAction corporateAction) {
        this.corporateAction = corporateAction;
    }

    public org.museframework.bian.leasing.dto.bq.CorporateAction getCorporateAction() {
        return corporateAction;
    }
}