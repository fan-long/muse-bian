/*The Syndicate Eligibility Clauses defines a particular clause or consideration that is applied to determine eligibility for Syndicate Eligibility Clauses*/
package org.museframework.bian.syndicatemanagement.dto.bq;

public class SyndicateComplianceClauses {
    /*Reference to Syndicate Compliance Clauses*/
    private org.museframework.bian.classes.Object syndicateMembershipReference;

    /*Reference to Syndicate Compliance Clauses*/
    private org.museframework.bian.classes.Object syndicateComplianceClausesReference;

    /*The type of Syndicate Compliance Clauses*/
    private String syndicateComplianceClausesType;

    /*The Syndicate Compliance Clauses specific Business Service*/
    private org.museframework.bian.classes.BusinessService businessService;

    /*The operating unit/employee responsible for governing Syndicate Compliance Clauses by applying the Syndicate Compliance Clauses clause*/
    private String businessUnitEmployeeReference;

    /*The completion status once Syndicate Compliance Clauses has been governed by applying the Syndicate Compliance Clauses clause*/
    private org.museframework.bian.classes.Condition postconditions;

    /*The required status/situation before Syndicate Compliance Clauses can be governed by applying the Syndicate Compliance Clauses clause*/
    private org.museframework.bian.classes.Condition preconditions;

    /*The timing and key actions/milestones involved in governing Syndicate Compliance Clauses by applying the Syndicate Compliance Clauses clause*/
    private String schedule;

    public void setSyndicateMembershipReference(org.museframework.bian.classes.Object syndicateMembershipReference) {
        this.syndicateMembershipReference = syndicateMembershipReference;
    }

    public org.museframework.bian.classes.Object getSyndicateMembershipReference() {
        return syndicateMembershipReference;
    }

    public void setSyndicateComplianceClausesReference(org.museframework.bian.classes.Object syndicateComplianceClausesReference) {
        this.syndicateComplianceClausesReference = syndicateComplianceClausesReference;
    }

    public org.museframework.bian.classes.Object getSyndicateComplianceClausesReference() {
        return syndicateComplianceClausesReference;
    }

    public void setSyndicateComplianceClausesType(String syndicateComplianceClausesType) {
        this.syndicateComplianceClausesType = syndicateComplianceClausesType;
    }

    public String getSyndicateComplianceClausesType() {
        return syndicateComplianceClausesType;
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