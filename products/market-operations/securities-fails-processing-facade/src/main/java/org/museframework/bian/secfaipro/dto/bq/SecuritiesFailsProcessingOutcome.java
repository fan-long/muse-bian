/*A course of action for doing Securities Fail Determination Workstep in the context of executing the Securities Fail Determination Workstep*/
package org.museframework.bian.secfaipro.dto.bq;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto
public class SecuritiesFailsProcessingOutcome {
    /**/
    @MetaField(0)
    private String securitiesFailsProcessingWorkProduct;

    /**/
    @MetaField(ref=true)
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