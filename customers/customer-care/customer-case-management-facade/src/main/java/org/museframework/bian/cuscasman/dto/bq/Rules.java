/*A collection of one or more responsibilities or tasks under management

Examples: Relationship development, Troubleshooting*/
package org.museframework.bian.cuscasman.dto.bq;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto
public class Rules {
    /*Definition of the basis for customer case evaluation*/
    @MetaField
    private String customerCaseDecisionCriterion;

    /*Definition of the applicable subject/criterion to be considered in case evaluation (e.g. documentary evidence, customer/merchant history, projected relationship impact, financial cost/projected revenue impact, reputational impact)*/
    @MetaField
    private String customerCaseDecisionCriterionDefinition;

    /*Specific rules, thresholds and parameter values to be applied in case evaluation for the criterion*/
    @MetaField
    private String customerCaseDecisionCriterionRules;

    /*Record of the sensitivity/tuning evaluations and adjustments made to the rule settings for the criterion*/
    @MetaField
    private String customerCaseDecisionCriterionAnalysis;

    /*Sample case examples that apply the criterion that are used to evaluate the impact and re-calibrate the associated rules as appropriate*/
    @MetaField
    private String customerCaseDecisionCriterionHistory;

    public void setCustomerCaseDecisionCriterion(String customerCaseDecisionCriterion) {
        this.customerCaseDecisionCriterion = customerCaseDecisionCriterion;
    }

    public String getCustomerCaseDecisionCriterion() {
        return customerCaseDecisionCriterion;
    }

    public void setCustomerCaseDecisionCriterionDefinition(String customerCaseDecisionCriterionDefinition) {
        this.customerCaseDecisionCriterionDefinition = customerCaseDecisionCriterionDefinition;
    }

    public String getCustomerCaseDecisionCriterionDefinition() {
        return customerCaseDecisionCriterionDefinition;
    }

    public void setCustomerCaseDecisionCriterionRules(String customerCaseDecisionCriterionRules) {
        this.customerCaseDecisionCriterionRules = customerCaseDecisionCriterionRules;
    }

    public String getCustomerCaseDecisionCriterionRules() {
        return customerCaseDecisionCriterionRules;
    }

    public void setCustomerCaseDecisionCriterionAnalysis(String customerCaseDecisionCriterionAnalysis) {
        this.customerCaseDecisionCriterionAnalysis = customerCaseDecisionCriterionAnalysis;
    }

    public String getCustomerCaseDecisionCriterionAnalysis() {
        return customerCaseDecisionCriterionAnalysis;
    }

    public void setCustomerCaseDecisionCriterionHistory(String customerCaseDecisionCriterionHistory) {
        this.customerCaseDecisionCriterionHistory = customerCaseDecisionCriterionHistory;
    }

    public String getCustomerCaseDecisionCriterionHistory() {
        return customerCaseDecisionCriterionHistory;
    }
}