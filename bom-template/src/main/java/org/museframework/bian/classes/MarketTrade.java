/*In financial terms, trade basically refers to the sale and purchase of assets and securities between two consensual sides.

In finance, trading refers to purchasing and selling securities or other assets. (Investopedia)

A trade relates to the delivery or exchanging of goods and services, cash or securities. (ISO20022)
.
Result of an order between at least two parties. (ISO20022)

Market Trade is at the side of Bank and Market
.*/
package org.museframework.bian.classes;

public class MarketTrade {
    /*Specifies the date/time on which the trade was executed. (ISO20022)*/
    private String tradeExecuteDate;

    /*Date on which the trade is settled, ie, the amounts are due. ISO20022*/
    private String tradeValueDate;

    /*End date of the trade, such as a treasury trade or a derivative trade. ISO20022*/
    private String tradeEndDate;

    /*Specifies the different identifications associated with a trade.*/
    private String tradeIdentification;

    /*Start date of the trade, such as a treasury trade or a derivative trade. ISO20022*/
    private String tradeStartDate;

    /*Asset which is the object of a trade. ISO20022*/
    private Asset tradeAsset;

    /*Market where a trade is negotiated and executed. IS020022*/
    private Market tradeMarket;

    public void setTradeExecuteDate(String tradeExecuteDate) {
        this.tradeExecuteDate = tradeExecuteDate;
    }

    public String getTradeExecuteDate() {
        return tradeExecuteDate;
    }

    public void setTradeValueDate(String tradeValueDate) {
        this.tradeValueDate = tradeValueDate;
    }

    public String getTradeValueDate() {
        return tradeValueDate;
    }

    public void setTradeEndDate(String tradeEndDate) {
        this.tradeEndDate = tradeEndDate;
    }

    public String getTradeEndDate() {
        return tradeEndDate;
    }

    public void setTradeIdentification(String tradeIdentification) {
        this.tradeIdentification = tradeIdentification;
    }

    public String getTradeIdentification() {
        return tradeIdentification;
    }

    public void setTradeStartDate(String tradeStartDate) {
        this.tradeStartDate = tradeStartDate;
    }

    public String getTradeStartDate() {
        return tradeStartDate;
    }

    public void setTradeAsset(Asset tradeAsset) {
        this.tradeAsset = tradeAsset;
    }

    public Asset getTradeAsset() {
        return tradeAsset;
    }

    public void setTradeMarket(Market tradeMarket) {
        this.tradeMarket = tradeMarket;
    }

    public Market getTradeMarket() {
        return tradeMarket;
    }
}