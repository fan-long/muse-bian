package org.museframework.bian.proquaass.dto;

public class RetrieveUsabilityChecksRequest {
    private String productqualityassuranceid;

    private String usabilitychecksid;

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
}