/*All kind of verifications 

Examples: Password verification*/
package org.museframework.bian.partyauthentication.dto.bq;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto
public class Behavior {
    /*The type of behavioral record being used for authentication*/
    @MetaField(0)
    private String authenticationBehaviorType;

    /*The behavioral record submitted for authentication*/
    @MetaField(0)
    private String authenticationBehaviorRecord;

    /*Reference to the registered customer behavioral record*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object registeredBehaviorInstanceReference;

    /*The result of the behavioral check*/
    @MetaField(0)
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