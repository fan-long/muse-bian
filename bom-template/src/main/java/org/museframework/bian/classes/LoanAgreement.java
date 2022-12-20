/*Definition:
A (Debt) Agreement into which is arranged that a party (lender) is giving money or financial instruments to another party (borrower) in exchange for future repayment of the loan value or principal amount, along with interest or finance charges. 

Comment:
A loan may be for a specific, one-time amount, or it can be available as an open-ended line of credit up to a specified limit, or any other variation.
A classification of any agreement that provides funds to an entity in return for a promise from the entity to repay a lender or investor in accordance with terms and conditions of a contract. 
*/
package org.museframework.bian.classes;

public class LoanAgreement {
    /*Term and condition to govern the use of loan product and the loan agreement in general.*/
    private Condition loanTermAndCondition;

    /*Amount of money promised to be borrowed.*/
    private String loanAmount;

    public void setLoanTermAndCondition(Condition loanTermAndCondition) {
        this.loanTermAndCondition = loanTermAndCondition;
    }

    public Condition getLoanTermAndCondition() {
        return loanTermAndCondition;
    }

    public void setLoanAmount(String loanAmount) {
        this.loanAmount = loanAmount;
    }

    public String getLoanAmount() {
        return loanAmount;
    }
}