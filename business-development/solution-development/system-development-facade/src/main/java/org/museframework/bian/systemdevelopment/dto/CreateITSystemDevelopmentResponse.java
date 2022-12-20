package org.museframework.bian.systemdevelopment.dto;

public class CreateITSystemDevelopmentResponse {
    private org.museframework.bian.systemdevelopment.dto.cr.ITSystemDevelopment iTSystemDevelopment;

    public void setiTSystemDevelopment(org.museframework.bian.systemdevelopment.dto.cr.ITSystemDevelopment iTSystemDevelopment) {
        this.iTSystemDevelopment = iTSystemDevelopment;
    }

    public org.museframework.bian.systemdevelopment.dto.cr.ITSystemDevelopment getiTSystemDevelopment() {
        return iTSystemDevelopment;
    }
}