/**/
package org.museframework.bian.classes;

public class Account_AccountRelationship {
    /**/
    private org.museframework.bian.enumerations.Account_Accountrelationshiptypevalues account_AccountRelationshipType;

    /**/
    private Account fromAccount;

    /**/
    private Account toAccount;

    public void setAccount_AccountRelationshipType(org.museframework.bian.enumerations.Account_Accountrelationshiptypevalues account_AccountRelationshipType) {
        this.account_AccountRelationshipType = account_AccountRelationshipType;
    }

    public org.museframework.bian.enumerations.Account_Accountrelationshiptypevalues getAccount_AccountRelationshipType() {
        return account_AccountRelationshipType;
    }

    public void setFromAccount(Account fromAccount) {
        this.fromAccount = fromAccount;
    }

    public Account getFromAccount() {
        return fromAccount;
    }

    public void setToAccount(Account toAccount) {
        this.toAccount = toAccount;
    }

    public Account getToAccount() {
        return toAccount;
    }
}