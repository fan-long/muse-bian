package org.museframework.bian.projectfinance.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class NotifyProjectFinancePlacementFulfillmentRequest {
    @MetaField
    private String projectfinanceid;

    @MetaField
    private String projectfinanceplacementfulfillmentid;

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
}