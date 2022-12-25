/*The Repo Transaction Cash Transfer Task is a discrete action or task that is required in the execution of the Repo Transaction Cash Transfer Task*/
package org.museframework.bian.stolenandrep.dto.bq;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto
public class StockLendingandReposOutcome {
    /**/
    @MetaField(0)
    private String stockLendingandReposCounterparty;

    /**/
    @MetaField(0)
    private String stockLendingandReposDividend;

    /**/
    @MetaField(ref=true)
    private org.museframework.bian.classes.FeeTransaction stockLendingandReposFees;

    /**/
    @MetaField(ref=true)
    private org.museframework.bian.classes.InterestTransaction stockLendingandReposInterest;

    /**/
    @MetaField(0)
    private String stockLendingandReposMargining;

    /**/
    @MetaField(0)
    private String stockLendingandReposNotionalPrincipal;

    /**/
    @MetaField(0)
    private String stockLendingandReposOptions;

    /**/
    @MetaField(0)
    private String stockLendingandReposRates;

    /**/
    @MetaField(0)
    private String stockLendingandReposSettlement;

    /**/
    @MetaField(0)
    private String stockLendingandReposWorkProduct;

    public void setStockLendingandReposCounterparty(String stockLendingandReposCounterparty) {
        this.stockLendingandReposCounterparty = stockLendingandReposCounterparty;
    }

    public String getStockLendingandReposCounterparty() {
        return stockLendingandReposCounterparty;
    }

    public void setStockLendingandReposDividend(String stockLendingandReposDividend) {
        this.stockLendingandReposDividend = stockLendingandReposDividend;
    }

    public String getStockLendingandReposDividend() {
        return stockLendingandReposDividend;
    }

    public void setStockLendingandReposFees(org.museframework.bian.classes.FeeTransaction stockLendingandReposFees) {
        this.stockLendingandReposFees = stockLendingandReposFees;
    }

    public org.museframework.bian.classes.FeeTransaction getStockLendingandReposFees() {
        return stockLendingandReposFees;
    }

    public void setStockLendingandReposInterest(org.museframework.bian.classes.InterestTransaction stockLendingandReposInterest) {
        this.stockLendingandReposInterest = stockLendingandReposInterest;
    }

    public org.museframework.bian.classes.InterestTransaction getStockLendingandReposInterest() {
        return stockLendingandReposInterest;
    }

    public void setStockLendingandReposMargining(String stockLendingandReposMargining) {
        this.stockLendingandReposMargining = stockLendingandReposMargining;
    }

    public String getStockLendingandReposMargining() {
        return stockLendingandReposMargining;
    }

    public void setStockLendingandReposNotionalPrincipal(String stockLendingandReposNotionalPrincipal) {
        this.stockLendingandReposNotionalPrincipal = stockLendingandReposNotionalPrincipal;
    }

    public String getStockLendingandReposNotionalPrincipal() {
        return stockLendingandReposNotionalPrincipal;
    }

    public void setStockLendingandReposOptions(String stockLendingandReposOptions) {
        this.stockLendingandReposOptions = stockLendingandReposOptions;
    }

    public String getStockLendingandReposOptions() {
        return stockLendingandReposOptions;
    }

    public void setStockLendingandReposRates(String stockLendingandReposRates) {
        this.stockLendingandReposRates = stockLendingandReposRates;
    }

    public String getStockLendingandReposRates() {
        return stockLendingandReposRates;
    }

    public void setStockLendingandReposSettlement(String stockLendingandReposSettlement) {
        this.stockLendingandReposSettlement = stockLendingandReposSettlement;
    }

    public String getStockLendingandReposSettlement() {
        return stockLendingandReposSettlement;
    }

    public void setStockLendingandReposWorkProduct(String stockLendingandReposWorkProduct) {
        this.stockLendingandReposWorkProduct = stockLendingandReposWorkProduct;
    }

    public String getStockLendingandReposWorkProduct() {
        return stockLendingandReposWorkProduct;
    }
}