/*The collection of operational serivces/functions offered by the operational facility

Examples: messages, capture, routines*/
package org.museframework.bian.customerworkbench.dto.bq;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto
public class Broadcast {
    /*Text of the broadcast message*/
    @MetaField
    private String customerWorkbenchBroadcastRecord;

    /*The timestamp for the broadcast*/
    @MetaField
    private String customerWorkbenchBroadcastRecordDateTime;

    public void setCustomerWorkbenchBroadcastRecord(String customerWorkbenchBroadcastRecord) {
        this.customerWorkbenchBroadcastRecord = customerWorkbenchBroadcastRecord;
    }

    public String getCustomerWorkbenchBroadcastRecord() {
        return customerWorkbenchBroadcastRecord;
    }

    public void setCustomerWorkbenchBroadcastRecordDateTime(String customerWorkbenchBroadcastRecordDateTime) {
        this.customerWorkbenchBroadcastRecordDateTime = customerWorkbenchBroadcastRecordDateTime;
    }

    public String getCustomerWorkbenchBroadcastRecordDateTime() {
        return customerWorkbenchBroadcastRecordDateTime;
    }
}