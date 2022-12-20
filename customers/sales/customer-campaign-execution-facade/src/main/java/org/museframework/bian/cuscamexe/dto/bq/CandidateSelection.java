/*The main worsteps to be followed in th eexecution of the procedure

Examples: Invoice generation*/
package org.museframework.bian.cuscamexe.dto.bq;

public class CandidateSelection {
    /*Details the selection criteria used to identify candidate customers*/
    private String customerCampaignSelectionCriteria;

    /*Reference to the employee or business unit that confirms eligibility of the candidate if appropriate (e.g. the relationship manager)*/
    private org.museframework.bian.classes.Object customerCampaignCandidateEmployeeBusinessUnitReference;

    /*Reference to the customer selected as a candidate*/
    private org.museframework.bian.classes.Object customerCampaignCandidateReference;

    public void setCustomerCampaignSelectionCriteria(String customerCampaignSelectionCriteria) {
        this.customerCampaignSelectionCriteria = customerCampaignSelectionCriteria;
    }

    public String getCustomerCampaignSelectionCriteria() {
        return customerCampaignSelectionCriteria;
    }

    public void setCustomerCampaignCandidateEmployeeBusinessUnitReference(org.museframework.bian.classes.Object customerCampaignCandidateEmployeeBusinessUnitReference) {
        this.customerCampaignCandidateEmployeeBusinessUnitReference = customerCampaignCandidateEmployeeBusinessUnitReference;
    }

    public org.museframework.bian.classes.Object getCustomerCampaignCandidateEmployeeBusinessUnitReference() {
        return customerCampaignCandidateEmployeeBusinessUnitReference;
    }

    public void setCustomerCampaignCandidateReference(org.museframework.bian.classes.Object customerCampaignCandidateReference) {
        this.customerCampaignCandidateReference = customerCampaignCandidateReference;
    }

    public org.museframework.bian.classes.Object getCustomerCampaignCandidateReference() {
        return customerCampaignCandidateReference;
    }
}