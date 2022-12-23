/*Complete work tasks following a defined procedure in support of general office activities and product and service delivery  within Collections. 
Example: Process the evaluation and completion of customer offers.*/
package org.museframework.bian.collections.dto.bq;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto
public class CollateralLiquidation {
    /*The required status/situation and or tasks that need to be completed prior to the initiation of the workstep*/
    @MetaField
    private String collateralLiquidationPreconditions;

    /*The operating unit/employee responsible for the workstep*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object collateralLiquidationBusinessUnitEmployeeReference;

    /*The timing and key actions/milestones making up the workstep*/
    @MetaField
    private String collateralLiquidationWorkSchedule;

    /*The Collateral Asset Liquidation Procedure specific Business Service*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.BusinessService collateralLiquidation;

    /*The completion status and reference to subsequent actions that may be triggered on completion of the workstep*/
    @MetaField
    private String collateralLiquidationPostconditions;

    /*Reference to the specific business service type*/
    @MetaField
    private String collateralLiquidationCollateralLiquidationServiceType;

    /*Description of the performed business service*/
    @MetaField
    private String collateralLiquidationCollateralLiquidationServiceDescription;

    /*Mandatory and optional inputs and output information for the business service*/
    @MetaField
    private String collateralLiquidationCollateralLiquidationServiceInputsandOuputs;

    /*Documentation, meeting schedules, notes, reasearch. calculations and any other work products produced by the business service*/
    @MetaField
    private String collateralLiquidationCollateralLiquidationServiceWorkProduct;

    /**/
    @MetaField
    private String collateralLiquidationCollateralLiquidationServiceName;

    public void setCollateralLiquidationPreconditions(String collateralLiquidationPreconditions) {
        this.collateralLiquidationPreconditions = collateralLiquidationPreconditions;
    }

    public String getCollateralLiquidationPreconditions() {
        return collateralLiquidationPreconditions;
    }

    public void setCollateralLiquidationBusinessUnitEmployeeReference(org.museframework.bian.classes.Object collateralLiquidationBusinessUnitEmployeeReference) {
        this.collateralLiquidationBusinessUnitEmployeeReference = collateralLiquidationBusinessUnitEmployeeReference;
    }

    public org.museframework.bian.classes.Object getCollateralLiquidationBusinessUnitEmployeeReference() {
        return collateralLiquidationBusinessUnitEmployeeReference;
    }

    public void setCollateralLiquidationWorkSchedule(String collateralLiquidationWorkSchedule) {
        this.collateralLiquidationWorkSchedule = collateralLiquidationWorkSchedule;
    }

    public String getCollateralLiquidationWorkSchedule() {
        return collateralLiquidationWorkSchedule;
    }

    public void setCollateralLiquidation(org.museframework.bian.classes.BusinessService collateralLiquidation) {
        this.collateralLiquidation = collateralLiquidation;
    }

    public org.museframework.bian.classes.BusinessService getCollateralLiquidation() {
        return collateralLiquidation;
    }

    public void setCollateralLiquidationPostconditions(String collateralLiquidationPostconditions) {
        this.collateralLiquidationPostconditions = collateralLiquidationPostconditions;
    }

    public String getCollateralLiquidationPostconditions() {
        return collateralLiquidationPostconditions;
    }

    public void setCollateralLiquidationCollateralLiquidationServiceType(String collateralLiquidationCollateralLiquidationServiceType) {
        this.collateralLiquidationCollateralLiquidationServiceType = collateralLiquidationCollateralLiquidationServiceType;
    }

    public String getCollateralLiquidationCollateralLiquidationServiceType() {
        return collateralLiquidationCollateralLiquidationServiceType;
    }

    public void setCollateralLiquidationCollateralLiquidationServiceDescription(String collateralLiquidationCollateralLiquidationServiceDescription) {
        this.collateralLiquidationCollateralLiquidationServiceDescription = collateralLiquidationCollateralLiquidationServiceDescription;
    }

    public String getCollateralLiquidationCollateralLiquidationServiceDescription() {
        return collateralLiquidationCollateralLiquidationServiceDescription;
    }

    public void setCollateralLiquidationCollateralLiquidationServiceInputsandOuputs(String collateralLiquidationCollateralLiquidationServiceInputsandOuputs) {
        this.collateralLiquidationCollateralLiquidationServiceInputsandOuputs = collateralLiquidationCollateralLiquidationServiceInputsandOuputs;
    }

    public String getCollateralLiquidationCollateralLiquidationServiceInputsandOuputs() {
        return collateralLiquidationCollateralLiquidationServiceInputsandOuputs;
    }

    public void setCollateralLiquidationCollateralLiquidationServiceWorkProduct(String collateralLiquidationCollateralLiquidationServiceWorkProduct) {
        this.collateralLiquidationCollateralLiquidationServiceWorkProduct = collateralLiquidationCollateralLiquidationServiceWorkProduct;
    }

    public String getCollateralLiquidationCollateralLiquidationServiceWorkProduct() {
        return collateralLiquidationCollateralLiquidationServiceWorkProduct;
    }

    public void setCollateralLiquidationCollateralLiquidationServiceName(String collateralLiquidationCollateralLiquidationServiceName) {
        this.collateralLiquidationCollateralLiquidationServiceName = collateralLiquidationCollateralLiquidationServiceName;
    }

    public String getCollateralLiquidationCollateralLiquidationServiceName() {
        return collateralLiquidationCollateralLiquidationServiceName;
    }
}