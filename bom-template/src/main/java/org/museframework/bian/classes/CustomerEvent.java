/*Event related to a specific Customer or Customer Relationship. */
package org.museframework.bian.classes;

public class CustomerEvent {
    /**/
    private String customerEventType;

    public void setCustomerEventType(String customerEventType) {
        this.customerEventType = customerEventType;
    }

    public String getCustomerEventType() {
        return customerEventType;
    }
}