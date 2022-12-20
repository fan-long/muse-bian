/*A set of key financial indicators for an organisation. */
package org.museframework.bian.classes;

public class OrganisationProfile {
    /*Structure and amount of long-term equity and debt capitals of the associated organisation, expressed as percentage of the total (equity and debt) capital.

capitalization (cap). BusinessDictionary.com. Retrieved September 10, 2018, from BusinessDictionary.com website: http://www.businessdictionary.com/definition/capitalization-cap.html*/
    private String capitalisation;

    /*The organisation's debt level (also known as "debt ratio"), expressed as total debt divided by total assets.*/
    private String debtLevel;

    /*Description of the associated organisation's economic intent.
The projected economic performance for the entity.*/
    private String economicIntent;

    /*The (past and projected) growth rate of the associated organisation.*/
    private String growthRate;

    /*Summary description of the associated organisation's profitability and securities holdings.
*/
    private String profitability;

    /*Summary description of the associated organisation's revenue and turnover. */
    private String revenue;

    /**/
    private String profileType;

    public void setCapitalisation(String capitalisation) {
        this.capitalisation = capitalisation;
    }

    public String getCapitalisation() {
        return capitalisation;
    }

    public void setDebtLevel(String debtLevel) {
        this.debtLevel = debtLevel;
    }

    public String getDebtLevel() {
        return debtLevel;
    }

    public void setEconomicIntent(String economicIntent) {
        this.economicIntent = economicIntent;
    }

    public String getEconomicIntent() {
        return economicIntent;
    }

    public void setGrowthRate(String growthRate) {
        this.growthRate = growthRate;
    }

    public String getGrowthRate() {
        return growthRate;
    }

    public void setProfitability(String profitability) {
        this.profitability = profitability;
    }

    public String getProfitability() {
        return profitability;
    }

    public void setRevenue(String revenue) {
        this.revenue = revenue;
    }

    public String getRevenue() {
        return revenue;
    }

    public void setProfileType(String profileType) {
        this.profileType = profileType;
    }

    public String getProfileType() {
        return profileType;
    }
}