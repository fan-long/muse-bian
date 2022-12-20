/*A production specification for a designed model. 

Production specification defines technical and operational deployment needs.*/
package org.museframework.bian.classes;

public class ModelDesignProductionSpecification {
    /**/
    private String operationalRequirement;

    /**/
    private String modelUsageRuleSet;

    public void setOperationalRequirement(String operationalRequirement) {
        this.operationalRequirement = operationalRequirement;
    }

    public String getOperationalRequirement() {
        return operationalRequirement;
    }

    public void setModelUsageRuleSet(String modelUsageRuleSet) {
        this.modelUsageRuleSet = modelUsageRuleSet;
    }

    public String getModelUsageRuleSet() {
        return modelUsageRuleSet;
    }
}