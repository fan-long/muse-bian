package org.museframework.bian.trustservices.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class NotifyTrustEstate_InheritanceandIncomeTaxFulfillmentRequest {
    @MetaField
    private String trustservicesid;

    @MetaField
    private String trustestate_inheritanceandincometaxfulfillmentid;

    public void setTrustservicesid(String trustservicesid) {
        this.trustservicesid = trustservicesid;
    }

    public String getTrustservicesid() {
        return trustservicesid;
    }

    public void setTrustestate_inheritanceandincometaxfulfillmentid(String trustestate_inheritanceandincometaxfulfillmentid) {
        this.trustestate_inheritanceandincometaxfulfillmentid = trustestate_inheritanceandincometaxfulfillmentid;
    }

    public String getTrustestate_inheritanceandincometaxfulfillmentid() {
        return trustestate_inheritanceandincometaxfulfillmentid;
    }
}