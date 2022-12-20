package org.museframework.bian.investmentaccount.dto;

public class InitiateCorporateActionResponse {
    private org.museframework.bian.investmentaccount.dto.bq.CorporateAction corporateAction;

    public void setCorporateAction(org.museframework.bian.investmentaccount.dto.bq.CorporateAction corporateAction) {
        this.corporateAction = corporateAction;
    }

    public org.museframework.bian.investmentaccount.dto.bq.CorporateAction getCorporateAction() {
        return corporateAction;
    }
}