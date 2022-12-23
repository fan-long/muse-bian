package org.museframework.bian.serevehis.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class RetrieveServicingFacilityRequest {
    @MetaField
    private String servicingeventhistoryid;

    @MetaField
    private String servicingfacilityid;

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
}