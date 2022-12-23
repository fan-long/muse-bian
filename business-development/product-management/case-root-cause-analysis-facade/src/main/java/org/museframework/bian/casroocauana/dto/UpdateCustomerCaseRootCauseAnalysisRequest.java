package org.museframework.bian.casroocauana.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class UpdateCustomerCaseRootCauseAnalysisRequest {
    @MetaField
    private String caserootcauseanalysisid;

    @MetaField(ref=true)
    private org.museframework.bian.casroocauana.dto.cr.CustomerCaseRootCauseAnalysis customerCaseRootCauseAnalysis;

    public void setCaserootcauseanalysisid(String caserootcauseanalysisid) {
        this.caserootcauseanalysisid = caserootcauseanalysisid;
    }

    public String getCaserootcauseanalysisid() {
        return caserootcauseanalysisid;
    }

    public void setCustomerCaseRootCauseAnalysis(org.museframework.bian.casroocauana.dto.cr.CustomerCaseRootCauseAnalysis customerCaseRootCauseAnalysis) {
        this.customerCaseRootCauseAnalysis = customerCaseRootCauseAnalysis;
    }

    public org.museframework.bian.casroocauana.dto.cr.CustomerCaseRootCauseAnalysis getCustomerCaseRootCauseAnalysis() {
        return customerCaseRootCauseAnalysis;
    }
}