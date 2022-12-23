/*The collection of operational serivces/functions offered by the operational facility

Examples: messages, capture, routines*/
package org.museframework.bian.mardatswiope.dto.bq;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto
public class Distribution {
    /*Reference to a user's switch service access rights*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object marketDataSwitchUserAccessRightsRecordReference;

    /*The users are registered to access different services/information made available through the switch - it is used to control information distribution*/
    @MetaField
    private String marketDataSwitchUserAccessRightsRecord;

    /*This tracks the switch service content that the user will receive for this session - reflecting their user access rights*/
    @MetaField
    private String marketDataSwitchServiceUserSessionRecord;

    public void setMarketDataSwitchUserAccessRightsRecordReference(org.museframework.bian.classes.Object marketDataSwitchUserAccessRightsRecordReference) {
        this.marketDataSwitchUserAccessRightsRecordReference = marketDataSwitchUserAccessRightsRecordReference;
    }

    public org.museframework.bian.classes.Object getMarketDataSwitchUserAccessRightsRecordReference() {
        return marketDataSwitchUserAccessRightsRecordReference;
    }

    public void setMarketDataSwitchUserAccessRightsRecord(String marketDataSwitchUserAccessRightsRecord) {
        this.marketDataSwitchUserAccessRightsRecord = marketDataSwitchUserAccessRightsRecord;
    }

    public String getMarketDataSwitchUserAccessRightsRecord() {
        return marketDataSwitchUserAccessRightsRecord;
    }

    public void setMarketDataSwitchServiceUserSessionRecord(String marketDataSwitchServiceUserSessionRecord) {
        this.marketDataSwitchServiceUserSessionRecord = marketDataSwitchServiceUserSessionRecord;
    }

    public String getMarketDataSwitchServiceUserSessionRecord() {
        return marketDataSwitchServiceUserSessionRecord;
    }
}