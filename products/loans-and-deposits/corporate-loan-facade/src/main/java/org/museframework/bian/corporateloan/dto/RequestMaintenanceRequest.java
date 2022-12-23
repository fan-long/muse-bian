package org.museframework.bian.corporateloan.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class RequestMaintenanceRequest {
    @MetaField
    private String corporateloanid;

    @MetaField
    private String maintenanceid;

    @MetaField(ref=true)
    private org.museframework.bian.corporateloan.dto.bq.Maintenance maintenance;

    public void setCorporateloanid(String corporateloanid) {
        this.corporateloanid = corporateloanid;
    }

    public String getCorporateloanid() {
        return corporateloanid;
    }

    public void setMaintenanceid(String maintenanceid) {
        this.maintenanceid = maintenanceid;
    }

    public String getMaintenanceid() {
        return maintenanceid;
    }

    public void setMaintenance(org.museframework.bian.corporateloan.dto.bq.Maintenance maintenance) {
        this.maintenance = maintenance;
    }

    public org.museframework.bian.corporateloan.dto.bq.Maintenance getMaintenance() {
        return maintenance;
    }
}