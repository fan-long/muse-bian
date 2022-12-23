package org.museframework.bian.ecmanddcm.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class RetrieveProspectusResponse {
    @MetaField(ref=true)
    private org.museframework.bian.ecmanddcm.dto.bq.Prospectus prospectus;

    public void setProspectus(org.museframework.bian.ecmanddcm.dto.bq.Prospectus prospectus) {
        this.prospectus = prospectus;
    }

    public org.museframework.bian.ecmanddcm.dto.bq.Prospectus getProspectus() {
        return prospectus;
    }
}