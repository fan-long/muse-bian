package org.museframework.bian.casroocauana.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class RetrieveCustomerCaseRootCauseAnalysisResponse {
    @MetaField(ref=true)
    private org.museframework.bian.casroocauana.dto.cr.CustomerCaseRootCauseAnalysis customerCaseRootCauseAnalysis;

    public void setCustomerCaseRootCauseAnalysis(org.museframework.bian.casroocauana.dto.cr.CustomerCaseRootCauseAnalysis customerCaseRootCauseAnalysis) {
        this.customerCaseRootCauseAnalysis = customerCaseRootCauseAnalysis;
    }

    public org.museframework.bian.casroocauana.dto.cr.CustomerCaseRootCauseAnalysis getCustomerCaseRootCauseAnalysis() {
        return customerCaseRootCauseAnalysis;
    }
}