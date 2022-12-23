package org.museframework.bian.proserage.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class GrantServiceProviderAgreementRequest {
    @MetaField
    private String productserviceagencyid;

    @MetaField(ref=true)
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