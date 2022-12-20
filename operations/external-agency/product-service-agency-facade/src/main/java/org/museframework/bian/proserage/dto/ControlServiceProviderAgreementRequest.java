package org.museframework.bian.proserage.dto;

public class ControlServiceProviderAgreementRequest {
    private String productserviceagencyid;

    private org.museframework.bian.proserage.dto.cr.ServiceProviderAgreement serviceProviderAgreement;

    public void setProductserviceagencyid(String productserviceagencyid) {
        this.productserviceagencyid = productserviceagencyid;
    }

    public String getProductserviceagencyid() {
        return productserviceagencyid;
    }

    public void setServiceProviderAgreement(org.museframework.bian.proserage.dto.cr.ServiceProviderAgreement serviceProviderAgreement) {
        this.serviceProviderAgreement = serviceProviderAgreement;
    }

    public org.museframework.bian.proserage.dto.cr.ServiceProviderAgreement getServiceProviderAgreement() {
        return serviceProviderAgreement;
    }
}