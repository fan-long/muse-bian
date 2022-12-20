/*A profile of the products, services and channel access that the customer has in place.  

- It is a full overview on the access via which channels, the customer products and services are available.   */
package org.museframework.bian.classes;

public class CustomerAccessProfile {
    /**/
    private String customerAccessProfileIdentification;

    public void setCustomerAccessProfileIdentification(String customerAccessProfileIdentification) {
        this.customerAccessProfileIdentification = customerAccessProfileIdentification;
    }

    public String getCustomerAccessProfileIdentification() {
        return customerAccessProfileIdentification;
    }
}