package org.museframework.bian.corporatetreasury.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class RetrieveTacticalFundingRequest {
    @MetaField
    private String corporatetreasuryid;

    @MetaField
    private String tacticalfundingid;

    public void setCorporatetreasuryid(String corporatetreasuryid) {
        this.corporatetreasuryid = corporatetreasuryid;
    }

    public String getCorporatetreasuryid() {
        return corporatetreasuryid;
    }

    public void setTacticalfundingid(String tacticalfundingid) {
        this.tacticalfundingid = tacticalfundingid;
    }

    public String getTacticalfundingid() {
        return tacticalfundingid;
    }
}