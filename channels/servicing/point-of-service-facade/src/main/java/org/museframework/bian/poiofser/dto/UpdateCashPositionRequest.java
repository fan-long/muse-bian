package org.museframework.bian.poiofser.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class UpdateCashPositionRequest {
    @MetaField
    private String pointofserviceid;

    @MetaField
    private String cashpositionid;

    @MetaField(ref=true)
    private org.museframework.bian.poiofser.dto.bq.CashPosition cashPosition;

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

    public void setCashPosition(org.museframework.bian.poiofser.dto.bq.CashPosition cashPosition) {
        this.cashPosition = cashPosition;
    }

    public org.museframework.bian.poiofser.dto.bq.CashPosition getCashPosition() {
        return cashPosition;
    }
}