package org.museframework.bian.brandmanagement.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class RetrieveTroubleshootingRequest {
    @MetaField
    private String brandmanagementid;

    @MetaField
    private String troubleshootingid;

    public void setBrandmanagementid(String brandmanagementid) {
        this.brandmanagementid = brandmanagementid;
    }

    public String getBrandmanagementid() {
        return brandmanagementid;
    }

    public void setTroubleshootingid(String troubleshootingid) {
        this.troubleshootingid = troubleshootingid;
    }

    public String getTroubleshootingid() {
        return troubleshootingid;
    }
}