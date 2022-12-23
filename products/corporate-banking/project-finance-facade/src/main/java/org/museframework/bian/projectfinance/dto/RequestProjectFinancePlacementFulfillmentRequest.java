package org.museframework.bian.projectfinance.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class RequestProjectFinancePlacementFulfillmentRequest {
    @MetaField
    private String projectfinanceid;

    @MetaField
    private String projectfinanceplacementfulfillmentid;

    @MetaField(ref=true)
    private org.museframework.bian.projectfinance.dto.bq.ProjectFinancePlacementFulfillment projectFinancePlacementFulfillment;

    public void setProjectfinanceid(String projectfinanceid) {
        this.projectfinanceid = projectfinanceid;
    }

    public String getProjectfinanceid() {
        return projectfinanceid;
    }

    public void setProjectfinanceplacementfulfillmentid(String projectfinanceplacementfulfillmentid) {
        this.projectfinanceplacementfulfillmentid = projectfinanceplacementfulfillmentid;
    }

    public String getProjectfinanceplacementfulfillmentid() {
        return projectfinanceplacementfulfillmentid;
    }

    public void setProjectFinancePlacementFulfillment(org.museframework.bian.projectfinance.dto.bq.ProjectFinancePlacementFulfillment projectFinancePlacementFulfillment) {
        this.projectFinancePlacementFulfillment = projectFinancePlacementFulfillment;
    }

    public org.museframework.bian.projectfinance.dto.bq.ProjectFinancePlacementFulfillment getProjectFinancePlacementFulfillment() {
        return projectFinancePlacementFulfillment;
    }
}