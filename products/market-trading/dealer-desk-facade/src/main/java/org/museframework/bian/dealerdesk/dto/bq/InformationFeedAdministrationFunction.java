/*An operational service or function supported within the Dealer Desk Consolidated Position Tracking Function for doing Dealer Desk Consolidated Position Tracking Function*/
package org.museframework.bian.dealerdesk.dto.bq;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto
public class InformationFeedAdministrationFunction {
    /*The required status/situation and or tasks that need to be completed prior to the invocation of the feature*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Condition preconditions;

    /*The schedule and timing of the function*/
    @MetaField
    private String schedule;

    /*The Information Feed Administration Function specific Business Service*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.BusinessService businessService;

    /*Reference to Information Feed Administration Function*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Session dealerDeskOperatingSessionReference;

    /*Reference to Information Feed Administration Function*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Function informationFeedAdministrationFunctionReference;

    /*The type of Information Feed Administration Function*/
    @MetaField
    private String informationFeedAdministrationFunctionType;

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

    public void setDealerDeskOperatingSessionReference(org.museframework.bian.classes.Session dealerDeskOperatingSessionReference) {
        this.dealerDeskOperatingSessionReference = dealerDeskOperatingSessionReference;
    }

    public org.museframework.bian.classes.Session getDealerDeskOperatingSessionReference() {
        return dealerDeskOperatingSessionReference;
    }

    public void setInformationFeedAdministrationFunctionReference(org.museframework.bian.classes.Function informationFeedAdministrationFunctionReference) {
        this.informationFeedAdministrationFunctionReference = informationFeedAdministrationFunctionReference;
    }

    public org.museframework.bian.classes.Function getInformationFeedAdministrationFunctionReference() {
        return informationFeedAdministrationFunctionReference;
    }

    public void setInformationFeedAdministrationFunctionType(String informationFeedAdministrationFunctionType) {
        this.informationFeedAdministrationFunctionType = informationFeedAdministrationFunctionType;
    }

    public String getInformationFeedAdministrationFunctionType() {
        return informationFeedAdministrationFunctionType;
    }
}