/*Specific project or program undertaken to achieve specific objectives

Read more: http://www.businessdictionary.com/definition/initiatives.html*/
package org.museframework.bian.classes;

public class BusinessInitiative {
    /*The type of initiative*/
    private String initiativeType;

    /*Definition of the initiative, including planned actions, deliverables and intended outcomes*/
    private String initiativeDescription;

    /*Planned and actual dates for activities making up the initiative. Any necessary details describing the purpose or reference properties of the transaction*/
    private String initiativeSchedule;

    /*File of consolidated notes, assessments etc. arising from the work*/
    private String initiativeWorkProduct;

    /*The results/impact of the initiative*/
    private String initiativeResult;

    /*Key dates and times associated with the execution of the business initiative (e.g. start, review, completion)*/
    private String initiativeDate;

    public void setInitiativeType(String initiativeType) {
        this.initiativeType = initiativeType;
    }

    public String getInitiativeType() {
        return initiativeType;
    }

    public void setInitiativeDescription(String initiativeDescription) {
        this.initiativeDescription = initiativeDescription;
    }

    public String getInitiativeDescription() {
        return initiativeDescription;
    }

    public void setInitiativeSchedule(String initiativeSchedule) {
        this.initiativeSchedule = initiativeSchedule;
    }

    public String getInitiativeSchedule() {
        return initiativeSchedule;
    }

    public void setInitiativeWorkProduct(String initiativeWorkProduct) {
        this.initiativeWorkProduct = initiativeWorkProduct;
    }

    public String getInitiativeWorkProduct() {
        return initiativeWorkProduct;
    }

    public void setInitiativeResult(String initiativeResult) {
        this.initiativeResult = initiativeResult;
    }

    public String getInitiativeResult() {
        return initiativeResult;
    }

    public void setInitiativeDate(String initiativeDate) {
        this.initiativeDate = initiativeDate;
    }

    public String getInitiativeDate() {
        return initiativeDate;
    }
}