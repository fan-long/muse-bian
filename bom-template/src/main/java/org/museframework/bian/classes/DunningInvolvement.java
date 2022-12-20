/*The involvement of a party in a dunning procedure

e.g. guarantor, borrower, debtor, notary, bailiff, employee...*/
package org.museframework.bian.classes;

public class DunningInvolvement {
    /*Reference to the party that is involved in the dunning procedure*/
    private String dunningInvolvedPartyReference;

    /*Role the party plays in the dunning procedure


examples: see class*/
    private String dunningInvolvedPartyRole;

    public void setDunningInvolvedPartyReference(String dunningInvolvedPartyReference) {
        this.dunningInvolvedPartyReference = dunningInvolvedPartyReference;
    }

    public String getDunningInvolvedPartyReference() {
        return dunningInvolvedPartyReference;
    }

    public void setDunningInvolvedPartyRole(String dunningInvolvedPartyRole) {
        this.dunningInvolvedPartyRole = dunningInvolvedPartyRole;
    }

    public String getDunningInvolvedPartyRole() {
        return dunningInvolvedPartyRole;
    }
}