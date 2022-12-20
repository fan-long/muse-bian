/*A problem that occurred during the running of a system.*/
package org.museframework.bian.classes;

public class ProductionIssue {
    /*The Type of production problem (error)
*/
    private String productionIssueType;

    /*Description of the production problem*/
    private String productionIssueDescription;

    /*Evaluation of the production problem cause and impact assessment*/
    private String productionIssueDiagnosis;

    /*Description of corrective action proposed and taken*/
    private String productionIssueResolutionTask;

    /*The state of resolution of a reported production problem*/
    private String productionIssueStatus;

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

    public void setProductionIssueStatus(String productionIssueStatus) {
        this.productionIssueStatus = productionIssueStatus;
    }

    public String getProductionIssueStatus() {
        return productionIssueStatus;
    }
}