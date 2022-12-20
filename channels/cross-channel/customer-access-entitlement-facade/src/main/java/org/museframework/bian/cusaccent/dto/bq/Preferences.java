/*A collection of terms (within some jurisdiction) that can be selected and configured to define a contract /agreement

Examples: Required disclosures*/
package org.museframework.bian.cusaccent.dto.bq;

public class Preferences {
    /*Assembles a number of channel access preferences*/
    private String channelAccessPreferencesRecord;

    /*Reference to one of possibly several preferences*/
    private org.museframework.bian.classes.Object channelAccessPreferenceReference;

    /*The type of preference (e.g. for correspondence)*/
    private String channelAccessPreferenceType;

    /*Consolidates details of the preference*/
    private String channelAccessPreferenceProfile;

    /*Details the specific device or channel with the preference*/
    private String channelAccessChannelDeviceType;

    /*Details the preference (e.g. no paper correspondence, no solicitations)*/
    private String channelAccessChannelDeviceTypePreference;

    /*The types of product and service to which this preference applies*/
    private String productandServiceType;

    public void setChannelAccessPreferencesRecord(String channelAccessPreferencesRecord) {
        this.channelAccessPreferencesRecord = channelAccessPreferencesRecord;
    }

    public String getChannelAccessPreferencesRecord() {
        return channelAccessPreferencesRecord;
    }

    public void setChannelAccessPreferenceReference(org.museframework.bian.classes.Object channelAccessPreferenceReference) {
        this.channelAccessPreferenceReference = channelAccessPreferenceReference;
    }

    public org.museframework.bian.classes.Object getChannelAccessPreferenceReference() {
        return channelAccessPreferenceReference;
    }

    public void setChannelAccessPreferenceType(String channelAccessPreferenceType) {
        this.channelAccessPreferenceType = channelAccessPreferenceType;
    }

    public String getChannelAccessPreferenceType() {
        return channelAccessPreferenceType;
    }

    public void setChannelAccessPreferenceProfile(String channelAccessPreferenceProfile) {
        this.channelAccessPreferenceProfile = channelAccessPreferenceProfile;
    }

    public String getChannelAccessPreferenceProfile() {
        return channelAccessPreferenceProfile;
    }

    public void setChannelAccessChannelDeviceType(String channelAccessChannelDeviceType) {
        this.channelAccessChannelDeviceType = channelAccessChannelDeviceType;
    }

    public String getChannelAccessChannelDeviceType() {
        return channelAccessChannelDeviceType;
    }

    public void setChannelAccessChannelDeviceTypePreference(String channelAccessChannelDeviceTypePreference) {
        this.channelAccessChannelDeviceTypePreference = channelAccessChannelDeviceTypePreference;
    }

    public String getChannelAccessChannelDeviceTypePreference() {
        return channelAccessChannelDeviceTypePreference;
    }

    public void setProductandServiceType(String productandServiceType) {
        this.productandServiceType = productandServiceType;
    }

    public String getProductandServiceType() {
        return productandServiceType;
    }
}