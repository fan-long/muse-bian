package org.museframework.bian.trustservices.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class ExchangeCorporateTrustServicesFacilityRequest {
    @MetaField
    private String trustservicesid;

    @MetaField(ref=true)
    private org.museframework.bian.trustservices.dto.cr.CorporateTrustServicesFacility corporateTrustServicesFacility;

    public void setTrustservicesid(String trustservicesid) {
        this.trustservicesid = trustservicesid;
    }

    public String getTrustservicesid() {
        return trustservicesid;
    }

    public void setCorporateTrustServicesFacility(org.museframework.bian.trustservices.dto.cr.CorporateTrustServicesFacility corporateTrustServicesFacility) {
        this.corporateTrustServicesFacility = corporateTrustServicesFacility;
    }

    public org.museframework.bian.trustservices.dto.cr.CorporateTrustServicesFacility getCorporateTrustServicesFacility() {
        return corporateTrustServicesFacility;
    }
}