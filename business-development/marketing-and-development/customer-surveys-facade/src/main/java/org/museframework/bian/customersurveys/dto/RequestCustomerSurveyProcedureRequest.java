package org.museframework.bian.customersurveys.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class RequestCustomerSurveyProcedureRequest {
    @MetaField
    private String customersurveysid;

    @MetaField(ref=true)
    private org.museframework.bian.customersurveys.dto.cr.CustomerSurveyProcedure customerSurveyProcedure;

    public void setCustomersurveysid(String customersurveysid) {
        this.customersurveysid = customersurveysid;
    }

    public String getCustomersurveysid() {
        return customersurveysid;
    }

    public void setCustomerSurveyProcedure(org.museframework.bian.customersurveys.dto.cr.CustomerSurveyProcedure customerSurveyProcedure) {
        this.customerSurveyProcedure = customerSurveyProcedure;
    }

    public org.museframework.bian.customersurveys.dto.cr.CustomerSurveyProcedure getCustomerSurveyProcedure() {
        return customerSurveyProcedure;
    }
}