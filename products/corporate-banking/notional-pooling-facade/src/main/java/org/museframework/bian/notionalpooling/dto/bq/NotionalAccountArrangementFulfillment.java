/*The configuration and execution of Notional Account Interest Allocation Fulfillment arrangement within the Notional Account Interest Allocation Fulfillment*/
package org.museframework.bian.notionalpooling.dto.bq;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto
public class NotionalAccountArrangementFulfillment {
    /*The required status/situation prior to the implementation of the feature*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Condition preconditions;

    /*The timing and key actions/milestones involved in completing the fulfillment feature instance*/
    @MetaField
    private String schedule;

    /*The Notional Account Arrangement Fulfillment specific Business Service*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.BusinessService businessService;

    /*The completion status and any triggered/dependent actions once the feature instance has been fulfilled*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Condition postconditions;

    /*Reference to Notional Account Arrangement Fulfillment*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.FinancialFacility notionalPoolingFacilityReference;

    /*Reference to Notional Account Arrangement Fulfillment*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object notionalAccountArrangementFulfillmentReference;

    /*The type of Notional Account Arrangement Fulfillment*/
    @MetaField
    private String notionalAccountArrangementFulfillmentType;

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

    public void setNotionalPoolingFacilityReference(org.museframework.bian.classes.FinancialFacility notionalPoolingFacilityReference) {
        this.notionalPoolingFacilityReference = notionalPoolingFacilityReference;
    }

    public org.museframework.bian.classes.FinancialFacility getNotionalPoolingFacilityReference() {
        return notionalPoolingFacilityReference;
    }

    public void setNotionalAccountArrangementFulfillmentReference(org.museframework.bian.classes.Object notionalAccountArrangementFulfillmentReference) {
        this.notionalAccountArrangementFulfillmentReference = notionalAccountArrangementFulfillmentReference;
    }

    public org.museframework.bian.classes.Object getNotionalAccountArrangementFulfillmentReference() {
        return notionalAccountArrangementFulfillmentReference;
    }

    public void setNotionalAccountArrangementFulfillmentType(String notionalAccountArrangementFulfillmentType) {
        this.notionalAccountArrangementFulfillmentType = notionalAccountArrangementFulfillmentType;
    }

    public String getNotionalAccountArrangementFulfillmentType() {
        return notionalAccountArrangementFulfillmentType;
    }
}