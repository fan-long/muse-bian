/*Execute a well-bounded financial transaction/task, typically involving largely automated/structured fulfillment processing  within Commissions. 
Example: Execute a payment transaction.*/
package org.museframework.bian.commissions.dto.bq;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto
public class Calculation {
    /*The required status/situation prior to the execution of the task*/
    @MetaField
    private String calculationPreconditions;

    /*The timing and key actions/milestones involved in completing the transaction task*/
    @MetaField
    private String calculationTaskSchedule;

    /*The Commission Transaction specific Business Service*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.BusinessService commissionCalculation;

    /*The completion status and any triggered/dependent actions once the task has been completed*/
    @MetaField
    private String calculationPostconditions;

    /*Reference to the specific business service type*/
    @MetaField
    private String calculationCommissionCalculationServiceType;

    /*Description of the performed business service*/
    @MetaField
    private String calculationCommissionCalculationServiceDescription;

    /*Mandatory and optional inputs and output information for the business service*/
    @MetaField
    private String calculationCommissionCalculationServiceInputsandOuputs;

    /*Documentation, meeting schedules, notes, reasearch. calculations and any other work products produced by the business service*/
    @MetaField
    private String calculationCommissionCalculationServiceWorkProduct;

    /**/
    @MetaField
    private String calculationCommissionCalculationServiceName;

    public void setCalculationPreconditions(String calculationPreconditions) {
        this.calculationPreconditions = calculationPreconditions;
    }

    public String getCalculationPreconditions() {
        return calculationPreconditions;
    }

    public void setCalculationTaskSchedule(String calculationTaskSchedule) {
        this.calculationTaskSchedule = calculationTaskSchedule;
    }

    public String getCalculationTaskSchedule() {
        return calculationTaskSchedule;
    }

    public void setCommissionCalculation(org.museframework.bian.classes.BusinessService commissionCalculation) {
        this.commissionCalculation = commissionCalculation;
    }

    public org.museframework.bian.classes.BusinessService getCommissionCalculation() {
        return commissionCalculation;
    }

    public void setCalculationPostconditions(String calculationPostconditions) {
        this.calculationPostconditions = calculationPostconditions;
    }

    public String getCalculationPostconditions() {
        return calculationPostconditions;
    }

    public void setCalculationCommissionCalculationServiceType(String calculationCommissionCalculationServiceType) {
        this.calculationCommissionCalculationServiceType = calculationCommissionCalculationServiceType;
    }

    public String getCalculationCommissionCalculationServiceType() {
        return calculationCommissionCalculationServiceType;
    }

    public void setCalculationCommissionCalculationServiceDescription(String calculationCommissionCalculationServiceDescription) {
        this.calculationCommissionCalculationServiceDescription = calculationCommissionCalculationServiceDescription;
    }

    public String getCalculationCommissionCalculationServiceDescription() {
        return calculationCommissionCalculationServiceDescription;
    }

    public void setCalculationCommissionCalculationServiceInputsandOuputs(String calculationCommissionCalculationServiceInputsandOuputs) {
        this.calculationCommissionCalculationServiceInputsandOuputs = calculationCommissionCalculationServiceInputsandOuputs;
    }

    public String getCalculationCommissionCalculationServiceInputsandOuputs() {
        return calculationCommissionCalculationServiceInputsandOuputs;
    }

    public void setCalculationCommissionCalculationServiceWorkProduct(String calculationCommissionCalculationServiceWorkProduct) {
        this.calculationCommissionCalculationServiceWorkProduct = calculationCommissionCalculationServiceWorkProduct;
    }

    public String getCalculationCommissionCalculationServiceWorkProduct() {
        return calculationCommissionCalculationServiceWorkProduct;
    }

    public void setCalculationCommissionCalculationServiceName(String calculationCommissionCalculationServiceName) {
        this.calculationCommissionCalculationServiceName = calculationCommissionCalculationServiceName;
    }

    public String getCalculationCommissionCalculationServiceName() {
        return calculationCommissionCalculationServiceName;
    }
}