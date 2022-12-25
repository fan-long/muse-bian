/*Oversee the working of a business unit, assign work, manage against a plan and troubleshoot issues  within Regulatory & Legal Authority.
Example: Manage the day to day activities at a bank branch location.*/
package org.museframework.bian.regandlegaut.dto.bq;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto
public class RegulatoryAndLegalAuthorityOutcome {
    /**/
    @MetaField(0)
    private String regulatoryAndLegalAuthorityPerformanceAnalysis;

    /**/
    @MetaField(0)
    private String regulatoryAndLegalAuthorityActivityAnalysis;

    /**/
    @MetaField(0)
    private String regulatoryAndLegalAuthorityCharter;

    /**/
    @MetaField(0)
    private String regulatoryAndLegalAuthorityTask;

    /**/
    @MetaField(0)
    private String regulatoryAndLegalAuthorityProject;

    public void setRegulatoryAndLegalAuthorityPerformanceAnalysis(String regulatoryAndLegalAuthorityPerformanceAnalysis) {
        this.regulatoryAndLegalAuthorityPerformanceAnalysis = regulatoryAndLegalAuthorityPerformanceAnalysis;
    }

    public String getRegulatoryAndLegalAuthorityPerformanceAnalysis() {
        return regulatoryAndLegalAuthorityPerformanceAnalysis;
    }

    public void setRegulatoryAndLegalAuthorityActivityAnalysis(String regulatoryAndLegalAuthorityActivityAnalysis) {
        this.regulatoryAndLegalAuthorityActivityAnalysis = regulatoryAndLegalAuthorityActivityAnalysis;
    }

    public String getRegulatoryAndLegalAuthorityActivityAnalysis() {
        return regulatoryAndLegalAuthorityActivityAnalysis;
    }

    public void setRegulatoryAndLegalAuthorityCharter(String regulatoryAndLegalAuthorityCharter) {
        this.regulatoryAndLegalAuthorityCharter = regulatoryAndLegalAuthorityCharter;
    }

    public String getRegulatoryAndLegalAuthorityCharter() {
        return regulatoryAndLegalAuthorityCharter;
    }

    public void setRegulatoryAndLegalAuthorityTask(String regulatoryAndLegalAuthorityTask) {
        this.regulatoryAndLegalAuthorityTask = regulatoryAndLegalAuthorityTask;
    }

    public String getRegulatoryAndLegalAuthorityTask() {
        return regulatoryAndLegalAuthorityTask;
    }

    public void setRegulatoryAndLegalAuthorityProject(String regulatoryAndLegalAuthorityProject) {
        this.regulatoryAndLegalAuthorityProject = regulatoryAndLegalAuthorityProject;
    }

    public String getRegulatoryAndLegalAuthorityProject() {
        return regulatoryAndLegalAuthorityProject;
    }
}