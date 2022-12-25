/*The Repo Transaction Cash Transfer Task is a discrete action or task that is required in the execution of the Repo Transaction Cash Transfer Task*/
package org.museframework.bian.stolenandrep.dto.bq;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto
public class RepoTransactionInitiationTask {
    /*The required status/situation prior to the execution of the task*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Condition preconditions;

    /*The timing and key actions/milestones involved in completing the transaction task*/
    @MetaField(0)
    private String schedule;

    /*The Repo Transaction Initiation Task specific Business Service*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.BusinessService businessService;

    /*The completion status and any triggered/dependent actions once the task has been completed*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Condition postconditions;

    /*Reference to Repo Transaction Initiation Task*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Transaction repoTransactionReference;

    /*The type of Repo Transaction Initiation Task*/
    @MetaField(0)
    private String repoTransactionInitiationTaskType;

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

    public void setRepoTransactionInitiationTaskType(String repoTransactionInitiationTaskType) {
        this.repoTransactionInitiationTaskType = repoTransactionInitiationTaskType;
    }

    public String getRepoTransactionInitiationTaskType() {
        return repoTransactionInitiationTaskType;
    }
}