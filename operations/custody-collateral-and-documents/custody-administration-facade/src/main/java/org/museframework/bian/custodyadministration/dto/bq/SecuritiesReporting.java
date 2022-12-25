/*Fulfill any scheduled and ad-hoc obligations under a service arrangement, most typically for a financial product or facility  within Custody Administration. 
Example: Perform the scheduled (e.g. statements, standing orders) and ad-hoc/requested (e.g. balance inquiries, fund transfers) fulfillment tasks for a customer current account facility.*/
package org.museframework.bian.custodyadministration.dto.bq;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto
public class SecuritiesReporting {
    /*The required status/situation prior to the implementation of the feature*/
    @MetaField(0)
    private String securitiesReportingPreconditions;

    /*The timing and key actions/milestones involved in completing the fulfillment feature instance*/
    @MetaField(0)
    private String securitiesReportingFeatureSchedule;

    /*The Custody Arrangement specific Business Service*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.BusinessService custodySecuritiesReporting;

    /*The completion status and any triggered/dependent actions once the feature instance has been fulfilled*/
    @MetaField(0)
    private String securitiesReportingPostconditions;

    /*Reference to the specific business service type*/
    @MetaField(0)
    private String securitiesReportingCustodySecuritiesReportingServiceType;

    /*Description of the performed business service*/
    @MetaField(0)
    private String securitiesReportingCustodySecuritiesReportingServiceDescription;

    /*Mandatory and optional inputs and output information for the business service*/
    @MetaField(0)
    private String securitiesReportingCustodySecuritiesReportingServiceInputsandOuputs;

    /*Documentation, meeting schedules, notes, reasearch. calculations and any other work products produced by the business service*/
    @MetaField(0)
    private String securitiesReportingCustodySecuritiesReportingServiceWorkProduct;

    /**/
    @MetaField(0)
    private String securitiesReportingCustodySecuritiesReportingServiceName;

    public void setSecuritiesReportingPreconditions(String securitiesReportingPreconditions) {
        this.securitiesReportingPreconditions = securitiesReportingPreconditions;
    }

    public String getSecuritiesReportingPreconditions() {
        return securitiesReportingPreconditions;
    }

    public void setSecuritiesReportingFeatureSchedule(String securitiesReportingFeatureSchedule) {
        this.securitiesReportingFeatureSchedule = securitiesReportingFeatureSchedule;
    }

    public String getSecuritiesReportingFeatureSchedule() {
        return securitiesReportingFeatureSchedule;
    }

    public void setCustodySecuritiesReporting(org.museframework.bian.classes.BusinessService custodySecuritiesReporting) {
        this.custodySecuritiesReporting = custodySecuritiesReporting;
    }

    public org.museframework.bian.classes.BusinessService getCustodySecuritiesReporting() {
        return custodySecuritiesReporting;
    }

    public void setSecuritiesReportingPostconditions(String securitiesReportingPostconditions) {
        this.securitiesReportingPostconditions = securitiesReportingPostconditions;
    }

    public String getSecuritiesReportingPostconditions() {
        return securitiesReportingPostconditions;
    }

    public void setSecuritiesReportingCustodySecuritiesReportingServiceType(String securitiesReportingCustodySecuritiesReportingServiceType) {
        this.securitiesReportingCustodySecuritiesReportingServiceType = securitiesReportingCustodySecuritiesReportingServiceType;
    }

    public String getSecuritiesReportingCustodySecuritiesReportingServiceType() {
        return securitiesReportingCustodySecuritiesReportingServiceType;
    }

    public void setSecuritiesReportingCustodySecuritiesReportingServiceDescription(String securitiesReportingCustodySecuritiesReportingServiceDescription) {
        this.securitiesReportingCustodySecuritiesReportingServiceDescription = securitiesReportingCustodySecuritiesReportingServiceDescription;
    }

    public String getSecuritiesReportingCustodySecuritiesReportingServiceDescription() {
        return securitiesReportingCustodySecuritiesReportingServiceDescription;
    }

    public void setSecuritiesReportingCustodySecuritiesReportingServiceInputsandOuputs(String securitiesReportingCustodySecuritiesReportingServiceInputsandOuputs) {
        this.securitiesReportingCustodySecuritiesReportingServiceInputsandOuputs = securitiesReportingCustodySecuritiesReportingServiceInputsandOuputs;
    }

    public String getSecuritiesReportingCustodySecuritiesReportingServiceInputsandOuputs() {
        return securitiesReportingCustodySecuritiesReportingServiceInputsandOuputs;
    }

    public void setSecuritiesReportingCustodySecuritiesReportingServiceWorkProduct(String securitiesReportingCustodySecuritiesReportingServiceWorkProduct) {
        this.securitiesReportingCustodySecuritiesReportingServiceWorkProduct = securitiesReportingCustodySecuritiesReportingServiceWorkProduct;
    }

    public String getSecuritiesReportingCustodySecuritiesReportingServiceWorkProduct() {
        return securitiesReportingCustodySecuritiesReportingServiceWorkProduct;
    }

    public void setSecuritiesReportingCustodySecuritiesReportingServiceName(String securitiesReportingCustodySecuritiesReportingServiceName) {
        this.securitiesReportingCustodySecuritiesReportingServiceName = securitiesReportingCustodySecuritiesReportingServiceName;
    }

    public String getSecuritiesReportingCustodySecuritiesReportingServiceName() {
        return securitiesReportingCustodySecuritiesReportingServiceName;
    }
}