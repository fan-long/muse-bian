/*All kind of verifications 

Examples: Password verification*/
package org.museframework.bian.partyauthentication.dto.bq;

public class Behavior {
    /*The type of behavioral record being used for authentication*/
    private String authenticationBehaviorType;

    /*The behavioral record submitted for authentication*/
    private String authenticationBehaviorRecord;

    /*Reference to the registered customer behavioral record*/
    private org.museframework.bian.classes.Object registeredBehaviorInstanceReference;

    /*The result of the behavioral check*/
    private String behaviorTestResult;

    public void setAuthenticationBehaviorType(String authenticationBehaviorType) {
        this.authenticationBehaviorType = authenticationBehaviorType;
    }

    public String getAuthenticationBehaviorType() {
        return authenticationBehaviorType;
    }

    public void setAuthenticationBehaviorRecord(String authenticationBehaviorRecord) {
        this.authenticationBehaviorRecord = authenticationBehaviorRecord;
    }

    public String getAuthenticationBehaviorRecord() {
        return authenticationBehaviorRecord;
    }

    public void setRegisteredBehaviorInstanceReference(org.museframework.bian.classes.Object registeredBehaviorInstanceReference) {
        this.registeredBehaviorInstanceReference = registeredBehaviorInstanceReference;
    }

    public org.museframework.bian.classes.Object getRegisteredBehaviorInstanceReference() {
        return registeredBehaviorInstanceReference;
    }

    public void setBehaviorTestResult(String behaviorTestResult) {
        this.behaviorTestResult = behaviorTestResult;
    }

    public String getBehaviorTestResult() {
        return behaviorTestResult;
    }
}