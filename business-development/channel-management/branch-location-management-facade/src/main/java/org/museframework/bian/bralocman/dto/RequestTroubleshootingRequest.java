package org.museframework.bian.bralocman.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class RequestTroubleshootingRequest {
    @MetaField
    private String branchlocationmanagementid;

    @MetaField
    private String troubleshootingid;

    @MetaField(ref=true)
    private org.museframework.bian.bralocman.dto.bq.Troubleshooting troubleshooting;

    public void setBranchlocationmanagementid(String branchlocationmanagementid) {
        this.branchlocationmanagementid = branchlocationmanagementid;
    }

    public String getBranchlocationmanagementid() {
        return branchlocationmanagementid;
    }

    public void setTroubleshootingid(String troubleshootingid) {
        this.troubleshootingid = troubleshootingid;
    }

    public String getTroubleshootingid() {
        return troubleshootingid;
    }

    public void setTroubleshooting(org.museframework.bian.bralocman.dto.bq.Troubleshooting troubleshooting) {
        this.troubleshooting = troubleshooting;
    }

    public org.museframework.bian.bralocman.dto.bq.Troubleshooting getTroubleshooting() {
        return troubleshooting;
    }
}