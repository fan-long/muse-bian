/*The Strategic Funding Topic advice is one specific topic that can be included in providing Strategic Funding Topic*/
package org.museframework.bian.corporatefinance.dto.bq;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto
public class TacticalFundingTopic {
    /*Reference to Tactical Funding Topic*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object corporateFinanceServicesAdviceReference;

    /*Reference to Tactical Funding Topic*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object tacticalFundingTopicReference;

    /*The type of Tactical Funding Topic*/
    @MetaField(0)
    private String tacticalFundingTopicType;

    /*The Tactical Funding Topic specific Business Service*/
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

    public void setTacticalFundingTopicReference(org.museframework.bian.classes.Object tacticalFundingTopicReference) {
        this.tacticalFundingTopicReference = tacticalFundingTopicReference;
    }

    public org.museframework.bian.classes.Object getTacticalFundingTopicReference() {
        return tacticalFundingTopicReference;
    }

    public void setTacticalFundingTopicType(String tacticalFundingTopicType) {
        this.tacticalFundingTopicType = tacticalFundingTopicType;
    }

    public String getTacticalFundingTopicType() {
        return tacticalFundingTopicType;
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