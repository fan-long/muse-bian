/*To test or assess an entity, possibly against some formal qualification or certification requirement within Party Authentication. */
package org.museframework.bian.partyauthentication.dto.cr;

public class PartyAuthenticationAssessment {
    /*Reference to the customer as the authentication subject*/
    private org.museframework.bian.classes.Object customerReference;

    /*Reference to the party or legal entity as the authentication subject*/
    private org.museframework.bian.classes.Object partyReference;

    /*Details the types of authentication assessments that are combined into the overall evaluation*/
    private String partyAuthenticationAssessmentProfile;

    /*Reference to the different types of authentication assessment*/
    private String authenticationType;

    /*The combination of the different assessment results used in the authentication determination*/
    private String partyAuthenticationConsolidationRecord;

    /*The required value and value returned as a result of the authentication task, defining the level of identity assurance achieved - valid for the duration of the current contact*/
    private String customerContactAuthenticationLevel;

    public void setCustomerReference(org.museframework.bian.classes.Object customerReference) {
        this.customerReference = customerReference;
    }

    public org.museframework.bian.classes.Object getCustomerReference() {
        return customerReference;
    }

    public void setPartyReference(org.museframework.bian.classes.Object partyReference) {
        this.partyReference = partyReference;
    }

    public org.museframework.bian.classes.Object getPartyReference() {
        return partyReference;
    }

    public void setPartyAuthenticationAssessmentProfile(String partyAuthenticationAssessmentProfile) {
        this.partyAuthenticationAssessmentProfile = partyAuthenticationAssessmentProfile;
    }

    public String getPartyAuthenticationAssessmentProfile() {
        return partyAuthenticationAssessmentProfile;
    }

    public void setAuthenticationType(String authenticationType) {
        this.authenticationType = authenticationType;
    }

    public String getAuthenticationType() {
        return authenticationType;
    }

    public void setPartyAuthenticationConsolidationRecord(String partyAuthenticationConsolidationRecord) {
        this.partyAuthenticationConsolidationRecord = partyAuthenticationConsolidationRecord;
    }

    public String getPartyAuthenticationConsolidationRecord() {
        return partyAuthenticationConsolidationRecord;
    }

    public void setCustomerContactAuthenticationLevel(String customerContactAuthenticationLevel) {
        this.customerContactAuthenticationLevel = customerContactAuthenticationLevel;
    }

    public String getCustomerContactAuthenticationLevel() {
        return customerContactAuthenticationLevel;
    }
}