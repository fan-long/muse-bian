/*Analysis of the parties involved in the subject of a dunning procedure*/
package org.museframework.bian.classes;

public class DunningSubjectInvolvementAnalysis {
    /*Reference to the party that is involved in the subject of the dunning procedure at the time of the dunning analysis*/
    private String dunningSubjectInvolvedPartyReference;

    /*Type of involvement (Role) of the party in relation to the subject of the dunning procedure at the time of analysis*/
    private String dunningSubjectInvolvedPartyRole;

    /*Obligation or entitlement of the party involved in the subject of the dunning procedure at the time of the analysis*/
    private String dunningSubjectInvolvedPartyObligationOrEntitlement;

    public void setDunningSubjectInvolvedPartyReference(String dunningSubjectInvolvedPartyReference) {
        this.dunningSubjectInvolvedPartyReference = dunningSubjectInvolvedPartyReference;
    }

    public String getDunningSubjectInvolvedPartyReference() {
        return dunningSubjectInvolvedPartyReference;
    }

    public void setDunningSubjectInvolvedPartyRole(String dunningSubjectInvolvedPartyRole) {
        this.dunningSubjectInvolvedPartyRole = dunningSubjectInvolvedPartyRole;
    }

    public String getDunningSubjectInvolvedPartyRole() {
        return dunningSubjectInvolvedPartyRole;
    }

    public void setDunningSubjectInvolvedPartyObligationOrEntitlement(String dunningSubjectInvolvedPartyObligationOrEntitlement) {
        this.dunningSubjectInvolvedPartyObligationOrEntitlement = dunningSubjectInvolvedPartyObligationOrEntitlement;
    }

    public String getDunningSubjectInvolvedPartyObligationOrEntitlement() {
        return dunningSubjectInvolvedPartyObligationOrEntitlement;
    }
}