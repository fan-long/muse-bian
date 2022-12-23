package org.museframework.bian.serevehis.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class UpdateServicingFacilityRequest {
    @MetaField
    private String servicingeventhistoryid;

    @MetaField
    private String servicingfacilityid;

    @MetaField(ref=true)
    private org.museframework.bian.serevehis.dto.bq.ServicingFacility servicingFacility;

    public void setServicingeventhistoryid(String servicingeventhistoryid) {
        this.servicingeventhistoryid = servicingeventhistoryid;
    }

    public String getServicingeventhistoryid() {
        return servicingeventhistoryid;
    }

    public void setServicingfacilityid(String servicingfacilityid) {
        this.servicingfacilityid = servicingfacilityid;
    }

    public String getServicingfacilityid() {
        return servicingfacilityid;
    }

    public void setServicingFacility(org.museframework.bian.serevehis.dto.bq.ServicingFacility servicingFacility) {
        this.servicingFacility = servicingFacility;
    }

    public org.museframework.bian.serevehis.dto.bq.ServicingFacility getServicingFacility() {
        return servicingFacility;
    }
}