/**/
package org.museframework.bian.merchandisingloan.dto.bq;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

//refer to BOClass org.museframework.bian.classes.FinancialInstrument
@MetaDto
public class FinancialInstrument {
    /*The required status/situation prior to the implementation of the feature*/
    @MetaField
    private String financialInstrumentPreconditions;

    /*The timing and key actions/milestones involved in completing the fulfillment feature instance*/
    @MetaField
    private String financialInstrumentFeatureSchedule;

    /*The Merchandising Loan Arrangement specific Business Service*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.BusinessService financialInstrument;

    /*The completion status and any triggered/dependent actions once the feature instance has been fulfilled*/
    @MetaField
    private String financialInstrumentPostconditions;

    /*Reference to the specific business service type*/
    @MetaField
    private String financialInstrumentFinancialInstrumentServiceType;

    /*Description of the performed business service*/
    @MetaField
    private String financialInstrumentFinancialInstrumentServiceDescription;

    /*Mandatory and optional inputs and output information for the business service*/
    @MetaField
    private String financialInstrumentFinancialInstrumentServiceInputsandOuputs;

    /*Documentation, meeting schedules, notes, reasearch. calculations and any other work products produced by the business service*/
    @MetaField
    private String financialInstrumentFinancialInstrumentServiceWorkProduct;

    /**/
    @MetaField
    private String financialInstrumentFinancialInstrumentServiceName;

    public void setFinancialInstrumentPreconditions(String financialInstrumentPreconditions) {
        this.financialInstrumentPreconditions = financialInstrumentPreconditions;
    }

    public String getFinancialInstrumentPreconditions() {
        return financialInstrumentPreconditions;
    }

    public void setFinancialInstrumentFeatureSchedule(String financialInstrumentFeatureSchedule) {
        this.financialInstrumentFeatureSchedule = financialInstrumentFeatureSchedule;
    }

    public String getFinancialInstrumentFeatureSchedule() {
        return financialInstrumentFeatureSchedule;
    }

    public void setFinancialInstrument(org.museframework.bian.classes.BusinessService financialInstrument) {
        this.financialInstrument = financialInstrument;
    }

    public org.museframework.bian.classes.BusinessService getFinancialInstrument() {
        return financialInstrument;
    }

    public void setFinancialInstrumentPostconditions(String financialInstrumentPostconditions) {
        this.financialInstrumentPostconditions = financialInstrumentPostconditions;
    }

    public String getFinancialInstrumentPostconditions() {
        return financialInstrumentPostconditions;
    }

    public void setFinancialInstrumentFinancialInstrumentServiceType(String financialInstrumentFinancialInstrumentServiceType) {
        this.financialInstrumentFinancialInstrumentServiceType = financialInstrumentFinancialInstrumentServiceType;
    }

    public String getFinancialInstrumentFinancialInstrumentServiceType() {
        return financialInstrumentFinancialInstrumentServiceType;
    }

    public void setFinancialInstrumentFinancialInstrumentServiceDescription(String financialInstrumentFinancialInstrumentServiceDescription) {
        this.financialInstrumentFinancialInstrumentServiceDescription = financialInstrumentFinancialInstrumentServiceDescription;
    }

    public String getFinancialInstrumentFinancialInstrumentServiceDescription() {
        return financialInstrumentFinancialInstrumentServiceDescription;
    }

    public void setFinancialInstrumentFinancialInstrumentServiceInputsandOuputs(String financialInstrumentFinancialInstrumentServiceInputsandOuputs) {
        this.financialInstrumentFinancialInstrumentServiceInputsandOuputs = financialInstrumentFinancialInstrumentServiceInputsandOuputs;
    }

    public String getFinancialInstrumentFinancialInstrumentServiceInputsandOuputs() {
        return financialInstrumentFinancialInstrumentServiceInputsandOuputs;
    }

    public void setFinancialInstrumentFinancialInstrumentServiceWorkProduct(String financialInstrumentFinancialInstrumentServiceWorkProduct) {
        this.financialInstrumentFinancialInstrumentServiceWorkProduct = financialInstrumentFinancialInstrumentServiceWorkProduct;
    }

    public String getFinancialInstrumentFinancialInstrumentServiceWorkProduct() {
        return financialInstrumentFinancialInstrumentServiceWorkProduct;
    }

    public void setFinancialInstrumentFinancialInstrumentServiceName(String financialInstrumentFinancialInstrumentServiceName) {
        this.financialInstrumentFinancialInstrumentServiceName = financialInstrumentFinancialInstrumentServiceName;
    }

    public String getFinancialInstrumentFinancialInstrumentServiceName() {
        return financialInstrumentFinancialInstrumentServiceName;
    }
}