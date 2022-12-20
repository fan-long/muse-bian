/*Monitor and define the status/rating of some entity within Customer Position. */
package org.museframework.bian.customerposition.dto.cr;

public class CustomerPositionState extends org.museframework.bian.classes.CustomerPositionState {
    /*Reference to the customer that the consolidated financial position represents*/
    private org.museframework.bian.classes.Object customerReference;

    /*The consolidated position state that is tracked for the customer - combines analysis from all  measures*/
    private String customerPositionStateRecord;

    public void setCustomerReference(org.museframework.bian.classes.Object customerReference) {
        this.customerReference = customerReference;
    }

    public org.museframework.bian.classes.Object getCustomerReference() {
        return customerReference;
    }

    public void setCustomerPositionStateRecord(String customerPositionStateRecord) {
        this.customerPositionStateRecord = customerPositionStateRecord;
    }

    public String getCustomerPositionStateRecord() {
        return customerPositionStateRecord;
    }
}