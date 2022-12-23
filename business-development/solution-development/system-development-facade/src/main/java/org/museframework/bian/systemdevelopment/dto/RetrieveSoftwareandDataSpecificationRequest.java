package org.museframework.bian.systemdevelopment.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class RetrieveSoftwareandDataSpecificationRequest {
    @MetaField
    private String systemdevelopmentid;

    @MetaField
    private String softwareanddataspecificationid;

    public void setSystemdevelopmentid(String systemdevelopmentid) {
        this.systemdevelopmentid = systemdevelopmentid;
    }

    public String getSystemdevelopmentid() {
        return systemdevelopmentid;
    }

    public void setSoftwareanddataspecificationid(String softwareanddataspecificationid) {
        this.softwareanddataspecificationid = softwareanddataspecificationid;
    }

    public String getSoftwareanddataspecificationid() {
        return softwareanddataspecificationid;
    }
}