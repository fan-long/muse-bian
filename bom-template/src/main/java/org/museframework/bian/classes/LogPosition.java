/*The position of Log at the certain point of time. 
*/
package org.museframework.bian.classes;

public class LogPosition {
    /**/
    private String positionType;

    /**/
    private String positionDefinition;

    /**/
    private String position;

    public void setPositionType(String positionType) {
        this.positionType = positionType;
    }

    public String getPositionType() {
        return positionType;
    }

    public void setPositionDefinition(String positionDefinition) {
        this.positionDefinition = positionDefinition;
    }

    public String getPositionDefinition() {
        return positionDefinition;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getPosition() {
        return position;
    }
}