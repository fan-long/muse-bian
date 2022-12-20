/*The collection of operational serivces/functions offered by the operational facility

Examples: messages, capture, routines*/
package org.museframework.bian.mardatswiope.dto.bq;

public class FeedUpload {
    /*Reference to packets of information/records provided, perhaps with real-time updates*/
    private org.museframework.bian.classes.Object marketInformationFeedServiceRecordReference;

    /*This is the uploaded market information that is distributed over the switch - its content is updated dynamically during the operating session*/
    private String marketInformationFeedServiceRecord;

    public void setMarketInformationFeedServiceRecordReference(org.museframework.bian.classes.Object marketInformationFeedServiceRecordReference) {
        this.marketInformationFeedServiceRecordReference = marketInformationFeedServiceRecordReference;
    }

    public org.museframework.bian.classes.Object getMarketInformationFeedServiceRecordReference() {
        return marketInformationFeedServiceRecordReference;
    }

    public void setMarketInformationFeedServiceRecord(String marketInformationFeedServiceRecord) {
        this.marketInformationFeedServiceRecord = marketInformationFeedServiceRecord;
    }

    public String getMarketInformationFeedServiceRecord() {
        return marketInformationFeedServiceRecord;
    }
}