/*Oversee the working of a business unit, assign work, manage against a plan and troubleshoot issues within Customer Relationship Management.*/
package org.museframework.bian.cusrelman.dto.cr;

public class CustomerRelationshipManagementPlan extends org.museframework.bian.classes.CustomerRelationshipManagementPlan {
    /*Reference to the associated customer (can currently be a person or a company)*/
    private org.museframework.bian.classes.Object customerReference;

    /*The assigned individual or business unit for the relationship*/
    private org.museframework.bian.classes.Object employeeBusinessUnitReference;

    /*A type of rating referenced and perhaps maintained by the relationship manager  (e.g. credit, financial, collateral)*/
    private String customerRelationshipRatingType;

    /*The rating value (and explanation)*/
    private String customerRelationshipRating;

    /*A type of insight referenced and perhaps maintained by the relationship manager  (e.g. retention candidate, sales propensity, life events)*/
    private String customerInsightType;

    /*Description of the insight*/
    private String customerInsightDescription;

    /*The target and actual budget covering income and allowed expenses/discounts*/
    private String customerBudget;

    /*Covers current and near term target product/service coverage as per the judgment of the Relationship Manager*/
    private String customerProductCoverage;

    /*Extracted analysis from production activity used to detect trends and key events (product activity/turnover summaries)*/
    private String customerProductUsage;

    /*Obtained from the appropriate Service Domain, this provides an automated/rules based analysis of unsold/eligible products and associated terms that can be refined by the manager*/
    private String customerProductEligibilityProfile;

    /*The sales plan details specific actions taken and planned to address sales opportunities (i.e. target product sales and associated contact schedule)*/
    private String customerSalesPlan;

    /*A maintained perspective of the profitability of the relationship to date and projected*/
    private String customerProfitability;

    public void setCustomerReference(org.museframework.bian.classes.Object customerReference) {
        this.customerReference = customerReference;
    }

    public org.museframework.bian.classes.Object getCustomerReference() {
        return customerReference;
    }

    public void setEmployeeBusinessUnitReference(org.museframework.bian.classes.Object employeeBusinessUnitReference) {
        this.employeeBusinessUnitReference = employeeBusinessUnitReference;
    }

    public org.museframework.bian.classes.Object getEmployeeBusinessUnitReference() {
        return employeeBusinessUnitReference;
    }

    public void setCustomerRelationshipRatingType(String customerRelationshipRatingType) {
        this.customerRelationshipRatingType = customerRelationshipRatingType;
    }

    public String getCustomerRelationshipRatingType() {
        return customerRelationshipRatingType;
    }

    public void setCustomerRelationshipRating(String customerRelationshipRating) {
        this.customerRelationshipRating = customerRelationshipRating;
    }

    public String getCustomerRelationshipRating() {
        return customerRelationshipRating;
    }

    public void setCustomerInsightType(String customerInsightType) {
        this.customerInsightType = customerInsightType;
    }

    public String getCustomerInsightType() {
        return customerInsightType;
    }

    public void setCustomerInsightDescription(String customerInsightDescription) {
        this.customerInsightDescription = customerInsightDescription;
    }

    public String getCustomerInsightDescription() {
        return customerInsightDescription;
    }

    public void setCustomerBudget(String customerBudget) {
        this.customerBudget = customerBudget;
    }

    public String getCustomerBudget() {
        return customerBudget;
    }

    public void setCustomerProductCoverage(String customerProductCoverage) {
        this.customerProductCoverage = customerProductCoverage;
    }

    public String getCustomerProductCoverage() {
        return customerProductCoverage;
    }

    public void setCustomerProductUsage(String customerProductUsage) {
        this.customerProductUsage = customerProductUsage;
    }

    public String getCustomerProductUsage() {
        return customerProductUsage;
    }

    public void setCustomerProductEligibilityProfile(String customerProductEligibilityProfile) {
        this.customerProductEligibilityProfile = customerProductEligibilityProfile;
    }

    public String getCustomerProductEligibilityProfile() {
        return customerProductEligibilityProfile;
    }

    public void setCustomerSalesPlan(String customerSalesPlan) {
        this.customerSalesPlan = customerSalesPlan;
    }

    public String getCustomerSalesPlan() {
        return customerSalesPlan;
    }

    public void setCustomerProfitability(String customerProfitability) {
        this.customerProfitability = customerProfitability;
    }

    public String getCustomerProfitability() {
        return customerProfitability;
    }
}