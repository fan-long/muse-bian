package org.museframework.bian.advvoiserman.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class UpdateCapacityPlanningRequest {
    @MetaField
    private String advancedvoiceservicesmanagementid;

    @MetaField
    private String capacityplanningid;

    @MetaField(ref=true)
    private org.museframework.bian.advvoiserman.dto.bq.CapacityPlanning capacityPlanning;

    public void setAdvancedvoiceservicesmanagementid(String advancedvoiceservicesmanagementid) {
        this.advancedvoiceservicesmanagementid = advancedvoiceservicesmanagementid;
    }

    public String getAdvancedvoiceservicesmanagementid() {
        return advancedvoiceservicesmanagementid;
    }

    public void setCapacityplanningid(String capacityplanningid) {
        this.capacityplanningid = capacityplanningid;
    }

    public String getCapacityplanningid() {
        return capacityplanningid;
    }

    public void setCapacityPlanning(org.museframework.bian.advvoiserman.dto.bq.CapacityPlanning capacityPlanning) {
        this.capacityPlanning = capacityPlanning;
    }

    public org.museframework.bian.advvoiserman.dto.bq.CapacityPlanning getCapacityPlanning() {
        return capacityPlanning;
    }
}