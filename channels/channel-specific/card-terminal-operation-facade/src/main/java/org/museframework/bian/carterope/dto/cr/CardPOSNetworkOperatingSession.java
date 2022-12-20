/*Operate equipment and/or a largely automated facility within Card Terminal Operation. */
package org.museframework.bian.carterope.dto.cr;

public class CardPOSNetworkOperatingSession extends org.museframework.bian.classes.CardPOSNetworkOperatingSession {
    /*Defines the service availability through the session*/
    private String cardPOSTerminalOperatingSchedule;

    public void setCardPOSTerminalOperatingSchedule(String cardPOSTerminalOperatingSchedule) {
        this.cardPOSTerminalOperatingSchedule = cardPOSTerminalOperatingSchedule;
    }

    public String getCardPOSTerminalOperatingSchedule() {
        return cardPOSTerminalOperatingSchedule;
    }
}