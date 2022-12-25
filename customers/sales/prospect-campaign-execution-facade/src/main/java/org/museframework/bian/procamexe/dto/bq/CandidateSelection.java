/*The main worsteps to be followed in th eexecution of the procedure

Examples: Invoice generation*/
package org.museframework.bian.procamexe.dto.bq;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto
public class CandidateSelection {
    /*Details the selection criteria used to identify candidate prospects*/
    @MetaField(0)
    private String prospectCampaignSelectionCriteria;

    /*Reference to the employee or business unit that confirms eligibility of the prospect list (e.g. confirming not current customer checks)*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object prospectCampaignCandidateEmployeeBusinessUnitReference;

    /*Reference to the prospects selected as a candidate*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object prospectCampaignCandidateReference;

    public void setProspectCampaignSelectionCriteria(String prospectCampaignSelectionCriteria) {
        this.prospectCampaignSelectionCriteria = prospectCampaignSelectionCriteria;
    }

    public String getProspectCampaignSelectionCriteria() {
        return prospectCampaignSelectionCriteria;
    }

    public void setProspectCampaignCandidateEmployeeBusinessUnitReference(org.museframework.bian.classes.Object prospectCampaignCandidateEmployeeBusinessUnitReference) {
        this.prospectCampaignCandidateEmployeeBusinessUnitReference = prospectCampaignCandidateEmployeeBusinessUnitReference;
    }

    public org.museframework.bian.classes.Object getProspectCampaignCandidateEmployeeBusinessUnitReference() {
        return prospectCampaignCandidateEmployeeBusinessUnitReference;
    }

    public void setProspectCampaignCandidateReference(org.museframework.bian.classes.Object prospectCampaignCandidateReference) {
        this.prospectCampaignCandidateReference = prospectCampaignCandidateReference;
    }

    public org.museframework.bian.classes.Object getProspectCampaignCandidateReference() {
        return prospectCampaignCandidateReference;
    }
}