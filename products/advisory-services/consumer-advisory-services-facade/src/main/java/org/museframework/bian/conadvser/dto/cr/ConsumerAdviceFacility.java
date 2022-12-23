/*Fulfill any scheduled and ad-hoc obligations under a service arrangement, most typically for a financial product or facility within Consumer Advisory Services. */
package org.museframework.bian.conadvser.dto.cr;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto
public class ConsumerAdviceFacility {
    /*Reference to the advisory service session*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object productInstanceReference;

    /*Reference to the customer receiving the financial advice*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object customerReference;

    /*Bank branch associated with the customer account/relationship for booking purposes*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object bankBranchLocationReference;

    /*Business unit and or employee reference to the source of the financial advice*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object employeeBusinessUnitReference;

    /*File of consolidated notes, forms and documents for the advisory session*/
    @MetaField
    private String consumerAdviceWorkProducts;

    /*The document reference for associated documents such as disclosures and acceptance records*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object documentDirectoryEntryInstanceReference;

    /*Target and actual dates for tasks performed (includes any specialist sessions)*/
    @MetaField
    private String consumerAdviceSessionSchedule;

    /*Details the types of consumer advice that are combined into the overall evaluation*/
    @MetaField
    private String consumerAdviceProfile;

    /*Reference to the different types of advice*/
    @MetaField
    private String adviceType;

    /*The combination of the different customer advisory assessments provided to the customer*/
    @MetaField
    private String consumerAdviceConsolidationRecord;

    /*Key dates and times associated with the advisory session (e.g. booking date, start date/time)*/
    @MetaField
    private String dateType;

    /*Value of the date type*/
    @MetaField
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

    public void setConsumerAdviceWorkProducts(String consumerAdviceWorkProducts) {
        this.consumerAdviceWorkProducts = consumerAdviceWorkProducts;
    }

    public String getConsumerAdviceWorkProducts() {
        return consumerAdviceWorkProducts;
    }

    public void setDocumentDirectoryEntryInstanceReference(org.museframework.bian.classes.Object documentDirectoryEntryInstanceReference) {
        this.documentDirectoryEntryInstanceReference = documentDirectoryEntryInstanceReference;
    }

    public org.museframework.bian.classes.Object getDocumentDirectoryEntryInstanceReference() {
        return documentDirectoryEntryInstanceReference;
    }

    public void setConsumerAdviceSessionSchedule(String consumerAdviceSessionSchedule) {
        this.consumerAdviceSessionSchedule = consumerAdviceSessionSchedule;
    }

    public String getConsumerAdviceSessionSchedule() {
        return consumerAdviceSessionSchedule;
    }

    public void setConsumerAdviceProfile(String consumerAdviceProfile) {
        this.consumerAdviceProfile = consumerAdviceProfile;
    }

    public String getConsumerAdviceProfile() {
        return consumerAdviceProfile;
    }

    public void setAdviceType(String adviceType) {
        this.adviceType = adviceType;
    }

    public String getAdviceType() {
        return adviceType;
    }

    public void setConsumerAdviceConsolidationRecord(String consumerAdviceConsolidationRecord) {
        this.consumerAdviceConsolidationRecord = consumerAdviceConsolidationRecord;
    }

    public String getConsumerAdviceConsolidationRecord() {
        return consumerAdviceConsolidationRecord;
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