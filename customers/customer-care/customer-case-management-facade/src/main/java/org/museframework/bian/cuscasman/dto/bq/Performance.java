/*A collection of one or more responsibilities or tasks under management

Examples: Relationship development, Troubleshooting*/
package org.museframework.bian.cuscasman.dto.bq;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto
public class Performance {
    /*Record of the customer case resolution resource utilization (target and actual)*/
    @MetaField(0)
    private String customerCaseResourceUtilization;

    /*Estimated projected customer case resource requirements and utilization and loading based on historical patterns and anticipated activity*/
    @MetaField(0)
    private String customerCaseLoadingProjections;

    /*Tracked activity and performance statistics used to manage the case resolution business function*/
    @MetaField(0)
    private String customerCaseResolutionServiceStatistics;

    /*The type of activity that is tracked and analyzed (e.g. case resolution throughput, time/effort per case, customer acceptance/appeal rate, merchant acceptance/appeal rate, customer/merchant retention, case resolution profit/loss)*/
    @MetaField(0)
    private String customerCaseServiceStatisticType;

    /*The statistical analysis that can include historical and trended views of the activity*/
    @MetaField(0)
    private String customerCaseServiceStatisticValue;

    /*The evaluation of the root cause or comparative assessments of the analysis*/
    @MetaField(0)
    private String customerCaseServiceStatisticInterpretation;

    /*Service/configuration amendment recommendations arising from the statistical analysis*/
    @MetaField(0)
    private String customerCaseServiceStatisticRecommendation;

    public void setCustomerCaseResourceUtilization(String customerCaseResourceUtilization) {
        this.customerCaseResourceUtilization = customerCaseResourceUtilization;
    }

    public String getCustomerCaseResourceUtilization() {
        return customerCaseResourceUtilization;
    }

    public void setCustomerCaseLoadingProjections(String customerCaseLoadingProjections) {
        this.customerCaseLoadingProjections = customerCaseLoadingProjections;
    }

    public String getCustomerCaseLoadingProjections() {
        return customerCaseLoadingProjections;
    }

    public void setCustomerCaseResolutionServiceStatistics(String customerCaseResolutionServiceStatistics) {
        this.customerCaseResolutionServiceStatistics = customerCaseResolutionServiceStatistics;
    }

    public String getCustomerCaseResolutionServiceStatistics() {
        return customerCaseResolutionServiceStatistics;
    }

    public void setCustomerCaseServiceStatisticType(String customerCaseServiceStatisticType) {
        this.customerCaseServiceStatisticType = customerCaseServiceStatisticType;
    }

    public String getCustomerCaseServiceStatisticType() {
        return customerCaseServiceStatisticType;
    }

    public void setCustomerCaseServiceStatisticValue(String customerCaseServiceStatisticValue) {
        this.customerCaseServiceStatisticValue = customerCaseServiceStatisticValue;
    }

    public String getCustomerCaseServiceStatisticValue() {
        return customerCaseServiceStatisticValue;
    }

    public void setCustomerCaseServiceStatisticInterpretation(String customerCaseServiceStatisticInterpretation) {
        this.customerCaseServiceStatisticInterpretation = customerCaseServiceStatisticInterpretation;
    }

    public String getCustomerCaseServiceStatisticInterpretation() {
        return customerCaseServiceStatisticInterpretation;
    }

    public void setCustomerCaseServiceStatisticRecommendation(String customerCaseServiceStatisticRecommendation) {
        this.customerCaseServiceStatisticRecommendation = customerCaseServiceStatisticRecommendation;
    }

    public String getCustomerCaseServiceStatisticRecommendation() {
        return customerCaseServiceStatisticRecommendation;
    }
}