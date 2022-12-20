/*Maintain a log of transactions or activity, typically a financial account/journal or a log of activity to support behavioral analysis within Channel Activity History. */
package org.museframework.bian.chaacthis.dto.cr;

public class ChannelActivityLog extends org.museframework.bian.classes.ChannelActivityLog {
    /*Reference to the customer being logged*/
    private org.museframework.bian.classes.Object customerReference;

    /*Key dates associated with the log (e.g. start time)*/
    private String date;

    public void setCustomerReference(org.museframework.bian.classes.Object customerReference) {
        this.customerReference = customerReference;
    }

    public org.museframework.bian.classes.Object getCustomerReference() {
        return customerReference;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getDate() {
        return date;
    }
}