/**/
package org.museframework.bian.classes;

public class Party_PartyRelationship {
    /**/
    private org.museframework.bian.enumerations.Party_Partyrelationshiptypevalues relationshipType;

    /**/
    private Party fromParty;

    /**/
    private Party toParty;

    public void setRelationshipType(org.museframework.bian.enumerations.Party_Partyrelationshiptypevalues relationshipType) {
        this.relationshipType = relationshipType;
    }

    public org.museframework.bian.enumerations.Party_Partyrelationshiptypevalues getRelationshipType() {
        return relationshipType;
    }

    public void setFromParty(Party fromParty) {
        this.fromParty = fromParty;
    }

    public Party getFromParty() {
        return fromParty;
    }

    public void setToParty(Party toParty) {
        this.toParty = toParty;
    }

    public Party getToParty() {
        return toParty;
    }
}