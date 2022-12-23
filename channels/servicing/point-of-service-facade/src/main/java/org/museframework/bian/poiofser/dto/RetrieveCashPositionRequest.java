package org.museframework.bian.poiofser.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class RetrieveCashPositionRequest {
    @MetaField
    private String pointofserviceid;

    @MetaField
    private String cashpositionid;

    public void setPointofserviceid(String pointofserviceid) {
        this.pointofserviceid = pointofserviceid;
    }

    public String getPointofserviceid() {
        return pointofserviceid;
    }

    public void setCashpositionid(String cashpositionid) {
        this.cashpositionid = cashpositionid;
    }

    public String getCashpositionid() {
        return cashpositionid;
    }
}