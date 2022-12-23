/*A collection of the events/transactions recorded by the log

Examples: Customer life event, Servicing event*/
package org.museframework.bian.serevehis.dto.bq;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto
public class Issue {
    /*Reference to the service position where issue arises*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object servicingPositionReference;

    /*Reference to the servicing session*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object servicingPositionSessionReference;

    /*Reference to the employee or unit raising the issue*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object employeeBusinessUnitReference;

    /*Defines the type of event/error being recorded (e.g. support facility failure)*/
    @MetaField
    private String productionIssueType;

    /*Description of the issue and involved functions, parties*/
    @MetaField
    private String productionIssueDescription;

    /*An evaluation of the event cause and impact*/
    @MetaField
    private String productionIssueDiagnosis;

    /*Description of corrective actions and assigned parties*/
    @MetaField
    private String productionIssueResolutionTask;

    public void setServicingPositionReference(org.museframework.bian.classes.Object servicingPositionReference) {
        this.servicingPositionReference = servicingPositionReference;
    }

    public org.museframework.bian.classes.Object getServicingPositionReference() {
        return servicingPositionReference;
    }

    public void setServicingPositionSessionReference(org.museframework.bian.classes.Object servicingPositionSessionReference) {
        this.servicingPositionSessionReference = servicingPositionSessionReference;
    }

    public org.museframework.bian.classes.Object getServicingPositionSessionReference() {
        return servicingPositionSessionReference;
    }

    public void setEmployeeBusinessUnitReference(org.museframework.bian.classes.Object employeeBusinessUnitReference) {
        this.employeeBusinessUnitReference = employeeBusinessUnitReference;
    }

    public org.museframework.bian.classes.Object getEmployeeBusinessUnitReference() {
        return employeeBusinessUnitReference;
    }

    public void setProductionIssueType(String productionIssueType) {
        this.productionIssueType = productionIssueType;
    }

    public String getProductionIssueType() {
        return productionIssueType;
    }

    public void setProductionIssueDescription(String productionIssueDescription) {
        this.productionIssueDescription = productionIssueDescription;
    }

    public String getProductionIssueDescription() {
        return productionIssueDescription;
    }

    public void setProductionIssueDiagnosis(String productionIssueDiagnosis) {
        this.productionIssueDiagnosis = productionIssueDiagnosis;
    }

    public String getProductionIssueDiagnosis() {
        return productionIssueDiagnosis;
    }

    public void setProductionIssueResolutionTask(String productionIssueResolutionTask) {
        this.productionIssueResolutionTask = productionIssueResolutionTask;
    }

    public String getProductionIssueResolutionTask() {
        return productionIssueResolutionTask;
    }
}