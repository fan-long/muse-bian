/*A course of action for doing Securities Fail Determination Workstep in the context of executing the Securities Fail Determination Workstep*/
package org.museframework.bian.secfaipro.dto.bq;

public class SecuritiesFailsProcessingOutcome {
    /**/
    private String securitiesFailsProcessingWorkProduct;

    /**/
    private org.museframework.bian.classes.Procedure securitiesFailsProcessingProcedure;

    public void setSecuritiesFailsProcessingWorkProduct(String securitiesFailsProcessingWorkProduct) {
        this.securitiesFailsProcessingWorkProduct = securitiesFailsProcessingWorkProduct;
    }

    public String getSecuritiesFailsProcessingWorkProduct() {
        return securitiesFailsProcessingWorkProduct;
    }

    public void setSecuritiesFailsProcessingProcedure(org.museframework.bian.classes.Procedure securitiesFailsProcessingProcedure) {
        this.securitiesFailsProcessingProcedure = securitiesFailsProcessingProcedure;
    }

    public org.museframework.bian.classes.Procedure getSecuritiesFailsProcessingProcedure() {
        return securitiesFailsProcessingProcedure;
    }
}