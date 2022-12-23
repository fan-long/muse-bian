/*The main worsteps to be followed in th eexecution of the procedure

Examples: Invoice generation*/
package org.museframework.bian.opeiteman.dto.bq;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto
public class Tracking {
    /*Reference to the associated customer billing transaction*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object customerBillingProcedureInstanceReference;

    /*The billed customer*/
    @MetaField
    private String customerBillingParty;

    /*The address the bill was sent to (can be electronic)*/
    @MetaField
    private String customerBillingAddress;

    /*The billing period is applicable*/
    @MetaField
    private String customerBillingPeriod;

    /*The content of the billing statement used in the bill*/
    @MetaField
    private String customerBillingStatement;

    /*The amount of the customer bill*/
    @MetaField
    private String customerBillingAmount;

    public void setCustomerBillingProcedureInstanceReference(org.museframework.bian.classes.Object customerBillingProcedureInstanceReference) {
        this.customerBillingProcedureInstanceReference = customerBillingProcedureInstanceReference;
    }

    public org.museframework.bian.classes.Object getCustomerBillingProcedureInstanceReference() {
        return customerBillingProcedureInstanceReference;
    }

    public void setCustomerBillingParty(String customerBillingParty) {
        this.customerBillingParty = customerBillingParty;
    }

    public String getCustomerBillingParty() {
        return customerBillingParty;
    }

    public void setCustomerBillingAddress(String customerBillingAddress) {
        this.customerBillingAddress = customerBillingAddress;
    }

    public String getCustomerBillingAddress() {
        return customerBillingAddress;
    }

    public void setCustomerBillingPeriod(String customerBillingPeriod) {
        this.customerBillingPeriod = customerBillingPeriod;
    }

    public String getCustomerBillingPeriod() {
        return customerBillingPeriod;
    }

    public void setCustomerBillingStatement(String customerBillingStatement) {
        this.customerBillingStatement = customerBillingStatement;
    }

    public String getCustomerBillingStatement() {
        return customerBillingStatement;
    }

    public void setCustomerBillingAmount(String customerBillingAmount) {
        this.customerBillingAmount = customerBillingAmount;
    }

    public String getCustomerBillingAmount() {
        return customerBillingAmount;
    }
}