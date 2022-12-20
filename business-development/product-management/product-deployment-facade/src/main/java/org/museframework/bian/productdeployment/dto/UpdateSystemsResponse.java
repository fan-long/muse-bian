package org.museframework.bian.productdeployment.dto;

public class UpdateSystemsResponse {
    private org.museframework.bian.productdeployment.dto.bq.Systems systems;

    public void setSystems(org.museframework.bian.productdeployment.dto.bq.Systems systems) {
        this.systems = systems;
    }

    public org.museframework.bian.productdeployment.dto.bq.Systems getSystems() {
        return systems;
    }
}