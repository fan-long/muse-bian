/*An order to buy or sell a specified amount of a security at the best price available.

A request by an investor - usually made through a broker or brokerage service - to buy or sell a security at the best available price in the current market.
https://www.investopedia.com/terms/m/marketorder.asp


A buy or sell order in which the broker is to execute the order at the best price currently available.

Read more: http://www.investorwords.com/2983/market_order.html#ixzz6PiOvXQsv*/
package org.museframework.bian.classes;

public class MarketOrderInstruction {
    /**/
    private String marketOrderType;

    /**/
    private String marketOrderDate;

    /**/
    private String marketOrderDateType;

    public void setMarketOrderType(String marketOrderType) {
        this.marketOrderType = marketOrderType;
    }

    public String getMarketOrderType() {
        return marketOrderType;
    }

    public void setMarketOrderDate(String marketOrderDate) {
        this.marketOrderDate = marketOrderDate;
    }

    public String getMarketOrderDate() {
        return marketOrderDate;
    }

    public void setMarketOrderDateType(String marketOrderDateType) {
        this.marketOrderDateType = marketOrderDateType;
    }

    public String getMarketOrderDateType() {
        return marketOrderDateType;
    }
}