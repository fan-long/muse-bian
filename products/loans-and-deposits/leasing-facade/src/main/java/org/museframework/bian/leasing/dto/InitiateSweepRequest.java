package org.museframework.bian.leasing.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class InitiateSweepRequest {
    @MetaField
    private String leasingid;

    @MetaField
    private String sweepid;

    @MetaField(ref=true)
    private org.museframework.bian.leasing.dto.bq.Sweep sweep;

    public void setLeasingid(String leasingid) {
        this.leasingid = leasingid;
    }

    public String getLeasingid() {
        return leasingid;
    }

    public void setSweepid(String sweepid) {
        this.sweepid = sweepid;
    }

    public String getSweepid() {
        return sweepid;
    }

    public void setSweep(org.museframework.bian.leasing.dto.bq.Sweep sweep) {
        this.sweep = sweep;
    }

    public org.museframework.bian.leasing.dto.bq.Sweep getSweep() {
        return sweep;
    }
}