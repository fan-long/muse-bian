package org.museframework.bian.projectfinance.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class ExecuteProjectFinanceFacilityRequest {
    @MetaField
    private String projectfinanceid;

    @MetaField(ref=true)
    private org.museframework.bian.projectfinance.dto.cr.ProjectFinanceFacility projectFinanceFacility;

    public void setProjectfinanceid(String projectfinanceid) {
        this.projectfinanceid = projectfinanceid;
    }

    public String getProjectfinanceid() {
        return projectfinanceid;
    }

    public void setProjectFinanceFacility(org.museframework.bian.projectfinance.dto.cr.ProjectFinanceFacility projectFinanceFacility) {
        this.projectFinanceFacility = projectFinanceFacility;
    }

    public org.museframework.bian.projectfinance.dto.cr.ProjectFinanceFacility getProjectFinanceFacility() {
        return projectFinanceFacility;
    }
}