/*Party roles involved in the loan agreement like Lender and Borrower.*/
package org.museframework.bian.classes;

public class LoanAgreementInvolvement {
    /**/
    private org.museframework.bian.enumerations.Loanagreementinvolvementtypevalues loanAgreementInvolvementType;

    public void setLoanAgreementInvolvementType(org.museframework.bian.enumerations.Loanagreementinvolvementtypevalues loanAgreementInvolvementType) {
        this.loanAgreementInvolvementType = loanAgreementInvolvementType;
    }

    public org.museframework.bian.enumerations.Loanagreementinvolvementtypevalues getLoanAgreementInvolvementType() {
        return loanAgreementInvolvementType;
    }
}