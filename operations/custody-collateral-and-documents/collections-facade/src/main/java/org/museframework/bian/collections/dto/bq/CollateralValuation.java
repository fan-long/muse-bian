/*Complete work tasks following a defined procedure in support of general office activities and product and service delivery  within Collections. 
Example: Process the evaluation and completion of customer offers.*/
package org.museframework.bian.collections.dto.bq;

public class CollateralValuation {
    /*The required status/situation and or tasks that need to be completed prior to the initiation of the workstep*/
    private String collateralValuationPreconditions;

    /*The operating unit/employee responsible for the workstep*/
    private org.museframework.bian.classes.Object collateralValuationBusinessUnitEmployeeReference;

    /*The timing and key actions/milestones making up the workstep*/
    private String collateralValuationWorkSchedule;

    /*The Collateral Asset Liquidation Procedure specific Business Service*/
    private org.museframework.bian.classes.BusinessService collateralValuation;

    /*The completion status and reference to subsequent actions that may be triggered on completion of the workstep*/
    private String collateralValuationPostconditions;

    /*Reference to the specific business service type*/
    private String collateralValuationCollateralValuationServiceType;

    /*Description of the performed business service*/
    private String collateralValuationCollateralValuationServiceDescription;

    /*Mandatory and optional inputs and output information for the business service*/
    private String collateralValuationCollateralValuationServiceInputsandOuputs;

    /*Documentation, meeting schedules, notes, reasearch. calculations and any other work products produced by the business service*/
    private String collateralValuationCollateralValuationServiceWorkProduct;

    /**/
    private String collateralValuationCollateralValuationServiceName;

    public void setCollateralValuationPreconditions(String collateralValuationPreconditions) {
        this.collateralValuationPreconditions = collateralValuationPreconditions;
    }

    public String getCollateralValuationPreconditions() {
        return collateralValuationPreconditions;
    }

    public void setCollateralValuationBusinessUnitEmployeeReference(org.museframework.bian.classes.Object collateralValuationBusinessUnitEmployeeReference) {
        this.collateralValuationBusinessUnitEmployeeReference = collateralValuationBusinessUnitEmployeeReference;
    }

    public org.museframework.bian.classes.Object getCollateralValuationBusinessUnitEmployeeReference() {
        return collateralValuationBusinessUnitEmployeeReference;
    }

    public void setCollateralValuationWorkSchedule(String collateralValuationWorkSchedule) {
        this.collateralValuationWorkSchedule = collateralValuationWorkSchedule;
    }

    public String getCollateralValuationWorkSchedule() {
        return collateralValuationWorkSchedule;
    }

    public void setCollateralValuation(org.museframework.bian.classes.BusinessService collateralValuation) {
        this.collateralValuation = collateralValuation;
    }

    public org.museframework.bian.classes.BusinessService getCollateralValuation() {
        return collateralValuation;
    }

    public void setCollateralValuationPostconditions(String collateralValuationPostconditions) {
        this.collateralValuationPostconditions = collateralValuationPostconditions;
    }

    public String getCollateralValuationPostconditions() {
        return collateralValuationPostconditions;
    }

    public void setCollateralValuationCollateralValuationServiceType(String collateralValuationCollateralValuationServiceType) {
        this.collateralValuationCollateralValuationServiceType = collateralValuationCollateralValuationServiceType;
    }

    public String getCollateralValuationCollateralValuationServiceType() {
        return collateralValuationCollateralValuationServiceType;
    }

    public void setCollateralValuationCollateralValuationServiceDescription(String collateralValuationCollateralValuationServiceDescription) {
        this.collateralValuationCollateralValuationServiceDescription = collateralValuationCollateralValuationServiceDescription;
    }

    public String getCollateralValuationCollateralValuationServiceDescription() {
        return collateralValuationCollateralValuationServiceDescription;
    }

    public void setCollateralValuationCollateralValuationServiceInputsandOuputs(String collateralValuationCollateralValuationServiceInputsandOuputs) {
        this.collateralValuationCollateralValuationServiceInputsandOuputs = collateralValuationCollateralValuationServiceInputsandOuputs;
    }

    public String getCollateralValuationCollateralValuationServiceInputsandOuputs() {
        return collateralValuationCollateralValuationServiceInputsandOuputs;
    }

    public void setCollateralValuationCollateralValuationServiceWorkProduct(String collateralValuationCollateralValuationServiceWorkProduct) {
        this.collateralValuationCollateralValuationServiceWorkProduct = collateralValuationCollateralValuationServiceWorkProduct;
    }

    public String getCollateralValuationCollateralValuationServiceWorkProduct() {
        return collateralValuationCollateralValuationServiceWorkProduct;
    }

    public void setCollateralValuationCollateralValuationServiceName(String collateralValuationCollateralValuationServiceName) {
        this.collateralValuationCollateralValuationServiceName = collateralValuationCollateralValuationServiceName;
    }

    public String getCollateralValuationCollateralValuationServiceName() {
        return collateralValuationCollateralValuationServiceName;
    }
}