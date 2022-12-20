/*A PartyRole that is played by a party in a specific access arrangement. */
package org.museframework.bian.classes;

public class AccessArrangementInvolvement {
    /**/
    private String accessAgreementInvolvementIdentification;

    /**/
    private org.museframework.bian.enumerations.Accessarrangementinvolvementtypevalues accessAgreementInvolvementType;

    public void setAccessAgreementInvolvementIdentification(String accessAgreementInvolvementIdentification) {
        this.accessAgreementInvolvementIdentification = accessAgreementInvolvementIdentification;
    }

    public String getAccessAgreementInvolvementIdentification() {
        return accessAgreementInvolvementIdentification;
    }

    public void setAccessAgreementInvolvementType(org.museframework.bian.enumerations.Accessarrangementinvolvementtypevalues accessAgreementInvolvementType) {
        this.accessAgreementInvolvementType = accessAgreementInvolvementType;
    }

    public org.museframework.bian.enumerations.Accessarrangementinvolvementtypevalues getAccessAgreementInvolvementType() {
        return accessAgreementInvolvementType;
    }
}