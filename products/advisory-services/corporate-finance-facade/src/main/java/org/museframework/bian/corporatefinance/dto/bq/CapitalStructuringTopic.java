/*The Strategic Funding Topic advice is one specific topic that can be included in providing Strategic Funding Topic*/
package org.museframework.bian.corporatefinance.dto.bq;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto
public class CapitalStructuringTopic {
    /*Reference to Capital Structuring Topic*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object corporateFinanceServicesAdviceReference;

    /*Reference to Capital Structuring Topic*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object capitalStructuringTopicReference;

    /*The type of Capital Structuring Topic*/
    @MetaField(0)
    private String capitalStructuringTopicType;

    /*The Capital Structuring Topic specific Business Service*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.BusinessService businessService;

    /*The operating unit/employee responsible for providing the advice/recommendation*/
    @MetaField(0)
    private String businessUnitEmployeeReference;

    /*The completion status once the advice/recommendation has been provided*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Condition postconditions;

    /*The required status/situation before the advice/recommendation can be provided*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Condition preconditions;

    /*The timing and key actions/milestones involved in providing the advice/recommendation*/
    @MetaField(0)
    private String schedule;

    public void setCorporateFinanceServicesAdviceReference(org.museframework.bian.classes.Object corporateFinanceServicesAdviceReference) {
        this.corporateFinanceServicesAdviceReference = corporateFinanceServicesAdviceReference;
    }

    public org.museframework.bian.classes.Object getCorporateFinanceServicesAdviceReference() {
        return corporateFinanceServicesAdviceReference;
    }

    public void setCapitalStructuringTopicReference(org.museframework.bian.classes.Object capitalStructuringTopicReference) {
        this.capitalStructuringTopicReference = capitalStructuringTopicReference;
    }

    public org.museframework.bian.classes.Object getCapitalStructuringTopicReference() {
        return capitalStructuringTopicReference;
    }

    public void setCapitalStructuringTopicType(String capitalStructuringTopicType) {
        this.capitalStructuringTopicType = capitalStructuringTopicType;
    }

    public String getCapitalStructuringTopicType() {
        return capitalStructuringTopicType;
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