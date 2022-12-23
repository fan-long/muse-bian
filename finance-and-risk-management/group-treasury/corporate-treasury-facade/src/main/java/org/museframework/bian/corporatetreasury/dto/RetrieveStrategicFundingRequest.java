package org.museframework.bian.corporatetreasury.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class RetrieveStrategicFundingRequest {
    @MetaField
    private String corporatetreasuryid;

    @MetaField
    private String strategicfundingid;

    public void setCorporatetreasuryid(String corporatetreasuryid) {
        this.corporatetreasuryid = corporatetreasuryid;
    }

    public String getCorporatetreasuryid() {
        return corporatetreasuryid;
    }

    public void setStrategicfundingid(String strategicfundingid) {
        this.strategicfundingid = strategicfundingid;
    }

    public String getStrategicfundingid() {
        return strategicfundingid;
    }
}