/*A collection of the events/transactions recorded by the log

Examples: Customer life event, Servicing event*/
package org.museframework.bian.rewpoiacc.dto.bq;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto
public class Expiration {
    /*The required status/situation before the event is captured*/
    @MetaField
    private String expirationPreconditions;

    /*The timing and key actions/milestones involved in capturing the event*/
    @MetaField
    private String expirationEventSchedule;

    /*The Reward Points Log specific  Business Service*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.BusinessService logEventExpiration;

    /*The completion status once the event has been captured*/
    @MetaField
    private String expirationPostconditions;

    /*Reference to the specific business service type*/
    @MetaField
    private String expirationLogEventExpirationServiceType;

    /*Description of the performed business service*/
    @MetaField
    private String expirationLogEventExpirationServiceDescription;

    /*Mandatory and optional inputs and output information for the business service*/
    @MetaField
    private String expirationLogEventExpirationServiceInputsandOuputs;

    /*Documentation, meeting schedules, notes, reasearch. calculations and any other work products produced by the business service*/
    @MetaField
    private String expirationLogEventExpirationServiceWorkProduct;

    /**/
    @MetaField
    private String expirationLogEventExpirationServiceName;

    public void setExpirationPreconditions(String expirationPreconditions) {
        this.expirationPreconditions = expirationPreconditions;
    }

    public String getExpirationPreconditions() {
        return expirationPreconditions;
    }

    public void setExpirationEventSchedule(String expirationEventSchedule) {
        this.expirationEventSchedule = expirationEventSchedule;
    }

    public String getExpirationEventSchedule() {
        return expirationEventSchedule;
    }

    public void setLogEventExpiration(org.museframework.bian.classes.BusinessService logEventExpiration) {
        this.logEventExpiration = logEventExpiration;
    }

    public org.museframework.bian.classes.BusinessService getLogEventExpiration() {
        return logEventExpiration;
    }

    public void setExpirationPostconditions(String expirationPostconditions) {
        this.expirationPostconditions = expirationPostconditions;
    }

    public String getExpirationPostconditions() {
        return expirationPostconditions;
    }

    public void setExpirationLogEventExpirationServiceType(String expirationLogEventExpirationServiceType) {
        this.expirationLogEventExpirationServiceType = expirationLogEventExpirationServiceType;
    }

    public String getExpirationLogEventExpirationServiceType() {
        return expirationLogEventExpirationServiceType;
    }

    public void setExpirationLogEventExpirationServiceDescription(String expirationLogEventExpirationServiceDescription) {
        this.expirationLogEventExpirationServiceDescription = expirationLogEventExpirationServiceDescription;
    }

    public String getExpirationLogEventExpirationServiceDescription() {
        return expirationLogEventExpirationServiceDescription;
    }

    public void setExpirationLogEventExpirationServiceInputsandOuputs(String expirationLogEventExpirationServiceInputsandOuputs) {
        this.expirationLogEventExpirationServiceInputsandOuputs = expirationLogEventExpirationServiceInputsandOuputs;
    }

    public String getExpirationLogEventExpirationServiceInputsandOuputs() {
        return expirationLogEventExpirationServiceInputsandOuputs;
    }

    public void setExpirationLogEventExpirationServiceWorkProduct(String expirationLogEventExpirationServiceWorkProduct) {
        this.expirationLogEventExpirationServiceWorkProduct = expirationLogEventExpirationServiceWorkProduct;
    }

    public String getExpirationLogEventExpirationServiceWorkProduct() {
        return expirationLogEventExpirationServiceWorkProduct;
    }

    public void setExpirationLogEventExpirationServiceName(String expirationLogEventExpirationServiceName) {
        this.expirationLogEventExpirationServiceName = expirationLogEventExpirationServiceName;
    }

    public String getExpirationLogEventExpirationServiceName() {
        return expirationLogEventExpirationServiceName;
    }
}