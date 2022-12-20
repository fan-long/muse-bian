/*A course of action for doing Production Issue Resolution Workstep in the context of executing the Production Issue Resolution Workstep*/
package org.museframework.bian.servicingissue.dto.bq;

public class ServicingIssueOutcome {
    /**/
    private String servicingIssueWorkProduct;

    /**/
    private org.museframework.bian.classes.Procedure servicingIssueProcedure;

    public void setServicingIssueWorkProduct(String servicingIssueWorkProduct) {
        this.servicingIssueWorkProduct = servicingIssueWorkProduct;
    }

    public String getServicingIssueWorkProduct() {
        return servicingIssueWorkProduct;
    }

    public void setServicingIssueProcedure(org.museframework.bian.classes.Procedure servicingIssueProcedure) {
        this.servicingIssueProcedure = servicingIssueProcedure;
    }

    public org.museframework.bian.classes.Procedure getServicingIssueProcedure() {
        return servicingIssueProcedure;
    }
}