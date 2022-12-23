package org.museframework.bian.customersurveys.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class UpdateDefinitionRequest {
    @MetaField
    private String customersurveysid;

    @MetaField
    private String definitionid;

    @MetaField(ref=true)
    private org.museframework.bian.customersurveys.dto.bq.Definition definition;

    public void setCustomersurveysid(String customersurveysid) {
        this.customersurveysid = customersurveysid;
    }

    public String getCustomersurveysid() {
        return customersurveysid;
    }

    public void setDefinitionid(String definitionid) {
        this.definitionid = definitionid;
    }

    public String getDefinitionid() {
        return definitionid;
    }

    public void setDefinition(org.museframework.bian.customersurveys.dto.bq.Definition definition) {
        this.definition = definition;
    }

    public org.museframework.bian.customersurveys.dto.bq.Definition getDefinition() {
        return definition;
    }
}