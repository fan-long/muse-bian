package org.museframework.bian.locdatman.dto;

public class UpdateOccupancyResponse {
    private org.museframework.bian.locdatman.dto.bq.Occupancy occupancy;

    public void setOccupancy(org.museframework.bian.locdatman.dto.bq.Occupancy occupancy) {
        this.occupancy = occupancy;
    }

    public org.museframework.bian.locdatman.dto.bq.Occupancy getOccupancy() {
        return occupancy;
    }
}