/*The Card Transaction Event is one of the specific types of events that is recorded in the Card Transaction Event*/
package org.museframework.bian.crecarposkee.dto.bq;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto
public class CreditCardPositionKeepingOutcome {
    /**/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Event creditCardPositionKeepingIncident;

    /**/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Log creditCardPositionKeepingLog;

    public void setCreditCardPositionKeepingIncident(org.museframework.bian.classes.Event creditCardPositionKeepingIncident) {
        this.creditCardPositionKeepingIncident = creditCardPositionKeepingIncident;
    }

    public org.museframework.bian.classes.Event getCreditCardPositionKeepingIncident() {
        return creditCardPositionKeepingIncident;
    }

    public void setCreditCardPositionKeepingLog(org.museframework.bian.classes.Log creditCardPositionKeepingLog) {
        this.creditCardPositionKeepingLog = creditCardPositionKeepingLog;
    }

    public org.museframework.bian.classes.Log getCreditCardPositionKeepingLog() {
        return creditCardPositionKeepingLog;
    }
}