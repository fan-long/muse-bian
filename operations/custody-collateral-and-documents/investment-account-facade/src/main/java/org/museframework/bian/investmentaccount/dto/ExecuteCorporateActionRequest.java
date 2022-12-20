package org.museframework.bian.investmentaccount.dto;

public class ExecuteCorporateActionRequest {
    private String investmentaccountid;

    private String corporateactionid;

    private org.museframework.bian.investmentaccount.dto.bq.CorporateAction corporateAction;

    public void setInvestmentaccountid(String investmentaccountid) {
        this.investmentaccountid = investmentaccountid;
    }

    public String getInvestmentaccountid() {
        return investmentaccountid;
    }

    public void setCorporateactionid(String corporateactionid) {
        this.corporateactionid = corporateactionid;
    }

    public String getCorporateactionid() {
        return corporateactionid;
    }

    public void setCorporateAction(org.museframework.bian.investmentaccount.dto.bq.CorporateAction corporateAction) {
        this.corporateAction = corporateAction;
    }

    public org.museframework.bian.investmentaccount.dto.bq.CorporateAction getCorporateAction() {
        return corporateAction;
    }
}