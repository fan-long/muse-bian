/*The configuration and execution of Standing Order Fulfillment arrangement within the Standing Order Fulfillment*/
package org.museframework.bian.standingorder.dto.bq;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto
public class StandingOrderPayment {
    /*The required status/situation prior to the implementation of the feature*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Condition standingOrderPaymentPreconditions;

    /*The timing and key actions/milestones involved in completing the fulfillment feature instance*/
    @MetaField(0)
    private String standingOrderPaymentFeatureSchedule;

    /*The Standing Order Arrangement specific Business Service*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.BusinessService businessService;

    /*The completion status and any triggered/dependent actions once the feature instance has been fulfilled*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Condition standingOrderPaymentPostconditions;

    /*Reference to the specific business service type*/
    @MetaField(0)
    private String standingOrderPaymentServiceType;

    /*Description of the performed business service*/
    @MetaField(0)
    private String standingOrderPaymentServiceDescription;

    /*Mandatory and optional inputs and output information for the business service*/
    @MetaField(0)
    private String standingOrderPaymentServiceInputsandOuputs;

    /*Documentation, meeting schedules, notes, reasearch. calculations and any other work products produced by the business service*/
    @MetaField(0)
    private String standingOrderPaymentServiceWorkProduct;

    /**/
    @MetaField(0)
    private String standingOrderPaymentServiceName;

    /*Date on which a standing order is actually executed*/
    @MetaField(0)
    private String standingOrderExecutionDate;

    /*Result of the execition instruction, e.g. executed or not excuted*/
    @MetaField(0)
    private String standingOrderExecutionResultType;

    /*Description of the reason for not excuting a standing order, e.g. insufficient balance, account blocked, AML flag, ……*/
    @MetaField(0)
    private String standingOrderExecutionNotExecutedReasonDescription;

    /*Actual principal amount of the this execution of the standing order*/
    @MetaField(0)
    private String standingOrderExecutionPrincipalAmount;

    /*Actual fee amount of the this execution of the standing order*/
    @MetaField(0)
    private String standingOrderExecutionFeeAmount;

    public void setStandingOrderPaymentPreconditions(org.museframework.bian.classes.Condition standingOrderPaymentPreconditions) {
        this.standingOrderPaymentPreconditions = standingOrderPaymentPreconditions;
    }

    public org.museframework.bian.classes.Condition getStandingOrderPaymentPreconditions() {
        return standingOrderPaymentPreconditions;
    }

    public void setStandingOrderPaymentFeatureSchedule(String standingOrderPaymentFeatureSchedule) {
        this.standingOrderPaymentFeatureSchedule = standingOrderPaymentFeatureSchedule;
    }

    public String getStandingOrderPaymentFeatureSchedule() {
        return standingOrderPaymentFeatureSchedule;
    }

    public void setBusinessService(org.museframework.bian.classes.BusinessService businessService) {
        this.businessService = businessService;
    }

    public org.museframework.bian.classes.BusinessService getBusinessService() {
        return businessService;
    }

    public void setStandingOrderPaymentPostconditions(org.museframework.bian.classes.Condition standingOrderPaymentPostconditions) {
        this.standingOrderPaymentPostconditions = standingOrderPaymentPostconditions;
    }

    public org.museframework.bian.classes.Condition getStandingOrderPaymentPostconditions() {
        return standingOrderPaymentPostconditions;
    }

    public void setStandingOrderPaymentServiceType(String standingOrderPaymentServiceType) {
        this.standingOrderPaymentServiceType = standingOrderPaymentServiceType;
    }

    public String getStandingOrderPaymentServiceType() {
        return standingOrderPaymentServiceType;
    }

    public void setStandingOrderPaymentServiceDescription(String standingOrderPaymentServiceDescription) {
        this.standingOrderPaymentServiceDescription = standingOrderPaymentServiceDescription;
    }

    public String getStandingOrderPaymentServiceDescription() {
        return standingOrderPaymentServiceDescription;
    }

    public void setStandingOrderPaymentServiceInputsandOuputs(String standingOrderPaymentServiceInputsandOuputs) {
        this.standingOrderPaymentServiceInputsandOuputs = standingOrderPaymentServiceInputsandOuputs;
    }

    public String getStandingOrderPaymentServiceInputsandOuputs() {
        return standingOrderPaymentServiceInputsandOuputs;
    }

    public void setStandingOrderPaymentServiceWorkProduct(String standingOrderPaymentServiceWorkProduct) {
        this.standingOrderPaymentServiceWorkProduct = standingOrderPaymentServiceWorkProduct;
    }

    public String getStandingOrderPaymentServiceWorkProduct() {
        return standingOrderPaymentServiceWorkProduct;
    }

    public void setStandingOrderPaymentServiceName(String standingOrderPaymentServiceName) {
        this.standingOrderPaymentServiceName = standingOrderPaymentServiceName;
    }

    public String getStandingOrderPaymentServiceName() {
        return standingOrderPaymentServiceName;
    }

    public void setStandingOrderExecutionDate(String standingOrderExecutionDate) {
        this.standingOrderExecutionDate = standingOrderExecutionDate;
    }

    public String getStandingOrderExecutionDate() {
        return standingOrderExecutionDate;
    }

    public void setStandingOrderExecutionResultType(String standingOrderExecutionResultType) {
        this.standingOrderExecutionResultType = standingOrderExecutionResultType;
    }

    public String getStandingOrderExecutionResultType() {
        return standingOrderExecutionResultType;
    }

    public void setStandingOrderExecutionNotExecutedReasonDescription(String standingOrderExecutionNotExecutedReasonDescription) {
        this.standingOrderExecutionNotExecutedReasonDescription = standingOrderExecutionNotExecutedReasonDescription;
    }

    public String getStandingOrderExecutionNotExecutedReasonDescription() {
        return standingOrderExecutionNotExecutedReasonDescription;
    }

    public void setStandingOrderExecutionPrincipalAmount(String standingOrderExecutionPrincipalAmount) {
        this.standingOrderExecutionPrincipalAmount = standingOrderExecutionPrincipalAmount;
    }

    public String getStandingOrderExecutionPrincipalAmount() {
        return standingOrderExecutionPrincipalAmount;
    }

    public void setStandingOrderExecutionFeeAmount(String standingOrderExecutionFeeAmount) {
        this.standingOrderExecutionFeeAmount = standingOrderExecutionFeeAmount;
    }

    public String getStandingOrderExecutionFeeAmount() {
        return standingOrderExecutionFeeAmount;
    }
}