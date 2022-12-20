/*Operate equipment and/or a largely automated facility within ACH Fulfillment. */
package org.museframework.bian.achoperations.dto.cr;

public class ACHFulfillmentOperatingSession {
    /*Reference to the ACH service*/
    private org.museframework.bian.classes.Object ACHReference;

    /*Details the ACH service availability*/
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