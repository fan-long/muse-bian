package org.museframework.bian.mardatswiope.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class UpdateInformationFeedSwitchOperatingSessionRequest {
    @MetaField
    private String marketdataswitchoperationid;

    @MetaField(ref=true)
    private org.museframework.bian.mardatswiope.dto.cr.InformationFeedSwitchOperatingSession informationFeedSwitchOperatingSession;

    public void setMarketdataswitchoperationid(String marketdataswitchoperationid) {
        this.marketdataswitchoperationid = marketdataswitchoperationid;
    }

    public String getMarketdataswitchoperationid() {
        return marketdataswitchoperationid;
    }

    public void setInformationFeedSwitchOperatingSession(org.museframework.bian.mardatswiope.dto.cr.InformationFeedSwitchOperatingSession informationFeedSwitchOperatingSession) {
        this.informationFeedSwitchOperatingSession = informationFeedSwitchOperatingSession;
    }

    public org.museframework.bian.mardatswiope.dto.cr.InformationFeedSwitchOperatingSession getInformationFeedSwitchOperatingSession() {
        return informationFeedSwitchOperatingSession;
    }
}