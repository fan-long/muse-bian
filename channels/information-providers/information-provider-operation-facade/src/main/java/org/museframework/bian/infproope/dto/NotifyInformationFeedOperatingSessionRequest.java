package org.museframework.bian.infproope.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class NotifyInformationFeedOperatingSessionRequest {
    @MetaField
    private String informationprovideroperationid;

    public void setInformationprovideroperationid(String informationprovideroperationid) {
        this.informationprovideroperationid = informationprovideroperationid;
    }

    public String getInformationprovideroperationid() {
        return informationprovideroperationid;
    }
}