package org.museframework.bian.projectfinance.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class ExecuteProjectFinanceRepaymentFulfillmentRequest {
    @MetaField
    private String projectfinanceid;

    @MetaField
    private String projectfinancerepaymentfulfillmentid;

    @MetaField(ref=true)
    private org.museframework.bian.projectfinance.dto.bq.ProjectFinanceRepaymentFulfillment projectFinanceRepaymentFulfillment;

    public void setProjectfinanceid(String projectfinanceid) {
        this.projectfinanceid = projectfinanceid;
    }

    public String getProjectfinanceid() {
        return projectfinanceid;
    }

    public void setProjectfinancerepaymentfulfillmentid(String projectfinancerepaymentfulfillmentid) {
        this.projectfinancerepaymentfulfillmentid = projectfinancerepaymentfulfillmentid;
    }

    public String getProjectfinancerepaymentfulfillmentid() {
        return projectfinancerepaymentfulfillmentid;
    }

    public void setProjectFinanceRepaymentFulfillment(org.museframework.bian.projectfinance.dto.bq.ProjectFinanceRepaymentFulfillment projectFinanceRepaymentFulfillment) {
        this.projectFinanceRepaymentFulfillment = projectFinanceRepaymentFulfillment;
    }

    public org.museframework.bian.projectfinance.dto.bq.ProjectFinanceRepaymentFulfillment getProjectFinanceRepaymentFulfillment() {
        return projectFinanceRepaymentFulfillment;
    }
}