/*The product/service profile for a specific customer or customer relationship.*/
package org.museframework.bian.classes;

public class CustomerProductProfile {
    /*A Functional Classification Hierarchy that distinguishes between Customer Product Profiles according to the aspect that is profiled.
Example values are Product Eligibility, Product Usage, Product Coverage, Product Sale and etc. */
    private String customerProductProfileType;

    public void setCustomerProductProfileType(String customerProductProfileType) {
        this.customerProductProfileType = customerProductProfileType;
    }

    public String getCustomerProductProfileType() {
        return customerProductProfileType;
    }
}