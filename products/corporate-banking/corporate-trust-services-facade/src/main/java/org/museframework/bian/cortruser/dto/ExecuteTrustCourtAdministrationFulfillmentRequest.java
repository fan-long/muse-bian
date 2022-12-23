package org.museframework.bian.cortruser.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class ExecuteTrustCourtAdministrationFulfillmentRequest {
    @MetaField
    private String corporatetrustservicesid;

    @MetaField
    private String trustcourtadministrationfulfillmentid;

    @MetaField(ref=true)
    private org.museframework.bian.cortruser.dto.bq.TrustCourtAdministrationFulfillment trustCourtAdministrationFulfillment;

    public void setCorporatetrustservicesid(String corporatetrustservicesid) {
        this.corporatetrustservicesid = corporatetrustservicesid;
    }

    public String getCorporatetrustservicesid() {
        return corporatetrustservicesid;
    }

    public void setTrustcourtadministrationfulfillmentid(String trustcourtadministrationfulfillmentid) {
        this.trustcourtadministrationfulfillmentid = trustcourtadministrationfulfillmentid;
    }

    public String getTrustcourtadministrationfulfillmentid() {
        return trustcourtadministrationfulfillmentid;
    }

    public void setTrustCourtAdministrationFulfillment(org.museframework.bian.cortruser.dto.bq.TrustCourtAdministrationFulfillment trustCourtAdministrationFulfillment) {
        this.trustCourtAdministrationFulfillment = trustCourtAdministrationFulfillment;
    }

    public org.museframework.bian.cortruser.dto.bq.TrustCourtAdministrationFulfillment getTrustCourtAdministrationFulfillment() {
        return trustCourtAdministrationFulfillment;
    }
}