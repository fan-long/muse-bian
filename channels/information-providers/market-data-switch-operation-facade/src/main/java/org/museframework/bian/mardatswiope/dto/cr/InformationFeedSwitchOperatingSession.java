/*Operate equipment and/or a largely automated facility within Market Data Switch Operation. */
package org.museframework.bian.mardatswiope.dto.cr;

public class InformationFeedSwitchOperatingSession {
    /*Refers to the market feed service - Note: the service operated by SD Information Provider Operation actually extracts the feed content*/
    private org.museframework.bian.classes.Object marketInformationFeedServiceReference;

    /*Sets out the range of information services/pages available - possibly with some form of selection menu*/
    private String marketInformationFeedServiceProfile;

    public void setMarketInformationFeedServiceReference(org.museframework.bian.classes.Object marketInformationFeedServiceReference) {
        this.marketInformationFeedServiceReference = marketInformationFeedServiceReference;
    }

    public org.museframework.bian.classes.Object getMarketInformationFeedServiceReference() {
        return marketInformationFeedServiceReference;
    }

    public void setMarketInformationFeedServiceProfile(String marketInformationFeedServiceProfile) {
        this.marketInformationFeedServiceProfile = marketInformationFeedServiceProfile;
    }

    public String getMarketInformationFeedServiceProfile() {
        return marketInformationFeedServiceProfile;
    }
}