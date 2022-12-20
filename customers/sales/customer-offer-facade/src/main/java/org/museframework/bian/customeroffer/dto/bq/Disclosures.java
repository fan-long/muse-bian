/*Handles the booking of the asset or liability to the appropriate unit*/
package org.museframework.bian.customeroffer.dto.bq;

public class Disclosures {
    /*The type of disclosure (e.g. verbal, requiring signature)*/
    private String disclosureType;

    /*The presented disclosure for customer review in any suitable format*/
    private String disclosureTextDescription;

    /*An indicator that the disclosure has been accepted (indicates signature obtained as necessary)*/
    private String customerAcceptanceIndicator;

    /*The customer signature/acceptance record*/
    private org.museframework.bian.classes.Object documentReference_forcustomersignatureacceptancerecord_;

    public void setDisclosureType(String disclosureType) {
        this.disclosureType = disclosureType;
    }

    public String getDisclosureType() {
        return disclosureType;
    }

    public void setDisclosureTextDescription(String disclosureTextDescription) {
        this.disclosureTextDescription = disclosureTextDescription;
    }

    public String getDisclosureTextDescription() {
        return disclosureTextDescription;
    }

    public void setCustomerAcceptanceIndicator(String customerAcceptanceIndicator) {
        this.customerAcceptanceIndicator = customerAcceptanceIndicator;
    }

    public String getCustomerAcceptanceIndicator() {
        return customerAcceptanceIndicator;
    }

    public void setDocumentReference_forcustomersignatureacceptancerecord_(org.museframework.bian.classes.Object documentReference_forcustomersignatureacceptancerecord_) {
        this.documentReference_forcustomersignatureacceptancerecord_ = documentReference_forcustomersignatureacceptancerecord_;
    }

    public org.museframework.bian.classes.Object getDocumentReference_forcustomersignatureacceptancerecord_() {
        return documentReference_forcustomersignatureacceptancerecord_;
    }
}