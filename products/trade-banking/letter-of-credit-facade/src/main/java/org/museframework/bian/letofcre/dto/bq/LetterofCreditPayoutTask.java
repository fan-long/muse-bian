/*The Customer Collateral Allocation Task is a discrete action or task that is required in the execution of the Customer Collateral Allocation Task*/
package org.museframework.bian.letofcre.dto.bq;

public class LetterofCreditPayoutTask {
    /*The required status/situation prior to the execution of the task*/
    private org.museframework.bian.classes.Condition preconditions;

    /*The timing and key actions/milestones involved in completing the transaction task*/
    private String schedule;

    /*The Letter of Credit Payout Task specific Business Service*/
    private org.museframework.bian.classes.BusinessService businessService;

    /*The completion status and any triggered/dependent actions once the task has been completed*/
    private org.museframework.bian.classes.Condition postconditions;

    /*Reference to Letter of Credit Payout Task*/
    private org.museframework.bian.classes.Transaction letterOfCreditTransactionReference;

    /*The type of Letter of Credit Payout Task*/
    private String letterofCreditPayoutTaskType;

    public void setPreconditions(org.museframework.bian.classes.Condition preconditions) {
        this.preconditions = preconditions;
    }

    public org.museframework.bian.classes.Condition getPreconditions() {
        return preconditions;
    }

    public void setSchedule(String schedule) {
        this.schedule = schedule;
    }

    public String getSchedule() {
        return schedule;
    }

    public void setBusinessService(org.museframework.bian.classes.BusinessService businessService) {
        this.businessService = businessService;
    }

    public org.museframework.bian.classes.BusinessService getBusinessService() {
        return businessService;
    }

    public void setPostconditions(org.museframework.bian.classes.Condition postconditions) {
        this.postconditions = postconditions;
    }

    public org.museframework.bian.classes.Condition getPostconditions() {
        return postconditions;
    }

    public void setLetterOfCreditTransactionReference(org.museframework.bian.classes.Transaction letterOfCreditTransactionReference) {
        this.letterOfCreditTransactionReference = letterOfCreditTransactionReference;
    }

    public org.museframework.bian.classes.Transaction getLetterOfCreditTransactionReference() {
        return letterOfCreditTransactionReference;
    }

    public void setLetterofCreditPayoutTaskType(String letterofCreditPayoutTaskType) {
        this.letterofCreditPayoutTaskType = letterofCreditPayoutTaskType;
    }

    public String getLetterofCreditPayoutTaskType() {
        return letterofCreditPayoutTaskType;
    }
}