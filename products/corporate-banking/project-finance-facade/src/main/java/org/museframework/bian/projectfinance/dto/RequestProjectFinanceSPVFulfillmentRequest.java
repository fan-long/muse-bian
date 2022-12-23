package org.museframework.bian.projectfinance.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class RequestProjectFinanceSPVFulfillmentRequest {
    @MetaField
    private String projectfinanceid;

    @MetaField
    private String projectfinancespvfulfillmentid;

    @MetaField(ref=true)
    private org.museframework.bian.projectfinance.dto.bq.ProjectFinanceSPVFulfillment projectFinanceSPVFulfillment;

    public void setProjectfinanceid(String projectfinanceid) {
        this.projectfinanceid = projectfinanceid;
    }

    public String getProjectfinanceid() {
        return projectfinanceid;
    }

    public void setProjectfinancespvfulfillmentid(String projectfinancespvfulfillmentid) {
        this.projectfinancespvfulfillmentid = projectfinancespvfulfillmentid;
    }

    public String getProjectfinancespvfulfillmentid() {
        return projectfinancespvfulfillmentid;
    }

    public void setProjectFinanceSPVFulfillment(org.museframework.bian.projectfinance.dto.bq.ProjectFinanceSPVFulfillment projectFinanceSPVFulfillment) {
        this.projectFinanceSPVFulfillment = projectFinanceSPVFulfillment;
    }

    public org.museframework.bian.projectfinance.dto.bq.ProjectFinanceSPVFulfillment getProjectFinanceSPVFulfillment() {
        return projectFinanceSPVFulfillment;
    }
}