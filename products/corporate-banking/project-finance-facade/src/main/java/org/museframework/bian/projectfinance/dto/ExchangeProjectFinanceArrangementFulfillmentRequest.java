package org.museframework.bian.projectfinance.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class ExchangeProjectFinanceArrangementFulfillmentRequest {
    @MetaField
    private String projectfinanceid;

    @MetaField
    private String projectfinancearrangementfulfillmentid;

    @MetaField(ref=true)
    private org.museframework.bian.projectfinance.dto.bq.ProjectFinanceArrangementFulfillment projectFinanceArrangementFulfillment;

    public void setProjectfinanceid(String projectfinanceid) {
        this.projectfinanceid = projectfinanceid;
    }

    public String getProjectfinanceid() {
        return projectfinanceid;
    }

    public void setProjectfinancearrangementfulfillmentid(String projectfinancearrangementfulfillmentid) {
        this.projectfinancearrangementfulfillmentid = projectfinancearrangementfulfillmentid;
    }

    public String getProjectfinancearrangementfulfillmentid() {
        return projectfinancearrangementfulfillmentid;
    }

    public void setProjectFinanceArrangementFulfillment(org.museframework.bian.projectfinance.dto.bq.ProjectFinanceArrangementFulfillment projectFinanceArrangementFulfillment) {
        this.projectFinanceArrangementFulfillment = projectFinanceArrangementFulfillment;
    }

    public org.museframework.bian.projectfinance.dto.bq.ProjectFinanceArrangementFulfillment getProjectFinanceArrangementFulfillment() {
        return projectFinanceArrangementFulfillment;
    }
}