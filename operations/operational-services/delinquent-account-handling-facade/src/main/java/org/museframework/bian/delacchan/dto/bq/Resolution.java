/*The main worsteps to be followed in th eexecution of the procedure

Examples: Invoice generation*/
package org.museframework.bian.delacchan.dto.bq;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto
public class Resolution {
    /*The result of the resolution planning activity (e.g.. account recovered, passed to collections)*/
    @MetaField
    private String delinquentAccountResolutionTaskResult;

    /*The recommended processing for the delinquent account - details passed on to associated function for execution as necessary*/
    @MetaField
    private String delinquentAccountResolutionActionPlan;

    /*Work documentation, forms and schedules produced and referenced during the task*/
    @MetaField
    private String delinquentAccountResolutionWorkProduct;

    public void setDelinquentAccountResolutionTaskResult(String delinquentAccountResolutionTaskResult) {
        this.delinquentAccountResolutionTaskResult = delinquentAccountResolutionTaskResult;
    }

    public String getDelinquentAccountResolutionTaskResult() {
        return delinquentAccountResolutionTaskResult;
    }

    public void setDelinquentAccountResolutionActionPlan(String delinquentAccountResolutionActionPlan) {
        this.delinquentAccountResolutionActionPlan = delinquentAccountResolutionActionPlan;
    }

    public String getDelinquentAccountResolutionActionPlan() {
        return delinquentAccountResolutionActionPlan;
    }

    public void setDelinquentAccountResolutionWorkProduct(String delinquentAccountResolutionWorkProduct) {
        this.delinquentAccountResolutionWorkProduct = delinquentAccountResolutionWorkProduct;
    }

    public String getDelinquentAccountResolutionWorkProduct() {
        return delinquentAccountResolutionWorkProduct;
    }
}