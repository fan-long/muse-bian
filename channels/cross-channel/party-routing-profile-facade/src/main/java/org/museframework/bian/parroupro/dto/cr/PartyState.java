/*Monitor and define the status/rating of some entity within Customer Profile. */
package org.museframework.bian.parroupro.dto.cr;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

//refer to BOClass org.museframework.bian.classes.PartyState
@MetaDto
public class PartyState {
    /*Reference to the customer for the profile*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object customerReference;

    public void setCustomerReference(org.museframework.bian.classes.Object customerReference) {
        this.customerReference = customerReference;
    }

    public org.museframework.bian.classes.Object getCustomerReference() {
        return customerReference;
    }
}