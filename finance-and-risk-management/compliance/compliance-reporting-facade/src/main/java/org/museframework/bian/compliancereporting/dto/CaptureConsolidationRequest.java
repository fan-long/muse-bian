package org.museframework.bian.compliancereporting.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class CaptureConsolidationRequest {
    @MetaField
    private String compliancereportingid;

    @MetaField
    private String consolidationid;

    @MetaField(ref=true)
    private org.museframework.bian.compliancereporting.dto.bq.Consolidation consolidation;

    public void setCompliancereportingid(String compliancereportingid) {
        this.compliancereportingid = compliancereportingid;
    }

    public String getCompliancereportingid() {
        return compliancereportingid;
    }

    public void setConsolidationid(String consolidationid) {
        this.consolidationid = consolidationid;
    }

    public String getConsolidationid() {
        return consolidationid;
    }

    public void setConsolidation(org.museframework.bian.compliancereporting.dto.bq.Consolidation consolidation) {
        this.consolidation = consolidation;
    }

    public org.museframework.bian.compliancereporting.dto.bq.Consolidation getConsolidation() {
        return consolidation;
    }
}