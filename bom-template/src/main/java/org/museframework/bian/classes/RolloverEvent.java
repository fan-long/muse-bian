/*The event that fulfills a rollover arrangement 

It may or may not result in creating a new Agreement */
package org.museframework.bian.classes;

public class RolloverEvent {
    /*Referebnce to the new agreement the original one "rolled over to"*/
    private String newAgreementRefernce;

    public void setNewAgreementRefernce(String newAgreementRefernce) {
        this.newAgreementRefernce = newAgreementRefernce;
    }

    public String getNewAgreementRefernce() {
        return newAgreementRefernce;
    }
}