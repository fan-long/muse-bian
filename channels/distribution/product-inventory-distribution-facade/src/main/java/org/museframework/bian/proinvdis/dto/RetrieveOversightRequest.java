package org.museframework.bian.proinvdis.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class RetrieveOversightRequest {
    @MetaField
    private String productinventorydistributionid;

    @MetaField
    private String oversightid;

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
}