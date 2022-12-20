package org.museframework.bian.locdatman.dto;

public class UpdateLocationResponse {
    private org.museframework.bian.locdatman.dto.bq.Location location;

    public void setLocation(org.museframework.bian.locdatman.dto.bq.Location location) {
        this.location = location;
    }

    public org.museframework.bian.locdatman.dto.bq.Location getLocation() {
        return location;
    }
}