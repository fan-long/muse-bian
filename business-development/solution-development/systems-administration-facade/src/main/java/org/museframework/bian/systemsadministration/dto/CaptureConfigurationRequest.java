package org.museframework.bian.systemsadministration.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class CaptureConfigurationRequest {
    @MetaField
    private String systemsadministrationid;

    @MetaField
    private String configurationid;

    @MetaField(ref=true)
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