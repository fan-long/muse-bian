/*System providing access to a correspondent network

e.g. a Swift Gateway*/
package org.museframework.bian.classes;

public class CorrespondentAccessSystem {
    /*Identification of the correspondent service system
*/
    private String cirrespondentSystemIdentifier;

    public void setCirrespondentSystemIdentifier(String cirrespondentSystemIdentifier) {
        this.cirrespondentSystemIdentifier = cirrespondentSystemIdentifier;
    }

    public String getCirrespondentSystemIdentifier() {
        return cirrespondentSystemIdentifier;
    }
}