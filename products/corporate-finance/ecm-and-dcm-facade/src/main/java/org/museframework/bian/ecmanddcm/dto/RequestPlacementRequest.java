package org.museframework.bian.ecmanddcm.dto;

public class RequestPlacementRequest {
    private String ecmanddcmid;

    private String placementid;

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