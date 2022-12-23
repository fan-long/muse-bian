/*The Incident Troubleshooting Oversight Duty is a specific role or responsibility that is one aspect of Incident Troubleshooting Oversight Duty*/
package org.museframework.bian.corbanrelman.dto.bq;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto
public class CorrespondentBankRelationshipManagementOutcome {
    /**/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Analysis correspondentBankRelationshipManagementPerformanceAnalysis;

    /**/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Analysis correspondentBankRelationshipManagementActivityAnalysis;

    /**/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Plan correspondentBankRelationshipManagementCharter;

    /**/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Project correspondentBankRelationshipManagementProject;

    public void setCorrespondentBankRelationshipManagementPerformanceAnalysis(org.museframework.bian.classes.Analysis correspondentBankRelationshipManagementPerformanceAnalysis) {
        this.correspondentBankRelationshipManagementPerformanceAnalysis = correspondentBankRelationshipManagementPerformanceAnalysis;
    }

    public org.museframework.bian.classes.Analysis getCorrespondentBankRelationshipManagementPerformanceAnalysis() {
        return correspondentBankRelationshipManagementPerformanceAnalysis;
    }

    public void setCorrespondentBankRelationshipManagementActivityAnalysis(org.museframework.bian.classes.Analysis correspondentBankRelationshipManagementActivityAnalysis) {
        this.correspondentBankRelationshipManagementActivityAnalysis = correspondentBankRelationshipManagementActivityAnalysis;
    }

    public org.museframework.bian.classes.Analysis getCorrespondentBankRelationshipManagementActivityAnalysis() {
        return correspondentBankRelationshipManagementActivityAnalysis;
    }

    public void setCorrespondentBankRelationshipManagementCharter(org.museframework.bian.classes.Plan correspondentBankRelationshipManagementCharter) {
        this.correspondentBankRelationshipManagementCharter = correspondentBankRelationshipManagementCharter;
    }

    public org.museframework.bian.classes.Plan getCorrespondentBankRelationshipManagementCharter() {
        return correspondentBankRelationshipManagementCharter;
    }

    public void setCorrespondentBankRelationshipManagementProject(org.museframework.bian.classes.Project correspondentBankRelationshipManagementProject) {
        this.correspondentBankRelationshipManagementProject = correspondentBankRelationshipManagementProject;
    }

    public org.museframework.bian.classes.Project getCorrespondentBankRelationshipManagementProject() {
        return correspondentBankRelationshipManagementProject;
    }
}