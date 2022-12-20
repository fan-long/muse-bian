package org.museframework.bian.proquaass.dto;

public class UpdateUsabilityChecksRequest {
    private String productqualityassuranceid;

    private String usabilitychecksid;

    private org.museframework.bian.proquaass.dto.bq.UsabilityChecks usabilityChecks;

    public void setProductqualityassuranceid(String productqualityassuranceid) {
        this.productqualityassuranceid = productqualityassuranceid;
    }

    public String getProductqualityassuranceid() {
        return productqualityassuranceid;
    }

    public void setUsabilitychecksid(String usabilitychecksid) {
        this.usabilitychecksid = usabilitychecksid;
    }

    public String getUsabilitychecksid() {
        return usabilitychecksid;
    }

    public void setUsabilityChecks(org.museframework.bian.proquaass.dto.bq.UsabilityChecks usabilityChecks) {
        this.usabilityChecks = usabilityChecks;
    }

    public org.museframework.bian.proquaass.dto.bq.UsabilityChecks getUsabilityChecks() {
        return usabilityChecks;
    }
}