/*Role that is played by a specific party in a specific bank relationship*/
package org.museframework.bian.classes;

public class BankRelationshipInvolvement {
    /**/
    private org.museframework.bian.enumerations.Bankrelationshipinvolvementtypevalues bankRelationshipInvolvementType;

    public void setBankRelationshipInvolvementType(org.museframework.bian.enumerations.Bankrelationshipinvolvementtypevalues bankRelationshipInvolvementType) {
        this.bankRelationshipInvolvementType = bankRelationshipInvolvementType;
    }

    public org.museframework.bian.enumerations.Bankrelationshipinvolvementtypevalues getBankRelationshipInvolvementType() {
        return bankRelationshipInvolvementType;
    }
}