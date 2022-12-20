package org.museframework.bian.systemsadministration.dto;

public class CaptureConfigurationRequest {
    private String systemsadministrationid;

    private String configurationid;

    private org.museframework.bian.systemsadministration.dto.bq.Configuration configuration;

    public void setSystemsadministrationid(String systemsadministrationid) {
        this.systemsadministrationid = systemsadministrationid;
    }

    public String getSystemsadministrationid() {
        return systemsadministrationid;
    }

    public void setConfigurationid(String configurationid) {
        this.configurationid = configurationid;
    }

    public String getConfigurationid() {
        return configurationid;
    }

    public void setConfiguration(org.museframework.bian.systemsadministration.dto.bq.Configuration configuration) {
        this.configuration = configuration;
    }

    public org.museframework.bian.systemsadministration.dto.bq.Configuration getConfiguration() {
        return configuration;
    }
}