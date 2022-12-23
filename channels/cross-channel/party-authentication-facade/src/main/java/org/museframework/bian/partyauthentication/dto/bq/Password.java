/*All kind of verifications 

Examples: Password verification*/
package org.museframework.bian.partyauthentication.dto.bq;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto
public class Password {
    /*Reference to a customer reference data item to be compared with submitted value*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object authenticationReferenceDataReference;

    /*Defines reference data item type submitted for comparison*/
    @MetaField
    private String authenticationReferenceDataType;

    /*The customer provided value is matched to the bank's maintained value*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object authenticationReferenceDataValue;

    /*Reference to an issued password*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object authenticationPasswordReference;

    /*Defines allowed values/format for an issued password*/
    @MetaField
    private String authenticationPasswordTemplate;

    /*The bank maintained value (can be customer provided or a bank generated value - encryption applies)*/
    @MetaField
    private String authenticationPasswordStoredValue;

    /*The valid period for the stored password*/
    @MetaField
    private String authenticationPasswordValidFromToDate;

    /*The customer provided value is matched to the bank's maintained value*/
    @MetaField
    private String authenticationPasswordPresentedValue;

    /*The result of the reference data and password checks*/
    @MetaField
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