/*A Role played by a Party in a Syndicate Membership Arrangement*/
package org.museframework.bian.classes;

public class SyndicateMembershipArrangementInvolvement {
    /**/
    private org.museframework.bian.enumerations.Syndicatemembershiparrangementinvolvementtypevalues syndicateMembershipArrangementInvolvementType;

    public void setSyndicateMembershipArrangementInvolvementType(org.museframework.bian.enumerations.Syndicatemembershiparrangementinvolvementtypevalues syndicateMembershipArrangementInvolvementType) {
        this.syndicateMembershipArrangementInvolvementType = syndicateMembershipArrangementInvolvementType;
    }

    public org.museframework.bian.enumerations.Syndicatemembershiparrangementinvolvementtypevalues getSyndicateMembershipArrangementInvolvementType() {
        return syndicateMembershipArrangementInvolvementType;
    }
}