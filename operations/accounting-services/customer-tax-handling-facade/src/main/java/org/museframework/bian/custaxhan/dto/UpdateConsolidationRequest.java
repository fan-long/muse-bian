package org.museframework.bian.custaxhan.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class UpdateConsolidationRequest {
    @MetaField
    private String customertaxhandlingid;

    @MetaField
    private String consolidationid;

    @MetaField(ref=true)
    private org.museframework.bian.custaxhan.dto.bq.Consolidation consolidation;

    public void setCustomertaxhandlingid(String customertaxhandlingid) {
        this.customertaxhandlingid = customertaxhandlingid;
    }

    public String getCustomertaxhandlingid() {
        return customertaxhandlingid;
    }

    public void setConsolidationid(String consolidationid) {
        this.consolidationid = consolidationid;
    }

    public String getConsolidationid() {
        return consolidationid;
    }

    public void setConsolidation(org.museframework.bian.custaxhan.dto.bq.Consolidation consolidation) {
        this.consolidation = consolidation;
    }

    public org.museframework.bian.custaxhan.dto.bq.Consolidation getConsolidation() {
        return consolidation;
    }
}