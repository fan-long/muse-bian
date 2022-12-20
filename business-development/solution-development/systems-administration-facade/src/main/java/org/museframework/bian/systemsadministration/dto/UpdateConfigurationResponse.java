package org.museframework.bian.systemsadministration.dto;

public class UpdateConfigurationResponse {
    private org.museframework.bian.systemsadministration.dto.bq.Configuration configuration;

    public void setConfiguration(org.museframework.bian.systemsadministration.dto.bq.Configuration configuration) {
        this.configuration = configuration;
    }

    public org.museframework.bian.systemsadministration.dto.bq.Configuration getConfiguration() {
        return configuration;
    }
}