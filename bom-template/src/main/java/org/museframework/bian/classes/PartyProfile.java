/*A set of information giving a description of a person or organization.*/
package org.museframework.bian.classes;

public class PartyProfile {
    /**/
    private org.museframework.bian.enumerations.Partyprofiletypevalues partyProfileType;

    /*Status of an identity check to prevent money laundering. This includes the counter-terrorism check. (ISO20022)*/
    private String moneyLaunderingCheck;

    /**/
    private String creditRating;

    /*Specifies the customers money laundering risk. (ISO20022)*/
    private String riskLevel;

    /*Specifies the type of due diligence checks carried out on a party. */
    private String dueDiligenceCheck;

    /*Indicates the main sources of the money. (ISO20022)*/
    private String sourceOfWealth;

    /**/
    private Party partyReference;

    /**/
    private Profile profileReference;

    public void setPartyProfileType(org.museframework.bian.enumerations.Partyprofiletypevalues partyProfileType) {
        this.partyProfileType = partyProfileType;
    }

    public org.museframework.bian.enumerations.Partyprofiletypevalues getPartyProfileType() {
        return partyProfileType;
    }

    public void setMoneyLaunderingCheck(String moneyLaunderingCheck) {
        this.moneyLaunderingCheck = moneyLaunderingCheck;
    }

    public String getMoneyLaunderingCheck() {
        return moneyLaunderingCheck;
    }

    public void setCreditRating(String creditRating) {
        this.creditRating = creditRating;
    }

    public String getCreditRating() {
        return creditRating;
    }

    public void setRiskLevel(String riskLevel) {
        this.riskLevel = riskLevel;
    }

    public String getRiskLevel() {
        return riskLevel;
    }

    public void setDueDiligenceCheck(String dueDiligenceCheck) {
        this.dueDiligenceCheck = dueDiligenceCheck;
    }

    public String getDueDiligenceCheck() {
        return dueDiligenceCheck;
    }

    public void setSourceOfWealth(String sourceOfWealth) {
        this.sourceOfWealth = sourceOfWealth;
    }

    public String getSourceOfWealth() {
        return sourceOfWealth;
    }

    public void setPartyReference(Party partyReference) {
        this.partyReference = partyReference;
    }

    public Party getPartyReference() {
        return partyReference;
    }

    public void setProfileReference(Profile profileReference) {
        this.profileReference = profileReference;
    }

    public Profile getProfileReference() {
        return profileReference;
    }
}