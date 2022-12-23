/*A collection of the events/transactions recorded by the log

Examples: Customer life event, Servicing event*/
package org.museframework.bian.cusevehis.dto.bq;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto
public class Sales {
    /*The type of event (e.g. campaign, unsolicited, solicited, development)*/
    @MetaField
    private String customerSalesEventType;

    /*Employees involved in recording the event*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object employeeUnitReference;

    /*The type of product or service being sold*/
    @MetaField
    private String productandServiceType;

    /*Reference to the recorded lead/opportunity if sale progresses*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object leadandOpportunityReference;

    /*The details of the event (in a suitable format)*/
    @MetaField
    private String customerSalesEventRecord;

    /*Reference to any commission agreement if appropriate*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object commissionAgreementReference;

    /*Date and time and the location the event was captured*/
    @MetaField
    private String dateTimeLocation;

    public void setCustomerSalesEventType(String customerSalesEventType) {
        this.customerSalesEventType = customerSalesEventType;
    }

    public String getCustomerSalesEventType() {
        return customerSalesEventType;
    }

    public void setEmployeeUnitReference(org.museframework.bian.classes.Object employeeUnitReference) {
        this.employeeUnitReference = employeeUnitReference;
    }

    public org.museframework.bian.classes.Object getEmployeeUnitReference() {
        return employeeUnitReference;
    }

    public void setProductandServiceType(String productandServiceType) {
        this.productandServiceType = productandServiceType;
    }

    public String getProductandServiceType() {
        return productandServiceType;
    }

    public void setLeadandOpportunityReference(org.museframework.bian.classes.Object leadandOpportunityReference) {
        this.leadandOpportunityReference = leadandOpportunityReference;
    }

    public org.museframework.bian.classes.Object getLeadandOpportunityReference() {
        return leadandOpportunityReference;
    }

    public void setCustomerSalesEventRecord(String customerSalesEventRecord) {
        this.customerSalesEventRecord = customerSalesEventRecord;
    }

    public String getCustomerSalesEventRecord() {
        return customerSalesEventRecord;
    }

    public void setCommissionAgreementReference(org.museframework.bian.classes.Object commissionAgreementReference) {
        this.commissionAgreementReference = commissionAgreementReference;
    }

    public org.museframework.bian.classes.Object getCommissionAgreementReference() {
        return commissionAgreementReference;
    }

    public void setDateTimeLocation(String dateTimeLocation) {
        this.dateTimeLocation = dateTimeLocation;
    }

    public String getDateTimeLocation() {
        return dateTimeLocation;
    }
}