package org.museframework.bian.cuscrerat.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class RetrieveInternalReportingRequest {
    @MetaField
    private String customercreditratingid;

    @MetaField
    private String internalreportingid;

    public void setCustomercreditratingid(String customercreditratingid) {
        this.customercreditratingid = customercreditratingid;
    }

    public String getCustomercreditratingid() {
        return customercreditratingid;
    }

    public void setInternalreportingid(String internalreportingid) {
        this.internalreportingid = internalreportingid;
    }

    public String getInternalreportingid() {
        return internalreportingid;
    }
}