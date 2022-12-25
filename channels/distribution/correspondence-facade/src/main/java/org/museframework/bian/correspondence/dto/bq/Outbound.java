/*The collection of operational serivces/functions offered by the operational facility

Examples: messages, capture, routines*/
package org.museframework.bian.correspondence.dto.bq;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto
public class Outbound {
    /*Internal source reference to the correspondence item passed for delivery (can be used to match responses)*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object correspondenceSourceReference;

    /*The correspondence message*/
    @MetaField(0)
    private String correspondenceRecord;

    /*The type of correspondence (e.g. confirmation note, mail shot)*/
    @MetaField(0)
    private String correspondenceType;

    /*Reference to a template used to assemble standard format correspondence (can be supplied with the correspondence or maintained within the Correspondence service domain as appropriate)*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object correspondenceTemplateReference;

    /*The template definition used in correspondence assembly*/
    @MetaField(0)
    private String correspondenceTemplateRecord;

    /*The message content (aligned to template as appropriate)*/
    @MetaField(0)
    private String correspondenceContent;

    /*Identifies the preferred media and channel for delivery of the message*/
    @MetaField(0)
    private String correspondenceMediaChannel;

    /*The address for message delivery (needs to match channel selection)*/
    @MetaField(0)
    private String correspondenceAddressee;

    /*If addressee is identified as a customer with channel preferences for correspondence*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object customerReference;

    /*???*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object channelAccessPreferenceReference;

    /*The channel usage profile applied for the correspondence*/
    @MetaField(0)
    private String channelAccessPreferenceProfile;

    /*The target device defines the format to be used (e.g. email)*/
    @MetaField(0)
    private String channelAccessChannelDeviceType;

    /*A description of the customer's delivery preferences applied to the message (e.g. no paper correspondence, stuffing and batching allowed)*/
    @MetaField(0)
    private String channelAccessChannelDeviceTypePreference;

    /*The associated product/service if applicable*/
    @MetaField(0)
    private String productandServiceType;

    /*The sending entity within the bank (can be used for responses)*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object employeeBusinessUnitReference;

    /*Key dates used for tracking delivery (e.g. generation date, mailing date, receipt confirmation date, re-send date)*/
    @MetaField(0)
    private String dateType;

    /*The value of the date and time*/
    @MetaField(0)
    private String date;

    public void setCorrespondenceSourceReference(org.museframework.bian.classes.Object correspondenceSourceReference) {
        this.correspondenceSourceReference = correspondenceSourceReference;
    }

    public org.museframework.bian.classes.Object getCorrespondenceSourceReference() {
        return correspondenceSourceReference;
    }

    public void setCorrespondenceRecord(String correspondenceRecord) {
        this.correspondenceRecord = correspondenceRecord;
    }

    public String getCorrespondenceRecord() {
        return correspondenceRecord;
    }

    public void setCorrespondenceType(String correspondenceType) {
        this.correspondenceType = correspondenceType;
    }

    public String getCorrespondenceType() {
        return correspondenceType;
    }

    public void setCorrespondenceTemplateReference(org.museframework.bian.classes.Object correspondenceTemplateReference) {
        this.correspondenceTemplateReference = correspondenceTemplateReference;
    }

    public org.museframework.bian.classes.Object getCorrespondenceTemplateReference() {
        return correspondenceTemplateReference;
    }

    public void setCorrespondenceTemplateRecord(String correspondenceTemplateRecord) {
        this.correspondenceTemplateRecord = correspondenceTemplateRecord;
    }

    public String getCorrespondenceTemplateRecord() {
        return correspondenceTemplateRecord;
    }

    public void setCorrespondenceContent(String correspondenceContent) {
        this.correspondenceContent = correspondenceContent;
    }

    public String getCorrespondenceContent() {
        return correspondenceContent;
    }

    public void setCorrespondenceMediaChannel(String correspondenceMediaChannel) {
        this.correspondenceMediaChannel = correspondenceMediaChannel;
    }

    public String getCorrespondenceMediaChannel() {
        return correspondenceMediaChannel;
    }

    public void setCorrespondenceAddressee(String correspondenceAddressee) {
        this.correspondenceAddressee = correspondenceAddressee;
    }

    public String getCorrespondenceAddressee() {
        return correspondenceAddressee;
    }

    public void setCustomerReference(org.museframework.bian.classes.Object customerReference) {
        this.customerReference = customerReference;
    }

    public org.museframework.bian.classes.Object getCustomerReference() {
        return customerReference;
    }

    public void setChannelAccessPreferenceReference(org.museframework.bian.classes.Object channelAccessPreferenceReference) {
        this.channelAccessPreferenceReference = channelAccessPreferenceReference;
    }

    public org.museframework.bian.classes.Object getChannelAccessPreferenceReference() {
        return channelAccessPreferenceReference;
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

    public void setEmployeeBusinessUnitReference(org.museframework.bian.classes.Object employeeBusinessUnitReference) {
        this.employeeBusinessUnitReference = employeeBusinessUnitReference;
    }

    public org.museframework.bian.classes.Object getEmployeeBusinessUnitReference() {
        return employeeBusinessUnitReference;
    }

    public void setDateType(String dateType) {
        this.dateType = dateType;
    }

    public String getDateType() {
        return dateType;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getDate() {
        return date;
    }
}