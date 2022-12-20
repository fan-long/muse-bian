/*Create and maintain a design for a procedure, product/service model or other such entity  within Fraud Model. 
Example: Create and maintain product designs and analytical models.*/
package org.museframework.bian.fraudmodel.dto.cr;

public class FraudModelSpecification {
    /*The type or category of behavior model (e.g. Decision tree, Bayesian Linear Regression, Logistic Regression, Neural Network))*/
    private String fraudModelType;

    /*A description of the model that clarifies the intended analysis/insights provided*/
    private String fraudModelPurpose;

    /*Maintains the current deployment configuration of the model*/
    private String fraudModelDeployment;

    /*Reference to the business units where the model is deployed and in use*/
    private org.museframework.bian.classes.Object employeeBusinessUnitReference;

    /*Details of the deployment for reference*/
    private String fraudModelDeploymentConfiguration;

    /*Reference to deployment task*/
    private org.museframework.bian.classes.Object fraudModelDeploymentTaskReference;

    /*Recorded details of a deployment task*/
    private String fraudModelDeploymentTaskRecord;

    /*The operational and development status of the model (e.g. under development, available, under review)*/
    private String fraudModelStatus;

    /*Tracking deployment and usage frequency*/
    private String fraudModelUsage;

    /*Track reporting of the impact/accuracy of the model's insights*/
    private String fraudModelImpact;

    /*Release version of available model plus version history as appropriate*/
    private String fraudModelVersion;

    /*The deployable model in any appropriate form (including historical versions as appropriate)*/
    private String fraudModel;

    public void setFraudModelType(String fraudModelType) {
        this.fraudModelType = fraudModelType;
    }

    public String getFraudModelType() {
        return fraudModelType;
    }

    public void setFraudModelPurpose(String fraudModelPurpose) {
        this.fraudModelPurpose = fraudModelPurpose;
    }

    public String getFraudModelPurpose() {
        return fraudModelPurpose;
    }

    public void setFraudModelDeployment(String fraudModelDeployment) {
        this.fraudModelDeployment = fraudModelDeployment;
    }

    public String getFraudModelDeployment() {
        return fraudModelDeployment;
    }

    public void setEmployeeBusinessUnitReference(org.museframework.bian.classes.Object employeeBusinessUnitReference) {
        this.employeeBusinessUnitReference = employeeBusinessUnitReference;
    }

    public org.museframework.bian.classes.Object getEmployeeBusinessUnitReference() {
        return employeeBusinessUnitReference;
    }

    public void setFraudModelDeploymentConfiguration(String fraudModelDeploymentConfiguration) {
        this.fraudModelDeploymentConfiguration = fraudModelDeploymentConfiguration;
    }

    public String getFraudModelDeploymentConfiguration() {
        return fraudModelDeploymentConfiguration;
    }

    public void setFraudModelDeploymentTaskReference(org.museframework.bian.classes.Object fraudModelDeploymentTaskReference) {
        this.fraudModelDeploymentTaskReference = fraudModelDeploymentTaskReference;
    }

    public org.museframework.bian.classes.Object getFraudModelDeploymentTaskReference() {
        return fraudModelDeploymentTaskReference;
    }

    public void setFraudModelDeploymentTaskRecord(String fraudModelDeploymentTaskRecord) {
        this.fraudModelDeploymentTaskRecord = fraudModelDeploymentTaskRecord;
    }

    public String getFraudModelDeploymentTaskRecord() {
        return fraudModelDeploymentTaskRecord;
    }

    public void setFraudModelStatus(String fraudModelStatus) {
        this.fraudModelStatus = fraudModelStatus;
    }

    public String getFraudModelStatus() {
        return fraudModelStatus;
    }

    public void setFraudModelUsage(String fraudModelUsage) {
        this.fraudModelUsage = fraudModelUsage;
    }

    public String getFraudModelUsage() {
        return fraudModelUsage;
    }

    public void setFraudModelImpact(String fraudModelImpact) {
        this.fraudModelImpact = fraudModelImpact;
    }

    public String getFraudModelImpact() {
        return fraudModelImpact;
    }

    public void setFraudModelVersion(String fraudModelVersion) {
        this.fraudModelVersion = fraudModelVersion;
    }

    public String getFraudModelVersion() {
        return fraudModelVersion;
    }

    public void setFraudModel(String fraudModel) {
        this.fraudModel = fraudModel;
    }

    public String getFraudModel() {
        return fraudModel;
    }
}