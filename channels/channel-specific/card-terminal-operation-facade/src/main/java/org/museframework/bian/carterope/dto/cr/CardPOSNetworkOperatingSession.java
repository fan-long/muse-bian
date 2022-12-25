/*Operate equipment and/or a largely automated facility within Card Terminal Operation. */
package org.museframework.bian.carterope.dto.cr;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

//refer to BOClass org.museframework.bian.classes.CardPOSNetworkOperatingSession
@MetaDto
public class CardPOSNetworkOperatingSession {
    /*Defines the service availability through the session*/
    @MetaField(0)
    private String cardPOSTerminalOperatingSchedule;

    public void setCardPOSTerminalOperatingSchedule(String cardPOSTerminalOperatingSchedule) {
        this.cardPOSTerminalOperatingSchedule = cardPOSTerminalOperatingSchedule;
    }

    public String getCardPOSTerminalOperatingSchedule() {
        return cardPOSTerminalOperatingSchedule;
    }
}