package org.museframework.bian.customerworkbench.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class ExecuteBrowsingResponse {
    @MetaField(ref=true)
    private org.museframework.bian.customerworkbench.dto.bq.Browsing browsing;

    public void setBrowsing(org.museframework.bian.customerworkbench.dto.bq.Browsing browsing) {
        this.browsing = browsing;
    }

    public org.museframework.bian.customerworkbench.dto.bq.Browsing getBrowsing() {
        return browsing;
    }
}