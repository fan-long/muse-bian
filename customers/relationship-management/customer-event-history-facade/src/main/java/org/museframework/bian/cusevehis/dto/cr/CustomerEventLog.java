/*Maintain a log of transactions or activity, typically a financial account/journal or a log of activity to support behavioral analysis within Customer Event History. */
package org.museframework.bian.cusevehis.dto.cr;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto
public class CustomerEventLog extends org.museframework.bian.classes.CustomerEventLog {
    /*Reference to the associated customer (can currently be a person or a company)*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object customerReference;

    public void setCustomerReference(org.museframework.bian.classes.Object customerReference) {
        this.customerReference = customerReference;
    }

    public org.museframework.bian.classes.Object getCustomerReference() {
        return customerReference;
    }
}