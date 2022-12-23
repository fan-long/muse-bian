/*The configuration and execution of Batch Debit arrangement within the Direct Debit Facility*/
package org.museframework.bian.directdebit.dto.bq;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto
public class BatchDebit {
    /*The required status/situation prior to the implementation of the feature*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Condition preconditions;

    /*The timing and key actions/milestones involved in completing the fulfillment feature instance*/
    @MetaField
    private String schedule;

    /*The Batch Debit specific Business Service*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.BusinessService businessService;

    /*The completion status and any triggered/dependent actions once the feature instance has been fulfilled*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Condition postconditions;

    /*Reference to the Direct Debit Facility*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.FinancialFacility directDebitFacilityReference;

    /*Reference to the Batch Debit*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object batchDebitReference;

    /*The type of Batch Debit*/
    @MetaField
    private String batchDebitType;

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

    public void setDirectDebitFacilityReference(org.museframework.bian.classes.FinancialFacility directDebitFacilityReference) {
        this.directDebitFacilityReference = directDebitFacilityReference;
    }

    public org.museframework.bian.classes.FinancialFacility getDirectDebitFacilityReference() {
        return directDebitFacilityReference;
    }

    public void setBatchDebitReference(org.museframework.bian.classes.Object batchDebitReference) {
        this.batchDebitReference = batchDebitReference;
    }

    public org.museframework.bian.classes.Object getBatchDebitReference() {
        return batchDebitReference;
    }

    public void setBatchDebitType(String batchDebitType) {
        this.batchDebitType = batchDebitType;
    }

    public String getBatchDebitType() {
        return batchDebitType;
    }
}