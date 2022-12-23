/**/
package org.museframework.bian.cusproandsereli.dto.cr;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto
public class CustomerEligibilityAssessment {
    /*Reference to the associated customer (can currently be a person or a company)*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object customerReference;

    /*This is the is the eligibility profile including in-force product terms*/
    @MetaField
    private String customerProductandServiceProfile;

    /*Defines the product/service type - note: the profile will reference all available products/services*/
    @MetaField
    private String productandServiceType;

    /*Defines if and under what terms a product/service is available to this customer - this detail is maintained by the service domain and referenced by this evaluation*/
    @MetaField
    private String customerProductandServiceTypeEligibility;

    /*Records the sold/in-force status of a product/service with the customer. Again this detail is maintained by the service domain and referenced by this evaluation*/
    @MetaField
    private String customerProductandServiceTypeUsage;

    /*The date time of the assessment*/
    @MetaField
    private String date;

    public void setCustomerReference(org.museframework.bian.classes.Object customerReference) {
        this.customerReference = customerReference;
    }

    public org.museframework.bian.classes.Object getCustomerReference() {
        return customerReference;
    }

    public void setCustomerProductandServiceProfile(String customerProductandServiceProfile) {
        this.customerProductandServiceProfile = customerProductandServiceProfile;
    }

    public String getCustomerProductandServiceProfile() {
        return customerProductandServiceProfile;
    }

    public void setProductandServiceType(String productandServiceType) {
        this.productandServiceType = productandServiceType;
    }

    public String getProductandServiceType() {
        return productandServiceType;
    }

    public void setCustomerProductandServiceTypeEligibility(String customerProductandServiceTypeEligibility) {
        this.customerProductandServiceTypeEligibility = customerProductandServiceTypeEligibility;
    }

    public String getCustomerProductandServiceTypeEligibility() {
        return customerProductandServiceTypeEligibility;
    }

    public void setCustomerProductandServiceTypeUsage(String customerProductandServiceTypeUsage) {
        this.customerProductandServiceTypeUsage = customerProductandServiceTypeUsage;
    }

    public String getCustomerProductandServiceTypeUsage() {
        return customerProductandServiceTypeUsage;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getDate() {
        return date;
    }
}