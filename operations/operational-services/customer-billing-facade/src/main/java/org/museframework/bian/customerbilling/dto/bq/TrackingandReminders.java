/*The main worsteps to be followed in th eexecution of the procedure

Examples: Invoice generation*/
package org.museframework.bian.customerbilling.dto.bq;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto
public class TrackingandReminders {
    /*Reference to an outbound contact established with the customer*/
    @MetaField(0)
    private String customerReminderContactRecord;

    /*Content of the reminder message*/
    @MetaField(0)
    private String contactMessage;

    /*The date and time of the contact*/
    @MetaField(0)
    private String contactDate;

    /*Any response arising from the contact*/
    @MetaField(0)
    private String contactResult;

    /*The result of the tracking and reminder activity*/
    @MetaField(0)
    private String trackingandRemindersResult;

    /*Work documentation, forms and schedules produced and referenced during the task*/
    @MetaField(0)
    private String trackingandRemindersWorkProduct;

    public void setCustomerReminderContactRecord(String customerReminderContactRecord) {
        this.customerReminderContactRecord = customerReminderContactRecord;
    }

    public String getCustomerReminderContactRecord() {
        return customerReminderContactRecord;
    }

    public void setContactMessage(String contactMessage) {
        this.contactMessage = contactMessage;
    }

    public String getContactMessage() {
        return contactMessage;
    }

    public void setContactDate(String contactDate) {
        this.contactDate = contactDate;
    }

    public String getContactDate() {
        return contactDate;
    }

    public void setContactResult(String contactResult) {
        this.contactResult = contactResult;
    }

    public String getContactResult() {
        return contactResult;
    }

    public void setTrackingandRemindersResult(String trackingandRemindersResult) {
        this.trackingandRemindersResult = trackingandRemindersResult;
    }

    public String getTrackingandRemindersResult() {
        return trackingandRemindersResult;
    }

    public void setTrackingandRemindersWorkProduct(String trackingandRemindersWorkProduct) {
        this.trackingandRemindersWorkProduct = trackingandRemindersWorkProduct;
    }

    public String getTrackingandRemindersWorkProduct() {
        return trackingandRemindersWorkProduct;
    }
}