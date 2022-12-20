/*The product features/services available with a financical facility*/
package org.museframework.bian.corbanope.dto.bq;

public class CorrespondentBankOperationsOutcome {
    /**/
    private org.museframework.bian.classes.Event correspondentBankOperationsIncident;

    /**/
    private String correspondentBankOperationsProvision;

    public void setCorrespondentBankOperationsIncident(org.museframework.bian.classes.Event correspondentBankOperationsIncident) {
        this.correspondentBankOperationsIncident = correspondentBankOperationsIncident;
    }

    public org.museframework.bian.classes.Event getCorrespondentBankOperationsIncident() {
        return correspondentBankOperationsIncident;
    }

    public void setCorrespondentBankOperationsProvision(String correspondentBankOperationsProvision) {
        this.correspondentBankOperationsProvision = correspondentBankOperationsProvision;
    }

    public String getCorrespondentBankOperationsProvision() {
        return correspondentBankOperationsProvision;
    }
}