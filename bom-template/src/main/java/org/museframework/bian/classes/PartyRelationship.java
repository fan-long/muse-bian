/*A relationship between two or more parties; the parties involved are specified in terms of the roles they play in the relationship.

A Party Relationship is a connection between an instance of a Party and two or more instances of associated objects in the relationship.*/
package org.museframework.bian.classes;

public class PartyRelationship {
    /**/
    private String relationshipType;

    /**/
    private String relationshipValidityPeriod;

    /**/
    private String relationshipStartDate;

    /**/
    private String relationshipEndDate;

    /**/
    private String relationshipLifecycleStatus;

    /**/
    private Agreement associatedAgreement;

    public void setRelationshipType(String relationshipType) {
        this.relationshipType = relationshipType;
    }

    public String getRelationshipType() {
        return relationshipType;
    }

    public void setRelationshipValidityPeriod(String relationshipValidityPeriod) {
        this.relationshipValidityPeriod = relationshipValidityPeriod;
    }

    public String getRelationshipValidityPeriod() {
        return relationshipValidityPeriod;
    }

    public void setRelationshipStartDate(String relationshipStartDate) {
        this.relationshipStartDate = relationshipStartDate;
    }

    public String getRelationshipStartDate() {
        return relationshipStartDate;
    }

    public void setRelationshipEndDate(String relationshipEndDate) {
        this.relationshipEndDate = relationshipEndDate;
    }

    public String getRelationshipEndDate() {
        return relationshipEndDate;
    }

    public void setRelationshipLifecycleStatus(String relationshipLifecycleStatus) {
        this.relationshipLifecycleStatus = relationshipLifecycleStatus;
    }

    public String getRelationshipLifecycleStatus() {
        return relationshipLifecycleStatus;
    }

    public void setAssociatedAgreement(Agreement associatedAgreement) {
        this.associatedAgreement = associatedAgreement;
    }

    public Agreement getAssociatedAgreement() {
        return associatedAgreement;
    }
}