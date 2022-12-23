/*The Incident Troubleshooting Oversight Duty is a specific role or responsibility that is one aspect of Incident Troubleshooting Oversight Duty*/
package org.museframework.bian.corbanrelman.dto.bq;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto
public class RelationshipReciprocityAssessmentDuty {
    /*The required status/situation before the duty/obligation can be met*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Condition preconditions;

    /*The operating unit/employee responsible for undertaking the duty*/
    @MetaField
    private String businessUnitEmployeeReference;

    /*The timing and key actions/milestones involved in fulfilling the duty*/
    @MetaField
    private String schedule;

    /*The Relationship Reciprocity Assessment Duty specific Business Service*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.BusinessService businessService;

    /*The completion status once the duty has been complied with (note the need to fulfill a duty may recur frequently)*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Condition postconditions;

    /*Reference to Relationship Reciprocity Assessment Duty*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Plan correpondentBankRelationshipManagementPlanReference;

    /*Reference to Relationship Reciprocity Assessment Duty*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.PlannedAction relationshipReciprocityAssessmentDutyReference;

    /*The type of Relationship Reciprocity Assessment Duty*/
    @MetaField
    private String relationshipReciprocityAssessmentDutyType;

    public void setPreconditions(org.museframework.bian.classes.Condition preconditions) {
        this.preconditions = preconditions;
    }

    public org.museframework.bian.classes.Condition getPreconditions() {
        return preconditions;
    }

    public void setBusinessUnitEmployeeReference(String businessUnitEmployeeReference) {
        this.businessUnitEmployeeReference = businessUnitEmployeeReference;
    }

    public String getBusinessUnitEmployeeReference() {
        return businessUnitEmployeeReference;
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

    public void setPostconditions(org.museframework.bian.classes.Condition postconditions) {
        this.postconditions = postconditions;
    }

    public org.museframework.bian.classes.Condition getPostconditions() {
        return postconditions;
    }

    public void setCorrepondentBankRelationshipManagementPlanReference(org.museframework.bian.classes.Plan correpondentBankRelationshipManagementPlanReference) {
        this.correpondentBankRelationshipManagementPlanReference = correpondentBankRelationshipManagementPlanReference;
    }

    public org.museframework.bian.classes.Plan getCorrepondentBankRelationshipManagementPlanReference() {
        return correpondentBankRelationshipManagementPlanReference;
    }

    public void setRelationshipReciprocityAssessmentDutyReference(org.museframework.bian.classes.PlannedAction relationshipReciprocityAssessmentDutyReference) {
        this.relationshipReciprocityAssessmentDutyReference = relationshipReciprocityAssessmentDutyReference;
    }

    public org.museframework.bian.classes.PlannedAction getRelationshipReciprocityAssessmentDutyReference() {
        return relationshipReciprocityAssessmentDutyReference;
    }

    public void setRelationshipReciprocityAssessmentDutyType(String relationshipReciprocityAssessmentDutyType) {
        this.relationshipReciprocityAssessmentDutyType = relationshipReciprocityAssessmentDutyType;
    }

    public String getRelationshipReciprocityAssessmentDutyType() {
        return relationshipReciprocityAssessmentDutyType;
    }
}