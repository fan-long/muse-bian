/**/
package org.museframework.bian.classes;

public class DunningContactApproach {
    /*The "format" used in the contact

e.g. script to be followed during phone contact, template for written contact...*/
    private String dunningContactContentTemplate;

    /*Time schedule/ frequency for contacts*/
    private String dunningContactSchedule;

    /**/
    private String attribute;

    public void setDunningContactContentTemplate(String dunningContactContentTemplate) {
        this.dunningContactContentTemplate = dunningContactContentTemplate;
    }

    public String getDunningContactContentTemplate() {
        return dunningContactContentTemplate;
    }

    public void setDunningContactSchedule(String dunningContactSchedule) {
        this.dunningContactSchedule = dunningContactSchedule;
    }

    public String getDunningContactSchedule() {
        return dunningContactSchedule;
    }

    public void setAttribute(String attribute) {
        this.attribute = attribute;
    }

    public String getAttribute() {
        return attribute;
    }
}