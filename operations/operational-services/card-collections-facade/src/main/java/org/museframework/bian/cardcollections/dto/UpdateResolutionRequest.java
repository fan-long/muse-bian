package org.museframework.bian.cardcollections.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class UpdateResolutionRequest {
    @MetaField
    private String cardcollectionsid;

    @MetaField
    private String resolutionid;

    @MetaField(ref=true)
    private org.museframework.bian.cardcollections.dto.bq.Resolution resolution;

    public void setCardcollectionsid(String cardcollectionsid) {
        this.cardcollectionsid = cardcollectionsid;
    }

    public String getCardcollectionsid() {
        return cardcollectionsid;
    }

    public void setResolutionid(String resolutionid) {
        this.resolutionid = resolutionid;
    }

    public String getResolutionid() {
        return resolutionid;
    }

    public void setResolution(org.museframework.bian.cardcollections.dto.bq.Resolution resolution) {
        this.resolution = resolution;
    }

    public org.museframework.bian.cardcollections.dto.bq.Resolution getResolution() {
        return resolution;
    }
}