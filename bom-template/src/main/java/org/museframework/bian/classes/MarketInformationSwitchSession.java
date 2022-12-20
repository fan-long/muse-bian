/*A session of a Market Data Switch System*/
package org.museframework.bian.classes;

public class MarketInformationSwitchSession {
    /*Content provided by a market information switch session
*/
    private String marketInformationSwitchContent;

    /*User performing the Market Information Switch Session*/
    private String marketInformationSwitchSessionUser;

    /*Reference to the ServiceProfile used in the session*/
    private String marketInformationSwitchSessionServiceProfile;

    public void setMarketInformationSwitchContent(String marketInformationSwitchContent) {
        this.marketInformationSwitchContent = marketInformationSwitchContent;
    }

    public String getMarketInformationSwitchContent() {
        return marketInformationSwitchContent;
    }

    public void setMarketInformationSwitchSessionUser(String marketInformationSwitchSessionUser) {
        this.marketInformationSwitchSessionUser = marketInformationSwitchSessionUser;
    }

    public String getMarketInformationSwitchSessionUser() {
        return marketInformationSwitchSessionUser;
    }

    public void setMarketInformationSwitchSessionServiceProfile(String marketInformationSwitchSessionServiceProfile) {
        this.marketInformationSwitchSessionServiceProfile = marketInformationSwitchSessionServiceProfile;
    }

    public String getMarketInformationSwitchSessionServiceProfile() {
        return marketInformationSwitchSessionServiceProfile;
    }
}