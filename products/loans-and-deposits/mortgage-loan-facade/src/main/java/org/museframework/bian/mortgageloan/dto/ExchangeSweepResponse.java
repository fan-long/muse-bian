package org.museframework.bian.mortgageloan.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class ExchangeSweepResponse {
    @MetaField(ref=true)
    private org.museframework.bian.mortgageloan.dto.bq.Sweep sweep;

    public void setSweep(org.museframework.bian.mortgageloan.dto.bq.Sweep sweep) {
        this.sweep = sweep;
    }

    public org.museframework.bian.mortgageloan.dto.bq.Sweep getSweep() {
        return sweep;
    }
}