/*To build or enhance something, typically an IT production systems  within System Development. Includes development, Assessment and deployment activities.
Example: Build, enhance, test and deploy a major enhancement to a production product processing system.*/
package org.museframework.bian.systemdevelopment.dto.cr;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto
public class ITSystemDevelopment {
    /*The reference to and descriptive name of the deployment project*/
    @MetaField
    private String systemDevelopmentProjectName;

    /*The type of deployment project (e.g. service update, new product release)*/
    @MetaField
    private String systemDevelopmentProjectType;

    /*A description of the scope, goal and make-up of the product deployment project*/
    @MetaField
    private String systemDevelopmentProjectDescription;

    /*The derived deployment execution plan, covering tasks from the completion and acceptance of the deployment plan through to completion of the deployment including post deployment analysis tasks if required. Consolidates the different aspects of the plan. (Captures both planned and actual results)*/
    @MetaField
    private String systemDevelopmentImplementationPlan;

    /*The financial considerations for the deployment (includes planning and execution)*/
    @MetaField
    private String systemDevelopmentBudget;

    /*The organizational aspects of the deployment effort (includes planning and execution)*/
    @MetaField
    private String systemDevelopmentProjectOrganization;

    /*The deployment schedule of events, planned and actual (includes planning and execution tasks)*/
    @MetaField
    private String systemDevelopmentProjectSchedule;

    /*Key dates associated with the development of the deployment plan (e.g. planning start date, deployment plan approval, deployment plan sign-off)*/
    @MetaField
    private String dateType;

    /*Value of the specific date type*/
    @MetaField
    private String date;

    public void setSystemDevelopmentProjectName(String systemDevelopmentProjectName) {
        this.systemDevelopmentProjectName = systemDevelopmentProjectName;
    }

    public String getSystemDevelopmentProjectName() {
        return systemDevelopmentProjectName;
    }

    public void setSystemDevelopmentProjectType(String systemDevelopmentProjectType) {
        this.systemDevelopmentProjectType = systemDevelopmentProjectType;
    }

    public String getSystemDevelopmentProjectType() {
        return systemDevelopmentProjectType;
    }

    public void setSystemDevelopmentProjectDescription(String systemDevelopmentProjectDescription) {
        this.systemDevelopmentProjectDescription = systemDevelopmentProjectDescription;
    }

    public String getSystemDevelopmentProjectDescription() {
        return systemDevelopmentProjectDescription;
    }

    public void setSystemDevelopmentImplementationPlan(String systemDevelopmentImplementationPlan) {
        this.systemDevelopmentImplementationPlan = systemDevelopmentImplementationPlan;
    }

    public String getSystemDevelopmentImplementationPlan() {
        return systemDevelopmentImplementationPlan;
    }

    public void setSystemDevelopmentBudget(String systemDevelopmentBudget) {
        this.systemDevelopmentBudget = systemDevelopmentBudget;
    }

    public String getSystemDevelopmentBudget() {
        return systemDevelopmentBudget;
    }

    public void setSystemDevelopmentProjectOrganization(String systemDevelopmentProjectOrganization) {
        this.systemDevelopmentProjectOrganization = systemDevelopmentProjectOrganization;
    }

    public String getSystemDevelopmentProjectOrganization() {
        return systemDevelopmentProjectOrganization;
    }

    public void setSystemDevelopmentProjectSchedule(String systemDevelopmentProjectSchedule) {
        this.systemDevelopmentProjectSchedule = systemDevelopmentProjectSchedule;
    }

    public String getSystemDevelopmentProjectSchedule() {
        return systemDevelopmentProjectSchedule;
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