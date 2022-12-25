/*Fulfill any scheduled and ad-hoc obligations under a service arrangement, most typically for a financial product or facility within ECM And DCM. */
package org.museframework.bian.ecmanddcm.dto.cr;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto
public class ECMAndDCMFacility {
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
    private org.museframework.bian.classes.Object businessUnitReference;

    /*The document reference for associated documents such as disclosures and acceptance records*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object documentDirectoryEntryInstanceReference;

    /*Definition of the involved parties or associations to the issuance project*/
    @MetaField(0)
    private String associations;

    /*The type of association (e.g. co-investor, legal)*/
    @MetaField(0)
    private String associationType;

    /*Description of the role, obligations or entitlements of the associated party*/
    @MetaField(0)
    private String associationObligationEntitlement;

    /*Reference to the associated party*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object associationReference;

    /*The schedule for work tasks performed and to be performed through the issuing process*/
    @MetaField(0)
    private String ECMAndDCMFulfillmentSchedule;

    /*Key dates associated with the issuance process (e.g. engagement date, prospectus date, offering date)*/
    @MetaField(0)
    private String dateType;

    /*Value of the date type*/
    @MetaField(0)
    private String date;

    /*The consolidated record of the developed investment vehicle. Combines the output of the development and issuance activities, participant details, investment transaction records as appropriate (details not included at this time)*/
    @MetaField(0)
    private String ECMAndDCMInstrumentRecord;

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

    public void setBusinessUnitReference(org.museframework.bian.classes.Object businessUnitReference) {
        this.businessUnitReference = businessUnitReference;
    }

    public org.museframework.bian.classes.Object getBusinessUnitReference() {
        return businessUnitReference;
    }

    public void setDocumentDirectoryEntryInstanceReference(org.museframework.bian.classes.Object documentDirectoryEntryInstanceReference) {
        this.documentDirectoryEntryInstanceReference = documentDirectoryEntryInstanceReference;
    }

    public org.museframework.bian.classes.Object getDocumentDirectoryEntryInstanceReference() {
        return documentDirectoryEntryInstanceReference;
    }

    public void setAssociations(String associations) {
        this.associations = associations;
    }

    public String getAssociations() {
        return associations;
    }

    public void setAssociationType(String associationType) {
        this.associationType = associationType;
    }

    public String getAssociationType() {
        return associationType;
    }

    public void setAssociationObligationEntitlement(String associationObligationEntitlement) {
        this.associationObligationEntitlement = associationObligationEntitlement;
    }

    public String getAssociationObligationEntitlement() {
        return associationObligationEntitlement;
    }

    public void setAssociationReference(org.museframework.bian.classes.Object associationReference) {
        this.associationReference = associationReference;
    }

    public org.museframework.bian.classes.Object getAssociationReference() {
        return associationReference;
    }

    public void setECMAndDCMFulfillmentSchedule(String ECMAndDCMFulfillmentSchedule) {
        this.ECMAndDCMFulfillmentSchedule = ECMAndDCMFulfillmentSchedule;
    }

    public String getECMAndDCMFulfillmentSchedule() {
        return ECMAndDCMFulfillmentSchedule;
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

    public void setECMAndDCMInstrumentRecord(String ECMAndDCMInstrumentRecord) {
        this.ECMAndDCMInstrumentRecord = ECMAndDCMInstrumentRecord;
    }

    public String getECMAndDCMInstrumentRecord() {
        return ECMAndDCMInstrumentRecord;
    }
}