package org.museframework.bian.customersurveys.dto;

public class RetrieveDefinitionRequest {
    private String customersurveysid;

    private String definitionid;

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
}