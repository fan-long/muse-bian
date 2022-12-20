/*A collection of one or more responsibilities or tasks under management

Examples: Relationship development, Troubleshooting*/
package org.museframework.bian.busuniman.dto.bq;

public class Performance {
    /*Record of the business unit employee target and actual utilization/productivity*/
    private String businessUnitResourceUtilization;

    /*Estimated projected business unit product/service delivery and work volume targets as appropriate for the type of unit*/
    private String businessUnitOutputWorkProjections;

    /*Tracked business unit activity and performance statistics used to manage the business unit*/
    private String businessUnitPerformanceStatistics;

    /*The type of activity that is tracked and analyzed (e.g. delivery rate, utilization)*/
    private String businessUnitPerformanceStatisticType;

    /*The statistical analysis that can include historical and trended views of the activity*/
    private String businessUnitPerformanceStatisticValue;

    /*Narrative that might explain any divergence from expected performance/delivery*/
    private String businessUnitPerformanceStatisticInterpretation;

    /*Proposed operational changes/recommendations arising from the performance tracking and analysis*/
    private String businessUnitPerformanceStatisticRecommendation;

    public void setBusinessUnitResourceUtilization(String businessUnitResourceUtilization) {
        this.businessUnitResourceUtilization = businessUnitResourceUtilization;
    }

    public String getBusinessUnitResourceUtilization() {
        return businessUnitResourceUtilization;
    }

    public void setBusinessUnitOutputWorkProjections(String businessUnitOutputWorkProjections) {
        this.businessUnitOutputWorkProjections = businessUnitOutputWorkProjections;
    }

    public String getBusinessUnitOutputWorkProjections() {
        return businessUnitOutputWorkProjections;
    }

    public void setBusinessUnitPerformanceStatistics(String businessUnitPerformanceStatistics) {
        this.businessUnitPerformanceStatistics = businessUnitPerformanceStatistics;
    }

    public String getBusinessUnitPerformanceStatistics() {
        return businessUnitPerformanceStatistics;
    }

    public void setBusinessUnitPerformanceStatisticType(String businessUnitPerformanceStatisticType) {
        this.businessUnitPerformanceStatisticType = businessUnitPerformanceStatisticType;
    }

    public String getBusinessUnitPerformanceStatisticType() {
        return businessUnitPerformanceStatisticType;
    }

    public void setBusinessUnitPerformanceStatisticValue(String businessUnitPerformanceStatisticValue) {
        this.businessUnitPerformanceStatisticValue = businessUnitPerformanceStatisticValue;
    }

    public String getBusinessUnitPerformanceStatisticValue() {
        return businessUnitPerformanceStatisticValue;
    }

    public void setBusinessUnitPerformanceStatisticInterpretation(String businessUnitPerformanceStatisticInterpretation) {
        this.businessUnitPerformanceStatisticInterpretation = businessUnitPerformanceStatisticInterpretation;
    }

    public String getBusinessUnitPerformanceStatisticInterpretation() {
        return businessUnitPerformanceStatisticInterpretation;
    }

    public void setBusinessUnitPerformanceStatisticRecommendation(String businessUnitPerformanceStatisticRecommendation) {
        this.businessUnitPerformanceStatisticRecommendation = businessUnitPerformanceStatisticRecommendation;
    }

    public String getBusinessUnitPerformanceStatisticRecommendation() {
        return businessUnitPerformanceStatisticRecommendation;
    }
}