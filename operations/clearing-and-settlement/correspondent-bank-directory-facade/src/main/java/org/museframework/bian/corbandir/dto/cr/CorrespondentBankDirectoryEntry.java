/*Capture and maintain reference information about some type of entitity within Correspondent Bank Data Management.*/
package org.museframework.bian.corbandir.dto.cr;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto
public class CorrespondentBankDirectoryEntry extends org.museframework.bian.classes.CorrespondentBankDirectoryEntry {
    /*Reference to the correspondent bank (e.g. BIC Codes)*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object correspondentBankReference;

    /*Clearing and sorting code used in payment processing*/
    @MetaField
    private String clearingSortCodes;

    /*Contact details for key parties at the bank*/
    @MetaField
    private String contactAddresses;

    /*One or more associated legal entity references associated with the bank*/
    @MetaField
    private String legalEntityIdentifiers;

    /*A description of the legal entity hierarchy at the bank*/
    @MetaField
    private String bankHierarchy;

    /*A reference to the bank calendar details for payment processing*/
    @MetaField
    private String holidayTimezoneSchedule;

    /*Reference to associated vostro account (your money at our bank)*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object vostroAccountReference;

    /*Reference to associated nostro account (our money at your bank)*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object nostroMirrorAccountReference;

    /*Reference to the bank agreement (that will detail limits, fees, preferred payments mechanism)*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object correspondentBankAgreementReference;

    /*The correspondent bank agreement (details agreed limits, fees, preferred payments mechanism, etc.)*/
    @MetaField
    private String correspondentBankAgreement;

    public void setCorrespondentBankReference(org.museframework.bian.classes.Object correspondentBankReference) {
        this.correspondentBankReference = correspondentBankReference;
    }

    public org.museframework.bian.classes.Object getCorrespondentBankReference() {
        return correspondentBankReference;
    }

    public void setClearingSortCodes(String clearingSortCodes) {
        this.clearingSortCodes = clearingSortCodes;
    }

    public String getClearingSortCodes() {
        return clearingSortCodes;
    }

    public void setContactAddresses(String contactAddresses) {
        this.contactAddresses = contactAddresses;
    }

    public String getContactAddresses() {
        return contactAddresses;
    }

    public void setLegalEntityIdentifiers(String legalEntityIdentifiers) {
        this.legalEntityIdentifiers = legalEntityIdentifiers;
    }

    public String getLegalEntityIdentifiers() {
        return legalEntityIdentifiers;
    }

    public void setBankHierarchy(String bankHierarchy) {
        this.bankHierarchy = bankHierarchy;
    }

    public String getBankHierarchy() {
        return bankHierarchy;
    }

    public void setHolidayTimezoneSchedule(String holidayTimezoneSchedule) {
        this.holidayTimezoneSchedule = holidayTimezoneSchedule;
    }

    public String getHolidayTimezoneSchedule() {
        return holidayTimezoneSchedule;
    }

    public void setVostroAccountReference(org.museframework.bian.classes.Object vostroAccountReference) {
        this.vostroAccountReference = vostroAccountReference;
    }

    public org.museframework.bian.classes.Object getVostroAccountReference() {
        return vostroAccountReference;
    }

    public void setNostroMirrorAccountReference(org.museframework.bian.classes.Object nostroMirrorAccountReference) {
        this.nostroMirrorAccountReference = nostroMirrorAccountReference;
    }

    public org.museframework.bian.classes.Object getNostroMirrorAccountReference() {
        return nostroMirrorAccountReference;
    }

    public void setCorrespondentBankAgreementReference(org.museframework.bian.classes.Object correspondentBankAgreementReference) {
        this.correspondentBankAgreementReference = correspondentBankAgreementReference;
    }

    public org.museframework.bian.classes.Object getCorrespondentBankAgreementReference() {
        return correspondentBankAgreementReference;
    }

    public void setCorrespondentBankAgreement(String correspondentBankAgreement) {
        this.correspondentBankAgreement = correspondentBankAgreement;
    }

    public String getCorrespondentBankAgreement() {
        return correspondentBankAgreement;
    }
}