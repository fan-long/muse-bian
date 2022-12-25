/*Fulfill any scheduled and ad-hoc obligations under a service arrangement, most typically for a financial product or facility  within Syndicated Loan. 
Example: Perform the scheduled (e.g. statements, standing orders) and ad-hoc/requested (e.g. balance inquiries, fund transfers) fulfillment tasks for a customer current account facility.*/
package org.museframework.bian.syndicatedloan.dto.bq;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto
public class Origination {
    /*The required status/situation prior to the implementation of the feature*/
    @MetaField(0)
    private String originationPreconditions;

    /*The timing and key actions/milestones involved in completing the fulfillment feature instance*/
    @MetaField(0)
    private String originationFeatureSchedule;

    /*The Syndicated Loan Arrangement specific Business Service*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.BusinessService syndicatedLoanOrigination;

    /*The completion status and any triggered/dependent actions once the feature instance has been fulfilled*/
    @MetaField(0)
    private String originationPostconditions;

    /*Reference to the specific business service type*/
    @MetaField(0)
    private String originationSyndicatedLoanOriginationServiceType;

    /*Description of the performed business service*/
    @MetaField(0)
    private String originationSyndicatedLoanOriginationServiceDescription;

    /*Mandatory and optional inputs and output information for the business service*/
    @MetaField(0)
    private String originationSyndicatedLoanOriginationServiceInputsandOuputs;

    /*Documentation, meeting schedules, notes, reasearch. calculations and any other work products produced by the business service*/
    @MetaField(0)
    private String originationSyndicatedLoanOriginationServiceWorkProduct;

    /**/
    @MetaField(0)
    private String originationSyndicatedLoanOriginationServiceName;

    public void setOriginationPreconditions(String originationPreconditions) {
        this.originationPreconditions = originationPreconditions;
    }

    public String getOriginationPreconditions() {
        return originationPreconditions;
    }

    public void setOriginationFeatureSchedule(String originationFeatureSchedule) {
        this.originationFeatureSchedule = originationFeatureSchedule;
    }

    public String getOriginationFeatureSchedule() {
        return originationFeatureSchedule;
    }

    public void setSyndicatedLoanOrigination(org.museframework.bian.classes.BusinessService syndicatedLoanOrigination) {
        this.syndicatedLoanOrigination = syndicatedLoanOrigination;
    }

    public org.museframework.bian.classes.BusinessService getSyndicatedLoanOrigination() {
        return syndicatedLoanOrigination;
    }

    public void setOriginationPostconditions(String originationPostconditions) {
        this.originationPostconditions = originationPostconditions;
    }

    public String getOriginationPostconditions() {
        return originationPostconditions;
    }

    public void setOriginationSyndicatedLoanOriginationServiceType(String originationSyndicatedLoanOriginationServiceType) {
        this.originationSyndicatedLoanOriginationServiceType = originationSyndicatedLoanOriginationServiceType;
    }

    public String getOriginationSyndicatedLoanOriginationServiceType() {
        return originationSyndicatedLoanOriginationServiceType;
    }

    public void setOriginationSyndicatedLoanOriginationServiceDescription(String originationSyndicatedLoanOriginationServiceDescription) {
        this.originationSyndicatedLoanOriginationServiceDescription = originationSyndicatedLoanOriginationServiceDescription;
    }

    public String getOriginationSyndicatedLoanOriginationServiceDescription() {
        return originationSyndicatedLoanOriginationServiceDescription;
    }

    public void setOriginationSyndicatedLoanOriginationServiceInputsandOuputs(String originationSyndicatedLoanOriginationServiceInputsandOuputs) {
        this.originationSyndicatedLoanOriginationServiceInputsandOuputs = originationSyndicatedLoanOriginationServiceInputsandOuputs;
    }

    public String getOriginationSyndicatedLoanOriginationServiceInputsandOuputs() {
        return originationSyndicatedLoanOriginationServiceInputsandOuputs;
    }

    public void setOriginationSyndicatedLoanOriginationServiceWorkProduct(String originationSyndicatedLoanOriginationServiceWorkProduct) {
        this.originationSyndicatedLoanOriginationServiceWorkProduct = originationSyndicatedLoanOriginationServiceWorkProduct;
    }

    public String getOriginationSyndicatedLoanOriginationServiceWorkProduct() {
        return originationSyndicatedLoanOriginationServiceWorkProduct;
    }

    public void setOriginationSyndicatedLoanOriginationServiceName(String originationSyndicatedLoanOriginationServiceName) {
        this.originationSyndicatedLoanOriginationServiceName = originationSyndicatedLoanOriginationServiceName;
    }

    public String getOriginationSyndicatedLoanOriginationServiceName() {
        return originationSyndicatedLoanOriginationServiceName;
    }
}