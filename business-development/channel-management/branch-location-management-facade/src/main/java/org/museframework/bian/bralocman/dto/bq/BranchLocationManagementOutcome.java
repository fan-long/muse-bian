/*Oversee the working of a business unit, assign work, manage against a plan and troubleshoot issues  within Branch Location Management.
Example: Manage the day to day activities at a bank branch location.*/
package org.museframework.bian.bralocman.dto.bq;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto
public class BranchLocationManagementOutcome {
    /**/
    @MetaField
    private String branchLocationManagementPerformanceAnalysis;

    /**/
    @MetaField
    private String branchLocationManagementActivityAnalysis;

    /**/
    @MetaField
    private String branchLocationManagementCharter;

    /**/
    @MetaField
    private String branchLocationManagementTask;

    /**/
    @MetaField
    private String branchLocationManagementProject;

    public void setBranchLocationManagementPerformanceAnalysis(String branchLocationManagementPerformanceAnalysis) {
        this.branchLocationManagementPerformanceAnalysis = branchLocationManagementPerformanceAnalysis;
    }

    public String getBranchLocationManagementPerformanceAnalysis() {
        return branchLocationManagementPerformanceAnalysis;
    }

    public void setBranchLocationManagementActivityAnalysis(String branchLocationManagementActivityAnalysis) {
        this.branchLocationManagementActivityAnalysis = branchLocationManagementActivityAnalysis;
    }

    public String getBranchLocationManagementActivityAnalysis() {
        return branchLocationManagementActivityAnalysis;
    }

    public void setBranchLocationManagementCharter(String branchLocationManagementCharter) {
        this.branchLocationManagementCharter = branchLocationManagementCharter;
    }

    public String getBranchLocationManagementCharter() {
        return branchLocationManagementCharter;
    }

    public void setBranchLocationManagementTask(String branchLocationManagementTask) {
        this.branchLocationManagementTask = branchLocationManagementTask;
    }

    public String getBranchLocationManagementTask() {
        return branchLocationManagementTask;
    }

    public void setBranchLocationManagementProject(String branchLocationManagementProject) {
        this.branchLocationManagementProject = branchLocationManagementProject;
    }

    public String getBranchLocationManagementProject() {
        return branchLocationManagementProject;
    }
}