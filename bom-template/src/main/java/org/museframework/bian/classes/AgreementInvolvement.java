/*The involvement (role) of an instance of a party in an instance of an agreement.
*/
package org.museframework.bian.classes;

public class AgreementInvolvement {
    /*A characteristic of agreement which refers to its involved parties based on the type of involvement (depend on the type of agreement/product). For example, involved parties in Direct Debit Agreement are debtor, creditor, debtor bank, creditor bank, etc. Other example, if the type of agreement is too abstract like contractual agreement, involved parties are PrincipalParty, CounterParty, ThirdParty. */
    private org.museframework.bian.enumerations.Agreementinvolvementtypevalues agreementInvolvementType;

    /*The party that has the involvement in the agreement*/
    private Party partyReference;

    /*The Agreement in which the party is involved*/
    private Agreement agreementReference;

    public void setAgreementInvolvementType(org.museframework.bian.enumerations.Agreementinvolvementtypevalues agreementInvolvementType) {
        this.agreementInvolvementType = agreementInvolvementType;
    }

    public org.museframework.bian.enumerations.Agreementinvolvementtypevalues getAgreementInvolvementType() {
        return agreementInvolvementType;
    }

    public void setPartyReference(Party partyReference) {
        this.partyReference = partyReference;
    }

    public Party getPartyReference() {
        return partyReference;
    }

    public void setAgreementReference(Agreement agreementReference) {
        this.agreementReference = agreementReference;
    }

    public Agreement getAgreementReference() {
        return agreementReference;
    }
}