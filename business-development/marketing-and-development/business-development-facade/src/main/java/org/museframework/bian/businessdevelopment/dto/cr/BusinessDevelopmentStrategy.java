/*Define the policies, goals & objectives and strategies for an organizational entity or unit  within Business Development. 
Example: Direct a division of the enterprise.*/
package org.museframework.bian.businessdevelopment.dto.cr;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

//refer to BOClass org.museframework.bian.classes.BusinessDevelopmentStrategy
@MetaDto
public class BusinessDevelopmentStrategy {
    /*The time period addressed by the business development strategy*/
    @MetaField(0)
    private String businessDevelopmentStrategyPeriod;

    /*Specific policies and guidelines that govern the application of the strategy*/
    @MetaField(0)
    private String businessDevelopmentStrategyPoliciesAndGuidelines;

    /*Roles and responsibilities for the oversight of implementation of the strategy*/
    @MetaField(0)
    private String businessDevelopmentStrategyOrganization;

    /*Target and actual financial budget for the strategy*/
    @MetaField(0)
    private String businessDevelopmentStrategyBudget;

    /*The target and actual strategy implementation schedule - recording planned and actual initiatives associated with the realization of the strategy*/
    @MetaField(0)
    private String businessDevelopmentStrategySchedule;

    /*The record of the goals making up the overall business development strategy*/
    @MetaField(0)
    private String businessDevelopmentGoalRecord;

    /*The type of goal (e.g. market share, new business, relationship performance)*/
    @MetaField(0)
    private String businessDevelopmentGoalType;

    /*A definition of the goal, including the intended actions required to achieve the goal*/
    @MetaField(0)
    private String businessDevelopmentGoalDefinition;

    /*Identifies the interested parties and their roles and responsibilities for the specific actions supporting the achievement of the goal*/
    @MetaField(0)
    private String businessDevelopmentGoalOrganization;

    /*Assessment of how the work is progressing towards achieving the goal, including projections of likely outcomes*/
    @MetaField(0)
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