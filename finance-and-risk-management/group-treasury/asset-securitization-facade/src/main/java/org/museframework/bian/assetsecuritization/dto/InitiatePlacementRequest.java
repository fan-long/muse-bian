package org.museframework.bian.assetsecuritization.dto;

public class InitiatePlacementRequest {
    private String assetsecuritizationid;

    private String placementid;

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