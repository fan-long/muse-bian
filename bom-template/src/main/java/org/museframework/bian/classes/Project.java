/*details of a project with defined deliverables, finite duration, budget and allocated resources*/
package org.museframework.bian.classes;

public class Project {
    /*The name of project*/
    private String projectName;

    /*A classification of the project*/
    private String projectType;

    /*A description of the scope, goal and make-up of the project*/
    private String projectDescription;

    /**/
    private String projectOrganisation;

    /**/
    private String projectSchedule;

    /**/
    private String projectDateTime;

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectType(String projectType) {
        this.projectType = projectType;
    }

    public String getProjectType() {
        return projectType;
    }

    public void setProjectDescription(String projectDescription) {
        this.projectDescription = projectDescription;
    }

    public String getProjectDescription() {
        return projectDescription;
    }

    public void setProjectOrganisation(String projectOrganisation) {
        this.projectOrganisation = projectOrganisation;
    }

    public String getProjectOrganisation() {
        return projectOrganisation;
    }

    public void setProjectSchedule(String projectSchedule) {
        this.projectSchedule = projectSchedule;
    }

    public String getProjectSchedule() {
        return projectSchedule;
    }

    public void setProjectDateTime(String projectDateTime) {
        this.projectDateTime = projectDateTime;
    }

    public String getProjectDateTime() {
        return projectDateTime;
    }
}