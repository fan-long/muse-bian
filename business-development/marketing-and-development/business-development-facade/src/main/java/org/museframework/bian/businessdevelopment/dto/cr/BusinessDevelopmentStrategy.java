/*Define the policies, goals & objectives and strategies for an organizational entity or unit  within Business Development. 
Example: Direct a division of the enterprise.*/
package org.museframework.bian.businessdevelopment.dto.cr;

public class BusinessDevelopmentStrategy extends org.museframework.bian.classes.BusinessDevelopmentStrategy {
    /*The time period addressed by the business development strategy*/
    private String businessDevelopmentStrategyPeriod;

    /*Specific policies and guidelines that govern the application of the strategy*/
    private String businessDevelopmentStrategyPoliciesAndGuidelines;

    /*Roles and responsibilities for the oversight of implementation of the strategy*/
    private String businessDevelopmentStrategyOrganization;

    /*Target and actual financial budget for the strategy*/
    private String businessDevelopmentStrategyBudget;

    /*The target and actual strategy implementation schedule - recording planned and actual initiatives associated with the realization of the strategy*/
    private String businessDevelopmentStrategySchedule;

    /*The record of the goals making up the overall business development strategy*/
    private String businessDevelopmentGoalRecord;

    /*The type of goal (e.g. market share, new business, relationship performance)*/
    private String businessDevelopmentGoalType;

    /*A definition of the goal, including the intended actions required to achieve the goal*/
    private String businessDevelopmentGoalDefinition;

    /*Identifies the interested parties and their roles and responsibilities for the specific actions supporting the achievement of the goal*/
    private String businessDevelopmentGoalOrganization;

    /*Assessment of how the work is progressing towards achieving the goal, including projections of likely outcomes*/
    private String businessDevelopmentGoalResult;

    public void setBusinessDevelopmentStrategyPeriod(String businessDevelopmentStrategyPeriod) {
        this.businessDevelopmentStrategyPeriod = businessDevelopmentStrategyPeriod;
    }

    public String getBusinessDevelopmentStrategyPeriod() {
        return businessDevelopmentStrategyPeriod;
    }

    public void setBusinessDevelopmentStrategyPoliciesAndGuidelines(String businessDevelopmentStrategyPoliciesAndGuidelines) {
        this.businessDevelopmentStrategyPoliciesAndGuidelines = businessDevelopmentStrategyPoliciesAndGuidelines;
    }

    public String getBusinessDevelopmentStrategyPoliciesAndGuidelines() {
        return businessDevelopmentStrategyPoliciesAndGuidelines;
    }

    public void setBusinessDevelopmentStrategyOrganization(String businessDevelopmentStrategyOrganization) {
        this.businessDevelopmentStrategyOrganization = businessDevelopmentStrategyOrganization;
    }

    public String getBusinessDevelopmentStrategyOrganization() {
        return businessDevelopmentStrategyOrganization;
    }

    public void setBusinessDevelopmentStrategyBudget(String businessDevelopmentStrategyBudget) {
        this.businessDevelopmentStrategyBudget = businessDevelopmentStrategyBudget;
    }

    public String getBusinessDevelopmentStrategyBudget() {
        return businessDevelopmentStrategyBudget;
    }

    public void setBusinessDevelopmentStrategySchedule(String businessDevelopmentStrategySchedule) {
        this.businessDevelopmentStrategySchedule = businessDevelopmentStrategySchedule;
    }

    public String getBusinessDevelopmentStrategySchedule() {
        return businessDevelopmentStrategySchedule;
    }

    public void setBusinessDevelopmentGoalRecord(String businessDevelopmentGoalRecord) {
        this.businessDevelopmentGoalRecord = businessDevelopmentGoalRecord;
    }

    public String getBusinessDevelopmentGoalRecord() {
        return businessDevelopmentGoalRecord;
    }

    public void setBusinessDevelopmentGoalType(String businessDevelopmentGoalType) {
        this.businessDevelopmentGoalType = businessDevelopmentGoalType;
    }

    public String getBusinessDevelopmentGoalType() {
        return businessDevelopmentGoalType;
    }

    public void setBusinessDevelopmentGoalDefinition(String businessDevelopmentGoalDefinition) {
        this.businessDevelopmentGoalDefinition = businessDevelopmentGoalDefinition;
    }

    public String getBusinessDevelopmentGoalDefinition() {
        return businessDevelopmentGoalDefinition;
    }

    public void setBusinessDevelopmentGoalOrganization(String businessDevelopmentGoalOrganization) {
        this.businessDevelopmentGoalOrganization = businessDevelopmentGoalOrganization;
    }

    public String getBusinessDevelopmentGoalOrganization() {
        return businessDevelopmentGoalOrganization;
    }

    public void setBusinessDevelopmentGoalResult(String businessDevelopmentGoalResult) {
        this.businessDevelopmentGoalResult = businessDevelopmentGoalResult;
    }

    public String getBusinessDevelopmentGoalResult() {
        return businessDevelopmentGoalResult;
    }
}