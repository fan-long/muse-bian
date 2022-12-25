/*The configuration and execution of Project Finance SPV Fulfillment arrangement within the Project Finance SPV Fulfillment*/
package org.museframework.bian.projectfinance.dto.bq;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto
public class ProjectFinanceArrangementFulfillment {
    /*The required status/situation prior to the implementation of the feature*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Condition preconditions;

    /*The timing and key actions/milestones involved in completing the fulfillment feature instance*/
    @MetaField(0)
    private String schedule;

    /*The Project Finance Arrangement Fulfillment specific Business Service*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.BusinessService businessService;

    /*The completion status and any triggered/dependent actions once the feature instance has been fulfilled*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Condition postconditions;

    /*Reference to Project Finance Arrangement Fulfillment*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.FinancialFacility projectFinanceFacilityReference;

    /*Reference to Project Finance Arrangement Fulfillment*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object projectFinanceArrangementFulfillmentReference;

    /*The type of Project Finance Arrangement Fulfillment*/
    @MetaField(0)
    private String projectFinanceArrangementFulfillmentType;

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

    public void setProjectFinanceFacilityReference(org.museframework.bian.classes.FinancialFacility projectFinanceFacilityReference) {
        this.projectFinanceFacilityReference = projectFinanceFacilityReference;
    }

    public org.museframework.bian.classes.FinancialFacility getProjectFinanceFacilityReference() {
        return projectFinanceFacilityReference;
    }

    public void setProjectFinanceArrangementFulfillmentReference(org.museframework.bian.classes.Object projectFinanceArrangementFulfillmentReference) {
        this.projectFinanceArrangementFulfillmentReference = projectFinanceArrangementFulfillmentReference;
    }

    public org.museframework.bian.classes.Object getProjectFinanceArrangementFulfillmentReference() {
        return projectFinanceArrangementFulfillmentReference;
    }

    public void setProjectFinanceArrangementFulfillmentType(String projectFinanceArrangementFulfillmentType) {
        this.projectFinanceArrangementFulfillmentType = projectFinanceArrangementFulfillmentType;
    }

    public String getProjectFinanceArrangementFulfillmentType() {
        return projectFinanceArrangementFulfillmentType;
    }
}