/*An agreement with a primary purpose of accumulating a flexibly available financial reserve

Contrary to a current account agreement, its primary purpose is not to facilitate payments.*/
package org.museframework.bian.classes;

public class SavingsAccountAgreement {
    /*The reference with which a SavingsAgreement is identified*/
    private String savingsAccountAgreementIdentification;

    /**/
    private String savingsAccountAgreementCurrency;

    /*The modalities for taxation of a savings account agreement*/
    private String savingsAccountAgreementTaxRegime;

    /**/
    private String customerCommentary;

    /*An indicator specifying if the Agreement has more than one account holder of not.
This indicator is a derived attribute. If there is more than one agreement involvement of type account holder, the indicator will be flagged as 1 */
    private String joinedAccountHolderIndicator;

    /*An indicator specifying if a standing order agreement is associated to the savings account.

This is a derived attribute from the relationship between Savings Account Agreement and Standing Order Agreement.*/
    private String standingOrderIndicator;

    public void setSavingsAccountAgreementIdentification(String savingsAccountAgreementIdentification) {
        this.savingsAccountAgreementIdentification = savingsAccountAgreementIdentification;
    }

    public String getSavingsAccountAgreementIdentification() {
        return savingsAccountAgreementIdentification;
    }

    public void setSavingsAccountAgreementCurrency(String savingsAccountAgreementCurrency) {
        this.savingsAccountAgreementCurrency = savingsAccountAgreementCurrency;
    }

    public String getSavingsAccountAgreementCurrency() {
        return savingsAccountAgreementCurrency;
    }

    public void setSavingsAccountAgreementTaxRegime(String savingsAccountAgreementTaxRegime) {
        this.savingsAccountAgreementTaxRegime = savingsAccountAgreementTaxRegime;
    }

    public String getSavingsAccountAgreementTaxRegime() {
        return savingsAccountAgreementTaxRegime;
    }

    public void setCustomerCommentary(String customerCommentary) {
        this.customerCommentary = customerCommentary;
    }

    public String getCustomerCommentary() {
        return customerCommentary;
    }

    public void setJoinedAccountHolderIndicator(String joinedAccountHolderIndicator) {
        this.joinedAccountHolderIndicator = joinedAccountHolderIndicator;
    }

    public String getJoinedAccountHolderIndicator() {
        return joinedAccountHolderIndicator;
    }

    public void setStandingOrderIndicator(String standingOrderIndicator) {
        this.standingOrderIndicator = standingOrderIndicator;
    }

    public String getStandingOrderIndicator() {
        return standingOrderIndicator;
    }
}