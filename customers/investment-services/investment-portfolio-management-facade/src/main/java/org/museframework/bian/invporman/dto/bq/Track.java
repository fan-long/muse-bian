/*The product features/services available with a financical facility*/
package org.museframework.bian.invporman.dto.bq;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto
public class Track {
    /*The sensitivity viewpoint for a held security position*/
    @MetaField(0)
    private String investmentPortfolioSecuritySensitivity;

    /*The expected value movement*/
    @MetaField(0)
    private String projectedValuation;

    /*An impact assessment of the projected movement on the investment portfolio - includes possible policy limit breaches*/
    @MetaField(0)
    private String projectedPortfolioImpact;

    public void setInvestmentPortfolioSecuritySensitivity(String investmentPortfolioSecuritySensitivity) {
        this.investmentPortfolioSecuritySensitivity = investmentPortfolioSecuritySensitivity;
    }

    public String getInvestmentPortfolioSecuritySensitivity() {
        return investmentPortfolioSecuritySensitivity;
    }

    public void setProjectedValuation(String projectedValuation) {
        this.projectedValuation = projectedValuation;
    }

    public String getProjectedValuation() {
        return projectedValuation;
    }

    public void setProjectedPortfolioImpact(String projectedPortfolioImpact) {
        this.projectedPortfolioImpact = projectedPortfolioImpact;
    }

    public String getProjectedPortfolioImpact() {
        return projectedPortfolioImpact;
    }
}