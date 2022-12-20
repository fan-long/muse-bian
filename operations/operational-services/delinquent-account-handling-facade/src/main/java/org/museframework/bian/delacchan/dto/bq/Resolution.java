/*The main worsteps to be followed in th eexecution of the procedure

Examples: Invoice generation*/
package org.museframework.bian.delacchan.dto.bq;

public class Resolution {
    /*The result of the resolution planning activity (e.g.. account recovered, passed to collections)*/
    private String delinquentAccountResolutionTaskResult;

    /*The recommended processing for the delinquent account - details passed on to associated function for execution as necessary*/
    private String delinquentAccountResolutionActionPlan;

    /*Work documentation, forms and schedules produced and referenced during the task*/
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