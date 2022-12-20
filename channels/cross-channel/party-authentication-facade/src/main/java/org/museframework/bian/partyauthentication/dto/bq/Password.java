/*All kind of verifications 

Examples: Password verification*/
package org.museframework.bian.partyauthentication.dto.bq;

public class Password {
    /*Reference to a customer reference data item to be compared with submitted value*/
    private org.museframework.bian.classes.Object authenticationReferenceDataReference;

    /*Defines reference data item type submitted for comparison*/
    private String authenticationReferenceDataType;

    /*The customer provided value is matched to the bank's maintained value*/
    private org.museframework.bian.classes.Object authenticationReferenceDataValue;

    /*Reference to an issued password*/
    private org.museframework.bian.classes.Object authenticationPasswordReference;

    /*Defines allowed values/format for an issued password*/
    private String authenticationPasswordTemplate;

    /*The bank maintained value (can be customer provided or a bank generated value - encryption applies)*/
    private String authenticationPasswordStoredValue;

    /*The valid period for the stored password*/
    private String authenticationPasswordValidFromToDate;

    /*The customer provided value is matched to the bank's maintained value*/
    private String authenticationPasswordPresentedValue;

    /*The result of the reference data and password checks*/
    private String authenticationPasswordTestResult;

    public void setAuthenticationReferenceDataReference(org.museframework.bian.classes.Object authenticationReferenceDataReference) {
        this.authenticationReferenceDataReference = authenticationReferenceDataReference;
    }

    public org.museframework.bian.classes.Object getAuthenticationReferenceDataReference() {
        return authenticationReferenceDataReference;
    }

    public void setAuthenticationReferenceDataType(String authenticationReferenceDataType) {
        this.authenticationReferenceDataType = authenticationReferenceDataType;
    }

    public String getAuthenticationReferenceDataType() {
        return authenticationReferenceDataType;
    }

    public void setAuthenticationReferenceDataValue(org.museframework.bian.classes.Object authenticationReferenceDataValue) {
        this.authenticationReferenceDataValue = authenticationReferenceDataValue;
    }

    public org.museframework.bian.classes.Object getAuthenticationReferenceDataValue() {
        return authenticationReferenceDataValue;
    }

    public void setAuthenticationPasswordReference(org.museframework.bian.classes.Object authenticationPasswordReference) {
        this.authenticationPasswordReference = authenticationPasswordReference;
    }

    public org.museframework.bian.classes.Object getAuthenticationPasswordReference() {
        return authenticationPasswordReference;
    }

    public void setAuthenticationPasswordTemplate(String authenticationPasswordTemplate) {
        this.authenticationPasswordTemplate = authenticationPasswordTemplate;
    }

    public String getAuthenticationPasswordTemplate() {
        return authenticationPasswordTemplate;
    }

    public void setAuthenticationPasswordStoredValue(String authenticationPasswordStoredValue) {
        this.authenticationPasswordStoredValue = authenticationPasswordStoredValue;
    }

    public String getAuthenticationPasswordStoredValue() {
        return authenticationPasswordStoredValue;
    }

    public void setAuthenticationPasswordValidFromToDate(String authenticationPasswordValidFromToDate) {
        this.authenticationPasswordValidFromToDate = authenticationPasswordValidFromToDate;
    }

    public String getAuthenticationPasswordValidFromToDate() {
        return authenticationPasswordValidFromToDate;
    }

    public void setAuthenticationPasswordPresentedValue(String authenticationPasswordPresentedValue) {
        this.authenticationPasswordPresentedValue = authenticationPasswordPresentedValue;
    }

    public String getAuthenticationPasswordPresentedValue() {
        return authenticationPasswordPresentedValue;
    }

    public void setAuthenticationPasswordTestResult(String authenticationPasswordTestResult) {
        this.authenticationPasswordTestResult = authenticationPasswordTestResult;
    }

    public String getAuthenticationPasswordTestResult() {
        return authenticationPasswordTestResult;
    }
}