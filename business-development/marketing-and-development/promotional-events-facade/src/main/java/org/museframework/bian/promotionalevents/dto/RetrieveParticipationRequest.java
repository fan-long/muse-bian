package org.museframework.bian.promotionalevents.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class RetrieveParticipationRequest {
    @MetaField
    private String promotionaleventsid;

    @MetaField
    private String participationid;

    public void setPromotionaleventsid(String promotionaleventsid) {
        this.promotionaleventsid = promotionaleventsid;
    }

    public String getPromotionaleventsid() {
        return promotionaleventsid;
    }

    public void setParticipationid(String participationid) {
        this.participationid = participationid;
    }

    public String getParticipationid() {
        return participationid;
    }
}