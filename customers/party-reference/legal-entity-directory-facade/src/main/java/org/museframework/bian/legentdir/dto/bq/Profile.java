/*"An assertion or statement with regard to a concept, a characteristic.

Examples: Product pricing rules, Customer reference details

A descriptor can be atomic or composed."
Prospect Management*/
package org.museframework.bian.legentdir.dto.bq;

public class Profile extends org.museframework.bian.classes.Profile {
    /*The estimated capitalization of the entity*/
    private String organizationCapitalization;

    /*The estimated debt level for the entity*/
    private String organizationDebtLevel;

    /*The projected economic performance for the entity*/
    private String organizationEconomicIntent;

    /*Past and projected growth rates*/
    private String organizationGrowthRate;

    /*Analysis of past performance  (a summary description)*/
    private String organizationProfitabilityStocks;

    /*Description of revenues, production volumes and staff turnover  a summary description)*/
    private String organizationRevenueTurnover;

    public void setOrganizationCapitalization(String organizationCapitalization) {
        this.organizationCapitalization = organizationCapitalization;
    }

    public String getOrganizationCapitalization() {
        return organizationCapitalization;
    }

    public void setOrganizationDebtLevel(String organizationDebtLevel) {
        this.organizationDebtLevel = organizationDebtLevel;
    }

    public String getOrganizationDebtLevel() {
        return organizationDebtLevel;
    }

    public void setOrganizationEconomicIntent(String organizationEconomicIntent) {
        this.organizationEconomicIntent = organizationEconomicIntent;
    }

    public String getOrganizationEconomicIntent() {
        return organizationEconomicIntent;
    }

    public void setOrganizationGrowthRate(String organizationGrowthRate) {
        this.organizationGrowthRate = organizationGrowthRate;
    }

    public String getOrganizationGrowthRate() {
        return organizationGrowthRate;
    }

    public void setOrganizationProfitabilityStocks(String organizationProfitabilityStocks) {
        this.organizationProfitabilityStocks = organizationProfitabilityStocks;
    }

    public String getOrganizationProfitabilityStocks() {
        return organizationProfitabilityStocks;
    }

    public void setOrganizationRevenueTurnover(String organizationRevenueTurnover) {
        this.organizationRevenueTurnover = organizationRevenueTurnover;
    }

    public String getOrganizationRevenueTurnover() {
        return organizationRevenueTurnover;
    }
}