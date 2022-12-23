package org.museframework.bian.colassadm.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class RetrieveValuationRequest {
    @MetaField
    private String collateralassetadministrationid;

    @MetaField
    private String valuationid;

    public void setCollateralassetadministrationid(String collateralassetadministrationid) {
        this.collateralassetadministrationid = collateralassetadministrationid;
    }

    public String getCollateralassetadministrationid() {
        return collateralassetadministrationid;
    }

    public void setValuationid(String valuationid) {
        this.valuationid = valuationid;
    }

    public String getValuationid() {
        return valuationid;
    }
}