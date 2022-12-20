/*The collection of operational serivces/functions offered by the operational facility

Examples: messages, capture, routines*/
package org.museframework.bian.customerworkbench.dto.bq;

public class ProductandServiceAccess {
    /*Locally maintained values used for auto-fill and local validation*/
    private String customerDetailsPreferences;

    /*Locally maintained structured dialogue to access bank services as appropriate*/
    private String productandServiceMenu;

    /*Locally record of product/service screen access*/
    private String productandServiceMenuAccessLog;

    /*Logged time and duration spent on product/service screens*/
    private String accessStartEndTime;

    /*Local copies of requested information, application forms etc.*/
    private String customerResidentFiles;

    public void setCustomerDetailsPreferences(String customerDetailsPreferences) {
        this.customerDetailsPreferences = customerDetailsPreferences;
    }

    public String getCustomerDetailsPreferences() {
        return customerDetailsPreferences;
    }

    public void setProductandServiceMenu(String productandServiceMenu) {
        this.productandServiceMenu = productandServiceMenu;
    }

    public String getProductandServiceMenu() {
        return productandServiceMenu;
    }

    public void setProductandServiceMenuAccessLog(String productandServiceMenuAccessLog) {
        this.productandServiceMenuAccessLog = productandServiceMenuAccessLog;
    }

    public String getProductandServiceMenuAccessLog() {
        return productandServiceMenuAccessLog;
    }

    public void setAccessStartEndTime(String accessStartEndTime) {
        this.accessStartEndTime = accessStartEndTime;
    }

    public String getAccessStartEndTime() {
        return accessStartEndTime;
    }

    public void setCustomerResidentFiles(String customerResidentFiles) {
        this.customerResidentFiles = customerResidentFiles;
    }

    public String getCustomerResidentFiles() {
        return customerResidentFiles;
    }
}