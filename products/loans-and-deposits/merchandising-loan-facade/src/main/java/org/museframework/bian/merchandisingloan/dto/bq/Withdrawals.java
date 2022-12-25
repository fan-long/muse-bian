/**/
package org.museframework.bian.merchandisingloan.dto.bq;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto
public class Withdrawals {
    /*The required status/situation prior to the implementation of the feature*/
    @MetaField(0)
    private String withdrawalsPreconditions;

    /*The timing and key actions/milestones involved in completing the fulfillment feature instance*/
    @MetaField(0)
    private String withdrawalsFeatureSchedule;

    /*The Merchandising Loan Arrangement specific Business Service*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.BusinessService withdrawalProcessing;

    /*The completion status and any triggered/dependent actions once the feature instance has been fulfilled*/
    @MetaField(0)
    private String withdrawalsPostconditions;

    /*Reference to the specific business service type*/
    @MetaField(0)
    private String withdrawalsWithdrawalProcessingServiceType;

    /*Description of the performed business service*/
    @MetaField(0)
    private String withdrawalsWithdrawalProcessingServiceDescription;

    /*Mandatory and optional inputs and output information for the business service*/
    @MetaField(0)
    private String withdrawalsWithdrawalProcessingServiceInputsandOuputs;

    /*Documentation, meeting schedules, notes, reasearch. calculations and any other work products produced by the business service*/
    @MetaField(0)
    private String withdrawalsWithdrawalProcessingServiceWorkProduct;

    /**/
    @MetaField(0)
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