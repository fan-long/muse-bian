/*Monitor and define the status/rating of some entity within Customer Profile. */
package org.museframework.bian.parroupro.dto.cr;

public class PartyState extends org.museframework.bian.classes.PartyState {
    /*Reference to the customer for the profile*/
    private org.museframework.bian.classes.Object customerReference;

    public void setCustomerReference(org.museframework.bian.classes.Object customerReference) {
        this.customerReference = customerReference;
    }

    public org.museframework.bian.classes.Object getCustomerReference() {
        return customerReference;
    }
}