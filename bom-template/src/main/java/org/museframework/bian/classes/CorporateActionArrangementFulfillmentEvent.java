/*The fulfilment of a Corporate Action Arrangement*/
package org.museframework.bian.classes;

public class CorporateActionArrangementFulfillmentEvent {
    /*The type of corporate action applied to the securities holdings*/
    private String corporateActionArrangementFulfillmentEventType;

    /*Details describing the purpose and impact of processing the action*/
    private String corporateActionArrangementFulfillmentEventDescription;

    /*The date and time the corporate action was processed to the account*/
    private String corporateActionArrangementFulfillmentEventDate;

    /*The outcome of applying the action to the account (can be simple confirmation)*/
    private String corporateActionArrangementFulfillmentEventResult;

    public void setCorporateActionArrangementFulfillmentEventType(String corporateActionArrangementFulfillmentEventType) {
        this.corporateActionArrangementFulfillmentEventType = corporateActionArrangementFulfillmentEventType;
    }

    public String getCorporateActionArrangementFulfillmentEventType() {
        return corporateActionArrangementFulfillmentEventType;
    }

    public void setCorporateActionArrangementFulfillmentEventDescription(String corporateActionArrangementFulfillmentEventDescription) {
        this.corporateActionArrangementFulfillmentEventDescription = corporateActionArrangementFulfillmentEventDescription;
    }

    public String getCorporateActionArrangementFulfillmentEventDescription() {
        return corporateActionArrangementFulfillmentEventDescription;
    }

    public void setCorporateActionArrangementFulfillmentEventDate(String corporateActionArrangementFulfillmentEventDate) {
        this.corporateActionArrangementFulfillmentEventDate = corporateActionArrangementFulfillmentEventDate;
    }

    public String getCorporateActionArrangementFulfillmentEventDate() {
        return corporateActionArrangementFulfillmentEventDate;
    }

    public void setCorporateActionArrangementFulfillmentEventResult(String corporateActionArrangementFulfillmentEventResult) {
        this.corporateActionArrangementFulfillmentEventResult = corporateActionArrangementFulfillmentEventResult;
    }

    public String getCorporateActionArrangementFulfillmentEventResult() {
        return corporateActionArrangementFulfillmentEventResult;
    }
}