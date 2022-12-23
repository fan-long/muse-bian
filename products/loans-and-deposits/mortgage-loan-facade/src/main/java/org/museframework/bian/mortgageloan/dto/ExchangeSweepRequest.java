package org.museframework.bian.mortgageloan.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class ExchangeSweepRequest {
    @MetaField
    private String mortgageloanid;

    @MetaField
    private String sweepid;

    @MetaField(ref=true)
    private org.museframework.bian.mortgageloan.dto.bq.Sweep sweep;

    public void setMortgageloanid(String mortgageloanid) {
        this.mortgageloanid = mortgageloanid;
    }

    public String getMortgageloanid() {
        return mortgageloanid;
    }

    public void setSweepid(String sweepid) {
        this.sweepid = sweepid;
    }

    public String getSweepid() {
        return sweepid;
    }

    public void setSweep(org.museframework.bian.mortgageloan.dto.bq.Sweep sweep) {
        this.sweep = sweep;
    }

    public org.museframework.bian.mortgageloan.dto.bq.Sweep getSweep() {
        return sweep;
    }
}