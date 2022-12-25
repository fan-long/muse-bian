/*A course of action for doing Account Resolution Workstep in the context of executing the Account Resolution Workstep*/
package org.museframework.bian.accountreconciliation.dto.bq;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto
public class AccountReconciliationOutcome {
    /**/
    @MetaField(0)
    private String accountReconciliationWorkProduct;

    /**/
    @MetaField(ref=true)
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