/**/
package org.museframework.bian.mortgageloan.dto.bq;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto
public class FinancialAccounting {
    /*The required status/situation prior to the implementation of the feature*/
    @MetaField(0)
    private String financialAccountingPreconditions;

    /*The timing and key actions/milestones involved in completing the fulfillment feature instance*/
    @MetaField(0)
    private String financialAccountingFeatureSchedule;

    /*The Mortgage Loan Arrangement specific Business Service*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.BusinessService financialAccounting;

    /*The completion status and any triggered/dependent actions once the feature instance has been fulfilled*/
    @MetaField(0)
    private String financialAccountingPostconditions;

    /*Reference to the specific business service type*/
    @MetaField(0)
    private String financialAccountingFinancialAccountingServiceType;

    /*Description of the performed business service*/
    @MetaField(0)
    private String financialAccountingFinancialAccountingServiceDescription;

    /*Mandatory and optional inputs and output information for the business service*/
    @MetaField(0)
    private String financialAccountingFinancialAccountingServiceInputsandOuputs;

    /*Documentation, meeting schedules, notes, reasearch. calculations and any other work products produced by the business service*/
    @MetaField(0)
    private String financialAccountingFinancialAccountingServiceWorkProduct;

    /**/
    @MetaField(0)
    private String financialAccountingFinancialAccountingServiceName;

    public void setFinancialAccountingPreconditions(String financialAccountingPreconditions) {
        this.financialAccountingPreconditions = financialAccountingPreconditions;
    }

    public String getFinancialAccountingPreconditions() {
        return financialAccountingPreconditions;
    }

    public void setFinancialAccountingFeatureSchedule(String financialAccountingFeatureSchedule) {
        this.financialAccountingFeatureSchedule = financialAccountingFeatureSchedule;
    }

    public String getFinancialAccountingFeatureSchedule() {
        return financialAccountingFeatureSchedule;
    }

    public void setFinancialAccounting(org.museframework.bian.classes.BusinessService financialAccounting) {
        this.financialAccounting = financialAccounting;
    }

    public org.museframework.bian.classes.BusinessService getFinancialAccounting() {
        return financialAccounting;
    }

    public void setFinancialAccountingPostconditions(String financialAccountingPostconditions) {
        this.financialAccountingPostconditions = financialAccountingPostconditions;
    }

    public String getFinancialAccountingPostconditions() {
        return financialAccountingPostconditions;
    }

    public void setFinancialAccountingFinancialAccountingServiceType(String financialAccountingFinancialAccountingServiceType) {
        this.financialAccountingFinancialAccountingServiceType = financialAccountingFinancialAccountingServiceType;
    }

    public String getFinancialAccountingFinancialAccountingServiceType() {
        return financialAccountingFinancialAccountingServiceType;
    }

    public void setFinancialAccountingFinancialAccountingServiceDescription(String financialAccountingFinancialAccountingServiceDescription) {
        this.financialAccountingFinancialAccountingServiceDescription = financialAccountingFinancialAccountingServiceDescription;
    }

    public String getFinancialAccountingFinancialAccountingServiceDescription() {
        return financialAccountingFinancialAccountingServiceDescription;
    }

    public void setFinancialAccountingFinancialAccountingServiceInputsandOuputs(String financialAccountingFinancialAccountingServiceInputsandOuputs) {
        this.financialAccountingFinancialAccountingServiceInputsandOuputs = financialAccountingFinancialAccountingServiceInputsandOuputs;
    }

    public String getFinancialAccountingFinancialAccountingServiceInputsandOuputs() {
        return financialAccountingFinancialAccountingServiceInputsandOuputs;
    }

    public void setFinancialAccountingFinancialAccountingServiceWorkProduct(String financialAccountingFinancialAccountingServiceWorkProduct) {
        this.financialAccountingFinancialAccountingServiceWorkProduct = financialAccountingFinancialAccountingServiceWorkProduct;
    }

    public String getFinancialAccountingFinancialAccountingServiceWorkProduct() {
        return financialAccountingFinancialAccountingServiceWorkProduct;
    }

    public void setFinancialAccountingFinancialAccountingServiceName(String financialAccountingFinancialAccountingServiceName) {
        this.financialAccountingFinancialAccountingServiceName = financialAccountingFinancialAccountingServiceName;
    }

    public String getFinancialAccountingFinancialAccountingServiceName() {
        return financialAccountingFinancialAccountingServiceName;
    }
}