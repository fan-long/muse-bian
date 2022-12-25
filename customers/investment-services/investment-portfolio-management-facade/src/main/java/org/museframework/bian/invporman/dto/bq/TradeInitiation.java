/*The product features/services available with a financical facility*/
package org.museframework.bian.invporman.dto.bq;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto
public class TradeInitiation {
    /*The trading request record used to initiate and track the trade*/
    @MetaField(0)
    private String investmentPortfolioTradeRequest;

    /*The type of security being traded*/
    @MetaField(0)
    private String investmentPortfolioTradeSecurityType;

    /*A description of the trade, including all key trading details (e.g. amount/volume, pricing/terms, clearing and settlement dates)*/
    @MetaField(0)
    private String investmentPortfolioTradeSecurityTradeDescription;

    public void setInvestmentPortfolioTradeRequest(String investmentPortfolioTradeRequest) {
        this.investmentPortfolioTradeRequest = investmentPortfolioTradeRequest;
    }

    public String getInvestmentPortfolioTradeRequest() {
        return investmentPortfolioTradeRequest;
    }

    public void setInvestmentPortfolioTradeSecurityType(String investmentPortfolioTradeSecurityType) {
        this.investmentPortfolioTradeSecurityType = investmentPortfolioTradeSecurityType;
    }

    public String getInvestmentPortfolioTradeSecurityType() {
        return investmentPortfolioTradeSecurityType;
    }

    public void setInvestmentPortfolioTradeSecurityTradeDescription(String investmentPortfolioTradeSecurityTradeDescription) {
        this.investmentPortfolioTradeSecurityTradeDescription = investmentPortfolioTradeSecurityTradeDescription;
    }

    public String getInvestmentPortfolioTradeSecurityTradeDescription() {
        return investmentPortfolioTradeSecurityTradeDescription;
    }
}