/*Entry means Posting to an account that results in an increase or decrease to a balance. (ISO20022)

An entry posted/booked in the account.  
*/
package org.museframework.bian.classes;

public class AccountEntry {
    /*The amount of funds entered on the account

has a plus or minus sign*/
    private String accountEntryAmount;

    /*The currency in which the AccountEntryAmount is expressed*/
    private String accountEntryCurrency;

    /**/
    private String accountEntryPurpose;

    /**/
    private String accountEntryValueDate;

    /**/
    private String accountEntryStatus;

    public void setAccountEntryAmount(String accountEntryAmount) {
        this.accountEntryAmount = accountEntryAmount;
    }

    public String getAccountEntryAmount() {
        return accountEntryAmount;
    }

    public void setAccountEntryCurrency(String accountEntryCurrency) {
        this.accountEntryCurrency = accountEntryCurrency;
    }

    public String getAccountEntryCurrency() {
        return accountEntryCurrency;
    }

    public void setAccountEntryPurpose(String accountEntryPurpose) {
        this.accountEntryPurpose = accountEntryPurpose;
    }

    public String getAccountEntryPurpose() {
        return accountEntryPurpose;
    }

    public void setAccountEntryValueDate(String accountEntryValueDate) {
        this.accountEntryValueDate = accountEntryValueDate;
    }

    public String getAccountEntryValueDate() {
        return accountEntryValueDate;
    }

    public void setAccountEntryStatus(String accountEntryStatus) {
        this.accountEntryStatus = accountEntryStatus;
    }

    public String getAccountEntryStatus() {
        return accountEntryStatus;
    }
}