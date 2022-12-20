/**/
package org.museframework.bian.merchandisingloan.dto.bq;

public class Withdrawals {
    /*The required status/situation prior to the implementation of the feature*/
    private String withdrawalsPreconditions;

    /*The timing and key actions/milestones involved in completing the fulfillment feature instance*/
    private String withdrawalsFeatureSchedule;

    /*The Merchandising Loan Arrangement specific Business Service*/
    private org.museframework.bian.classes.BusinessService withdrawalProcessing;

    /*The completion status and any triggered/dependent actions once the feature instance has been fulfilled*/
    private String withdrawalsPostconditions;

    /*Reference to the specific business service type*/
    private String withdrawalsWithdrawalProcessingServiceType;

    /*Description of the performed business service*/
    private String withdrawalsWithdrawalProcessingServiceDescription;

    /*Mandatory and optional inputs and output information for the business service*/
    private String withdrawalsWithdrawalProcessingServiceInputsandOuputs;

    /*Documentation, meeting schedules, notes, reasearch. calculations and any other work products produced by the business service*/
    private String withdrawalsWithdrawalProcessingServiceWorkProduct;

    /**/
    private String withdrawalsWithdrawalProcessingServiceName;

    public void setWithdrawalsPreconditions(String withdrawalsPreconditions) {
        this.withdrawalsPreconditions = withdrawalsPreconditions;
    }

    public String getWithdrawalsPreconditions() {
        return withdrawalsPreconditions;
    }

    public void setWithdrawalsFeatureSchedule(String withdrawalsFeatureSchedule) {
        this.withdrawalsFeatureSchedule = withdrawalsFeatureSchedule;
    }

    public String getWithdrawalsFeatureSchedule() {
        return withdrawalsFeatureSchedule;
    }

    public void setWithdrawalProcessing(org.museframework.bian.classes.BusinessService withdrawalProcessing) {
        this.withdrawalProcessing = withdrawalProcessing;
    }

    public org.museframework.bian.classes.BusinessService getWithdrawalProcessing() {
        return withdrawalProcessing;
    }

    public void setWithdrawalsPostconditions(String withdrawalsPostconditions) {
        this.withdrawalsPostconditions = withdrawalsPostconditions;
    }

    public String getWithdrawalsPostconditions() {
        return withdrawalsPostconditions;
    }

    public void setWithdrawalsWithdrawalProcessingServiceType(String withdrawalsWithdrawalProcessingServiceType) {
        this.withdrawalsWithdrawalProcessingServiceType = withdrawalsWithdrawalProcessingServiceType;
    }

    public String getWithdrawalsWithdrawalProcessingServiceType() {
        return withdrawalsWithdrawalProcessingServiceType;
    }

    public void setWithdrawalsWithdrawalProcessingServiceDescription(String withdrawalsWithdrawalProcessingServiceDescription) {
        this.withdrawalsWithdrawalProcessingServiceDescription = withdrawalsWithdrawalProcessingServiceDescription;
    }

    public String getWithdrawalsWithdrawalProcessingServiceDescription() {
        return withdrawalsWithdrawalProcessingServiceDescription;
    }

    public void setWithdrawalsWithdrawalProcessingServiceInputsandOuputs(String withdrawalsWithdrawalProcessingServiceInputsandOuputs) {
        this.withdrawalsWithdrawalProcessingServiceInputsandOuputs = withdrawalsWithdrawalProcessingServiceInputsandOuputs;
    }

    public String getWithdrawalsWithdrawalProcessingServiceInputsandOuputs() {
        return withdrawalsWithdrawalProcessingServiceInputsandOuputs;
    }

    public void setWithdrawalsWithdrawalProcessingServiceWorkProduct(String withdrawalsWithdrawalProcessingServiceWorkProduct) {
        this.withdrawalsWithdrawalProcessingServiceWorkProduct = withdrawalsWithdrawalProcessingServiceWorkProduct;
    }

    public String getWithdrawalsWithdrawalProcessingServiceWorkProduct() {
        return withdrawalsWithdrawalProcessingServiceWorkProduct;
    }

    public void setWithdrawalsWithdrawalProcessingServiceName(String withdrawalsWithdrawalProcessingServiceName) {
        this.withdrawalsWithdrawalProcessingServiceName = withdrawalsWithdrawalProcessingServiceName;
    }

    public String getWithdrawalsWithdrawalProcessingServiceName() {
        return withdrawalsWithdrawalProcessingServiceName;
    }
}