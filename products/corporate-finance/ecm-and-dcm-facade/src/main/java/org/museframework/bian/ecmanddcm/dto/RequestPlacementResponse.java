package org.museframework.bian.ecmanddcm.dto;

public class RequestPlacementResponse {
    private org.museframework.bian.ecmanddcm.dto.bq.Placement placement;

    public void setPlacement(org.museframework.bian.ecmanddcm.dto.bq.Placement placement) {
        this.placement = placement;
    }

    public org.museframework.bian.ecmanddcm.dto.bq.Placement getPlacement() {
        return placement;
    }
}