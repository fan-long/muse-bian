/*Party that manages the account on behalf of the account owner, that is manages the registration and booking of entries on the account, calculates balances on the account and provides information about the account. (ISO20022)*/
package org.museframework.bian.classes;

public class AccountServicer {
    /*Identifier of party who plays the role of account servicer.*/
    private String accountServicerIdentifier;

    public void setAccountServicerIdentifier(String accountServicerIdentifier) {
        this.accountServicerIdentifier = accountServicerIdentifier;
    }

    public String getAccountServicerIdentifier() {
        return accountServicerIdentifier;
    }
}