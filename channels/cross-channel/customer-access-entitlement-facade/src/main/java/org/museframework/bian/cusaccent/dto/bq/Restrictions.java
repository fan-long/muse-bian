/*A collection of terms (within some jurisdiction) that can be selected and configured to define a contract /agreement

Examples: Required disclosures*/
package org.museframework.bian.cusaccent.dto.bq;

public class Restrictions {
    /*Assembles the array of channel access constraints*/
    private String channelAccessRestrictionsRecord;

    /*Details allowed products/services and associated features*/
    private String channelAccessProductandServiceTypeUsage;

    /*Details restrictions on allowed product/services by channel/device*/
    private String channelAccessProductandServiceChannelDeviceRestrictions;

    /*Details restrictions on allowed product/services by location*/
    private String channelAccessProductandServiceLocationRestrictions;

    /*Details restrictions on allowed product/services by frequency and cumulative amounts - can be cross-product*/
    private String channelAccessProductandServiceFrequencyLimitRestrictions;

    /*Details restrictions on allowed product/service by schedule and cumulative access duration*/
    private String channelAccessProductandServiceTimeDurationRestrictions;

    public void setChannelAccessRestrictionsRecord(String channelAccessRestrictionsRecord) {
        this.channelAccessRestrictionsRecord = channelAccessRestrictionsRecord;
    }

    public String getChannelAccessRestrictionsRecord() {
        return channelAccessRestrictionsRecord;
    }

    public void setChannelAccessProductandServiceTypeUsage(String channelAccessProductandServiceTypeUsage) {
        this.channelAccessProductandServiceTypeUsage = channelAccessProductandServiceTypeUsage;
    }

    public String getChannelAccessProductandServiceTypeUsage() {
        return channelAccessProductandServiceTypeUsage;
    }

    public void setChannelAccessProductandServiceChannelDeviceRestrictions(String channelAccessProductandServiceChannelDeviceRestrictions) {
        this.channelAccessProductandServiceChannelDeviceRestrictions = channelAccessProductandServiceChannelDeviceRestrictions;
    }

    public String getChannelAccessProductandServiceChannelDeviceRestrictions() {
        return channelAccessProductandServiceChannelDeviceRestrictions;
    }

    public void setChannelAccessProductandServiceLocationRestrictions(String channelAccessProductandServiceLocationRestrictions) {
        this.channelAccessProductandServiceLocationRestrictions = channelAccessProductandServiceLocationRestrictions;
    }

    public String getChannelAccessProductandServiceLocationRestrictions() {
        return channelAccessProductandServiceLocationRestrictions;
    }

    public void setChannelAccessProductandServiceFrequencyLimitRestrictions(String channelAccessProductandServiceFrequencyLimitRestrictions) {
        this.channelAccessProductandServiceFrequencyLimitRestrictions = channelAccessProductandServiceFrequencyLimitRestrictions;
    }

    public String getChannelAccessProductandServiceFrequencyLimitRestrictions() {
        return channelAccessProductandServiceFrequencyLimitRestrictions;
    }

    public void setChannelAccessProductandServiceTimeDurationRestrictions(String channelAccessProductandServiceTimeDurationRestrictions) {
        this.channelAccessProductandServiceTimeDurationRestrictions = channelAccessProductandServiceTimeDurationRestrictions;
    }

    public String getChannelAccessProductandServiceTimeDurationRestrictions() {
        return channelAccessProductandServiceTimeDurationRestrictions;
    }
}