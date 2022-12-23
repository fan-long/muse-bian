/*The configuration and execution of Check Clearing and Settlement Fulfillment arrangement within the Check Clearing and Settlement Fulfillment*/
package org.museframework.bian.chelocbox.dto.bq;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto
public class PaperCheckProcessingFulfillment {
    /*The required status/situation prior to the implementation of the feature*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Condition preconditions;

    /*The timing and key actions/milestones involved in completing the fulfillment feature instance*/
    @MetaField
    private String schedule;

    /*The Paper Check Processing Fulfillment specific Business Service*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.BusinessService businessService;

    /*The completion status and any triggered/dependent actions once the feature instance has been fulfilled*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Condition postconditions;

    /*Reference to Paper Check Processing Fulfillment*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.FinancialFacility lockBoxFacilityReference;

    /*Reference to Paper Check Processing Fulfillment*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object paperCheckProcessingFulfillmentReference;

    /*The type of Paper Check Processing Fulfillment*/
    @MetaField
    private String paperCheckProcessingFulfillmentType;

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

    public void setLockBoxFacilityReference(org.museframework.bian.classes.FinancialFacility lockBoxFacilityReference) {
        this.lockBoxFacilityReference = lockBoxFacilityReference;
    }

    public org.museframework.bian.classes.FinancialFacility getLockBoxFacilityReference() {
        return lockBoxFacilityReference;
    }

    public void setPaperCheckProcessingFulfillmentReference(org.museframework.bian.classes.Object paperCheckProcessingFulfillmentReference) {
        this.paperCheckProcessingFulfillmentReference = paperCheckProcessingFulfillmentReference;
    }

    public org.museframework.bian.classes.Object getPaperCheckProcessingFulfillmentReference() {
        return paperCheckProcessingFulfillmentReference;
    }

    public void setPaperCheckProcessingFulfillmentType(String paperCheckProcessingFulfillmentType) {
        this.paperCheckProcessingFulfillmentType = paperCheckProcessingFulfillmentType;
    }

    public String getPaperCheckProcessingFulfillmentType() {
        return paperCheckProcessingFulfillmentType;
    }
}