/*An accounting process that compares two sets of records to check that figures are correct and in agreement. (Investopedia)

An account reconciliation is the actions taken to prove that an account balance is valid. The concept is most commonly associated with the bank reconciliation, where a companys recorded cash balance is compared to the banks end-of-month bank statement and adjusted as necessary to make the two balances match. It is also a key task to be completed before an organizations books are audited at the end of each year. (AccountingTools)*/
package org.museframework.bian.classes;

public class AccountReconciliation {
    /**/
    private Workstep accountReconciliationWorkstep;

    /**/
    private org.museframework.bian.enumerations.Accountreconciliationworksteptypevalues accountReconciliationWorkstepType;

    public void setAccountReconciliationWorkstep(Workstep accountReconciliationWorkstep) {
        this.accountReconciliationWorkstep = accountReconciliationWorkstep;
    }

    public Workstep getAccountReconciliationWorkstep() {
        return accountReconciliationWorkstep;
    }

    public void setAccountReconciliationWorkstepType(org.museframework.bian.enumerations.Accountreconciliationworksteptypevalues accountReconciliationWorkstepType) {
        this.accountReconciliationWorkstepType = accountReconciliationWorkstepType;
    }

    public org.museframework.bian.enumerations.Accountreconciliationworksteptypevalues getAccountReconciliationWorkstepType() {
        return accountReconciliationWorkstepType;
    }
}