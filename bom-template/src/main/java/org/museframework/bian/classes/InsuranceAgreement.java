/*An Agreement between an insurer and a customer to insure a risk object against some risk.*/
package org.museframework.bian.classes;

public class InsuranceAgreement {
    /*An identifier that allows to uniquely refer to an instance of an Insurance Agreement.*/
    private String insuranceAgreementIdentifier;

    public void setInsuranceAgreementIdentifier(String insuranceAgreementIdentifier) {
        this.insuranceAgreementIdentifier = insuranceAgreementIdentifier;
    }

    public String getInsuranceAgreementIdentifier() {
        return insuranceAgreementIdentifier;
    }
}