/*The collection of operational serivces/functions offered by the operational facility

Examples: messages, capture, routines*/
package org.museframework.bian.poiofser.dto.bq;

public class Interaction {
    /*Reference to a customer contact session interaction log for the customer contacts handled at the position*/
    private org.museframework.bian.classes.Object customerSessionDialogueReference;

    public void setCustomerSessionDialogueReference(org.museframework.bian.classes.Object customerSessionDialogueReference) {
        this.customerSessionDialogueReference = customerSessionDialogueReference;
    }

    public org.museframework.bian.classes.Object getCustomerSessionDialogueReference() {
        return customerSessionDialogueReference;
    }
}