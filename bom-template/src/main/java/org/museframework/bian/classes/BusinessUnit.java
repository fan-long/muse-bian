/*A unit of an organisation that does not have legal standing outside the organisation.

A logical element or segment of a company (such as accounting, production, marketing) representing a specific business function, and a definite place on the organizational chart, under the domain of a manager. Also called department, division, or a functional area. (Business Dictionary)

Read more: http://www.businessdictionary.com/definition/business-unit.html*/
package org.museframework.bian.classes;

public class BusinessUnit {
    /**/
    private String businessFunction;

    /**/
    private String goal;

    public void setBusinessFunction(String businessFunction) {
        this.businessFunction = businessFunction;
    }

    public String getBusinessFunction() {
        return businessFunction;
    }

    public void setGoal(String goal) {
        this.goal = goal;
    }

    public String getGoal() {
        return goal;
    }
}