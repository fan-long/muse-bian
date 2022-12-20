/*An event determined by a corporation's board of directors, that changes the existing corporate capital structure or financial condition. (ISO20022)

A corporate action is any activity that brings material change to an organization and impacts its stakeholders, including shareholders, both common and preferred, as well as bondholders. These events are generally approved by the company's board of directors; shareholders may be permitted to vote on some events as well. Some corporate actions require shareholders to submit a response. (Investopeda)

A corporate action is an event initiated by a public company that brings or could bring an actual change to the securities-equity or debt-issued by the company. Corporate actions are typically agreed upon by a company's board of directors and authorized by the shareholders.  (Wikipeda)*/
package org.museframework.bian.classes;

public class CorporateAction {
    /*Specifies the status of the CA event. (ISO20022)*/
    private org.museframework.bian.enumerations.Corporateactionstatusvalues corporateActionStatus;

    /*Type of corporate action event. (ISO20022)*/
    private org.museframework.bian.enumerations.Corporateactiontypevalues corporateActionType;

    /**/
    private org.museframework.bian.enumerations.Corporateactiondatetimetypevalues corporateActionDateTime;

    public void setCorporateActionStatus(org.museframework.bian.enumerations.Corporateactionstatusvalues corporateActionStatus) {
        this.corporateActionStatus = corporateActionStatus;
    }

    public org.museframework.bian.enumerations.Corporateactionstatusvalues getCorporateActionStatus() {
        return corporateActionStatus;
    }

    public void setCorporateActionType(org.museframework.bian.enumerations.Corporateactiontypevalues corporateActionType) {
        this.corporateActionType = corporateActionType;
    }

    public org.museframework.bian.enumerations.Corporateactiontypevalues getCorporateActionType() {
        return corporateActionType;
    }

    public void setCorporateActionDateTime(org.museframework.bian.enumerations.Corporateactiondatetimetypevalues corporateActionDateTime) {
        this.corporateActionDateTime = corporateActionDateTime;
    }

    public org.museframework.bian.enumerations.Corporateactiondatetimetypevalues getCorporateActionDateTime() {
        return corporateActionDateTime;
    }
}