package org.museframework.bian.leasing.dto;

public class UpdateCorporateActionRequest {
    private String leasingid;

    private String corporateactionid;

    private org.museframework.bian.leasing.dto.bq.CorporateAction corporateAction;

    public void setLeasingid(String leasingid) {
        this.leasingid = leasingid;
    }

    public String getLeasingid() {
        return leasingid;
    }

    public void setCorporateactionid(String corporateactionid) {
        this.corporateactionid = corporateactionid;
    }

    public String getCorporateactionid() {
        return corporateactionid;
    }

    public void setCorporateAction(org.museframework.bian.leasing.dto.bq.CorporateAction corporateAction) {
        this.corporateAction = corporateAction;
    }

    public org.museframework.bian.leasing.dto.bq.CorporateAction getCorporateAction() {
        return corporateAction;
    }
}