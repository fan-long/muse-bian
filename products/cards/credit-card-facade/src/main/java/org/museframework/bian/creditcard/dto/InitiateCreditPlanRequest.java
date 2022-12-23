package org.museframework.bian.creditcard.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class InitiateCreditPlanRequest {
    @MetaField
    private String creditcardid;

    @MetaField
    private String creditplanid;

    @MetaField(ref=true)
    private org.museframework.bian.creditcard.dto.bq.CreditPlan creditPlan;

    public void setCreditcardid(String creditcardid) {
        this.creditcardid = creditcardid;
    }

    public String getCreditcardid() {
        return creditcardid;
    }

    public void setCreditplanid(String creditplanid) {
        this.creditplanid = creditplanid;
    }

    public String getCreditplanid() {
        return creditplanid;
    }

    public void setCreditPlan(org.museframework.bian.creditcard.dto.bq.CreditPlan creditPlan) {
        this.creditPlan = creditPlan;
    }

    public org.museframework.bian.creditcard.dto.bq.CreditPlan getCreditPlan() {
        return creditPlan;
    }
}