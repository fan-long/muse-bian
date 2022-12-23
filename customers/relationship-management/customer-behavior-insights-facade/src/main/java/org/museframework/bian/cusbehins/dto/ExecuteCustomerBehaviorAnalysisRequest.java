package org.museframework.bian.cusbehins.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class ExecuteCustomerBehaviorAnalysisRequest {
    @MetaField
    private String customerbehaviorinsightsid;

    @MetaField(ref=true)
    private org.museframework.bian.cusbehins.dto.cr.CustomerBehaviorAnalysis customerBehaviorAnalysis;

    public void setCustomerbehaviorinsightsid(String customerbehaviorinsightsid) {
        this.customerbehaviorinsightsid = customerbehaviorinsightsid;
    }

    public String getCustomerbehaviorinsightsid() {
        return customerbehaviorinsightsid;
    }

    public void setCustomerBehaviorAnalysis(org.museframework.bian.cusbehins.dto.cr.CustomerBehaviorAnalysis customerBehaviorAnalysis) {
        this.customerBehaviorAnalysis = customerBehaviorAnalysis;
    }

    public org.museframework.bian.cusbehins.dto.cr.CustomerBehaviorAnalysis getCustomerBehaviorAnalysis() {
        return customerBehaviorAnalysis;
    }
}