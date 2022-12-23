package org.museframework.bian.cusbehins.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class ExecuteInsightRequest {
    @MetaField
    private String customerbehaviorinsightsid;

    @MetaField
    private String insightid;

    @MetaField(ref=true)
    private org.museframework.bian.cusbehins.dto.bq.Insight insight;

    public void setCustomerbehaviorinsightsid(String customerbehaviorinsightsid) {
        this.customerbehaviorinsightsid = customerbehaviorinsightsid;
    }

    public String getCustomerbehaviorinsightsid() {
        return customerbehaviorinsightsid;
    }

    public void setInsightid(String insightid) {
        this.insightid = insightid;
    }

    public String getInsightid() {
        return insightid;
    }

    public void setInsight(org.museframework.bian.cusbehins.dto.bq.Insight insight) {
        this.insight = insight;
    }

    public org.museframework.bian.cusbehins.dto.bq.Insight getInsight() {
        return insight;
    }
}