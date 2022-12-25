/**/
package org.museframework.bian.merchandisingloan.dto.bq;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto
public class Deposits {
    /*The required status/situation prior to the implementation of the feature*/
    @MetaField(0)
    private String depositsPreconditions;

    /*The timing and key actions/milestones involved in completing the fulfillment feature instance*/
    @MetaField(0)
    private String depositsFeatureSchedule;

    /*The Merchandising Loan Arrangement specific Business Service*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.BusinessService depositProcessing;

    /*The completion status and any triggered/dependent actions once the feature instance has been fulfilled*/
    @MetaField(0)
    private String depositsPostconditions;

    /*Reference to the specific business service type*/
    @MetaField(0)
    private String depositsDepositProcessingServiceType;

    /*Description of the performed business service*/
    @MetaField(0)
    private String depositsDepositProcessingServiceDescription;

    /*Mandatory and optional inputs and output information for the business service*/
    @MetaField(0)
    private String depositsDepositProcessingServiceInputsandOuputs;

    /*Documentation, meeting schedules, notes, reasearch. calculations and any other work products produced by the business service*/
    @MetaField(0)
    private String depositsDepositProcessingServiceWorkProduct;

    /**/
    @MetaField(0)
    private String depositsDepositProcessingServiceName;

    public void setDepositsPreconditions(String depositsPreconditions) {
        this.depositsPreconditions = depositsPreconditions;
    }

    public String getDepositsPreconditions() {
        return depositsPreconditions;
    }

    public void setDepositsFeatureSchedule(String depositsFeatureSchedule) {
        this.depositsFeatureSchedule = depositsFeatureSchedule;
    }

    public String getDepositsFeatureSchedule() {
        return depositsFeatureSchedule;
    }

    public void setDepositProcessing(org.museframework.bian.classes.BusinessService depositProcessing) {
        this.depositProcessing = depositProcessing;
    }

    public org.museframework.bian.classes.BusinessService getDepositProcessing() {
        return depositProcessing;
    }

    public void setDepositsPostconditions(String depositsPostconditions) {
        this.depositsPostconditions = depositsPostconditions;
    }

    public String getDepositsPostconditions() {
        return depositsPostconditions;
    }

    public void setDepositsDepositProcessingServiceType(String depositsDepositProcessingServiceType) {
        this.depositsDepositProcessingServiceType = depositsDepositProcessingServiceType;
    }

    public String getDepositsDepositProcessingServiceType() {
        return depositsDepositProcessingServiceType;
    }

    public void setDepositsDepositProcessingServiceDescription(String depositsDepositProcessingServiceDescription) {
        this.depositsDepositProcessingServiceDescription = depositsDepositProcessingServiceDescription;
    }

    public String getDepositsDepositProcessingServiceDescription() {
        return depositsDepositProcessingServiceDescription;
    }

    public void setDepositsDepositProcessingServiceInputsandOuputs(String depositsDepositProcessingServiceInputsandOuputs) {
        this.depositsDepositProcessingServiceInputsandOuputs = depositsDepositProcessingServiceInputsandOuputs;
    }

    public String getDepositsDepositProcessingServiceInputsandOuputs() {
        return depositsDepositProcessingServiceInputsandOuputs;
    }

    public void setDepositsDepositProcessingServiceWorkProduct(String depositsDepositProcessingServiceWorkProduct) {
        this.depositsDepositProcessingServiceWorkProduct = depositsDepositProcessingServiceWorkProduct;
    }

    public String getDepositsDepositProcessingServiceWorkProduct() {
        return depositsDepositProcessingServiceWorkProduct;
    }

    public void setDepositsDepositProcessingServiceName(String depositsDepositProcessingServiceName) {
        this.depositsDepositProcessingServiceName = depositsDepositProcessingServiceName;
    }

    public String getDepositsDepositProcessingServiceName() {
        return depositsDepositProcessingServiceName;
    }
}