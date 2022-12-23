package org.museframework.bian.cencashan.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class RetrieveProjectionandAllocationRequest {
    @MetaField
    private String centralcashhandlingid;

    @MetaField
    private String projectionandallocationid;

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
}