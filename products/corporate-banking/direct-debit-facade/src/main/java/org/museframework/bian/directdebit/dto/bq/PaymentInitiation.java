/*The configuration and execution of Batch Debit arrangement within the Direct Debit Facility*/
package org.museframework.bian.directdebit.dto.bq;

public class PaymentInitiation {
    /*The required status/situation prior to the implementation of the feature*/
    private String paymentInitiationPreconditions;

    /*The timing and key actions/milestones involved in completing the fulfillment feature instance*/
    private String paymentInitiationFeatureSchedule;

    /*The Direct Debit Arrangement specific Business Service*/
    private org.museframework.bian.classes.BusinessService directDebitPaymentInitiation;

    /*The completion status and any triggered/dependent actions once the feature instance has been fulfilled*/
    private String paymentInitiationPostconditions;

    /*Reference to the specific business service type*/
    private String paymentInitiationDirectDebitPaymentInitiationServiceType;

    /*Description of the performed business service*/
    private String paymentInitiationDirectDebitPaymentInitiationServiceDescription;

    /*Mandatory and optional inputs and output information for the business service*/
    private String paymentInitiationDirectDebitPaymentInitiationServiceInputsandOuputs;

    /*Documentation, meeting schedules, notes, reasearch. calculations and any other work products produced by the business service*/
    private String paymentInitiationDirectDebitPaymentInitiationServiceWorkProduct;

    /**/
    private String paymentInitiationDirectDebitPaymentInitiationServiceName;

    public void setPaymentInitiationPreconditions(String paymentInitiationPreconditions) {
        this.paymentInitiationPreconditions = paymentInitiationPreconditions;
    }

    public String getPaymentInitiationPreconditions() {
        return paymentInitiationPreconditions;
    }

    public void setPaymentInitiationFeatureSchedule(String paymentInitiationFeatureSchedule) {
        this.paymentInitiationFeatureSchedule = paymentInitiationFeatureSchedule;
    }

    public String getPaymentInitiationFeatureSchedule() {
        return paymentInitiationFeatureSchedule;
    }

    public void setDirectDebitPaymentInitiation(org.museframework.bian.classes.BusinessService directDebitPaymentInitiation) {
        this.directDebitPaymentInitiation = directDebitPaymentInitiation;
    }

    public org.museframework.bian.classes.BusinessService getDirectDebitPaymentInitiation() {
        return directDebitPaymentInitiation;
    }

    public void setPaymentInitiationPostconditions(String paymentInitiationPostconditions) {
        this.paymentInitiationPostconditions = paymentInitiationPostconditions;
    }

    public String getPaymentInitiationPostconditions() {
        return paymentInitiationPostconditions;
    }

    public void setPaymentInitiationDirectDebitPaymentInitiationServiceType(String paymentInitiationDirectDebitPaymentInitiationServiceType) {
        this.paymentInitiationDirectDebitPaymentInitiationServiceType = paymentInitiationDirectDebitPaymentInitiationServiceType;
    }

    public String getPaymentInitiationDirectDebitPaymentInitiationServiceType() {
        return paymentInitiationDirectDebitPaymentInitiationServiceType;
    }

    public void setPaymentInitiationDirectDebitPaymentInitiationServiceDescription(String paymentInitiationDirectDebitPaymentInitiationServiceDescription) {
        this.paymentInitiationDirectDebitPaymentInitiationServiceDescription = paymentInitiationDirectDebitPaymentInitiationServiceDescription;
    }

    public String getPaymentInitiationDirectDebitPaymentInitiationServiceDescription() {
        return paymentInitiationDirectDebitPaymentInitiationServiceDescription;
    }

    public void setPaymentInitiationDirectDebitPaymentInitiationServiceInputsandOuputs(String paymentInitiationDirectDebitPaymentInitiationServiceInputsandOuputs) {
        this.paymentInitiationDirectDebitPaymentInitiationServiceInputsandOuputs = paymentInitiationDirectDebitPaymentInitiationServiceInputsandOuputs;
    }

    public String getPaymentInitiationDirectDebitPaymentInitiationServiceInputsandOuputs() {
        return paymentInitiationDirectDebitPaymentInitiationServiceInputsandOuputs;
    }

    public void setPaymentInitiationDirectDebitPaymentInitiationServiceWorkProduct(String paymentInitiationDirectDebitPaymentInitiationServiceWorkProduct) {
        this.paymentInitiationDirectDebitPaymentInitiationServiceWorkProduct = paymentInitiationDirectDebitPaymentInitiationServiceWorkProduct;
    }

    public String getPaymentInitiationDirectDebitPaymentInitiationServiceWorkProduct() {
        return paymentInitiationDirectDebitPaymentInitiationServiceWorkProduct;
    }

    public void setPaymentInitiationDirectDebitPaymentInitiationServiceName(String paymentInitiationDirectDebitPaymentInitiationServiceName) {
        this.paymentInitiationDirectDebitPaymentInitiationServiceName = paymentInitiationDirectDebitPaymentInitiationServiceName;
    }

    public String getPaymentInitiationDirectDebitPaymentInitiationServiceName() {
        return paymentInitiationDirectDebitPaymentInitiationServiceName;
    }
}