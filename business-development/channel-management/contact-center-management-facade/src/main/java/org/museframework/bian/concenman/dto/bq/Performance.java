/*A collection of one or more responsibilities or tasks under management

Examples: Relationship development, Troubleshooting*/
package org.museframework.bian.concenman.dto.bq;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto
public class Performance {
    /*Record of the contact center position target and actual utilization*/
    @MetaField
    private String contactCenterPositionUtilization;

    /*Estimated projected contact center resource requirements and utilization and loading based on historical patterns and anticipated activity*/
    @MetaField
    private String contactCenterLoadingProjections;

    /*Tracked activity and performance statistics used to manage the contact center set-up and to inform staff training*/
    @MetaField
    private String contactCenterServiceStatistics;

    /*The type of activity that is tracked and analyzed (e.g. wait time, average handle time, dropped call ratio, resolution rate)*/
    @MetaField
    private String contactCenterServiceStatisticType;

    /*The statistical analysis that can include historical and trended views of the activity*/
    @MetaField
    private String contactCenterServiceStatisticValue;

    /*The evaluation of the root cause or comparative assessments of the analysis*/
    @MetaField
    private String contactCenterServiceStatisticInterpretation;

    /*Service/configuration amendment recommendations arising from the statistical analysis*/
    @MetaField
    private String contactCenterServiceStatisticRecommendation;

    public void setContactCenterPositionUtilization(String contactCenterPositionUtilization) {
        this.contactCenterPositionUtilization = contactCenterPositionUtilization;
    }

    public String getContactCenterPositionUtilization() {
        return contactCenterPositionUtilization;
    }

    public void setContactCenterLoadingProjections(String contactCenterLoadingProjections) {
        this.contactCenterLoadingProjections = contactCenterLoadingProjections;
    }

    public String getContactCenterLoadingProjections() {
        return contactCenterLoadingProjections;
    }

    public void setContactCenterServiceStatistics(String contactCenterServiceStatistics) {
        this.contactCenterServiceStatistics = contactCenterServiceStatistics;
    }

    public String getContactCenterServiceStatistics() {
        return contactCenterServiceStatistics;
    }

    public void setContactCenterServiceStatisticType(String contactCenterServiceStatisticType) {
        this.contactCenterServiceStatisticType = contactCenterServiceStatisticType;
    }

    public String getContactCenterServiceStatisticType() {
        return contactCenterServiceStatisticType;
    }

    public void setContactCenterServiceStatisticValue(String contactCenterServiceStatisticValue) {
        this.contactCenterServiceStatisticValue = contactCenterServiceStatisticValue;
    }

    public String getContactCenterServiceStatisticValue() {
        return contactCenterServiceStatisticValue;
    }

    public void setContactCenterServiceStatisticInterpretation(String contactCenterServiceStatisticInterpretation) {
        this.contactCenterServiceStatisticInterpretation = contactCenterServiceStatisticInterpretation;
    }

    public String getContactCenterServiceStatisticInterpretation() {
        return contactCenterServiceStatisticInterpretation;
    }

    public void setContactCenterServiceStatisticRecommendation(String contactCenterServiceStatisticRecommendation) {
        this.contactCenterServiceStatisticRecommendation = contactCenterServiceStatisticRecommendation;
    }

    public String getContactCenterServiceStatisticRecommendation() {
        return contactCenterServiceStatisticRecommendation;
    }
}