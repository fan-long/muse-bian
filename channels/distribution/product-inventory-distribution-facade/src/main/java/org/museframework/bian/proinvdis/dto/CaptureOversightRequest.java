package org.museframework.bian.proinvdis.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class CaptureOversightRequest {
    @MetaField
    private String productinventorydistributionid;

    @MetaField
    private String oversightid;

    @MetaField(ref=true)
    private org.museframework.bian.proinvdis.dto.bq.Oversight oversight;

    public void setProductinventorydistributionid(String productinventorydistributionid) {
        this.productinventorydistributionid = productinventorydistributionid;
    }

    public String getProductinventorydistributionid() {
        return productinventorydistributionid;
    }

    public void setOversightid(String oversightid) {
        this.oversightid = oversightid;
    }

    public String getOversightid() {
        return oversightid;
    }

    public void setOversight(org.museframework.bian.proinvdis.dto.bq.Oversight oversight) {
        this.oversight = oversight;
    }

    public org.museframework.bian.proinvdis.dto.bq.Oversight getOversight() {
        return oversight;
    }
}