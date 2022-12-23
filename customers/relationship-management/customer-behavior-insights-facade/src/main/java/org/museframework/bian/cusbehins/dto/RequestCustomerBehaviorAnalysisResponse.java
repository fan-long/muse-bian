package org.museframework.bian.cusbehins.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class RequestCustomerBehaviorAnalysisResponse {
    @MetaField(ref=true)
    private org.museframework.bian.cusbehins.dto.cr.CustomerBehaviorAnalysis customerBehaviorAnalysis;

    public void setCustomerBehaviorAnalysis(org.museframework.bian.cusbehins.dto.cr.CustomerBehaviorAnalysis customerBehaviorAnalysis) {
        this.customerBehaviorAnalysis = customerBehaviorAnalysis;
    }

    public org.museframework.bian.cusbehins.dto.cr.CustomerBehaviorAnalysis getCustomerBehaviorAnalysis() {
        return customerBehaviorAnalysis;
    }
}