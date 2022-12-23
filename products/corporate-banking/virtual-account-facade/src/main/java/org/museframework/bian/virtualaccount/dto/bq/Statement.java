/*The configuration and execution of Virtual Account Configuration Fulfillment arrangement within the Virtual Account Configuration Fulfillment*/
package org.museframework.bian.virtualaccount.dto.bq;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto
public class Statement extends org.museframework.bian.classes.Statement {
    /*The required status/situation prior to the implementation of the feature*/
    @MetaField
    private String statementPreconditions;

    /*The timing and key actions/milestones involved in completing the fulfillment feature instance*/
    @MetaField
    private String statementFeatureSchedule;

    /*The Statement specific  Business Service*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.BusinessService businessService;

    /*The completion status and any triggered/dependent actions once the feature instance has been fulfilled*/
    @MetaField
    private String statementPostconditions;

    /*Reference to the specific [BS] business service type*/
    @MetaField
    private String statementServiceType;

    /*Description of the performed [BS] business service*/
    @MetaField
    private String statementServiceDescription;

    /*Mandatory and optional inputs and output information for the BS business service*/
    @MetaField
    private String statementServiceInputsandOuputs;

    /*Documentation, meeting schedules, notes, reasearch. calculations and any other work products produced by the [BS] business service*/
    @MetaField
    private String statementServiceWorkProduct;

    /**/
    @MetaField
    private String statementServiceName;

    public void setStatementPreconditions(String statementPreconditions) {
        this.statementPreconditions = statementPreconditions;
    }

    public String getStatementPreconditions() {
        return statementPreconditions;
    }

    public void setStatementFeatureSchedule(String statementFeatureSchedule) {
        this.statementFeatureSchedule = statementFeatureSchedule;
    }

    public String getStatementFeatureSchedule() {
        return statementFeatureSchedule;
    }

    public void setBusinessService(org.museframework.bian.classes.BusinessService businessService) {
        this.businessService = businessService;
    }

    public org.museframework.bian.classes.BusinessService getBusinessService() {
        return businessService;
    }

    public void setStatementPostconditions(String statementPostconditions) {
        this.statementPostconditions = statementPostconditions;
    }

    public String getStatementPostconditions() {
        return statementPostconditions;
    }

    public void setStatementServiceType(String statementServiceType) {
        this.statementServiceType = statementServiceType;
    }

    public String getStatementServiceType() {
        return statementServiceType;
    }

    public void setStatementServiceDescription(String statementServiceDescription) {
        this.statementServiceDescription = statementServiceDescription;
    }

    public String getStatementServiceDescription() {
        return statementServiceDescription;
    }

    public void setStatementServiceInputsandOuputs(String statementServiceInputsandOuputs) {
        this.statementServiceInputsandOuputs = statementServiceInputsandOuputs;
    }

    public String getStatementServiceInputsandOuputs() {
        return statementServiceInputsandOuputs;
    }

    public void setStatementServiceWorkProduct(String statementServiceWorkProduct) {
        this.statementServiceWorkProduct = statementServiceWorkProduct;
    }

    public String getStatementServiceWorkProduct() {
        return statementServiceWorkProduct;
    }

    public void setStatementServiceName(String statementServiceName) {
        this.statementServiceName = statementServiceName;
    }

    public String getStatementServiceName() {
        return statementServiceName;
    }
}