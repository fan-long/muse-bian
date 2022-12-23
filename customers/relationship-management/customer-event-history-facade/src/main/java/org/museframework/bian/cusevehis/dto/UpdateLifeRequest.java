package org.museframework.bian.cusevehis.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class UpdateLifeRequest {
    @MetaField
    private String customereventhistoryid;

    @MetaField
    private String lifeid;

    @MetaField(ref=true)
    private org.museframework.bian.cusevehis.dto.bq.Life life;

    public void setCustomereventhistoryid(String customereventhistoryid) {
        this.customereventhistoryid = customereventhistoryid;
    }

    public String getCustomereventhistoryid() {
        return customereventhistoryid;
    }

    public void setLifeid(String lifeid) {
        this.lifeid = lifeid;
    }

    public String getLifeid() {
        return lifeid;
    }

    public void setLife(org.museframework.bian.cusevehis.dto.bq.Life life) {
        this.life = life;
    }

    public org.museframework.bian.cusevehis.dto.bq.Life getLife() {
        return life;
    }
}