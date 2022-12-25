/*Operate equipment and/or a largely automated facility within ACH Fulfillment. */
package org.museframework.bian.achoperations.dto.cr;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto
public class ACHFulfillmentOperatingSession {
    /*Reference to the ACH service*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object ACHReference;

    /*Details the ACH service availability*/
    @MetaField(0)
    private String ACHAccessSchedule;

    public void setACHReference(org.museframework.bian.classes.Object ACHReference) {
        this.ACHReference = ACHReference;
    }

    public org.museframework.bian.classes.Object getACHReference() {
        return ACHReference;
    }

    public void setACHAccessSchedule(String ACHAccessSchedule) {
        this.ACHAccessSchedule = ACHAccessSchedule;
    }

    public String getACHAccessSchedule() {
        return ACHAccessSchedule;
    }
}