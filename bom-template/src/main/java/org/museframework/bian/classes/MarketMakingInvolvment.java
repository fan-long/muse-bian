/*A role which is played by a Party in Market Making*/
package org.museframework.bian.classes;

public class MarketMakingInvolvment {
    /**/
    private org.museframework.bian.enumerations.Marketmakinginvolvmenttypevalues marketMakingInvolvmentType;

    public void setMarketMakingInvolvmentType(org.museframework.bian.enumerations.Marketmakinginvolvmenttypevalues marketMakingInvolvmentType) {
        this.marketMakingInvolvmentType = marketMakingInvolvmentType;
    }

    public org.museframework.bian.enumerations.Marketmakinginvolvmenttypevalues getMarketMakingInvolvmentType() {
        return marketMakingInvolvmentType;
    }
}