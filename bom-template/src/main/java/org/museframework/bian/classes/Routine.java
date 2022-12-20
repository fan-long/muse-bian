/*A regular course of procedure that is to be followed to administer the operational unit/function.*/
package org.museframework.bian.classes;

public class Routine {
    /**/
    private String routineType;

    /**/
    private String routineDefinition;

    /**/
    private String routineDataTime;

    /**/
    private String routineStatus;

    public void setRoutineType(String routineType) {
        this.routineType = routineType;
    }

    public String getRoutineType() {
        return routineType;
    }

    public void setRoutineDefinition(String routineDefinition) {
        this.routineDefinition = routineDefinition;
    }

    public String getRoutineDefinition() {
        return routineDefinition;
    }

    public void setRoutineDataTime(String routineDataTime) {
        this.routineDataTime = routineDataTime;
    }

    public String getRoutineDataTime() {
        return routineDataTime;
    }

    public void setRoutineStatus(String routineStatus) {
        this.routineStatus = routineStatus;
    }

    public String getRoutineStatus() {
        return routineStatus;
    }
}