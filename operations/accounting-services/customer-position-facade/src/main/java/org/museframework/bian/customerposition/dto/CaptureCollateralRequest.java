package org.museframework.bian.customerposition.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class CaptureCollateralRequest {
    @MetaField
    private String customerpositionid;

    @MetaField
    private String collateralid;

    @MetaField(ref=true)
    private org.museframework.bian.customerposition.dto.bq.Collateral collateral;

    public void setCustomerpositionid(String customerpositionid) {
        this.customerpositionid = customerpositionid;
    }

    public String getCustomerpositionid() {
        return customerpositionid;
    }

    public void setCollateralid(String collateralid) {
        this.collateralid = collateralid;
    }

    public String getCollateralid() {
        return collateralid;
    }

    public void setCollateral(org.museframework.bian.customerposition.dto.bq.Collateral collateral) {
        this.collateral = collateral;
    }

    public org.museframework.bian.customerposition.dto.bq.Collateral getCollateral() {
        return collateral;
    }
}