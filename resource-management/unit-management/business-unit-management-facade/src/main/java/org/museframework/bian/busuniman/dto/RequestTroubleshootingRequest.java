package org.museframework.bian.busuniman.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class RequestTroubleshootingRequest {
    @MetaField
    private String businessunitmanagementid;

    @MetaField
    private String troubleshootingid;

    @MetaField(ref=true)
    private org.museframework.bian.busuniman.dto.bq.Troubleshooting troubleshooting;

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

    public void setTroubleshooting(org.museframework.bian.busuniman.dto.bq.Troubleshooting troubleshooting) {
        this.troubleshooting = troubleshooting;
    }

    public org.museframework.bian.busuniman.dto.bq.Troubleshooting getTroubleshooting() {
        return troubleshooting;
    }
}