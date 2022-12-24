/*Monitor and define the status/rating of some entity within Customer Position. */
package org.museframework.bian.customerposition.dto.cr;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

//refer to BOClass org.museframework.bian.classes.CustomerPositionState
@MetaDto
public class CustomerPositionState {
    /*Reference to the customer that the consolidated financial position represents*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object customerReference;

    /*The consolidated position state that is tracked for the customer - combines analysis from all  measures*/
    @MetaField
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