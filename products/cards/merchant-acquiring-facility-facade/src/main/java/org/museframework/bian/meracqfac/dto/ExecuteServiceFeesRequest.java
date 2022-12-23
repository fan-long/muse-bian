package org.museframework.bian.meracqfac.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class ExecuteServiceFeesRequest {
    @MetaField
    private String merchantacquiringfacilityid;

    @MetaField
    private String servicefeesid;

    @MetaField(ref=true)
    private org.museframework.bian.meracqfac.dto.bq.ServiceFees serviceFees;

    public void setMerchantacquiringfacilityid(String merchantacquiringfacilityid) {
        this.merchantacquiringfacilityid = merchantacquiringfacilityid;
    }

    public String getMerchantacquiringfacilityid() {
        return merchantacquiringfacilityid;
    }

    public void setServicefeesid(String servicefeesid) {
        this.servicefeesid = servicefeesid;
    }

    public String getServicefeesid() {
        return servicefeesid;
    }

    public void setServiceFees(org.museframework.bian.meracqfac.dto.bq.ServiceFees serviceFees) {
        this.serviceFees = serviceFees;
    }

    public org.museframework.bian.meracqfac.dto.bq.ServiceFees getServiceFees() {
        return serviceFees;
    }
}