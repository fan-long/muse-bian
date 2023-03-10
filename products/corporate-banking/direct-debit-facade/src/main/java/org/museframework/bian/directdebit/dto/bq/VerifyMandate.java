/*The configuration and execution of Batch Debit arrangement within the Direct Debit Facility*/
package org.museframework.bian.directdebit.dto.bq;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto
public class VerifyMandate {
    /*The required status/situation prior to the implementation of the feature*/
    @MetaField(0)
    private String verifyMandatePreconditions;

    /*The timing and key actions/milestones involved in completing the fulfillment feature instance*/
    @MetaField(0)
    private String verifyMandateFeatureSchedule;

    /*The Direct Debit Arrangement specific Business Service*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.BusinessService directDebitMandateCheck;

    /*The completion status and any triggered/dependent actions once the feature instance has been fulfilled*/
    @MetaField(0)
    private String verifyMandatePostconditions;

    /*Reference to the specific business service type*/
    @MetaField(0)
    private String verifyMandateDirectDebitMandateCheckServiceType;

    /*Description of the performed business service*/
    @MetaField(0)
    private String verifyMandateDirectDebitMandateCheckServiceDescription;

    /*Mandatory and optional inputs and output information for the business service*/
    @MetaField(0)
    private String verifyMandateDirectDebitMandateCheckServiceInputsandOuputs;

    /*Documentation, meeting schedules, notes, reasearch. calculations and any other work products produced by the business service*/
    @MetaField(0)
    private String verifyMandateDirectDebitMandateCheckServiceWorkProduct;

    /**/
    @MetaField(0)
    private String verifyMandateDirectDebitMandateCheckServiceName;

    public void setVerifyMandatePreconditions(String verifyMandatePreconditions) {
        this.verifyMandatePreconditions = verifyMandatePreconditions;
    }

    public String getVerifyMandatePreconditions() {
        return verifyMandatePreconditions;
    }

    public void setVerifyMandateFeatureSchedule(String verifyMandateFeatureSchedule) {
        this.verifyMandateFeatureSchedule = verifyMandateFeatureSchedule;
    }

    public String getVerifyMandateFeatureSchedule() {
        return verifyMandateFeatureSchedule;
    }

    public void setDirectDebitMandateCheck(org.museframework.bian.classes.BusinessService directDebitMandateCheck) {
        this.directDebitMandateCheck = directDebitMandateCheck;
    }

    public org.museframework.bian.classes.BusinessService getDirectDebitMandateCheck() {
        return directDebitMandateCheck;
    }

    public void setVerifyMandatePostconditions(String verifyMandatePostconditions) {
        this.verifyMandatePostconditions = verifyMandatePostconditions;
    }

    public String getVerifyMandatePostconditions() {
        return verifyMandatePostconditions;
    }

    public void setVerifyMandateDirectDebitMandateCheckServiceType(String verifyMandateDirectDebitMandateCheckServiceType) {
        this.verifyMandateDirectDebitMandateCheckServiceType = verifyMandateDirectDebitMandateCheckServiceType;
    }

    public String getVerifyMandateDirectDebitMandateCheckServiceType() {
        return verifyMandateDirectDebitMandateCheckServiceType;
    }

    public void setVerifyMandateDirectDebitMandateCheckServiceDescription(String verifyMandateDirectDebitMandateCheckServiceDescription) {
        this.verifyMandateDirectDebitMandateCheckServiceDescription = verifyMandateDirectDebitMandateCheckServiceDescription;
    }

    public String getVerifyMandateDirectDebitMandateCheckServiceDescription() {
        return verifyMandateDirectDebitMandateCheckServiceDescription;
    }

    public void setVerifyMandateDirectDebitMandateCheckServiceInputsandOuputs(String verifyMandateDirectDebitMandateCheckServiceInputsandOuputs) {
        this.verifyMandateDirectDebitMandateCheckServiceInputsandOuputs = verifyMandateDirectDebitMandateCheckServiceInputsandOuputs;
    }

    public String getVerifyMandateDirectDebitMandateCheckServiceInputsandOuputs() {
        return verifyMandateDirectDebitMandateCheckServiceInputsandOuputs;
    }

    public void setVerifyMandateDirectDebitMandateCheckServiceWorkProduct(String verifyMandateDirectDebitMandateCheckServiceWorkProduct) {
        this.verifyMandateDirectDebitMandateCheckServiceWorkProduct = verifyMandateDirectDebitMandateCheckServiceWorkProduct;
    }

    public String getVerifyMandateDirectDebitMandateCheckServiceWorkProduct() {
        return verifyMandateDirectDebitMandateCheckServiceWorkProduct;
    }

    public void setVerifyMandateDirectDebitMandateCheckServiceName(String verifyMandateDirectDebitMandateCheckServiceName) {
        this.verifyMandateDirectDebitMandateCheckServiceName = verifyMandateDirectDebitMandateCheckServiceName;
    }

    public String getVerifyMandateDirectDebitMandateCheckServiceName() {
        return verifyMandateDirectDebitMandateCheckServiceName;
    }
}