/*The Incident Troubleshooting Oversight Duty is a specific role or responsibility that is one aspect of Incident Troubleshooting Oversight Duty*/
package org.museframework.bian.corbanrelman.dto.bq;

public class IncidentTroubleshootingOversightDuty {
    /*The required status/situation before the duty/obligation can be met*/
    private org.museframework.bian.classes.Condition preconditions;

    /*The operating unit/employee responsible for undertaking the duty*/
    private String businessUnitEmployeeReference;

    /*The timing and key actions/milestones involved in fulfilling the duty*/
    private String schedule;

    /*The Incident Troubleshooting Oversight Duty specific Business Service*/
    private org.museframework.bian.classes.BusinessService businessService;

    /*The completion status once the duty has been complied with (note the need to fulfill a duty may recur frequently)*/
    private org.museframework.bian.classes.Condition postconditions;

    /*Reference to Incident Troubleshooting Oversight Duty*/
    private org.museframework.bian.classes.Plan correpondentBankRelationshipManagementPlanReference;

    /*Reference to Incident Troubleshooting Oversight Duty*/
    private org.museframework.bian.classes.PlannedAction incidentTroubleshootingOversightDutyReference;

    /*The type of Incident Troubleshooting Oversight Duty*/
    private String incidentTroubleshootingOversightDutyType;

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

    public void setIncidentTroubleshootingOversightDutyReference(org.museframework.bian.classes.PlannedAction incidentTroubleshootingOversightDutyReference) {
        this.incidentTroubleshootingOversightDutyReference = incidentTroubleshootingOversightDutyReference;
    }

    public org.museframework.bian.classes.PlannedAction getIncidentTroubleshootingOversightDutyReference() {
        return incidentTroubleshootingOversightDutyReference;
    }

    public void setIncidentTroubleshootingOversightDutyType(String incidentTroubleshootingOversightDutyType) {
        this.incidentTroubleshootingOversightDutyType = incidentTroubleshootingOversightDutyType;
    }

    public String getIncidentTroubleshootingOversightDutyType() {
        return incidentTroubleshootingOversightDutyType;
    }
}