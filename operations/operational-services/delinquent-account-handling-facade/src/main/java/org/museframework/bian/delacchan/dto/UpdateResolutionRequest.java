package org.museframework.bian.delacchan.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class UpdateResolutionRequest {
    @MetaField
    private String delinquentaccounthandlingid;

    @MetaField
    private String resolutionid;

    @MetaField(ref=true)
    private org.museframework.bian.delacchan.dto.bq.Resolution resolution;

    public void setDelinquentaccounthandlingid(String delinquentaccounthandlingid) {
        this.delinquentaccounthandlingid = delinquentaccounthandlingid;
    }

    public String getDelinquentaccounthandlingid() {
        return delinquentaccounthandlingid;
    }

    public void setResolutionid(String resolutionid) {
        this.resolutionid = resolutionid;
    }

    public String getResolutionid() {
        return resolutionid;
    }

    public void setResolution(org.museframework.bian.delacchan.dto.bq.Resolution resolution) {
        this.resolution = resolution;
    }

    public org.museframework.bian.delacchan.dto.bq.Resolution getResolution() {
        return resolution;
    }
}