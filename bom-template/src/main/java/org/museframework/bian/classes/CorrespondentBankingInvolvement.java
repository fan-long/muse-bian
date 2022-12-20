/*Party who plays a specific role in the correspondent banking agreement. */
package org.museframework.bian.classes;

public class CorrespondentBankingInvolvement {
    /**/
    private org.museframework.bian.enumerations.Correspondentbankinginvolvementtypevalues correspondentBankingInvolvementType;

    public void setCorrespondentBankingInvolvementType(org.museframework.bian.enumerations.Correspondentbankinginvolvementtypevalues correspondentBankingInvolvementType) {
        this.correspondentBankingInvolvementType = correspondentBankingInvolvementType;
    }

    public org.museframework.bian.enumerations.Correspondentbankinginvolvementtypevalues getCorrespondentBankingInvolvementType() {
        return correspondentBankingInvolvementType;
    }
}