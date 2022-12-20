package org.museframework.bian.proquaass.dto;

public class UpdateFunctionalConsistencyChecksRequest {
    private String productqualityassuranceid;

    private String functionalconsistencychecksid;

    private org.museframework.bian.proquaass.dto.bq.FunctionalConsistencyChecks functionalConsistencyChecks;

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

    public void setFunctionalConsistencyChecks(org.museframework.bian.proquaass.dto.bq.FunctionalConsistencyChecks functionalConsistencyChecks) {
        this.functionalConsistencyChecks = functionalConsistencyChecks;
    }

    public org.museframework.bian.proquaass.dto.bq.FunctionalConsistencyChecks getFunctionalConsistencyChecks() {
        return functionalConsistencyChecks;
    }
}