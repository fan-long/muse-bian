package org.museframework.bian.marordexe.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class RequestPositionRequest {
    @MetaField
    private String marketorderexecutionid;

    @MetaField
    private String positionid;

    @MetaField(ref=true)
    private org.museframework.bian.marordexe.dto.bq.Position position;

    public void setMarketorderexecutionid(String marketorderexecutionid) {
        this.marketorderexecutionid = marketorderexecutionid;
    }

    public String getMarketorderexecutionid() {
        return marketorderexecutionid;
    }

    public void setPositionid(String positionid) {
        this.positionid = positionid;
    }

    public String getPositionid() {
        return positionid;
    }

    public void setPosition(org.museframework.bian.marordexe.dto.bq.Position position) {
        this.position = position;
    }

    public org.museframework.bian.marordexe.dto.bq.Position getPosition() {
        return position;
    }
}