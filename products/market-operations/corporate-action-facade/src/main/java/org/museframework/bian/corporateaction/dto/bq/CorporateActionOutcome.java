/*A course of action for doing Security Spin-Off Action Workstep in the context of executing the Security Spin-Off Action Workstep*/
package org.museframework.bian.corporateaction.dto.bq;

public class CorporateActionOutcome {
    /**/
    private String corporateActionWorkProduct;

    /**/
    private org.museframework.bian.classes.Procedure corporateActionProcedure;

    public void setCorporateActionWorkProduct(String corporateActionWorkProduct) {
        this.corporateActionWorkProduct = corporateActionWorkProduct;
    }

    public String getCorporateActionWorkProduct() {
        return corporateActionWorkProduct;
    }

    public void setCorporateActionProcedure(org.museframework.bian.classes.Procedure corporateActionProcedure) {
        this.corporateActionProcedure = corporateActionProcedure;
    }

    public org.museframework.bian.classes.Procedure getCorporateActionProcedure() {
        return corporateActionProcedure;
    }
}