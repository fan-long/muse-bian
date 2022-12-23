package org.museframework.bian.cencashan.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class ExchangeProjectionandAllocationRequest {
    @MetaField
    private String centralcashhandlingid;

    @MetaField
    private String projectionandallocationid;

    @MetaField(ref=true)
    private org.museframework.bian.cencashan.dto.bq.ProjectionandAllocation projectionandAllocation;

    public void setCentralcashhandlingid(String centralcashhandlingid) {
        this.centralcashhandlingid = centralcashhandlingid;
    }

    public String getCentralcashhandlingid() {
        return centralcashhandlingid;
    }

    public void setProjectionandallocationid(String projectionandallocationid) {
        this.projectionandallocationid = projectionandallocationid;
    }

    public String getProjectionandallocationid() {
        return projectionandallocationid;
    }

    public void setProjectionandAllocation(org.museframework.bian.cencashan.dto.bq.ProjectionandAllocation projectionandAllocation) {
        this.projectionandAllocation = projectionandAllocation;
    }

    public org.museframework.bian.cencashan.dto.bq.ProjectionandAllocation getProjectionandAllocation() {
        return projectionandAllocation;
    }
}