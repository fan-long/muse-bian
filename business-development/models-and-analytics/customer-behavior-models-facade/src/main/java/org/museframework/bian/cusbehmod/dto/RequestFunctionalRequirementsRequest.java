package org.museframework.bian.cusbehmod.dto;

public class RequestFunctionalRequirementsRequest {
    private String customerbehaviormodelsid;

    private String functionalrequirementsid;

    private org.museframework.bian.cusbehmod.dto.bq.FunctionalRequirements functionalRequirements;

    public void setCustomerbehaviormodelsid(String customerbehaviormodelsid) {
        this.customerbehaviormodelsid = customerbehaviormodelsid;
    }

    public String getCustomerbehaviormodelsid() {
        return customerbehaviormodelsid;
    }

    public void setFunctionalrequirementsid(String functionalrequirementsid) {
        this.functionalrequirementsid = functionalrequirementsid;
    }

    public String getFunctionalrequirementsid() {
        return functionalrequirementsid;
    }

    public void setFunctionalRequirements(org.museframework.bian.cusbehmod.dto.bq.FunctionalRequirements functionalRequirements) {
        this.functionalRequirements = functionalRequirements;
    }

    public org.museframework.bian.cusbehmod.dto.bq.FunctionalRequirements getFunctionalRequirements() {
        return functionalRequirements;
    }
}