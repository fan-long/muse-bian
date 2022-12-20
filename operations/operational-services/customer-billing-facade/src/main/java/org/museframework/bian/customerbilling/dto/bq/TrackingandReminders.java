/*The main worsteps to be followed in th eexecution of the procedure

Examples: Invoice generation*/
package org.museframework.bian.customerbilling.dto.bq;

public class TrackingandReminders {
    /*Reference to an outbound contact established with the customer*/
    private String customerReminderContactRecord;

    /*Content of the reminder message*/
    private String contactMessage;

    /*The date and time of the contact*/
    private String contactDate;

    /*Any response arising from the contact*/
    private String contactResult;

    /*The result of the tracking and reminder activity*/
    private String trackingandRemindersResult;

    /*Work documentation, forms and schedules produced and referenced during the task*/
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