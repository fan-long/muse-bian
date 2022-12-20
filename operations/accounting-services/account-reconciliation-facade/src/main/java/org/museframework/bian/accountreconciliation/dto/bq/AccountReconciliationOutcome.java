/*A course of action for doing Account Resolution Workstep in the context of executing the Account Resolution Workstep*/
package org.museframework.bian.accountreconciliation.dto.bq;

public class AccountReconciliationOutcome {
    /**/
    private String accountReconciliationWorkProduct;

    /**/
    private org.museframework.bian.classes.Procedure accountReconciliationProcedure;

    public void setAccountReconciliationWorkProduct(String accountReconciliationWorkProduct) {
        this.accountReconciliationWorkProduct = accountReconciliationWorkProduct;
    }

    public String getAccountReconciliationWorkProduct() {
        return accountReconciliationWorkProduct;
    }

    public void setAccountReconciliationProcedure(org.museframework.bian.classes.Procedure accountReconciliationProcedure) {
        this.accountReconciliationProcedure = accountReconciliationProcedure;
    }

    public org.museframework.bian.classes.Procedure getAccountReconciliationProcedure() {
        return accountReconciliationProcedure;
    }
}