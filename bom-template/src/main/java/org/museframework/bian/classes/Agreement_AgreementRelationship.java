/*A characteristic of agreement which refers to its related agreements. */
package org.museframework.bian.classes;

public class Agreement_AgreementRelationship {
    /**/
    private org.museframework.bian.enumerations.Agreement_Agreementrelationshiptypevalues agreement_AgreementRelationshipType;

    /**/
    private Agreement fromAgreement;

    /**/
    private Agreement toAgreement;

    public void setAgreement_AgreementRelationshipType(org.museframework.bian.enumerations.Agreement_Agreementrelationshiptypevalues agreement_AgreementRelationshipType) {
        this.agreement_AgreementRelationshipType = agreement_AgreementRelationshipType;
    }

    public org.museframework.bian.enumerations.Agreement_Agreementrelationshiptypevalues getAgreement_AgreementRelationshipType() {
        return agreement_AgreementRelationshipType;
    }

    public void setFromAgreement(Agreement fromAgreement) {
        this.fromAgreement = fromAgreement;
    }

    public Agreement getFromAgreement() {
        return fromAgreement;
    }

    public void setToAgreement(Agreement toAgreement) {
        this.toAgreement = toAgreement;
    }

    public Agreement getToAgreement() {
        return toAgreement;
    }
}