/*Reference to the terms in force for a specific customer for this service provider*/
package org.museframework.bian.servicingmandate.dto.bq;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto
public class CustomerMandate {
    /*Reference to the individual customer be accessed through the servicing order*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object customerReference;

    /*Details the specific customer access allowed under the mandate*/
    @MetaField(0)
    private String servicingMandateAgreementCustomerProductandServiceProfile;

    /*A type of product or service covered by the mandate*/
    @MetaField(0)
    private String productandServiceType;

    /*Defines if and under what terms a product/service can be accessed for this customer under the mandate*/
    @MetaField(0)
    private String servicingMandateAgreementCustomerProductandServiceTypeAccess;

    /*Records the usage of products/service under the mandate for control purposes*/
    @MetaField(0)
    private String servicingMandateAgreementCustomerProductandServiceTypeUsage;

    public void setCustomerReference(org.museframework.bian.classes.Object customerReference) {
        this.customerReference = customerReference;
    }

    public org.museframework.bian.classes.Object getCustomerReference() {
        return customerReference;
    }

    public void setServicingMandateAgreementCustomerProductandServiceProfile(String servicingMandateAgreementCustomerProductandServiceProfile) {
        this.servicingMandateAgreementCustomerProductandServiceProfile = servicingMandateAgreementCustomerProductandServiceProfile;
    }

    public String getServicingMandateAgreementCustomerProductandServiceProfile() {
        return servicingMandateAgreementCustomerProductandServiceProfile;
    }

    public void setProductandServiceType(String productandServiceType) {
        this.productandServiceType = productandServiceType;
    }

    public String getProductandServiceType() {
        return productandServiceType;
    }

    public void setServicingMandateAgreementCustomerProductandServiceTypeAccess(String servicingMandateAgreementCustomerProductandServiceTypeAccess) {
        this.servicingMandateAgreementCustomerProductandServiceTypeAccess = servicingMandateAgreementCustomerProductandServiceTypeAccess;
    }

    public String getServicingMandateAgreementCustomerProductandServiceTypeAccess() {
        return servicingMandateAgreementCustomerProductandServiceTypeAccess;
    }

    public void setServicingMandateAgreementCustomerProductandServiceTypeUsage(String servicingMandateAgreementCustomerProductandServiceTypeUsage) {
        this.servicingMandateAgreementCustomerProductandServiceTypeUsage = servicingMandateAgreementCustomerProductandServiceTypeUsage;
    }

    public String getServicingMandateAgreementCustomerProductandServiceTypeUsage() {
        return servicingMandateAgreementCustomerProductandServiceTypeUsage;
    }
}