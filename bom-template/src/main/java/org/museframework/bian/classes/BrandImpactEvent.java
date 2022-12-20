/*An event that threatens the brand */
package org.museframework.bian.classes;

public class BrandImpactEvent {
    /*The type of event that threatens the brand (e.g. production issue, legal issue, employee action, marketing conflict)*/
    private String brandImpactEventType;

    /*Detailed description of the event and situation leading to the brand exposure*/
    private String brandImpactEventDescription;

    /*Schedule of actions taken to mitigate the event (plan and actual)*/
    private String responseSchedule;

    /*Actions taken to mitigate the event (e.g. press release, other communications, corrective/compensatory actions*/
    private String responseAction;

    public void setBrandImpactEventType(String brandImpactEventType) {
        this.brandImpactEventType = brandImpactEventType;
    }

    public String getBrandImpactEventType() {
        return brandImpactEventType;
    }

    public void setBrandImpactEventDescription(String brandImpactEventDescription) {
        this.brandImpactEventDescription = brandImpactEventDescription;
    }

    public String getBrandImpactEventDescription() {
        return brandImpactEventDescription;
    }

    public void setResponseSchedule(String responseSchedule) {
        this.responseSchedule = responseSchedule;
    }

    public String getResponseSchedule() {
        return responseSchedule;
    }

    public void setResponseAction(String responseAction) {
        this.responseAction = responseAction;
    }

    public String getResponseAction() {
        return responseAction;
    }
}