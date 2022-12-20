/*Complete work tasks following a defined procedure in support of general office activities and product and service delivery  within Accounts Receivable. 
Example: Process the evaluation and completion of customer offers.*/
package org.museframework.bian.accountsreceivable.dto.bq;

public class ReceivablesEvaluation {
    /*The required status/situation and or tasks that need to be completed prior to the initiation of the workstep*/
    private String receivablesEvaluationPreconditions;

    /*The operating unit/employee responsible for the workstep*/
    private org.museframework.bian.classes.Object receivablesEvaluationBusinessUnitEmployeeReference;

    /*The timing and key actions/milestones making up the workstep*/
    private String receivablesEvaluationWorkSchedule;

    /*The Accounts Receivable Procedure specific Business Service*/
    private org.museframework.bian.classes.BusinessService receivablesEvaluation;

    /*The completion status and reference to subsequent actions that may be triggered on completion of the workstep*/
    private String receivablesEvaluationPostconditions;

    /*Reference to the specific business service type*/
    private String receivablesEvaluationReceivablesEvaluationServiceType;

    /*Description of the performed business service*/
    private String receivablesEvaluationReceivablesEvaluationServiceDescription;

    /*Mandatory and optional inputs and output information for the business service*/
    private String receivablesEvaluationReceivablesEvaluationServiceInputsandOuputs;

    /*Documentation, meeting schedules, notes, reasearch. calculations and any other work products produced by the business service*/
    private String receivablesEvaluationReceivablesEvaluationServiceWorkProduct;

    /**/
    private String receivablesEvaluationReceivablesEvaluationServiceName;

    public void setReceivablesEvaluationPreconditions(String receivablesEvaluationPreconditions) {
        this.receivablesEvaluationPreconditions = receivablesEvaluationPreconditions;
    }

    public String getReceivablesEvaluationPreconditions() {
        return receivablesEvaluationPreconditions;
    }

    public void setReceivablesEvaluationBusinessUnitEmployeeReference(org.museframework.bian.classes.Object receivablesEvaluationBusinessUnitEmployeeReference) {
        this.receivablesEvaluationBusinessUnitEmployeeReference = receivablesEvaluationBusinessUnitEmployeeReference;
    }

    public org.museframework.bian.classes.Object getReceivablesEvaluationBusinessUnitEmployeeReference() {
        return receivablesEvaluationBusinessUnitEmployeeReference;
    }

    public void setReceivablesEvaluationWorkSchedule(String receivablesEvaluationWorkSchedule) {
        this.receivablesEvaluationWorkSchedule = receivablesEvaluationWorkSchedule;
    }

    public String getReceivablesEvaluationWorkSchedule() {
        return receivablesEvaluationWorkSchedule;
    }

    public void setReceivablesEvaluation(org.museframework.bian.classes.BusinessService receivablesEvaluation) {
        this.receivablesEvaluation = receivablesEvaluation;
    }

    public org.museframework.bian.classes.BusinessService getReceivablesEvaluation() {
        return receivablesEvaluation;
    }

    public void setReceivablesEvaluationPostconditions(String receivablesEvaluationPostconditions) {
        this.receivablesEvaluationPostconditions = receivablesEvaluationPostconditions;
    }

    public String getReceivablesEvaluationPostconditions() {
        return receivablesEvaluationPostconditions;
    }

    public void setReceivablesEvaluationReceivablesEvaluationServiceType(String receivablesEvaluationReceivablesEvaluationServiceType) {
        this.receivablesEvaluationReceivablesEvaluationServiceType = receivablesEvaluationReceivablesEvaluationServiceType;
    }

    public String getReceivablesEvaluationReceivablesEvaluationServiceType() {
        return receivablesEvaluationReceivablesEvaluationServiceType;
    }

    public void setReceivablesEvaluationReceivablesEvaluationServiceDescription(String receivablesEvaluationReceivablesEvaluationServiceDescription) {
        this.receivablesEvaluationReceivablesEvaluationServiceDescription = receivablesEvaluationReceivablesEvaluationServiceDescription;
    }

    public String getReceivablesEvaluationReceivablesEvaluationServiceDescription() {
        return receivablesEvaluationReceivablesEvaluationServiceDescription;
    }

    public void setReceivablesEvaluationReceivablesEvaluationServiceInputsandOuputs(String receivablesEvaluationReceivablesEvaluationServiceInputsandOuputs) {
        this.receivablesEvaluationReceivablesEvaluationServiceInputsandOuputs = receivablesEvaluationReceivablesEvaluationServiceInputsandOuputs;
    }

    public String getReceivablesEvaluationReceivablesEvaluationServiceInputsandOuputs() {
        return receivablesEvaluationReceivablesEvaluationServiceInputsandOuputs;
    }

    public void setReceivablesEvaluationReceivablesEvaluationServiceWorkProduct(String receivablesEvaluationReceivablesEvaluationServiceWorkProduct) {
        this.receivablesEvaluationReceivablesEvaluationServiceWorkProduct = receivablesEvaluationReceivablesEvaluationServiceWorkProduct;
    }

    public String getReceivablesEvaluationReceivablesEvaluationServiceWorkProduct() {
        return receivablesEvaluationReceivablesEvaluationServiceWorkProduct;
    }

    public void setReceivablesEvaluationReceivablesEvaluationServiceName(String receivablesEvaluationReceivablesEvaluationServiceName) {
        this.receivablesEvaluationReceivablesEvaluationServiceName = receivablesEvaluationReceivablesEvaluationServiceName;
    }

    public String getReceivablesEvaluationReceivablesEvaluationServiceName() {
        return receivablesEvaluationReceivablesEvaluationServiceName;
    }
}