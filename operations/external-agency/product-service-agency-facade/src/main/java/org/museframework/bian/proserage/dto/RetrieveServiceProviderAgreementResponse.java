package org.museframework.bian.proserage.dto;

public class RetrieveServiceProviderAgreementResponse {
    private org.museframework.bian.proserage.dto.cr.ServiceProviderAgreement serviceProviderAgreement;

    public void setServiceProviderAgreement(org.museframework.bian.proserage.dto.cr.ServiceProviderAgreement serviceProviderAgreement) {
        this.serviceProviderAgreement = serviceProviderAgreement;
    }

    public org.museframework.bian.proserage.dto.cr.ServiceProviderAgreement getServiceProviderAgreement() {
        return serviceProviderAgreement;
    }
}