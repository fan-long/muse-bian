/*Execute a well-bounded financial transaction/task, typically involving largely automated/structured fulfillment processing  within Currency Exchange. 
Example: Execute a payment transaction.*/
package org.museframework.bian.currencyexchange.dto.bq;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto
public class FXTransactionPricing {
    /*The required status/situation prior to the execution of the task*/
    @MetaField
    private String FXTransactionPricingPreconditions;

    /*The timing and key actions/milestones involved in completing the transaction task*/
    @MetaField
    private String FXTransactionPricingTaskSchedule;

    /*The Currency Exchange Transaction specific Business Service*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.BusinessService OTCFXTransactionPricing;

    /*The completion status and any triggered/dependent actions once the task has been completed*/
    @MetaField
    private String FXTransactionPricingPostconditions;

    /*Reference to the specific business service type*/
    @MetaField
    private String FXTransactionPricingOTCFXTransactionPricingServiceType;

    /*Description of the performed business service*/
    @MetaField
    private String FXTransactionPricingOTCFXTransactionPricingServiceDescription;

    /*Mandatory and optional inputs and output information for the business service*/
    @MetaField
    private String FXTransactionPricingOTCFXTransactionPricingServiceInputsandOuputs;

    /*Documentation, meeting schedules, notes, reasearch. calculations and any other work products produced by the business service*/
    @MetaField
    private String FXTransactionPricingOTCFXTransactionPricingServiceWorkProduct;

    /**/
    @MetaField
    private String FXTransactionPricingOTCFXTransactionPricingServiceName;

    public void setFXTransactionPricingPreconditions(String FXTransactionPricingPreconditions) {
        this.FXTransactionPricingPreconditions = FXTransactionPricingPreconditions;
    }

    public String getFXTransactionPricingPreconditions() {
        return FXTransactionPricingPreconditions;
    }

    public void setFXTransactionPricingTaskSchedule(String FXTransactionPricingTaskSchedule) {
        this.FXTransactionPricingTaskSchedule = FXTransactionPricingTaskSchedule;
    }

    public String getFXTransactionPricingTaskSchedule() {
        return FXTransactionPricingTaskSchedule;
    }

    public void setOTCFXTransactionPricing(org.museframework.bian.classes.BusinessService OTCFXTransactionPricing) {
        this.OTCFXTransactionPricing = OTCFXTransactionPricing;
    }

    public org.museframework.bian.classes.BusinessService getOTCFXTransactionPricing() {
        return OTCFXTransactionPricing;
    }

    public void setFXTransactionPricingPostconditions(String FXTransactionPricingPostconditions) {
        this.FXTransactionPricingPostconditions = FXTransactionPricingPostconditions;
    }

    public String getFXTransactionPricingPostconditions() {
        return FXTransactionPricingPostconditions;
    }

    public void setFXTransactionPricingOTCFXTransactionPricingServiceType(String FXTransactionPricingOTCFXTransactionPricingServiceType) {
        this.FXTransactionPricingOTCFXTransactionPricingServiceType = FXTransactionPricingOTCFXTransactionPricingServiceType;
    }

    public String getFXTransactionPricingOTCFXTransactionPricingServiceType() {
        return FXTransactionPricingOTCFXTransactionPricingServiceType;
    }

    public void setFXTransactionPricingOTCFXTransactionPricingServiceDescription(String FXTransactionPricingOTCFXTransactionPricingServiceDescription) {
        this.FXTransactionPricingOTCFXTransactionPricingServiceDescription = FXTransactionPricingOTCFXTransactionPricingServiceDescription;
    }

    public String getFXTransactionPricingOTCFXTransactionPricingServiceDescription() {
        return FXTransactionPricingOTCFXTransactionPricingServiceDescription;
    }

    public void setFXTransactionPricingOTCFXTransactionPricingServiceInputsandOuputs(String FXTransactionPricingOTCFXTransactionPricingServiceInputsandOuputs) {
        this.FXTransactionPricingOTCFXTransactionPricingServiceInputsandOuputs = FXTransactionPricingOTCFXTransactionPricingServiceInputsandOuputs;
    }

    public String getFXTransactionPricingOTCFXTransactionPricingServiceInputsandOuputs() {
        return FXTransactionPricingOTCFXTransactionPricingServiceInputsandOuputs;
    }

    public void setFXTransactionPricingOTCFXTransactionPricingServiceWorkProduct(String FXTransactionPricingOTCFXTransactionPricingServiceWorkProduct) {
        this.FXTransactionPricingOTCFXTransactionPricingServiceWorkProduct = FXTransactionPricingOTCFXTransactionPricingServiceWorkProduct;
    }

    public String getFXTransactionPricingOTCFXTransactionPricingServiceWorkProduct() {
        return FXTransactionPricingOTCFXTransactionPricingServiceWorkProduct;
    }

    public void setFXTransactionPricingOTCFXTransactionPricingServiceName(String FXTransactionPricingOTCFXTransactionPricingServiceName) {
        this.FXTransactionPricingOTCFXTransactionPricingServiceName = FXTransactionPricingOTCFXTransactionPricingServiceName;
    }

    public String getFXTransactionPricingOTCFXTransactionPricingServiceName() {
        return FXTransactionPricingOTCFXTransactionPricingServiceName;
    }
}