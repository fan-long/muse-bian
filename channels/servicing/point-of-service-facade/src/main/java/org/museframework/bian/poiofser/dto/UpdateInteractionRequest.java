package org.museframework.bian.poiofser.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class UpdateInteractionRequest {
    @MetaField
    private String pointofserviceid;

    @MetaField
    private String interactionid;

    @MetaField(ref=true)
    private org.museframework.bian.poiofser.dto.bq.Interaction interaction;

    public void setPointofserviceid(String pointofserviceid) {
        this.pointofserviceid = pointofserviceid;
    }

    public String getPointofserviceid() {
        return pointofserviceid;
    }

    public void setInteractionid(String interactionid) {
        this.interactionid = interactionid;
    }

    public String getInteractionid() {
        return interactionid;
    }

    public void setInteraction(org.museframework.bian.poiofser.dto.bq.Interaction interaction) {
        this.interaction = interaction;
    }

    public org.museframework.bian.poiofser.dto.bq.Interaction getInteraction() {
        return interaction;
    }
}