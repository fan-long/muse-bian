/*The main worsteps to be followed in th eexecution of the procedure

Examples: Invoice generation*/
package org.museframework.bian.sessiondialogue.dto.bq;

public class Authentication extends org.museframework.bian.classes.Authentication {
    /*The target level of authentication required*/
    private String requiredAuthenticationLevel;

    /*The result of the authentication request (the request is handles by Contact Handler  and Party Authentication service domains*/
    private String authenticationTaskResult;

    public void setRequiredAuthenticationLevel(String requiredAuthenticationLevel) {
        this.requiredAuthenticationLevel = requiredAuthenticationLevel;
    }

    public String getRequiredAuthenticationLevel() {
        return requiredAuthenticationLevel;
    }

    public void setAuthenticationTaskResult(String authenticationTaskResult) {
        this.authenticationTaskResult = authenticationTaskResult;
    }

    public String getAuthenticationTaskResult() {
        return authenticationTaskResult;
    }
}