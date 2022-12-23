package org.museframework.bian.creditfacility.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class RequestMaintenanceRequest {
    @MetaField
    private String creditfacilityid;

    @MetaField
    private String maintenanceid;

    @MetaField(ref=true)
    private org.museframework.bian.creditfacility.dto.bq.Maintenance maintenance;

    public void setCreditfacilityid(String creditfacilityid) {
        this.creditfacilityid = creditfacilityid;
    }

    public String getCreditfacilityid() {
        return creditfacilityid;
    }

    public void setMaintenanceid(String maintenanceid) {
        this.maintenanceid = maintenanceid;
    }

    public String getMaintenanceid() {
        return maintenanceid;
    }

    public void setMaintenance(org.museframework.bian.creditfacility.dto.bq.Maintenance maintenance) {
        this.maintenance = maintenance;
    }

    public org.museframework.bian.creditfacility.dto.bq.Maintenance getMaintenance() {
        return maintenance;
    }
}