/*The Customer Payment Task is a discrete action or task that is required in the execution of the Customer Payment Task*/
package org.museframework.bian.bankguarantee.dto.bq;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto
public class BankGuaranteeCollectionsTask {
    /*The required status/situation prior to the execution of the task*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Condition preconditions;

    /*The timing and key actions/milestones involved in completing the transaction task*/
    @MetaField
    private String schedule;

    /*The Bank Guarantee Collections Task specific Business Service*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.BusinessService businessService;

    /*The completion status and any triggered/dependent actions once the task has been completed*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Condition postconditions;

    /*Reference to Bank Guarantee Collections Task*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Transaction bankGuaranteeTransactionReference;

    /*The type of Bank Guarantee Collections Task*/
    @MetaField
    private String bankGuaranteeCollectionsTaskType;

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

    public void setBankGuaranteeTransactionReference(org.museframework.bian.classes.Transaction bankGuaranteeTransactionReference) {
        this.bankGuaranteeTransactionReference = bankGuaranteeTransactionReference;
    }

    public org.museframework.bian.classes.Transaction getBankGuaranteeTransactionReference() {
        return bankGuaranteeTransactionReference;
    }

    public void setBankGuaranteeCollectionsTaskType(String bankGuaranteeCollectionsTaskType) {
        this.bankGuaranteeCollectionsTaskType = bankGuaranteeCollectionsTaskType;
    }

    public String getBankGuaranteeCollectionsTaskType() {
        return bankGuaranteeCollectionsTaskType;
    }
}