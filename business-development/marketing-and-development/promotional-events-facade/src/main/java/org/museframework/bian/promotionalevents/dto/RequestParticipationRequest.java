package org.museframework.bian.promotionalevents.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class RequestParticipationRequest {
    @MetaField
    private String promotionaleventsid;

    @MetaField
    private String participationid;

    @MetaField(ref=true)
    private org.museframework.bian.promotionalevents.dto.bq.Participation participation;

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

    public void setParticipation(org.museframework.bian.promotionalevents.dto.bq.Participation participation) {
        this.participation = participation;
    }

    public org.museframework.bian.promotionalevents.dto.bq.Participation getParticipation() {
        return participation;
    }
}