package org.museframework.bian.cusaccent.dto;

public class RequestCustomerAccessProfileAgreementRequest {
    private String customeraccessentitlementid;

    private org.museframework.bian.cusaccent.dto.cr.CustomerAccessProfileAgreement customerAccessProfileAgreement;

    public void setCustomeraccessentitlementid(String customeraccessentitlementid) {
        this.customeraccessentitlementid = customeraccessentitlementid;
    }

    public String getCustomeraccessentitlementid() {
        return customeraccessentitlementid;
    }

    public void setCustomerAccessProfileAgreement(org.museframework.bian.cusaccent.dto.cr.CustomerAccessProfileAgreement customerAccessProfileAgreement) {
        this.customerAccessProfileAgreement = customerAccessProfileAgreement;
    }

    public org.museframework.bian.cusaccent.dto.cr.CustomerAccessProfileAgreement getCustomerAccessProfileAgreement() {
        return customerAccessProfileAgreement;
    }
}