/*All kind of verifications 

Examples: Password verification*/
package org.museframework.bian.partyauthentication.dto.bq;

public class Question {
    /*Reference to the selected secret question*/
    private org.museframework.bian.classes.Object authenticationSecretQuestionReference;

    /*Template includes the question text and provided customer response - given value is compared to the stored value*/
    private String authenticationSecretQuestionTemplate;

    /*This is the stored value, the provided value is compared to this*/
    private String authenticationSecretQuestionValue;

    /*The result of the secret question check*/
    private String secretQuestionTestResult;

    public void setAuthenticationSecretQuestionReference(org.museframework.bian.classes.Object authenticationSecretQuestionReference) {
        this.authenticationSecretQuestionReference = authenticationSecretQuestionReference;
    }

    public org.museframework.bian.classes.Object getAuthenticationSecretQuestionReference() {
        return authenticationSecretQuestionReference;
    }

    public void setAuthenticationSecretQuestionTemplate(String authenticationSecretQuestionTemplate) {
        this.authenticationSecretQuestionTemplate = authenticationSecretQuestionTemplate;
    }

    public String getAuthenticationSecretQuestionTemplate() {
        return authenticationSecretQuestionTemplate;
    }

    public void setAuthenticationSecretQuestionValue(String authenticationSecretQuestionValue) {
        this.authenticationSecretQuestionValue = authenticationSecretQuestionValue;
    }

    public String getAuthenticationSecretQuestionValue() {
        return authenticationSecretQuestionValue;
    }

    public void setSecretQuestionTestResult(String secretQuestionTestResult) {
        this.secretQuestionTestResult = secretQuestionTestResult;
    }

    public String getSecretQuestionTestResult() {
        return secretQuestionTestResult;
    }
}