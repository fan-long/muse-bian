/*Create and maintain a design for a procedure, product/service model or other such entity  within Customer Behavior Models. 
Example: Create and maintain product designs and analytical models.*/
package org.museframework.bian.cusbehmod.dto.cr;

public class CustomerBehaviorModelSpecification {
    /*The type or category of behavior model (e.g. life event detection)*/
    private String customerBehaviorModelType;

    /*A description of the model that clarifies the intended analysis/insights provided*/
    private String customerBehaviorModelPurpose;

    /*Maintains the current deployment configuration of the model*/
    private String customerBehaviorModelDeployment;

    /*Reference to the business units where the model is deployed and in use*/
    private org.museframework.bian.classes.Object employeeBusinessUnitReference;

    /*Details of the deployment for reference*/
    private String customerBehaviorModelDeploymentConfiguration;

    /*Reference to deployment task*/
    private org.museframework.bian.classes.Object customerBehaviorModelDeploymentTaskReference;

    /*Recorded details of a deployment task*/
    private String customerBehaviorModelDeploymentTaskRecord;

    /*The operational and development status of the model (e.g. under development, available, under review)*/
    private String customerBehaviorModelStatus;

    /*Tracking deployment and usage frequency*/
    private String customerBehaviorModelUsage;

    /*Track reporting of the impact/accuracy of the model's insights*/
    private String customerBehaviorModelImpact;

    /*Release version of available model plus version history as appropriate*/
    private String customerBehaviorModelVersion;

    /*The deployable model in any appropriate form (including historical versions as appropriate)*/
    private String customerBehaviorModel;

    public void setCustomerBehaviorModelType(String customerBehaviorModelType) {
        this.customerBehaviorModelType = customerBehaviorModelType;
    }

    public String getCustomerBehaviorModelType() {
        return customerBehaviorModelType;
    }

    public void setCustomerBehaviorModelPurpose(String customerBehaviorModelPurpose) {
        this.customerBehaviorModelPurpose = customerBehaviorModelPurpose;
    }

    public String getCustomerBehaviorModelPurpose() {
        return customerBehaviorModelPurpose;
    }

    public void setCustomerBehaviorModelDeployment(String customerBehaviorModelDeployment) {
        this.customerBehaviorModelDeployment = customerBehaviorModelDeployment;
    }

    public String getCustomerBehaviorModelDeployment() {
        return customerBehaviorModelDeployment;
    }

    public void setEmployeeBusinessUnitReference(org.museframework.bian.classes.Object employeeBusinessUnitReference) {
        this.employeeBusinessUnitReference = employeeBusinessUnitReference;
    }

    public org.museframework.bian.classes.Object getEmployeeBusinessUnitReference() {
        return employeeBusinessUnitReference;
    }

    public void setCustomerBehaviorModelDeploymentConfiguration(String customerBehaviorModelDeploymentConfiguration) {
        this.customerBehaviorModelDeploymentConfiguration = customerBehaviorModelDeploymentConfiguration;
    }

    public String getCustomerBehaviorModelDeploymentConfiguration() {
        return customerBehaviorModelDeploymentConfiguration;
    }

    public void setCustomerBehaviorModelDeploymentTaskReference(org.museframework.bian.classes.Object customerBehaviorModelDeploymentTaskReference) {
        this.customerBehaviorModelDeploymentTaskReference = customerBehaviorModelDeploymentTaskReference;
    }

    public org.museframework.bian.classes.Object getCustomerBehaviorModelDeploymentTaskReference() {
        return customerBehaviorModelDeploymentTaskReference;
    }

    public void setCustomerBehaviorModelDeploymentTaskRecord(String customerBehaviorModelDeploymentTaskRecord) {
        this.customerBehaviorModelDeploymentTaskRecord = customerBehaviorModelDeploymentTaskRecord;
    }

    public String getCustomerBehaviorModelDeploymentTaskRecord() {
        return customerBehaviorModelDeploymentTaskRecord;
    }

    public void setCustomerBehaviorModelStatus(String customerBehaviorModelStatus) {
        this.customerBehaviorModelStatus = customerBehaviorModelStatus;
    }

    public String getCustomerBehaviorModelStatus() {
        return customerBehaviorModelStatus;
    }

    public void setCustomerBehaviorModelUsage(String customerBehaviorModelUsage) {
        this.customerBehaviorModelUsage = customerBehaviorModelUsage;
    }

    public String getCustomerBehaviorModelUsage() {
        return customerBehaviorModelUsage;
    }

    public void setCustomerBehaviorModelImpact(String customerBehaviorModelImpact) {
        this.customerBehaviorModelImpact = customerBehaviorModelImpact;
    }

    public String getCustomerBehaviorModelImpact() {
        return customerBehaviorModelImpact;
    }

    public void setCustomerBehaviorModelVersion(String customerBehaviorModelVersion) {
        this.customerBehaviorModelVersion = customerBehaviorModelVersion;
    }

    public String getCustomerBehaviorModelVersion() {
        return customerBehaviorModelVersion;
    }

    public void setCustomerBehaviorModel(String customerBehaviorModel) {
        this.customerBehaviorModel = customerBehaviorModel;
    }

    public String getCustomerBehaviorModel() {
        return customerBehaviorModel;
    }
}