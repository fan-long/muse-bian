/*Party who plays a specific role in a bank plan agreement. */
package org.museframework.bian.classes;

public class BankPlanAgreementInvolvement {
    /**/
    private org.museframework.bian.enumerations.Bankplanagreementinvolvementtypevalues involvementType;

    /**/
    private Party involvedParty;

    /**/
    private Agreement involvedAgreement;

    public void setInvolvementType(org.museframework.bian.enumerations.Bankplanagreementinvolvementtypevalues involvementType) {
        this.involvementType = involvementType;
    }

    public org.museframework.bian.enumerations.Bankplanagreementinvolvementtypevalues getInvolvementType() {
        return involvementType;
    }

    public void setInvolvedParty(Party involvedParty) {
        this.involvedParty = involvedParty;
    }

    public Party getInvolvedParty() {
        return involvedParty;
    }

    public void setInvolvedAgreement(Agreement involvedAgreement) {
        this.involvedAgreement = involvedAgreement;
    }

    public Agreement getInvolvedAgreement() {
        return involvedAgreement;
    }
}