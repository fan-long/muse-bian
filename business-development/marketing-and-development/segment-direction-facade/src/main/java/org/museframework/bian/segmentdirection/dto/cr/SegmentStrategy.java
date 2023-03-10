/*Define the policies, goals & objectives and strategies for an organizational entity or unit  within Segment Direction. 
Example: Direct a division of the enterprise.*/
package org.museframework.bian.segmentdirection.dto.cr;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

//refer to BOClass org.museframework.bian.classes.SegmentStrategy
@MetaDto
public class SegmentStrategy {
    /*The time period addressed by the segment strategy*/
    @MetaField(0)
    private String segmentStrategyPeriod;

    /*Specific policies and guidelines that govern the application of the strategy*/
    @MetaField(0)
    private String segmentStrategyPoliciesAndGuidelines;

    /*Roles and responsibilities for the oversight of implementation of the strategy*/
    @MetaField(0)
    private String segmentStrategyOrganization;

    /*Target and actual financial budget for the strategy*/
    @MetaField(0)
    private String segmentStrategyBudget;

    /*The target and actual strategy implementation schedule - recording planned and actual initiatives associated with the realization of the strategy*/
    @MetaField(0)
    private String segmentStrategySchedule;

    /*The record of the goals making up the overall segment strategy*/
    @MetaField(0)
    private String segmentGoalRecord;

    /*The type of goal (e.g. market share, new business, relationship performance)*/
    @MetaField(0)
    private String segmentGoalType;

    /*A definition of the goal, including the intended actions required to achieve the goal*/
    @MetaField(0)
    private String segmentGoalDefinition;

    /*Identifies the interested parties and their roles and responsibilities for the specific actions supporting the achievement of the goal*/
    @MetaField(0)
    private String segmentGoalOrganization;

    /*Assessment of how the work is progressing towards achieving the goal, including projections of likely outcomes*/
    @MetaField(0)
    private String segmentGoalResult;

    public void setSegmentStrategyPeriod(String segmentStrategyPeriod) {
        this.segmentStrategyPeriod = segmentStrategyPeriod;
    }

    public String getSegmentStrategyPeriod() {
        return segmentStrategyPeriod;
    }

    public void setSegmentStrategyPoliciesAndGuidelines(String segmentStrategyPoliciesAndGuidelines) {
        this.segmentStrategyPoliciesAndGuidelines = segmentStrategyPoliciesAndGuidelines;
    }

    public String getSegmentStrategyPoliciesAndGuidelines() {
        return segmentStrategyPoliciesAndGuidelines;
    }

    public void setSegmentStrategyOrganization(String segmentStrategyOrganization) {
        this.segmentStrategyOrganization = segmentStrategyOrganization;
    }

    public String getSegmentStrategyOrganization() {
        return segmentStrategyOrganization;
    }

    public void setSegmentStrategyBudget(String segmentStrategyBudget) {
        this.segmentStrategyBudget = segmentStrategyBudget;
    }

    public String getSegmentStrategyBudget() {
        return segmentStrategyBudget;
    }

    public void setSegmentStrategySchedule(String segmentStrategySchedule) {
        this.segmentStrategySchedule = segmentStrategySchedule;
    }

    public String getSegmentStrategySchedule() {
        return segmentStrategySchedule;
    }

    public void setSegmentGoalRecord(String segmentGoalRecord) {
        this.segmentGoalRecord = segmentGoalRecord;
    }

    public String getSegmentGoalRecord() {
        return segmentGoalRecord;
    }

    public void setSegmentGoalType(String segmentGoalType) {
        this.segmentGoalType = segmentGoalType;
    }

    public String getSegmentGoalType() {
        return segmentGoalType;
    }

    public void setSegmentGoalDefinition(String segmentGoalDefinition) {
        this.segmentGoalDefinition = segmentGoalDefinition;
    }

    public String getSegmentGoalDefinition() {
        return segmentGoalDefinition;
    }

    public void setSegmentGoalOrganization(String segmentGoalOrganization) {
        this.segmentGoalOrganization = segmentGoalOrganization;
    }

    public String getSegmentGoalOrganization() {
        return segmentGoalOrganization;
    }

    public void setSegmentGoalResult(String segmentGoalResult) {
        this.segmentGoalResult = segmentGoalResult;
    }

    public String getSegmentGoalResult() {
        return segmentGoalResult;
    }
}