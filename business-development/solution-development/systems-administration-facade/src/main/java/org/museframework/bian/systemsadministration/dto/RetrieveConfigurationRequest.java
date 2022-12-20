package org.museframework.bian.systemsadministration.dto;

public class RetrieveConfigurationRequest {
    private String systemsadministrationid;

    private String configurationid;

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
}