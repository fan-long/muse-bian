package org.museframework.bian.assetsecuritization.dto;

public class RetrievePlacementRequest {
    private String assetsecuritizationid;

    private String placementid;

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
}