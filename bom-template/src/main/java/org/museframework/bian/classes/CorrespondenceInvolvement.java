/*A specific role which is played by a specific party in the correspondence.*/
package org.museframework.bian.classes;

public class CorrespondenceInvolvement {
    /**/
    private String correspondenceInvolvementType;

    public void setCorrespondenceInvolvementType(String correspondenceInvolvementType) {
        this.correspondenceInvolvementType = correspondenceInvolvementType;
    }

    public String getCorrespondenceInvolvementType() {
        return correspondenceInvolvementType;
    }
}