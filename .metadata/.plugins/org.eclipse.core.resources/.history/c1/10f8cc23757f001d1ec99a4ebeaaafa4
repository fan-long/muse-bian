/*A measuring state on which movements in value or amounts of assets, rights and obligations are registered.

Comment: 
It is a bookkeeping instrument holding the amount or value of something by registering the movements in plus and min when events happen which have an impact on the position.
The term "account" is usually associated to an accounting or bookkeeping concept to hold the financial or stock state of a business concept. An account will typically group the debit and credit entries for a specific aspect of the business resulting from transactions,
Often accounts are represented as a T-account which is a visual aid used to depict an account. Above the top portion of the T would be the account title. On the left-side of the base of the T would be any debit amounts; on the right-side would be the credit amounts.
A commonly used bookkeeping method is the double-entry method. This means that every transaction has at least 2 movements. If a customer pays 100 € in cash, there is
a decrease in the amount that the customer owes to the company (the customer position is decreased)
an increase in the amount that the company has in cash (the cash position is increased)

An account can be assigning to one or more ledgers. A ledger is a group of accounts for a certain purpose. If there is need for multiple ledgers because of multiple purpose, an account can perfectly well assigned to multiple ledgers. When Ledgers are in real physical books, this is not possible. When ledgers are digital, accounts can be grouped into multiple groups at the same time. This practice is very rarely taught into courses for accounting, but in digital accounting, it is common practice.

Examples: 
stock account of a shop, cash register, bank account, financial accounting account, customer account, supplier account, ...
Bank Account BE12 1234 5678 9012: is an individual banking account
Accounts Payable, is a collective account keeping the balance of the amounts to pay by the organisation to its suppliers. The balance is the result of the financial movements related to suppliers. This account is managed usually in a General Ledger 
Supplier Account X, is an individual account keeping the balance of the amounts to pay by the organisation to an individual supplier. The balance is the result of the financial movements related to an individual supplier. This account is managed usually in a sub-ledger.
Stock Account x, is an individual account keeping the balance of the amounts in stock of a specific good.
A payment service to take fund out of an account. */
package org.museframework.bian.classes;

public class Account {
    /*A characteristic of account which refers to the LifecycleStatus of account like opened, closed, blocked, etc.

Specifies the current state of an account. (ISO20022)*/
    private String accountStatus;

    /*The identifier of account like Account Number.*/
    private String accountIdentification;

    /*A characteristic of account which refers to LifecycleDate of account (e.g., ClosingDate, OpeningDate, LiveDate, etc.) */
    private String accountDate;

    /*Specifies the category of account like payment account, loan account, cash account, securities account, etc. */
    private String accountType;

    /**/
    private String accountPurpose;

    /*The state of the obligations managed on the account, the result of all entries on the account.

Numerical representation of the net increases and decreases in an account at a specific point in time. (ISO20022)

Banking: Amount available in an account for withdrawal or use.
Read more: http://www.businessdictionary.com/definition/balance.html

Bookkeeping: Difference between the debit and credit sides of an account.
Read more: http://www.businessdictionary.com/definition/balance.html*/
    private String accountBalance;

    /**/
    private String accountCurrency;

    /*A detailed explanation or commentary of account. 
*/
    private String accountDescription;

    public void setAccountStatus(String accountStatus) {
        this.accountStatus = accountStatus;
    }

    public String getAccountStatus() {
        return accountStatus;
    }

    public void setAccountIdentification(String accountIdentification) {
        this.accountIdentification = accountIdentification;
    }

    public String getAccountIdentification() {
        return accountIdentification;
    }

    public void setAccountDate(String accountDate) {
        this.accountDate = accountDate;
    }

    public String getAccountDate() {
        return accountDate;
    }

    public void setAccountType(String accountType) {
        this.accountType = accountType;
    }

    public String getAccountType() {
        return accountType;
    }

    public void setAccountPurpose(String accountPurpose) {
        this.accountPurpose = accountPurpose;
    }

    public String getAccountPurpose() {
        return accountPurpose;
    }

    public void setAccountBalance(String accountBalance) {
        this.accountBalance = accountBalance;
    }

    public String getAccountBalance() {
        return accountBalance;
    }

    public void setAccountCurrency(String accountCurrency) {
        this.accountCurrency = accountCurrency;
    }

    public String getAccountCurrency() {
        return accountCurrency;
    }

    public void setAccountDescription(String accountDescription) {
        this.accountDescription = accountDescription;
    }

    public String getAccountDescription() {
        return accountDescription;
    }
}