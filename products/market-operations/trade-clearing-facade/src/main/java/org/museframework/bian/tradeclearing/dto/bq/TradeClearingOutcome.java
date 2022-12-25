/*A course of action for doing Market Trade Settlement Initiation Workstep in the context of executing the Market Trade Settlement Initiation Workstep*/
package org.museframework.bian.tradeclearing.dto.bq;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto
public class TradeClearingOutcome {
    /**/
    @MetaField(0)
    private String tradeClearingWorkProduct;

    /**/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Procedure tradeClearingProcedure;

    public void setTradeClearingWorkProduct(String tradeClearingWorkProduct) {
        this.tradeClearingWorkProduct = tradeClearingWorkProduct;
    }

    public String getTradeClearingWorkProduct() {
        return tradeClearingWorkProduct;
    }

    public void setTradeClearingProcedure(org.museframework.bian.classes.Procedure tradeClearingProcedure) {
        this.tradeClearingProcedure = tradeClearingProcedure;
    }

    public org.museframework.bian.classes.Procedure getTradeClearingProcedure() {
        return tradeClearingProcedure;
    }
}