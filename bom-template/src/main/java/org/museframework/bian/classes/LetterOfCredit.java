/*Instrument issued by a bank substituting its name and credit standing for that of its customer. (ISO20022)

A letter of credit is a written undertaking of the bank, issued for the account of a customer (the applicant), to honour a demand for payment, upon the beneficiary's compliance with the terms and conditions set forth in the undertaking. (ISO20022)

A letter of credit is a document sent from a bank or financial institute that guarantees that a seller will receive a buyer's payment on time and for the full amount. (Investopedia)

A letter from a bank guaranteeing that a buyer's payment to a seller will be received on time and for the correct amount (Investopedia)

*/
package org.museframework.bian.classes;

public class LetterOfCredit {
    /*Types of documents include commercial letters of credit, standby letters of credit, revocable letters of credit, irrevocable letters of credit, revolving letters of credit, and red clause letters of credit. (Investopedia)*/
    private org.museframework.bian.enumerations.Letterofcredittypevalues letterOfCreditType;

    public void setLetterOfCreditType(org.museframework.bian.enumerations.Letterofcredittypevalues letterOfCreditType) {
        this.letterOfCreditType = letterOfCreditType;
    }

    public org.museframework.bian.enumerations.Letterofcredittypevalues getLetterOfCreditType() {
        return letterOfCreditType;
    }
}