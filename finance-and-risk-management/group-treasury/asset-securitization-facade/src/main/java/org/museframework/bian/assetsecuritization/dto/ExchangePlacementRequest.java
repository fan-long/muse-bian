package org.museframework.bian.assetsecuritization.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class ExchangePlacementRequest {
    @MetaField
    private String assetsecuritizationid;

    @MetaField
    private String placementid;

    @MetaField(ref=true)
    private org.museframework.bian.assetsecuritization.dto.bq.Placement placement;

    public void setAssetsecuritizationid(String assetsecuritizationid) {
        this.assetsecuritizationid = assetsecuritizationid;
    }

    public String getAssetsecuritizationid() {
        return assetsecuritizationid;
    }

    public void setPlacementid(String placementid) {
        this.placementid = placementid;
    }

    public String getPlacementid() {
        return placementid;
    }

    public void setPlacement(org.museframework.bian.assetsecuritization.dto.bq.Placement placement) {
        this.placement = placement;
    }

    public org.museframework.bian.assetsecuritization.dto.bq.Placement getPlacement() {
        return placement;
    }
}