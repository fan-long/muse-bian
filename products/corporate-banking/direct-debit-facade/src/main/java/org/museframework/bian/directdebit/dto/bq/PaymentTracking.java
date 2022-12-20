/*The configuration and execution of Batch Debit arrangement within the Direct Debit Facility*/
package org.museframework.bian.directdebit.dto.bq;

public class PaymentTracking {
    /*The required status/situation prior to the implementation of the feature*/
    private String paymentTrackingPreconditions;

    /*The timing and key actions/milestones involved in completing the fulfillment feature instance*/
    private String paymentTrackingFeatureSchedule;

    /*The Direct Debit Arrangement specific Business Service*/
    private org.museframework.bian.classes.BusinessService directDebitPaymentTracking;

    /*The completion status and any triggered/dependent actions once the feature instance has been fulfilled*/
    private String paymentTrackingPostconditions;

    /*Reference to the specific business service type*/
    private String paymentTrackingDirectDebitPaymentTrackingServiceType;

    /*Description of the performed business service*/
    private String paymentTrackingDirectDebitPaymentTrackingServiceDescription;

    /*Mandatory and optional inputs and output information for the business service*/
    private String paymentTrackingDirectDebitPaymentTrackingServiceInputsandOuputs;

    /*Documentation, meeting schedules, notes, reasearch. calculations and any other work products produced by the business service*/
    private String paymentTrackingDirectDebitPaymentTrackingServiceWorkProduct;

    /**/
    private String paymentTrackingDirectDebitPaymentTrackingServiceName;

    public void setPaymentTrackingPreconditions(String paymentTrackingPreconditions) {
        this.paymentTrackingPreconditions = paymentTrackingPreconditions;
    }

    public String getPaymentTrackingPreconditions() {
        return paymentTrackingPreconditions;
    }

    public void setPaymentTrackingFeatureSchedule(String paymentTrackingFeatureSchedule) {
        this.paymentTrackingFeatureSchedule = paymentTrackingFeatureSchedule;
    }

    public String getPaymentTrackingFeatureSchedule() {
        return paymentTrackingFeatureSchedule;
    }

    public void setDirectDebitPaymentTracking(org.museframework.bian.classes.BusinessService directDebitPaymentTracking) {
        this.directDebitPaymentTracking = directDebitPaymentTracking;
    }

    public org.museframework.bian.classes.BusinessService getDirectDebitPaymentTracking() {
        return directDebitPaymentTracking;
    }

    public void setPaymentTrackingPostconditions(String paymentTrackingPostconditions) {
        this.paymentTrackingPostconditions = paymentTrackingPostconditions;
    }

    public String getPaymentTrackingPostconditions() {
        return paymentTrackingPostconditions;
    }

    public void setPaymentTrackingDirectDebitPaymentTrackingServiceType(String paymentTrackingDirectDebitPaymentTrackingServiceType) {
        this.paymentTrackingDirectDebitPaymentTrackingServiceType = paymentTrackingDirectDebitPaymentTrackingServiceType;
    }

    public String getPaymentTrackingDirectDebitPaymentTrackingServiceType() {
        return paymentTrackingDirectDebitPaymentTrackingServiceType;
    }

    public void setPaymentTrackingDirectDebitPaymentTrackingServiceDescription(String paymentTrackingDirectDebitPaymentTrackingServiceDescription) {
        this.paymentTrackingDirectDebitPaymentTrackingServiceDescription = paymentTrackingDirectDebitPaymentTrackingServiceDescription;
    }

    public String getPaymentTrackingDirectDebitPaymentTrackingServiceDescription() {
        return paymentTrackingDirectDebitPaymentTrackingServiceDescription;
    }

    public void setPaymentTrackingDirectDebitPaymentTrackingServiceInputsandOuputs(String paymentTrackingDirectDebitPaymentTrackingServiceInputsandOuputs) {
        this.paymentTrackingDirectDebitPaymentTrackingServiceInputsandOuputs = paymentTrackingDirectDebitPaymentTrackingServiceInputsandOuputs;
    }

    public String getPaymentTrackingDirectDebitPaymentTrackingServiceInputsandOuputs() {
        return paymentTrackingDirectDebitPaymentTrackingServiceInputsandOuputs;
    }

    public void setPaymentTrackingDirectDebitPaymentTrackingServiceWorkProduct(String paymentTrackingDirectDebitPaymentTrackingServiceWorkProduct) {
        this.paymentTrackingDirectDebitPaymentTrackingServiceWorkProduct = paymentTrackingDirectDebitPaymentTrackingServiceWorkProduct;
    }

    public String getPaymentTrackingDirectDebitPaymentTrackingServiceWorkProduct() {
        return paymentTrackingDirectDebitPaymentTrackingServiceWorkProduct;
    }

    public void setPaymentTrackingDirectDebitPaymentTrackingServiceName(String paymentTrackingDirectDebitPaymentTrackingServiceName) {
        this.paymentTrackingDirectDebitPaymentTrackingServiceName = paymentTrackingDirectDebitPaymentTrackingServiceName;
    }

    public String getPaymentTrackingDirectDebitPaymentTrackingServiceName() {
        return paymentTrackingDirectDebitPaymentTrackingServiceName;
    }
}