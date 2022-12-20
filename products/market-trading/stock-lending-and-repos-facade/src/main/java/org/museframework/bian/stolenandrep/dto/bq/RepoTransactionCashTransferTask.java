/*The Repo Transaction Cash Transfer Task is a discrete action or task that is required in the execution of the Repo Transaction Cash Transfer Task*/
package org.museframework.bian.stolenandrep.dto.bq;

public class RepoTransactionCashTransferTask {
    /*The required status/situation prior to the execution of the task*/
    private org.museframework.bian.classes.Condition preconditions;

    /*The timing and key actions/milestones involved in completing the transaction task*/
    private String schedule;

    /*The Repo Transaction Cash Transfer Task specific Business Service*/
    private org.museframework.bian.classes.BusinessService businessService;

    /*The completion status and any triggered/dependent actions once the task has been completed*/
    private org.museframework.bian.classes.Condition postconditions;

    /*Reference to Repo Transaction Cash Transfer Task*/
    private org.museframework.bian.classes.Transaction repoTransactionReference;

    /*The type of Repo Transaction Cash Transfer Task*/
    private String repoTransactionCashTransferTaskType;

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

    public void setRepoTransactionReference(org.museframework.bian.classes.Transaction repoTransactionReference) {
        this.repoTransactionReference = repoTransactionReference;
    }

    public org.museframework.bian.classes.Transaction getRepoTransactionReference() {
        return repoTransactionReference;
    }

    public void setRepoTransactionCashTransferTaskType(String repoTransactionCashTransferTaskType) {
        this.repoTransactionCashTransferTaskType = repoTransactionCashTransferTaskType;
    }

    public String getRepoTransactionCashTransferTaskType() {
        return repoTransactionCashTransferTaskType;
    }
}