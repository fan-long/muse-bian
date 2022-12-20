/*A Physical or virtual space where buyers, sellers, market authorities and other market parties trade products and services according to market rules.*/
package org.museframework.bian.classes;

public class Market {
    /**/
    private org.museframework.bian.enumerations.Markettypevalues marketType;

    public void setMarketType(org.museframework.bian.enumerations.Markettypevalues marketType) {
        this.marketType = marketType;
    }

    public org.museframework.bian.enumerations.Markettypevalues getMarketType() {
        return marketType;
    }
}