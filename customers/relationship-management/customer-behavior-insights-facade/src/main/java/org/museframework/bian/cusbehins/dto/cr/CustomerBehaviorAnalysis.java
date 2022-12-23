/*Analyze the performance or behavior of some on-going activity or entity  within Customer Behavior Insights. 
Examples: Provide behavioral insights and analysis into customer behavior and analyze financial market activity in order to identify opportunities, define pricing and evaluate risks.

Analyze the performance or behavior of some on-going activity or entity. Examples: Provide behavioral insights and analysis into customer behavior and analyze financial market activity in order to identify opportunities, define pricing and evaluate risks.*/
package org.museframework.bian.cusbehins.dto.cr;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto
public class CustomerBehaviorAnalysis extends org.museframework.bian.classes.CustomerBehaviorAnalysis {
    /*Reference to the associated customer (can currently be a person or a company)*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object customerReference;

    /*The schedule for refreshing the analyses for a customer*/
    @MetaField
    private String customerInsightAnalysisSchedule;

    /*A record of the collection of behavioral insight analyses maintained for the customer*/
    @MetaField
    private String customerBehaviorAnalysisInsightsRecord;

    /*Defines a type of maintained customer insight (e.g. retention candidate, cross-sell candidate)*/
    @MetaField
    private String customerInsightType;

    /*The derived value of the specific insight for the customer and past values if appropriate*/
    @MetaField
    private String customerInsight;

    /*The date/time the value was last refreshed, and past value dates if appropriate*/
    @MetaField
    private String customerInsightCalculationDate;

    public void setCustomerReference(org.museframework.bian.classes.Object customerReference) {
        this.customerReference = customerReference;
    }

    public org.museframework.bian.classes.Object getCustomerReference() {
        return customerReference;
    }

    public void setCustomerInsightAnalysisSchedule(String customerInsightAnalysisSchedule) {
        this.customerInsightAnalysisSchedule = customerInsightAnalysisSchedule;
    }

    public String getCustomerInsightAnalysisSchedule() {
        return customerInsightAnalysisSchedule;
    }

    public void setCustomerBehaviorAnalysisInsightsRecord(String customerBehaviorAnalysisInsightsRecord) {
        this.customerBehaviorAnalysisInsightsRecord = customerBehaviorAnalysisInsightsRecord;
    }

    public String getCustomerBehaviorAnalysisInsightsRecord() {
        return customerBehaviorAnalysisInsightsRecord;
    }

    public void setCustomerInsightType(String customerInsightType) {
        this.customerInsightType = customerInsightType;
    }

    public String getCustomerInsightType() {
        return customerInsightType;
    }

    public void setCustomerInsight(String customerInsight) {
        this.customerInsight = customerInsight;
    }

    public String getCustomerInsight() {
        return customerInsight;
    }

    public void setCustomerInsightCalculationDate(String customerInsightCalculationDate) {
        this.customerInsightCalculationDate = customerInsightCalculationDate;
    }

    public String getCustomerInsightCalculationDate() {
        return customerInsightCalculationDate;
    }
}