package org.museframework.bian.conadvser.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class RetrieveFinancialPlanningRequest {
    @MetaField
    private String consumeradvisoryservicesid;

    @MetaField
    private String financialplanningid;

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
}