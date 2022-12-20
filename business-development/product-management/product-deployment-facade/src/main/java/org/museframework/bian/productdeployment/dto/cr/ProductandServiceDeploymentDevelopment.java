/*To build or enhance something, typically an IT production systems  within Product Deployment. Includes development, Assessment and deployment activities.
Example: Build, enhance, test and deploy a major enhancement to a production product processing system.*/
package org.museframework.bian.productdeployment.dto.cr;

public class ProductandServiceDeploymentDevelopment {
    /*The reference to and descriptive name of the deployment project*/
    private String productandServiceDeploymentProjectName;

    /*The type of deployment project (e.g. service update, new product release)*/
    private String productandServiceDeploymentProjectType;

    /*A description of the scope, goal and make-up of the product deployment project*/
    private String productandServiceDeploymentProjectDescription;

    /*The derived deployment execution plan, covering tasks from the completion and acceptance of the deployment plan through to completion of the deployment including post deployment analysis tasks if required. Consolidates the different aspects of the plan. (Captures both planned and actual results)*/
    private String productandServiceDeploymentImplementationPlan;

    /*The financial considerations for the deployment (includes planning and execution)*/
    private String productandServiceDeploymentBudget;

    /*The organizational aspects of the deployment effort (includes planning and execution)*/
    private String productandServiceDeploymentOrganization;

    /*The deployment schedule of events, planned and actual (includes planning and execution tasks)*/
    private String productandServiceDeploymentSchedule;

    /*Key dates associated with the development of the deployment plan (e.g. planning start date, deployment plan approval, deployment plan sign-off)*/
    private String dateType;

    /*Value of the specific date type*/
    private String date;

    public void setProductandServiceDeploymentProjectName(String productandServiceDeploymentProjectName) {
        this.productandServiceDeploymentProjectName = productandServiceDeploymentProjectName;
    }

    public String getProductandServiceDeploymentProjectName() {
        return productandServiceDeploymentProjectName;
    }

    public void setProductandServiceDeploymentProjectType(String productandServiceDeploymentProjectType) {
        this.productandServiceDeploymentProjectType = productandServiceDeploymentProjectType;
    }

    public String getProductandServiceDeploymentProjectType() {
        return productandServiceDeploymentProjectType;
    }

    public void setProductandServiceDeploymentProjectDescription(String productandServiceDeploymentProjectDescription) {
        this.productandServiceDeploymentProjectDescription = productandServiceDeploymentProjectDescription;
    }

    public String getProductandServiceDeploymentProjectDescription() {
        return productandServiceDeploymentProjectDescription;
    }

    public void setProductandServiceDeploymentImplementationPlan(String productandServiceDeploymentImplementationPlan) {
        this.productandServiceDeploymentImplementationPlan = productandServiceDeploymentImplementationPlan;
    }

    public String getProductandServiceDeploymentImplementationPlan() {
        return productandServiceDeploymentImplementationPlan;
    }

    public void setProductandServiceDeploymentBudget(String productandServiceDeploymentBudget) {
        this.productandServiceDeploymentBudget = productandServiceDeploymentBudget;
    }

    public String getProductandServiceDeploymentBudget() {
        return productandServiceDeploymentBudget;
    }

    public void setProductandServiceDeploymentOrganization(String productandServiceDeploymentOrganization) {
        this.productandServiceDeploymentOrganization = productandServiceDeploymentOrganization;
    }

    public String getProductandServiceDeploymentOrganization() {
        return productandServiceDeploymentOrganization;
    }

    public void setProductandServiceDeploymentSchedule(String productandServiceDeploymentSchedule) {
        this.productandServiceDeploymentSchedule = productandServiceDeploymentSchedule;
    }

    public String getProductandServiceDeploymentSchedule() {
        return productandServiceDeploymentSchedule;
    }

    public void setDateType(String dateType) {
        this.dateType = dateType;
    }

    public String getDateType() {
        return dateType;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getDate() {
        return date;
    }
}