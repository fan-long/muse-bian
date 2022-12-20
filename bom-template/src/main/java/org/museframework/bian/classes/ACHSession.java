/**/
package org.museframework.bian.classes;

public class ACHSession {
    /*An identifier that allows to uniquely refer to an instance of an ACH Session.*/
    private String ACHSessionIdentifier;

    public void setACHSessionIdentifier(String ACHSessionIdentifier) {
        this.ACHSessionIdentifier = ACHSessionIdentifier;
    }

    public String getACHSessionIdentifier() {
        return ACHSessionIdentifier;
    }
}