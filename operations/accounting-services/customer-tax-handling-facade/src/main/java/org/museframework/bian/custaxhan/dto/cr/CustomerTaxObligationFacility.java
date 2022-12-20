/*Fulfill any scheduled and ad-hoc obligations under a service arrangement, most typically for a financial product or facility within Customer Tax Handling. */
package org.museframework.bian.custaxhan.dto.cr;

public class CustomerTaxObligationFacility {
    /*Reference to the customer for whom the consolidated tax position is maintained*/
    private org.museframework.bian.classes.Object customerReference;

    /*The consolidated record of the customer tax reporting position - basis for generating tax reports*/
    private String customerTaxHandlingArrangementRecord;

    /*Reference to the applicable tax authority/jurisdiction that applies for the customer - can be multiple for the customer*/
    private org.museframework.bian.classes.Object taxationJurisdictionReference;

    /*Tax handling and reporting regulation that is applied to this customer*/
    private org.museframework.bian.classes.Object applicableTaxationRuleReference;

    /*Covers all tax reporting guidelines, schedule and position reporting requirements for the customer*/
    private String applicableTaxationRuleDefinition;

    /*Defines the customer tax reporting obligations, recording target and actual dates*/
    private String customerTaxReportingSchedule;

    public void setCustomerReference(org.museframework.bian.classes.Object customerReference) {
        this.customerReference = customerReference;
    }

    public org.museframework.bian.classes.Object getCustomerReference() {
        return customerReference;
    }

    public void setCustomerTaxHandlingArrangementRecord(String customerTaxHandlingArrangementRecord) {
        this.customerTaxHandlingArrangementRecord = customerTaxHandlingArrangementRecord;
    }

    public String getCustomerTaxHandlingArrangementRecord() {
        return customerTaxHandlingArrangementRecord;
    }

    public void setTaxationJurisdictionReference(org.museframework.bian.classes.Object taxationJurisdictionReference) {
        this.taxationJurisdictionReference = taxationJurisdictionReference;
    }

    public org.museframework.bian.classes.Object getTaxationJurisdictionReference() {
        return taxationJurisdictionReference;
    }

    public void setApplicableTaxationRuleReference(org.museframework.bian.classes.Object applicableTaxationRuleReference) {
        this.applicableTaxationRuleReference = applicableTaxationRuleReference;
    }

    public org.museframework.bian.classes.Object getApplicableTaxationRuleReference() {
        return applicableTaxationRuleReference;
    }

    public void setApplicableTaxationRuleDefinition(String applicableTaxationRuleDefinition) {
        this.applicableTaxationRuleDefinition = applicableTaxationRuleDefinition;
    }

    public String getApplicableTaxationRuleDefinition() {
        return applicableTaxationRuleDefinition;
    }

    public void setCustomerTaxReportingSchedule(String customerTaxReportingSchedule) {
        this.customerTaxReportingSchedule = customerTaxReportingSchedule;
    }

    public String getCustomerTaxReportingSchedule() {
        return customerTaxReportingSchedule;
    }
}