/*The collection of operational serivces/functions offered by the operational facility

Examples: messages, capture, routines*/
package org.museframework.bian.customerworkbench.dto.bq;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto
public class Browsing {
    /*The device URL can be used to detect known and repeat customer access*/
    @MetaField(0)
    private String customerURL;

    /*The access URL to the public web based bank information*/
    @MetaField(0)
    private String bankWebsiteURL;

    public void setCustomerURL(String customerURL) {
        this.customerURL = customerURL;
    }

    public String getCustomerURL() {
        return customerURL;
    }

    public void setBankWebsiteURL(String bankWebsiteURL) {
        this.bankWebsiteURL = bankWebsiteURL;
    }

    public String getBankWebsiteURL() {
        return bankWebsiteURL;
    }
}