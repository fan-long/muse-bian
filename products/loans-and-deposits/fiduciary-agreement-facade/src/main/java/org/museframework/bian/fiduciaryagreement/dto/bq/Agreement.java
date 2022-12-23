/*Fulfill any scheduled and ad-hoc obligations under a service arrangement, most typically for a financial product or facility  within Fiduciary Agreement. 
Example: Perform the scheduled (e.g. statements, standing orders) and ad-hoc/requested (e.g. balance inquiries, fund transfers) fulfillment tasks for a customer current account facility.*/
package org.museframework.bian.fiduciaryagreement.dto.bq;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto
public class Agreement extends org.museframework.bian.classes.Agreement {
    /*The required status/situation prior to the implementation of the feature*/
    @MetaField
    private String agreementPreconditions;

    /*The timing and key actions/milestones involved in completing the fulfillment feature instance*/
    @MetaField
    private String agreementFeatureSchedule;

    /*The Fiduciary Relationship Arrangement specific Business Service*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.BusinessService businessService;

    /*The completion status and any triggered/dependent actions once the feature instance has been fulfilled*/
    @MetaField
    private String agreementPostconditions;

    /*Reference to the specific business service type*/
    @MetaField
    private String agreementServiceType;

    /*Description of the performed business service*/
    @MetaField
    private String agreementServiceDescription;

    /*Mandatory and optional inputs and output information for the business service*/
    @MetaField
    private String agreementServiceInputsandOuputs;

    /*Documentation, meeting schedules, notes, reasearch. calculations and any other work products produced by the business service*/
    @MetaField
    private String agreementServiceWorkProduct;

    /**/
    @MetaField
    private String agreementServiceName;

    public void setAgreementPreconditions(String agreementPreconditions) {
        this.agreementPreconditions = agreementPreconditions;
    }

    public String getAgreementPreconditions() {
        return agreementPreconditions;
    }

    public void setAgreementFeatureSchedule(String agreementFeatureSchedule) {
        this.agreementFeatureSchedule = agreementFeatureSchedule;
    }

    public String getAgreementFeatureSchedule() {
        return agreementFeatureSchedule;
    }

    public void setBusinessService(org.museframework.bian.classes.BusinessService businessService) {
        this.businessService = businessService;
    }

    public org.museframework.bian.classes.BusinessService getBusinessService() {
        return businessService;
    }

    public void setAgreementPostconditions(String agreementPostconditions) {
        this.agreementPostconditions = agreementPostconditions;
    }

    public String getAgreementPostconditions() {
        return agreementPostconditions;
    }

    public void setAgreementServiceType(String agreementServiceType) {
        this.agreementServiceType = agreementServiceType;
    }

    public String getAgreementServiceType() {
        return agreementServiceType;
    }

    public void setAgreementServiceDescription(String agreementServiceDescription) {
        this.agreementServiceDescription = agreementServiceDescription;
    }

    public String getAgreementServiceDescription() {
        return agreementServiceDescription;
    }

    public void setAgreementServiceInputsandOuputs(String agreementServiceInputsandOuputs) {
        this.agreementServiceInputsandOuputs = agreementServiceInputsandOuputs;
    }

    public String getAgreementServiceInputsandOuputs() {
        return agreementServiceInputsandOuputs;
    }

    public void setAgreementServiceWorkProduct(String agreementServiceWorkProduct) {
        this.agreementServiceWorkProduct = agreementServiceWorkProduct;
    }

    public String getAgreementServiceWorkProduct() {
        return agreementServiceWorkProduct;
    }

    public void setAgreementServiceName(String agreementServiceName) {
        this.agreementServiceName = agreementServiceName;
    }

    public String getAgreementServiceName() {
        return agreementServiceName;
    }
}