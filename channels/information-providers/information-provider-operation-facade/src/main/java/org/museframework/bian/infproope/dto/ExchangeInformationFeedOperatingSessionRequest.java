package org.museframework.bian.infproope.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class ExchangeInformationFeedOperatingSessionRequest {
    @MetaField
    private String informationprovideroperationid;

    @MetaField(ref=true)
    private org.museframework.bian.infproope.dto.cr.InformationFeedOperatingSession informationFeedOperatingSession;

    public void setInformationprovideroperationid(String informationprovideroperationid) {
        this.informationprovideroperationid = informationprovideroperationid;
    }

    public String getInformationprovideroperationid() {
        return informationprovideroperationid;
    }

    public void setInformationFeedOperatingSession(org.museframework.bian.infproope.dto.cr.InformationFeedOperatingSession informationFeedOperatingSession) {
        this.informationFeedOperatingSession = informationFeedOperatingSession;
    }

    public org.museframework.bian.infproope.dto.cr.InformationFeedOperatingSession getInformationFeedOperatingSession() {
        return informationFeedOperatingSession;
    }
}