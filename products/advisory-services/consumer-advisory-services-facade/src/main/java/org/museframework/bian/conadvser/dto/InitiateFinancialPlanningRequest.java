package org.museframework.bian.conadvser.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class InitiateFinancialPlanningRequest {
    @MetaField
    private String consumeradvisoryservicesid;

    @MetaField
    private String financialplanningid;

    @MetaField(ref=true)
    private org.museframework.bian.conadvser.dto.bq.FinancialPlanning financialPlanning;

    public void setConsumeradvisoryservicesid(String consumeradvisoryservicesid) {
        this.consumeradvisoryservicesid = consumeradvisoryservicesid;
    }

    public String getConsumeradvisoryservicesid() {
        return consumeradvisoryservicesid;
    }

    public void setFinancialplanningid(String financialplanningid) {
        this.financialplanningid = financialplanningid;
    }

    public String getFinancialplanningid() {
        return financialplanningid;
    }

    public void setFinancialPlanning(org.museframework.bian.conadvser.dto.bq.FinancialPlanning financialPlanning) {
        this.financialPlanning = financialPlanning;
    }

    public org.museframework.bian.conadvser.dto.bq.FinancialPlanning getFinancialPlanning() {
        return financialPlanning;
    }
}