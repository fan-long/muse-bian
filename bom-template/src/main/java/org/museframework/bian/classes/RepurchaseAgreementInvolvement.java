/*Role played by a party in the Repurchase Agreement*/
package org.museframework.bian.classes;

public class RepurchaseAgreementInvolvement {
    /**/
    private org.museframework.bian.enumerations.Repurchaseagreementinvolvementtypevalues repurchaseAgreementInvolvementType;

    public void setRepurchaseAgreementInvolvementType(org.museframework.bian.enumerations.Repurchaseagreementinvolvementtypevalues repurchaseAgreementInvolvementType) {
        this.repurchaseAgreementInvolvementType = repurchaseAgreementInvolvementType;
    }

    public org.museframework.bian.enumerations.Repurchaseagreementinvolvementtypevalues getRepurchaseAgreementInvolvementType() {
        return repurchaseAgreementInvolvementType;
    }
}