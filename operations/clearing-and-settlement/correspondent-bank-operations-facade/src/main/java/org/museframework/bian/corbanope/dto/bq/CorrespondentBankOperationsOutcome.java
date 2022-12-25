/*The product features/services available with a financical facility*/
package org.museframework.bian.corbanope.dto.bq;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto
public class CorrespondentBankOperationsOutcome {
    /**/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Event correspondentBankOperationsIncident;

    /**/
    @MetaField(0)
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