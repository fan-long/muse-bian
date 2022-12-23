package org.museframework.bian.advvoiserman.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class UpdateTroubleshootingRequest {
    @MetaField
    private String advancedvoiceservicesmanagementid;

    @MetaField
    private String troubleshootingid;

    @MetaField(ref=true)
    private org.museframework.bian.advvoiserman.dto.bq.Troubleshooting troubleshooting;

    public void setAdvancedvoiceservicesmanagementid(String advancedvoiceservicesmanagementid) {
        this.advancedvoiceservicesmanagementid = advancedvoiceservicesmanagementid;
    }

    public String getAdvancedvoiceservicesmanagementid() {
        return advancedvoiceservicesmanagementid;
    }

    public void setTroubleshootingid(String troubleshootingid) {
        this.troubleshootingid = troubleshootingid;
    }

    public String getTroubleshootingid() {
        return troubleshootingid;
    }

    public void setTroubleshooting(org.museframework.bian.advvoiserman.dto.bq.Troubleshooting troubleshooting) {
        this.troubleshooting = troubleshooting;
    }

    public org.museframework.bian.advvoiserman.dto.bq.Troubleshooting getTroubleshooting() {
        return troubleshooting;
    }
}