/*Complete work tasks following a defined procedure in support of general office activities and product and service delivery  within Collections. 
Example: Process the evaluation and completion of customer offers.*/
package org.museframework.bian.collections.dto.bq;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto
public class DebtFactoring {
    /*The required status/situation and or tasks that need to be completed prior to the initiation of the workstep*/
    @MetaField(0)
    private String debtFactoringPreconditions;

    /*The operating unit/employee responsible for the workstep*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object debtFactoringBusinessUnitEmployeeReference;

    /*The timing and key actions/milestones making up the workstep*/
    @MetaField(0)
    private String debtFactoringWorkSchedule;

    /*The Collateral Asset Liquidation Procedure specific Business Service*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.BusinessService factoring;

    /*The completion status and reference to subsequent actions that may be triggered on completion of the workstep*/
    @MetaField(0)
    private String debtFactoringPostconditions;

    /*Reference to the specific business service type*/
    @MetaField(0)
    private String debtFactoringFactoringServiceType;

    /*Description of the performed business service*/
    @MetaField(0)
    private String debtFactoringFactoringServiceDescription;

    /*Mandatory and optional inputs and output information for the business service*/
    @MetaField(0)
    private String debtFactoringFactoringServiceInputsandOuputs;

    /*Documentation, meeting schedules, notes, reasearch. calculations and any other work products produced by the business service*/
    @MetaField(0)
    private String debtFactoringFactoringServiceWorkProduct;

    /**/
    @MetaField(0)
    private String debtFactoringFactoringServiceName;

    public void setDebtFactoringPreconditions(String debtFactoringPreconditions) {
        this.debtFactoringPreconditions = debtFactoringPreconditions;
    }

    public String getDebtFactoringPreconditions() {
        return debtFactoringPreconditions;
    }

    public void setDebtFactoringBusinessUnitEmployeeReference(org.museframework.bian.classes.Object debtFactoringBusinessUnitEmployeeReference) {
        this.debtFactoringBusinessUnitEmployeeReference = debtFactoringBusinessUnitEmployeeReference;
    }

    public org.museframework.bian.classes.Object getDebtFactoringBusinessUnitEmployeeReference() {
        return debtFactoringBusinessUnitEmployeeReference;
    }

    public void setDebtFactoringWorkSchedule(String debtFactoringWorkSchedule) {
        this.debtFactoringWorkSchedule = debtFactoringWorkSchedule;
    }

    public String getDebtFactoringWorkSchedule() {
        return debtFactoringWorkSchedule;
    }

    public void setFactoring(org.museframework.bian.classes.BusinessService factoring) {
        this.factoring = factoring;
    }

    public org.museframework.bian.classes.BusinessService getFactoring() {
        return factoring;
    }

    public void setDebtFactoringPostconditions(String debtFactoringPostconditions) {
        this.debtFactoringPostconditions = debtFactoringPostconditions;
    }

    public String getDebtFactoringPostconditions() {
        return debtFactoringPostconditions;
    }

    public void setDebtFactoringFactoringServiceType(String debtFactoringFactoringServiceType) {
        this.debtFactoringFactoringServiceType = debtFactoringFactoringServiceType;
    }

    public String getDebtFactoringFactoringServiceType() {
        return debtFactoringFactoringServiceType;
    }

    public void setDebtFactoringFactoringServiceDescription(String debtFactoringFactoringServiceDescription) {
        this.debtFactoringFactoringServiceDescription = debtFactoringFactoringServiceDescription;
    }

    public String getDebtFactoringFactoringServiceDescription() {
        return debtFactoringFactoringServiceDescription;
    }

    public void setDebtFactoringFactoringServiceInputsandOuputs(String debtFactoringFactoringServiceInputsandOuputs) {
        this.debtFactoringFactoringServiceInputsandOuputs = debtFactoringFactoringServiceInputsandOuputs;
    }

    public String getDebtFactoringFactoringServiceInputsandOuputs() {
        return debtFactoringFactoringServiceInputsandOuputs;
    }

    public void setDebtFactoringFactoringServiceWorkProduct(String debtFactoringFactoringServiceWorkProduct) {
        this.debtFactoringFactoringServiceWorkProduct = debtFactoringFactoringServiceWorkProduct;
    }

    public String getDebtFactoringFactoringServiceWorkProduct() {
        return debtFactoringFactoringServiceWorkProduct;
    }

    public void setDebtFactoringFactoringServiceName(String debtFactoringFactoringServiceName) {
        this.debtFactoringFactoringServiceName = debtFactoringFactoringServiceName;
    }

    public String getDebtFactoringFactoringServiceName() {
        return debtFactoringFactoringServiceName;
    }
}