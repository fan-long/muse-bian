package org.museframework.bian.customersurveys.dto;

public class UpdateDefinitionRequest {
    private String customersurveysid;

    private String definitionid;

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