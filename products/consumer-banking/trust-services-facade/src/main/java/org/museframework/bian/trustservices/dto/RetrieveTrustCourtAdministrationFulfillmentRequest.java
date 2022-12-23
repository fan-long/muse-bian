package org.museframework.bian.trustservices.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class RetrieveTrustCourtAdministrationFulfillmentRequest {
    @MetaField
    private String trustservicesid;

    @MetaField
    private String trustcourtadministrationfulfillmentid;

    public void setTrustservicesid(String trustservicesid) {
        this.trustservicesid = trustservicesid;
    }

    public String getTrustservicesid() {
        return trustservicesid;
    }

    public void setTrustcourtadministrationfulfillmentid(String trustcourtadministrationfulfillmentid) {
        this.trustcourtadministrationfulfillmentid = trustcourtadministrationfulfillmentid;
    }

    public String getTrustcourtadministrationfulfillmentid() {
        return trustcourtadministrationfulfillmentid;
    }
}