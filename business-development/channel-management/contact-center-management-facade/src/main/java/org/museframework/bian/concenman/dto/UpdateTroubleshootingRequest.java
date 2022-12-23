package org.museframework.bian.concenman.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class UpdateTroubleshootingRequest {
    @MetaField
    private String contactcentermanagementid;

    @MetaField
    private String troubleshootingid;

    @MetaField(ref=true)
    private org.museframework.bian.concenman.dto.bq.Troubleshooting troubleshooting;

    public void setContactcentermanagementid(String contactcentermanagementid) {
        this.contactcentermanagementid = contactcentermanagementid;
    }

    public String getContactcentermanagementid() {
        return contactcentermanagementid;
    }

    public void setTroubleshootingid(String troubleshootingid) {
        this.troubleshootingid = troubleshootingid;
    }

    public String getTroubleshootingid() {
        return troubleshootingid;
    }

    public void setTroubleshooting(org.museframework.bian.concenman.dto.bq.Troubleshooting troubleshooting) {
        this.troubleshooting = troubleshooting;
    }

    public org.museframework.bian.concenman.dto.bq.Troubleshooting getTroubleshooting() {
        return troubleshooting;
    }
}