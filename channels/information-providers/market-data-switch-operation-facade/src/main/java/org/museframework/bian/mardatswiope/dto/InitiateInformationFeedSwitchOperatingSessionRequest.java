package org.museframework.bian.mardatswiope.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class InitiateInformationFeedSwitchOperatingSessionRequest {
    @MetaField(ref=true)
    private org.museframework.bian.mardatswiope.dto.cr.InformationFeedSwitchOperatingSession informationFeedSwitchOperatingSession;

    public void setInformationFeedSwitchOperatingSession(org.museframework.bian.mardatswiope.dto.cr.InformationFeedSwitchOperatingSession informationFeedSwitchOperatingSession) {
        this.informationFeedSwitchOperatingSession = informationFeedSwitchOperatingSession;
    }

    public org.museframework.bian.mardatswiope.dto.cr.InformationFeedSwitchOperatingSession getInformationFeedSwitchOperatingSession() {
        return informationFeedSwitchOperatingSession;
    }
}