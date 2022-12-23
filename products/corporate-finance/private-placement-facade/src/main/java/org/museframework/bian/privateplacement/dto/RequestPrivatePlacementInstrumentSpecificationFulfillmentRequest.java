package org.museframework.bian.privateplacement.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class RequestPrivatePlacementInstrumentSpecificationFulfillmentRequest {
    @MetaField
    private String privateplacementid;

    @MetaField
    private String privateplacementinstrumentspecificationfulfillmentid;

    @MetaField(ref=true)
    private org.museframework.bian.privateplacement.dto.bq.PrivatePlacementInstrumentSpecificationFulfillment privatePlacementInstrumentSpecificationFulfillment;

    public void setPrivateplacementid(String privateplacementid) {
        this.privateplacementid = privateplacementid;
    }

    public String getPrivateplacementid() {
        return privateplacementid;
    }

    public void setPrivateplacementinstrumentspecificationfulfillmentid(String privateplacementinstrumentspecificationfulfillmentid) {
        this.privateplacementinstrumentspecificationfulfillmentid = privateplacementinstrumentspecificationfulfillmentid;
    }

    public String getPrivateplacementinstrumentspecificationfulfillmentid() {
        return privateplacementinstrumentspecificationfulfillmentid;
    }

    public void setPrivatePlacementInstrumentSpecificationFulfillment(org.museframework.bian.privateplacement.dto.bq.PrivatePlacementInstrumentSpecificationFulfillment privatePlacementInstrumentSpecificationFulfillment) {
        this.privatePlacementInstrumentSpecificationFulfillment = privatePlacementInstrumentSpecificationFulfillment;
    }

    public org.museframework.bian.privateplacement.dto.bq.PrivatePlacementInstrumentSpecificationFulfillment getPrivatePlacementInstrumentSpecificationFulfillment() {
        return privatePlacementInstrumentSpecificationFulfillment;
    }
}