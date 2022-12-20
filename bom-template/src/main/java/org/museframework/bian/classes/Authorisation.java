/*An evaluation whether a party or system is allowed to do something.

The consent given by a participant (or a third party acting on behalf of that participant) in order to transfer funds or securities. (ECB)*/
package org.museframework.bian.classes;

public class Authorisation {
    /**/
    private String authorisationDateTime;

    public void setAuthorisationDateTime(String authorisationDateTime) {
        this.authorisationDateTime = authorisationDateTime;
    }

    public String getAuthorisationDateTime() {
        return authorisationDateTime;
    }
}