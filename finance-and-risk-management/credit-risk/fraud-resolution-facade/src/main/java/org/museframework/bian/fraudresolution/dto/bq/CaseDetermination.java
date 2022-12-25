/*The main worsteps to be followed in th eexecution of the procedure

Examples: Invoice generation*/
package org.museframework.bian.fraudresolution.dto.bq;

import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto
public class CaseDetermination {
    /*Reference to the involved customer's agreement*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object customerAgreementReference;

    /*Customer agreement accessed to determine constraints on resolution approach*/
    @MetaField(0)
    private String customerAgreement;

    /*Reference to the involved merchant's agreement*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object merchantAgreementReference;

    /*Merchant agreement accessed to determine constraints on resolution approach*/
    @MetaField(0)
    private String merchantAgreement;

    /*Reference to the interested party's agreement*/
    @MetaField(ref=true)
    private org.museframework.bian.classes.Object interestedPartyAgreementReference;

    /*Interested party agreement accessed to determine constraints on resolution approach*/
    @MetaField(0)
    private String interestedPartyAgreement;

    /*Record of rules and guidelines applied to determine fraud case resolution*/
    @MetaField(0)
    private String fraudCaseDeterminationRecord;

    public void setCustomerAgreementReference(org.museframework.bian.classes.Object customerAgreementReference) {
        this.customerAgreementReference = customerAgreementReference;
    }

    public org.museframework.bian.classes.Object getCustomerAgreementReference() {
        return customerAgreementReference;
    }

    public void setCustomerAgreement(String customerAgreement) {
        this.customerAgreement = customerAgreement;
    }

    public String getCustomerAgreement() {
        return customerAgreement;
    }

    public void setMerchantAgreementReference(org.museframework.bian.classes.Object merchantAgreementReference) {
        this.merchantAgreementReference = merchantAgreementReference;
    }

    public org.museframework.bian.classes.Object getMerchantAgreementReference() {
        return merchantAgreementReference;
    }

    public void setMerchantAgreement(String merchantAgreement) {
        this.merchantAgreement = merchantAgreement;
    }

    public String getMerchantAgreement() {
        return merchantAgreement;
    }

    public void setInterestedPartyAgreementReference(org.museframework.bian.classes.Object interestedPartyAgreementReference) {
        this.interestedPartyAgreementReference = interestedPartyAgreementReference;
    }

    public org.museframework.bian.classes.Object getInterestedPartyAgreementReference() {
        return interestedPartyAgreementReference;
    }

    public void setInterestedPartyAgreement(String interestedPartyAgreement) {
        this.interestedPartyAgreement = interestedPartyAgreement;
    }

    public String getInterestedPartyAgreement() {
        return interestedPartyAgreement;
    }

    public void setFraudCaseDeterminationRecord(String fraudCaseDeterminationRecord) {
        this.fraudCaseDeterminationRecord = fraudCaseDeterminationRecord;
    }

    public String getFraudCaseDeterminationRecord() {
        return fraudCaseDeterminationRecord;
    }
}