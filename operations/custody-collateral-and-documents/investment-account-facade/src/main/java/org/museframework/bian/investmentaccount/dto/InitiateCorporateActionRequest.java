package org.museframework.bian.investmentaccount.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class InitiateCorporateActionRequest {
    @MetaField
    private String investmentaccountid;

    @MetaField
    private String corporateactionid;

    @MetaField(ref=true)
    private org.museframework.bian.investmentaccount.dto.bq.CorporateAction corporateAction;

    public void setInvestmentaccountid(String investmentaccountid) {
        this.investmentaccountid = investmentaccountid;
    }

    public String getInvestmentaccountid() {
        return investmentaccountid;
    }

    public void setCorporateactionid(String corporateactionid) {
        this.corporateactionid = corporateactionid;
    }

    public String getCorporateactionid() {
        return corporateactionid;
    }

    public void setCorporateAction(org.museframework.bian.investmentaccount.dto.bq.CorporateAction corporateAction) {
        this.corporateAction = corporateAction;
    }

    public org.museframework.bian.investmentaccount.dto.bq.CorporateAction getCorporateAction() {
        return corporateAction;
    }
}