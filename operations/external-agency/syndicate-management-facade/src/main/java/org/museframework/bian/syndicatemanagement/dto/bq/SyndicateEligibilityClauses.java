/*The Syndicate Eligibility Clauses defines a particular clause or consideration that is applied to determine eligibility for Syndicate Eligibility Clauses*/
package org.museframework.bian.syndicatemanagement.dto.bq;

public class SyndicateEligibilityClauses {
    /*Reference to Syndicate Eligibility Clauses*/
    private org.museframework.bian.classes.Object syndicateMembershipReference;

    /*Reference to Syndicate Eligibility Clauses*/
    private org.museframework.bian.classes.Object syndicateEligibilityClausesReference;

    /*The type of Syndicate Eligibility Clauses*/
    private String syndicateEligibilityClausesType;

    /*The Syndicate Eligibility Clauses specific Business Service*/
    private org.museframework.bian.classes.BusinessService businessService;

    /*The operating unit/employee responsible for governing Syndicate Eligibility Clauses by applying the Syndicate Eligibility Clauses clause*/
    private String businessUnitEmployeeReference;

    /*The completion status once Syndicate Eligibility Clauses has been governed by applying the Syndicate Eligibility Clauses clause*/
    private org.museframework.bian.classes.Condition postconditions;

    /*The required status/situation before Syndicate Eligibility Clauses can be governed by applying the Syndicate Eligibility Clauses clause*/
    private org.museframework.bian.classes.Condition preconditions;

    /*The timing and key actions/milestones involved in governing Syndicate Eligibility Clauses by applying the Syndicate Eligibility Clauses clause*/
    private String schedule;

    public void setSyndicateMembershipReference(org.museframework.bian.classes.Object syndicateMembershipReference) {
        this.syndicateMembershipReference = syndicateMembershipReference;
    }

    public org.museframework.bian.classes.Object getSyndicateMembershipReference() {
        return syndicateMembershipReference;
    }

    public void setSyndicateEligibilityClausesReference(org.museframework.bian.classes.Object syndicateEligibilityClausesReference) {
        this.syndicateEligibilityClausesReference = syndicateEligibilityClausesReference;
    }

    public org.museframework.bian.classes.Object getSyndicateEligibilityClausesReference() {
        return syndicateEligibilityClausesReference;
    }

    public void setSyndicateEligibilityClausesType(String syndicateEligibilityClausesType) {
        this.syndicateEligibilityClausesType = syndicateEligibilityClausesType;
    }

    public String getSyndicateEligibilityClausesType() {
        return syndicateEligibilityClausesType;
    }

    public void setBusinessService(org.museframework.bian.classes.BusinessService businessService) {
        this.businessService = businessService;
    }

    public org.museframework.bian.classes.BusinessService getBusinessService() {
        return businessService;
    }

    public void setBusinessUnitEmployeeReference(String businessUnitEmployeeReference) {
        this.businessUnitEmployeeReference = businessUnitEmployeeReference;
    }

    public String getBusinessUnitEmployeeReference() {
        return businessUnitEmployeeReference;
    }

    public void setPostconditions(org.museframework.bian.classes.Condition postconditions) {
        this.postconditions = postconditions;
    }

    public org.museframework.bian.classes.Condition getPostconditions() {
        return postconditions;
    }

    public void setPreconditions(org.museframework.bian.classes.Condition preconditions) {
        this.preconditions = preconditions;
    }

    public org.museframework.bian.classes.Condition getPreconditions() {
        return preconditions;
    }

    public void setSchedule(String schedule) {
        this.schedule = schedule;
    }

    public String getSchedule() {
        return schedule;
    }
}