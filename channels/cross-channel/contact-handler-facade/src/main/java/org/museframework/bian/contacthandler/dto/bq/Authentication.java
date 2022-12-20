/*The collection of operational serivces/functions offered by the operational facility

Examples: messages, capture, routines*/
package org.museframework.bian.contacthandler.dto.bq;

public class Authentication extends org.museframework.bian.classes.Authentication {
    /*The task updates the contact record authentication status field and handles the interaction with the Party Authentication service domain to get the required level of authentication for the contact*/
    private String authenticationTaskRecord;

    public void setAuthenticationTaskRecord(String authenticationTaskRecord) {
        this.authenticationTaskRecord = authenticationTaskRecord;
    }

    public String getAuthenticationTaskRecord() {
        return authenticationTaskRecord;
    }
}