/*The Strategic Funding Topic advice is one specific topic that can be included in providing Strategic Funding Topic*/
package org.museframework.bian.corporatefinance.dto.bq;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto
public class TaxOptimizationTopic {
    /*Reference to Tax Optimization Topic*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object corporateFinanceServicesAdviceReference;

    /*Reference to Tax Optimization Topic*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object taxOptimizationTopicReference;

    /*The type of Tax Optimization Topic*/
    @MetaField
    private String taxOptimizationTopicType;

    /*The Tax Optimization Topic specific Business Service*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.BusinessService businessService;

    /*The operating unit/employee responsible for providing the advice/recommendation*/
    @MetaField
    private String businessUnitEmployeeReference;

    /*The completion status once the advice/recommendation has been provided*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Condition postconditions;

    /*The required status/situation before the advice/recommendation can be provided*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Condition preconditions;

    /*The timing and key actions/milestones involved in providing the advice/recommendation*/
    @MetaField
    private String schedule;

    public void setCorporateFinanceServicesAdviceReference(org.museframework.bian.classes.Object corporateFinanceServicesAdviceReference) {
        this.corporateFinanceServicesAdviceReference = corporateFinanceServicesAdviceReference;
    }

    public org.museframework.bian.classes.Object getCorporateFinanceServicesAdviceReference() {
        return corporateFinanceServicesAdviceReference;
    }

    public void setTaxOptimizationTopicReference(org.museframework.bian.classes.Object taxOptimizationTopicReference) {
        this.taxOptimizationTopicReference = taxOptimizationTopicReference;
    }

    public org.museframework.bian.classes.Object getTaxOptimizationTopicReference() {
        return taxOptimizationTopicReference;
    }

    public void setTaxOptimizationTopicType(String taxOptimizationTopicType) {
        this.taxOptimizationTopicType = taxOptimizationTopicType;
    }

    public String getTaxOptimizationTopicType() {
        return taxOptimizationTopicType;
    }

    public void setBusinessService(org.museframework.bian.classes.BusinessService businessService) {
        this.businessService = businessService;
    }

    public org.museframework.bian.classes.BusinessService getBusinessService() {
        return businessService;
    }

    public void setBusinessUnitEmployeeReference(String businessUnitEmployeeReference) {
        this.businessUnitEmployeeReference = businessUnitEmployeeReference;
    }

    public String getBusinessUnitEmployeeReference() {
        return businessUnitEmployeeReference;
    }

    public void setPostconditions(org.museframework.bian.classes.Condition postconditions) {
        this.postconditions = postconditions;
    }

    public org.museframework.bian.classes.Condition getPostconditions() {
        return postconditions;
    }

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
}