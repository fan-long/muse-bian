package org.museframework.bian.leasing.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class UpdateCollateralRequest {
    @MetaField
    private String leasingid;

    @MetaField
    private String collateralid;

    @MetaField(ref=true)
    private org.museframework.bian.leasing.dto.bq.Collateral collateral;

    public void setLeasingid(String leasingid) {
        this.leasingid = leasingid;
    }

    public String getLeasingid() {
        return leasingid;
    }

    public void setCollateralid(String collateralid) {
        this.collateralid = collateralid;
    }

    public String getCollateralid() {
        return collateralid;
    }

    public void setCollateral(org.museframework.bian.leasing.dto.bq.Collateral collateral) {
        this.collateral = collateral;
    }

    public org.museframework.bian.leasing.dto.bq.Collateral getCollateral() {
        return collateral;
    }
}