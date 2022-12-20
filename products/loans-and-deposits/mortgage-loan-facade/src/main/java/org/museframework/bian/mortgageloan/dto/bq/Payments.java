/**/
package org.museframework.bian.mortgageloan.dto.bq;

public class Payments {
    /*The required status/situation prior to the implementation of the feature*/
    private String paymentsPreconditions;

    /*The timing and key actions/milestones involved in completing the fulfillment feature instance*/
    private String paymentsFeatureSchedule;

    /*The Mortgage Loan Arrangement specific Business Service*/
    private org.museframework.bian.classes.BusinessService businessService;

    /*The completion status and any triggered/dependent actions once the feature instance has been fulfilled*/
    private String paymentsPostconditions;

    /*Reference to the specific business service type*/
    private String paymentsServiceType;

    /*Description of the performed business service*/
    private String paymentsServiceDescription;

    /*Mandatory and optional inputs and output information for the business service*/
    private String paymentsServiceInputsandOuputs;

    /*Documentation, meeting schedules, notes, reasearch. calculations and any other work products produced by the business service*/
    private String paymentsServiceWorkProduct;

    /**/
    private String paymentsServiceName;

    public void setPaymentsPreconditions(String paymentsPreconditions) {
        this.paymentsPreconditions = paymentsPreconditions;
    }

    public String getPaymentsPreconditions() {
        return paymentsPreconditions;
    }

    public void setPaymentsFeatureSchedule(String paymentsFeatureSchedule) {
        this.paymentsFeatureSchedule = paymentsFeatureSchedule;
    }

    public String getPaymentsFeatureSchedule() {
        return paymentsFeatureSchedule;
    }

    public void setBusinessService(org.museframework.bian.classes.BusinessService businessService) {
        this.businessService = businessService;
    }

    public org.museframework.bian.classes.BusinessService getBusinessService() {
        return businessService;
    }

    public void setPaymentsPostconditions(String paymentsPostconditions) {
        this.paymentsPostconditions = paymentsPostconditions;
    }

    public String getPaymentsPostconditions() {
        return paymentsPostconditions;
    }

    public void setPaymentsServiceType(String paymentsServiceType) {
        this.paymentsServiceType = paymentsServiceType;
    }

    public String getPaymentsServiceType() {
        return paymentsServiceType;
    }

    public void setPaymentsServiceDescription(String paymentsServiceDescription) {
        this.paymentsServiceDescription = paymentsServiceDescription;
    }

    public String getPaymentsServiceDescription() {
        return paymentsServiceDescription;
    }

    public void setPaymentsServiceInputsandOuputs(String paymentsServiceInputsandOuputs) {
        this.paymentsServiceInputsandOuputs = paymentsServiceInputsandOuputs;
    }

    public String getPaymentsServiceInputsandOuputs() {
        return paymentsServiceInputsandOuputs;
    }

    public void setPaymentsServiceWorkProduct(String paymentsServiceWorkProduct) {
        this.paymentsServiceWorkProduct = paymentsServiceWorkProduct;
    }

    public String getPaymentsServiceWorkProduct() {
        return paymentsServiceWorkProduct;
    }

    public void setPaymentsServiceName(String paymentsServiceName) {
        this.paymentsServiceName = paymentsServiceName;
    }

    public String getPaymentsServiceName() {
        return paymentsServiceName;
    }
}