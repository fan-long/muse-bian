/*Fulfill any scheduled and ad-hoc obligations under a service arrangement, most typically for a financial product or facility within Corporate Tax Advisory. */
package org.museframework.bian.cortaxadv.dto.cr;

public class CorporateTaxAdvisoryFacility {
    /*Reference to the collection of advisory service sessions underlying the service*/
    private org.museframework.bian.classes.Object productInstanceReference;

    /*Reference to the customer receiving the financial advice*/
    private org.museframework.bian.classes.Object customerReference;

    /*Bank branch associated with the customer account/relationship for booking purposes*/
    private org.museframework.bian.classes.Object bankBranchLocationReference;

    /*Business unit and or employee reference to the source of the financial advice*/
    private org.museframework.bian.classes.Object employeeBusinessUnitReference;

    /*File of consolidated notes, forms and documents for the advisory sessions*/
    private String corporateTaxAdvisoryWorkProducts;

    /*The document reference for associated documents such as disclosures and acceptance records*/
    private org.museframework.bian.classes.Object documentDirectoryEntryInstanceReference;

    /*Target and actual dates for tasks performed (includes any specialist sessions)*/
    private String corporateTaxAdviceSessionSchedule;

    /*The combination of the different tax advisory sessions and assessments provided to the customer*/
    private String corporateTaxAdviceConsolidationRecord;

    /*Key dates and times associated with the advisory sessions (e.g. booking date, start date/time)*/
    private String dateType;

    /*Value of the date type*/
    private String date;

    public void setProductInstanceReference(org.museframework.bian.classes.Object productInstanceReference) {
        this.productInstanceReference = productInstanceReference;
    }

    public org.museframework.bian.classes.Object getProductInstanceReference() {
        return productInstanceReference;
    }

    public void setCustomerReference(org.museframework.bian.classes.Object customerReference) {
        this.customerReference = customerReference;
    }

    public org.museframework.bian.classes.Object getCustomerReference() {
        return customerReference;
    }

    public void setBankBranchLocationReference(org.museframework.bian.classes.Object bankBranchLocationReference) {
        this.bankBranchLocationReference = bankBranchLocationReference;
    }

    public org.museframework.bian.classes.Object getBankBranchLocationReference() {
        return bankBranchLocationReference;
    }

    public void setEmployeeBusinessUnitReference(org.museframework.bian.classes.Object employeeBusinessUnitReference) {
        this.employeeBusinessUnitReference = employeeBusinessUnitReference;
    }

    public org.museframework.bian.classes.Object getEmployeeBusinessUnitReference() {
        return employeeBusinessUnitReference;
    }

    public void setCorporateTaxAdvisoryWorkProducts(String corporateTaxAdvisoryWorkProducts) {
        this.corporateTaxAdvisoryWorkProducts = corporateTaxAdvisoryWorkProducts;
    }

    public String getCorporateTaxAdvisoryWorkProducts() {
        return corporateTaxAdvisoryWorkProducts;
    }

    public void setDocumentDirectoryEntryInstanceReference(org.museframework.bian.classes.Object documentDirectoryEntryInstanceReference) {
        this.documentDirectoryEntryInstanceReference = documentDirectoryEntryInstanceReference;
    }

    public org.museframework.bian.classes.Object getDocumentDirectoryEntryInstanceReference() {
        return documentDirectoryEntryInstanceReference;
    }

    public void setCorporateTaxAdviceSessionSchedule(String corporateTaxAdviceSessionSchedule) {
        this.corporateTaxAdviceSessionSchedule = corporateTaxAdviceSessionSchedule;
    }

    public String getCorporateTaxAdviceSessionSchedule() {
        return corporateTaxAdviceSessionSchedule;
    }

    public void setCorporateTaxAdviceConsolidationRecord(String corporateTaxAdviceConsolidationRecord) {
        this.corporateTaxAdviceConsolidationRecord = corporateTaxAdviceConsolidationRecord;
    }

    public String getCorporateTaxAdviceConsolidationRecord() {
        return corporateTaxAdviceConsolidationRecord;
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