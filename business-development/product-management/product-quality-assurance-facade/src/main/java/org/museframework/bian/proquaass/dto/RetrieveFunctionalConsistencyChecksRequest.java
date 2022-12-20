package org.museframework.bian.proquaass.dto;

public class RetrieveFunctionalConsistencyChecksRequest {
    private String productqualityassuranceid;

    private String functionalconsistencychecksid;

    public void setProductqualityassuranceid(String productqualityassuranceid) {
        this.productqualityassuranceid = productqualityassuranceid;
    }

    public String getProductqualityassuranceid() {
        return productqualityassuranceid;
    }

    public void setFunctionalconsistencychecksid(String functionalconsistencychecksid) {
        this.functionalconsistencychecksid = functionalconsistencychecksid;
    }

    public String getFunctionalconsistencychecksid() {
        return functionalconsistencychecksid;
    }
}