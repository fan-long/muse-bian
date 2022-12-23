package org.museframework.bian.customerportfolio.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class UpdateCustomerSegmentAnalysisResponse {
    @MetaField(ref=true)
    private org.museframework.bian.customerportfolio.dto.cr.CustomerSegmentAnalysis customerSegmentAnalysis;

    public void setCustomerSegmentAnalysis(org.museframework.bian.customerportfolio.dto.cr.CustomerSegmentAnalysis customerSegmentAnalysis) {
        this.customerSegmentAnalysis = customerSegmentAnalysis;
    }

    public org.museframework.bian.customerportfolio.dto.cr.CustomerSegmentAnalysis getCustomerSegmentAnalysis() {
        return customerSegmentAnalysis;
    }
}