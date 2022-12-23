package org.museframework.bian.ebranchmanagement.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class UpdateCapacityPlanningRequest {
    @MetaField
    private String ebranchmanagementid;

    @MetaField
    private String capacityplanningid;

    @MetaField(ref=true)
    private org.museframework.bian.ebranchmanagement.dto.bq.CapacityPlanning capacityPlanning;

    public void setEbranchmanagementid(String ebranchmanagementid) {
        this.ebranchmanagementid = ebranchmanagementid;
    }

    public String getEbranchmanagementid() {
        return ebranchmanagementid;
    }

    public void setCapacityplanningid(String capacityplanningid) {
        this.capacityplanningid = capacityplanningid;
    }

    public String getCapacityplanningid() {
        return capacityplanningid;
    }

    public void setCapacityPlanning(org.museframework.bian.ebranchmanagement.dto.bq.CapacityPlanning capacityPlanning) {
        this.capacityPlanning = capacityPlanning;
    }

    public org.museframework.bian.ebranchmanagement.dto.bq.CapacityPlanning getCapacityPlanning() {
        return capacityPlanning;
    }
}