package org.museframework.bian.poiofser.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class InitiateAutomatedRequest {
    @MetaField
    private String pointofserviceid;

    @MetaField
    private String automatedid;

    @MetaField(ref=true)
    private org.museframework.bian.poiofser.dto.bq.Automated automated;

    public void setPointofserviceid(String pointofserviceid) {
        this.pointofserviceid = pointofserviceid;
    }

    public String getPointofserviceid() {
        return pointofserviceid;
    }

    public void setAutomatedid(String automatedid) {
        this.automatedid = automatedid;
    }

    public String getAutomatedid() {
        return automatedid;
    }

    public void setAutomated(org.museframework.bian.poiofser.dto.bq.Automated automated) {
        this.automated = automated;
    }

    public org.museframework.bian.poiofser.dto.bq.Automated getAutomated() {
        return automated;
    }
}