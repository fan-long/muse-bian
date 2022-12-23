package org.museframework.bian.busuniman.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class RetrieveTroubleshootingRequest {
    @MetaField
    private String businessunitmanagementid;

    @MetaField
    private String troubleshootingid;

    public void setBusinessunitmanagementid(String businessunitmanagementid) {
        this.businessunitmanagementid = businessunitmanagementid;
    }

    public String getBusinessunitmanagementid() {
        return businessunitmanagementid;
    }

    public void setTroubleshootingid(String troubleshootingid) {
        this.troubleshootingid = troubleshootingid;
    }

    public String getTroubleshootingid() {
        return troubleshootingid;
    }
}