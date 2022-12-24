/*Handle and assign the day to day activities, capture time, costs and income for an operational unit within Regulatory Reporting. 
*/
package org.museframework.bian.regulatoryreporting.dto.cr;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

//refer to BOClass org.museframework.bian.classes.RegulatoryComplianceAdministrativePlan
@MetaDto
public class RegulatoryComplianceAdministrativePlan {
    /*Reference to the interested regulatory reporting authority*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object regulatoryAuthorityReference;

    /*The details of all regulatory reporting requirements and scheduled reporting tasks*/
    @MetaField
    private String regulatoryReportingSchedule;

    /*Reference to the regulation for which content is being collected*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object regulationReference;

    /*The types of report, included in the reporting schedule*/
    @MetaField
    private String regulatoryReportType;

    public void setRegulatoryAuthorityReference(org.museframework.bian.classes.Object regulatoryAuthorityReference) {
        this.regulatoryAuthorityReference = regulatoryAuthorityReference;
    }

    public org.museframework.bian.classes.Object getRegulatoryAuthorityReference() {
        return regulatoryAuthorityReference;
    }

    public void setRegulatoryReportingSchedule(String regulatoryReportingSchedule) {
        this.regulatoryReportingSchedule = regulatoryReportingSchedule;
    }

    public String getRegulatoryReportingSchedule() {
        return regulatoryReportingSchedule;
    }

    public void setRegulationReference(org.museframework.bian.classes.Object regulationReference) {
        this.regulationReference = regulationReference;
    }

    public org.museframework.bian.classes.Object getRegulationReference() {
        return regulationReference;
    }

    public void setRegulatoryReportType(String regulatoryReportType) {
        this.regulatoryReportType = regulatoryReportType;
    }

    public String getRegulatoryReportType() {
        return regulatoryReportType;
    }
}