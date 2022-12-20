/*A party represents an autonomous entity in which a bank has a business interest. It has a legal definition and identity. A party is a Person, Organization, (a proposed definition for BIAN BOM adapted from BIAN Party Working Group) 

- Entity involved in an activity. (ISO20022)*/
package org.museframework.bian.classes;

public class Party {
    /*Name by which a party is known and which is usually used to identify that party. (ISO20022)*/
    private String partyName;

    /*Specifies the type of party in different business contexts. (ISO20022)*/
    private org.museframework.bian.enumerations.Partytypevalues partyType;

    /**/
    private String partyDateTime;

    /**/
    private String partyIdentification;

    public void setPartyName(String partyName) {
        this.partyName = partyName;
    }

    public String getPartyName() {
        return partyName;
    }

    public void setPartyType(org.museframework.bian.enumerations.Partytypevalues partyType) {
        this.partyType = partyType;
    }

    public org.museframework.bian.enumerations.Partytypevalues getPartyType() {
        return partyType;
    }

    public void setPartyDateTime(String partyDateTime) {
        this.partyDateTime = partyDateTime;
    }

    public String getPartyDateTime() {
        return partyDateTime;
    }

    public void setPartyIdentification(String partyIdentification) {
        this.partyIdentification = partyIdentification;
    }

    public String getPartyIdentification() {
        return partyIdentification;
    }
}