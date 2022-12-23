package org.museframework.bian.leasing.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class UpdateSweepResponse {
    @MetaField(ref=true)
    private org.museframework.bian.leasing.dto.bq.Sweep sweep;

    public void setSweep(org.museframework.bian.leasing.dto.bq.Sweep sweep) {
        this.sweep = sweep;
    }

    public org.museframework.bian.leasing.dto.bq.Sweep getSweep() {
        return sweep;
    }
}