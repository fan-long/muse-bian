/*An event related to the behaviour performed by an actor. 

Comment:
An actor can be a party or a machine
An action Includes various types of requests, orders and financial transactions. Includes responses where appropriate.
An action is an event which means that the concept describes the result of acting.*/
package org.museframework.bian.classes;

public class Action {
    /**/
    private org.museframework.bian.enumerations.Actiontypevalues actionType;

    public void setActionType(org.museframework.bian.enumerations.Actiontypevalues actionType) {
        this.actionType = actionType;
    }

    public org.museframework.bian.enumerations.Actiontypevalues getActionType() {
        return actionType;
    }
}