/*An arrangement within the agreed syndicate charter and operating agreement to perform syndicate membership and compliance
*/
package org.museframework.bian.classes;

public class SyndicateMembershipArrangement {
    /**/
    private org.museframework.bian.enumerations.Syndicatemembershiparrangementtypevalues syndicateMembershipArrangementType;

    public void setSyndicateMembershipArrangementType(org.museframework.bian.enumerations.Syndicatemembershiparrangementtypevalues syndicateMembershipArrangementType) {
        this.syndicateMembershipArrangementType = syndicateMembershipArrangementType;
    }

    public org.museframework.bian.enumerations.Syndicatemembershiparrangementtypevalues getSyndicateMembershipArrangementType() {
        return syndicateMembershipArrangementType;
    }
}