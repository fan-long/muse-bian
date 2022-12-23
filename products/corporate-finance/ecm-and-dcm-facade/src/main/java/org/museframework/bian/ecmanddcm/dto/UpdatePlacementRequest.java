package org.museframework.bian.ecmanddcm.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class UpdatePlacementRequest {
    @MetaField
    private String ecmanddcmid;

    @MetaField
    private String placementid;

    @MetaField(ref=true)
    private org.museframework.bian.ecmanddcm.dto.bq.Placement placement;

    public void setEcmanddcmid(String ecmanddcmid) {
        this.ecmanddcmid = ecmanddcmid;
    }

    public String getEcmanddcmid() {
        return ecmanddcmid;
    }

    public void setPlacementid(String placementid) {
        this.placementid = placementid;
    }

    public String getPlacementid() {
        return placementid;
    }

    public void setPlacement(org.museframework.bian.ecmanddcm.dto.bq.Placement placement) {
        this.placement = placement;
    }

    public org.museframework.bian.ecmanddcm.dto.bq.Placement getPlacement() {
        return placement;
    }
}