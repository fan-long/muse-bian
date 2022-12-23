package org.museframework.bian.corporatetreasury.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class RetrieveLiquidityRequest {
    @MetaField
    private String corporatetreasuryid;

    @MetaField
    private String liquidityid;

    public void setCorporatetreasuryid(String corporatetreasuryid) {
        this.corporatetreasuryid = corporatetreasuryid;
    }

    public String getCorporatetreasuryid() {
        return corporatetreasuryid;
    }

    public void setLiquidityid(String liquidityid) {
        this.liquidityid = liquidityid;
    }

    public String getLiquidityid() {
        return liquidityid;
    }
}