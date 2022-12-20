/*A goal represents a high-level statement of intent, direction, or desired end state for an organization and its stakeholders. (ArchiMate 3.1)

An observable and measurable end result having one or more objectives to be achieved within a more or less fixed timeframe.

Read more: http://www.businessdictionary.com/definition/goal.html*/
package org.museframework.bian.classes;

public class Goal {
    /*The type of goal*/
    private String goalType;

    /*A definition of the goal, including the intended actions required to achieve the goal*/
    private String goalDefinition;

    /*Assessment of how the work is progressing towards achieving the goal, including projections of likely outcomes*/
    private String goalResult;

    public void setGoalType(String goalType) {
        this.goalType = goalType;
    }

    public String getGoalType() {
        return goalType;
    }

    public void setGoalDefinition(String goalDefinition) {
        this.goalDefinition = goalDefinition;
    }

    public String getGoalDefinition() {
        return goalDefinition;
    }

    public void setGoalResult(String goalResult) {
        this.goalResult = goalResult;
    }

    public String getGoalResult() {
        return goalResult;
    }
}