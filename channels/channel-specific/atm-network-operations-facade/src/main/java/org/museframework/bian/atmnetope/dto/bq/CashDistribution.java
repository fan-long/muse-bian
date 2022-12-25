/*Operate equipment and/or a largely automated facility  within ATM Network Operations. 
Example: Operate the bank's internal intranet facility.*/
package org.museframework.bian.atmnetope.dto.bq;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto
public class CashDistribution {
    /*The required status/situation and or tasks that need to be completed prior to the invocation of the feature*/
    @MetaField(0)
    private String cashDistributionPreconditions;

    /*The schedule and timing of the function*/
    @MetaField(0)
    private String cashDistributionFunctionSchedule;

    /*The ATMNetwork Operating Session specific Business Service*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.BusinessService cashDistribution;

    /*Reference to the specific business service type*/
    @MetaField(0)
    private String cashDistributionServiceType;

    /*Description of the performed business service*/
    @MetaField(0)
    private String cashDistributionServiceDescription;

    /*Mandatory and optional inputs and output information for the business service*/
    @MetaField(0)
    private String cashDistributionServiceInputsandOuputs;

    /*Documentation, meeting schedules, notes, reasearch. calculations and any other work products produced by the business service*/
    @MetaField(0)
    private String cashDistributionServiceWorkProduct;

    /**/
    @MetaField(0)
    private String cashDistributionServiceName;

    public void setCashDistributionPreconditions(String cashDistributionPreconditions) {
        this.cashDistributionPreconditions = cashDistributionPreconditions;
    }

    public String getCashDistributionPreconditions() {
        return cashDistributionPreconditions;
    }

    public void setCashDistributionFunctionSchedule(String cashDistributionFunctionSchedule) {
        this.cashDistributionFunctionSchedule = cashDistributionFunctionSchedule;
    }

    public String getCashDistributionFunctionSchedule() {
        return cashDistributionFunctionSchedule;
    }

    public void setCashDistribution(org.museframework.bian.classes.BusinessService cashDistribution) {
        this.cashDistribution = cashDistribution;
    }

    public org.museframework.bian.classes.BusinessService getCashDistribution() {
        return cashDistribution;
    }

    public void setCashDistributionServiceType(String cashDistributionServiceType) {
        this.cashDistributionServiceType = cashDistributionServiceType;
    }

    public String getCashDistributionServiceType() {
        return cashDistributionServiceType;
    }

    public void setCashDistributionServiceDescription(String cashDistributionServiceDescription) {
        this.cashDistributionServiceDescription = cashDistributionServiceDescription;
    }

    public String getCashDistributionServiceDescription() {
        return cashDistributionServiceDescription;
    }

    public void setCashDistributionServiceInputsandOuputs(String cashDistributionServiceInputsandOuputs) {
        this.cashDistributionServiceInputsandOuputs = cashDistributionServiceInputsandOuputs;
    }

    public String getCashDistributionServiceInputsandOuputs() {
        return cashDistributionServiceInputsandOuputs;
    }

    public void setCashDistributionServiceWorkProduct(String cashDistributionServiceWorkProduct) {
        this.cashDistributionServiceWorkProduct = cashDistributionServiceWorkProduct;
    }

    public String getCashDistributionServiceWorkProduct() {
        return cashDistributionServiceWorkProduct;
    }

    public void setCashDistributionServiceName(String cashDistributionServiceName) {
        this.cashDistributionServiceName = cashDistributionServiceName;
    }

    public String getCashDistributionServiceName() {
        return cashDistributionServiceName;
    }
}