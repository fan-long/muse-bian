/*A set of rules (e.g., regulation, policy, law, guideline, principle, standard) to guide, direct or operate a subject matter.*/
package org.museframework.bian.classes;

public class RuleSet {
    /**/
    private String ruleSetDefinition;

    /**/
    private String ruleSetInterpretation;

    /**/
    private String ruleSetType;

    /**/
    private String ruleSetName;

    /**/
    private String ruleSetIdentification;

    /**/
    private String ruleSetLifecycleStatus;

    public void setRuleSetDefinition(String ruleSetDefinition) {
        this.ruleSetDefinition = ruleSetDefinition;
    }

    public String getRuleSetDefinition() {
        return ruleSetDefinition;
    }

    public void setRuleSetInterpretation(String ruleSetInterpretation) {
        this.ruleSetInterpretation = ruleSetInterpretation;
    }

    public String getRuleSetInterpretation() {
        return ruleSetInterpretation;
    }

    public void setRuleSetType(String ruleSetType) {
        this.ruleSetType = ruleSetType;
    }

    public String getRuleSetType() {
        return ruleSetType;
    }

    public void setRuleSetName(String ruleSetName) {
        this.ruleSetName = ruleSetName;
    }

    public String getRuleSetName() {
        return ruleSetName;
    }

    public void setRuleSetIdentification(String ruleSetIdentification) {
        this.ruleSetIdentification = ruleSetIdentification;
    }

    public String getRuleSetIdentification() {
        return ruleSetIdentification;
    }

    public void setRuleSetLifecycleStatus(String ruleSetLifecycleStatus) {
        this.ruleSetLifecycleStatus = ruleSetLifecycleStatus;
    }

    public String getRuleSetLifecycleStatus() {
        return ruleSetLifecycleStatus;
    }
}