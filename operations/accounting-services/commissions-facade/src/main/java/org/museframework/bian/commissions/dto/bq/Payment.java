/*Execute a well-bounded financial transaction/task, typically involving largely automated/structured fulfillment processing  within Commissions. 
Example: Execute a payment transaction.*/
package org.museframework.bian.commissions.dto.bq;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto
public class Payment {
    /*The required status/situation prior to the execution of the task*/
    @MetaField
    private String paymentPreconditions;

    /*The timing and key actions/milestones involved in completing the transaction task*/
    @MetaField
    private String paymentTaskSchedule;

    /*The Commission Transaction specific Business Service*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.BusinessService businessService;

    /*The completion status and any triggered/dependent actions once the task has been completed*/
    @MetaField
    private String paymentPostconditions;

    /*Reference to the specific business service type*/
    @MetaField
    private String paymentServiceType;

    /*Description of the performed business service*/
    @MetaField
    private String paymentServiceDescription;

    /*Mandatory and optional inputs and output information for the business service*/
    @MetaField
    private String paymentServiceInputsandOuputs;

    /*Documentation, meeting schedules, notes, reasearch. calculations and any other work products produced by the business service*/
    @MetaField
    private String paymentServiceWorkProduct;

    /**/
    @MetaField
    private String paymentServiceName;

    public void setPaymentPreconditions(String paymentPreconditions) {
        this.paymentPreconditions = paymentPreconditions;
    }

    public String getPaymentPreconditions() {
        return paymentPreconditions;
    }

    public void setPaymentTaskSchedule(String paymentTaskSchedule) {
        this.paymentTaskSchedule = paymentTaskSchedule;
    }

    public String getPaymentTaskSchedule() {
        return paymentTaskSchedule;
    }

    public void setBusinessService(org.museframework.bian.classes.BusinessService businessService) {
        this.businessService = businessService;
    }

    public org.museframework.bian.classes.BusinessService getBusinessService() {
        return businessService;
    }

    public void setPaymentPostconditions(String paymentPostconditions) {
        this.paymentPostconditions = paymentPostconditions;
    }

    public String getPaymentPostconditions() {
        return paymentPostconditions;
    }

    public void setPaymentServiceType(String paymentServiceType) {
        this.paymentServiceType = paymentServiceType;
    }

    public String getPaymentServiceType() {
        return paymentServiceType;
    }

    public void setPaymentServiceDescription(String paymentServiceDescription) {
        this.paymentServiceDescription = paymentServiceDescription;
    }

    public String getPaymentServiceDescription() {
        return paymentServiceDescription;
    }

    public void setPaymentServiceInputsandOuputs(String paymentServiceInputsandOuputs) {
        this.paymentServiceInputsandOuputs = paymentServiceInputsandOuputs;
    }

    public String getPaymentServiceInputsandOuputs() {
        return paymentServiceInputsandOuputs;
    }

    public void setPaymentServiceWorkProduct(String paymentServiceWorkProduct) {
        this.paymentServiceWorkProduct = paymentServiceWorkProduct;
    }

    public String getPaymentServiceWorkProduct() {
        return paymentServiceWorkProduct;
    }

    public void setPaymentServiceName(String paymentServiceName) {
        this.paymentServiceName = paymentServiceName;
    }

    public String getPaymentServiceName() {
        return paymentServiceName;
    }
}