/*Fulfill any scheduled and ad-hoc obligations under a service arrangement, most typically for a financial product or facility  within Syndicated Loan. 
Example: Perform the scheduled (e.g. statements, standing orders) and ad-hoc/requested (e.g. balance inquiries, fund transfers) fulfillment tasks for a customer current account facility.*/
package org.museframework.bian.syndicatedloan.dto.bq;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto
public class SyndicateAssembly {
    /*The required status/situation prior to the implementation of the feature*/
    @MetaField(0)
    private String syndicateAssemblyPreconditions;

    /*The timing and key actions/milestones involved in completing the fulfillment feature instance*/
    @MetaField(0)
    private String syndicateAssemblyFeatureSchedule;

    /*The Syndicated Loan Arrangement specific Business Service*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.BusinessService syndicatedLoanOrganization;

    /*The completion status and any triggered/dependent actions once the feature instance has been fulfilled*/
    @MetaField(0)
    private String syndicateAssemblyPostconditions;

    /*Reference to the specific business service type*/
    @MetaField(0)
    private String syndicateAssemblySyndicatedLoanOrganizationServiceType;

    /*Description of the performed business service*/
    @MetaField(0)
    private String syndicateAssemblySyndicatedLoanOrganizationServiceDescription;

    /*Mandatory and optional inputs and output information for the business service*/
    @MetaField(0)
    private String syndicateAssemblySyndicatedLoanOrganizationServiceInputsandOuputs;

    /*Documentation, meeting schedules, notes, reasearch. calculations and any other work products produced by the business service*/
    @MetaField(0)
    private String syndicateAssemblySyndicatedLoanOrganizationServiceWorkProduct;

    /**/
    @MetaField(0)
    private String syndicateAssemblySyndicatedLoanOrganizationServiceName;

    public void setSyndicateAssemblyPreconditions(String syndicateAssemblyPreconditions) {
        this.syndicateAssemblyPreconditions = syndicateAssemblyPreconditions;
    }

    public String getSyndicateAssemblyPreconditions() {
        return syndicateAssemblyPreconditions;
    }

    public void setSyndicateAssemblyFeatureSchedule(String syndicateAssemblyFeatureSchedule) {
        this.syndicateAssemblyFeatureSchedule = syndicateAssemblyFeatureSchedule;
    }

    public String getSyndicateAssemblyFeatureSchedule() {
        return syndicateAssemblyFeatureSchedule;
    }

    public void setSyndicatedLoanOrganization(org.museframework.bian.classes.BusinessService syndicatedLoanOrganization) {
        this.syndicatedLoanOrganization = syndicatedLoanOrganization;
    }

    public org.museframework.bian.classes.BusinessService getSyndicatedLoanOrganization() {
        return syndicatedLoanOrganization;
    }

    public void setSyndicateAssemblyPostconditions(String syndicateAssemblyPostconditions) {
        this.syndicateAssemblyPostconditions = syndicateAssemblyPostconditions;
    }

    public String getSyndicateAssemblyPostconditions() {
        return syndicateAssemblyPostconditions;
    }

    public void setSyndicateAssemblySyndicatedLoanOrganizationServiceType(String syndicateAssemblySyndicatedLoanOrganizationServiceType) {
        this.syndicateAssemblySyndicatedLoanOrganizationServiceType = syndicateAssemblySyndicatedLoanOrganizationServiceType;
    }

    public String getSyndicateAssemblySyndicatedLoanOrganizationServiceType() {
        return syndicateAssemblySyndicatedLoanOrganizationServiceType;
    }

    public void setSyndicateAssemblySyndicatedLoanOrganizationServiceDescription(String syndicateAssemblySyndicatedLoanOrganizationServiceDescription) {
        this.syndicateAssemblySyndicatedLoanOrganizationServiceDescription = syndicateAssemblySyndicatedLoanOrganizationServiceDescription;
    }

    public String getSyndicateAssemblySyndicatedLoanOrganizationServiceDescription() {
        return syndicateAssemblySyndicatedLoanOrganizationServiceDescription;
    }

    public void setSyndicateAssemblySyndicatedLoanOrganizationServiceInputsandOuputs(String syndicateAssemblySyndicatedLoanOrganizationServiceInputsandOuputs) {
        this.syndicateAssemblySyndicatedLoanOrganizationServiceInputsandOuputs = syndicateAssemblySyndicatedLoanOrganizationServiceInputsandOuputs;
    }

    public String getSyndicateAssemblySyndicatedLoanOrganizationServiceInputsandOuputs() {
        return syndicateAssemblySyndicatedLoanOrganizationServiceInputsandOuputs;
    }

    public void setSyndicateAssemblySyndicatedLoanOrganizationServiceWorkProduct(String syndicateAssemblySyndicatedLoanOrganizationServiceWorkProduct) {
        this.syndicateAssemblySyndicatedLoanOrganizationServiceWorkProduct = syndicateAssemblySyndicatedLoanOrganizationServiceWorkProduct;
    }

    public String getSyndicateAssemblySyndicatedLoanOrganizationServiceWorkProduct() {
        return syndicateAssemblySyndicatedLoanOrganizationServiceWorkProduct;
    }

    public void setSyndicateAssemblySyndicatedLoanOrganizationServiceName(String syndicateAssemblySyndicatedLoanOrganizationServiceName) {
        this.syndicateAssemblySyndicatedLoanOrganizationServiceName = syndicateAssemblySyndicatedLoanOrganizationServiceName;
    }

    public String getSyndicateAssemblySyndicatedLoanOrganizationServiceName() {
        return syndicateAssemblySyndicatedLoanOrganizationServiceName;
    }
}