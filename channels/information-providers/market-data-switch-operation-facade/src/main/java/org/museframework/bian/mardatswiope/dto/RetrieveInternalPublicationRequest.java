package org.museframework.bian.mardatswiope.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class RetrieveInternalPublicationRequest {
    @MetaField
    private String marketdataswitchoperationid;

    @MetaField
    private String internalpublicationid;

    public void setMarketdataswitchoperationid(String marketdataswitchoperationid) {
        this.marketdataswitchoperationid = marketdataswitchoperationid;
    }

    public String getMarketdataswitchoperationid() {
        return marketdataswitchoperationid;
    }

    public void setInternalpublicationid(String internalpublicationid) {
        this.internalpublicationid = internalpublicationid;
    }

    public String getInternalpublicationid() {
        return internalpublicationid;
    }
}