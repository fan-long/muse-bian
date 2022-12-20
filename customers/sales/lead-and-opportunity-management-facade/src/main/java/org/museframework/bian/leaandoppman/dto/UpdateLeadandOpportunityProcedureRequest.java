package org.museframework.bian.leaandoppman.dto;

public class UpdateLeadandOpportunityProcedureRequest {
    private String leadandopportunitymanagementid;

    private org.museframework.bian.leaandoppman.dto.cr.LeadandOpportunityProcedure leadandOpportunityProcedure;

    public void setLeadandopportunitymanagementid(String leadandopportunitymanagementid) {
        this.leadandopportunitymanagementid = leadandopportunitymanagementid;
    }

    public String getLeadandopportunitymanagementid() {
        return leadandopportunitymanagementid;
    }

    public void setLeadandOpportunityProcedure(org.museframework.bian.leaandoppman.dto.cr.LeadandOpportunityProcedure leadandOpportunityProcedure) {
        this.leadandOpportunityProcedure = leadandOpportunityProcedure;
    }

    public org.museframework.bian.leaandoppman.dto.cr.LeadandOpportunityProcedure getLeadandOpportunityProcedure() {
        return leadandOpportunityProcedure;
    }
}