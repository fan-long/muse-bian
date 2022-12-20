/*The product features/services available with a financical facility*/
package org.museframework.bian.investmentaccount.dto.bq;

public class DepositsandWithdrawals {
    /*The type of securities deposit transaction that can be applied to the investment account (e.g. immediate, scheduled, earmarked)*/
    private String securitiesDepositType;

    /*The type of securities withdrawal transaction that can be applied to the account (e.g. immediate, scheduled, earmarked)*/
    private String securitiesWithdrawalType;

    /*Details of the securities deposit transaction*/
    private String securitiesDepositTransaction;

    /*Identifies the source of the deposit*/
    private org.museframework.bian.classes.Object securitiesDepositTransactionSourceReference;

    /*The type of securities deposit made with the transaction*/
    private String securitiesDepositTransactionDepositType;

    /*Any necessary details describing the purpose or reference properties of the deposit*/
    private String securitiesDepositTransactionDescription;

    /*The volume or value of securities deposited*/
    private String securitiesDepositTransactionAmount;

    /*The date and time the deposit was initiated*/
    private String securitiesDepositTransactionDate;

    /*Details of the securities withdrawal transaction*/
    private String securitiesWithdrawalTransaction;

    /*Identifies the target for the withdrawal*/
    private org.museframework.bian.classes.Object securitiesWithdrawalTransactionSourceReference;

    /*The type of securities withdrawal made with the transaction*/
    private String securitiesWithdrawalTransactionWithdrawalType;

    /*Any necessary details describing the purpose or reference properties of the withdrawal*/
    private String securitiesWithdrawalTransactionDescription;

    /*The volume or value of the withdrawn securities*/
    private String securitiesWithdrawalTransactionAmount;

    /*The date and time the withdrawal was initiated*/
    private String securitiesWithdrawalTransactionDate;

    public void setSecuritiesDepositType(String securitiesDepositType) {
        this.securitiesDepositType = securitiesDepositType;
    }

    public String getSecuritiesDepositType() {
        return securitiesDepositType;
    }

    public void setSecuritiesWithdrawalType(String securitiesWithdrawalType) {
        this.securitiesWithdrawalType = securitiesWithdrawalType;
    }

    public String getSecuritiesWithdrawalType() {
        return securitiesWithdrawalType;
    }

    public void setSecuritiesDepositTransaction(String securitiesDepositTransaction) {
        this.securitiesDepositTransaction = securitiesDepositTransaction;
    }

    public String getSecuritiesDepositTransaction() {
        return securitiesDepositTransaction;
    }

    public void setSecuritiesDepositTransactionSourceReference(org.museframework.bian.classes.Object securitiesDepositTransactionSourceReference) {
        this.securitiesDepositTransactionSourceReference = securitiesDepositTransactionSourceReference;
    }

    public org.museframework.bian.classes.Object getSecuritiesDepositTransactionSourceReference() {
        return securitiesDepositTransactionSourceReference;
    }

    public void setSecuritiesDepositTransactionDepositType(String securitiesDepositTransactionDepositType) {
        this.securitiesDepositTransactionDepositType = securitiesDepositTransactionDepositType;
    }

    public String getSecuritiesDepositTransactionDepositType() {
        return securitiesDepositTransactionDepositType;
    }

    public void setSecuritiesDepositTransactionDescription(String securitiesDepositTransactionDescription) {
        this.securitiesDepositTransactionDescription = securitiesDepositTransactionDescription;
    }

    public String getSecuritiesDepositTransactionDescription() {
        return securitiesDepositTransactionDescription;
    }

    public void setSecuritiesDepositTransactionAmount(String securitiesDepositTransactionAmount) {
        this.securitiesDepositTransactionAmount = securitiesDepositTransactionAmount;
    }

    public String getSecuritiesDepositTransactionAmount() {
        return securitiesDepositTransactionAmount;
    }

    public void setSecuritiesDepositTransactionDate(String securitiesDepositTransactionDate) {
        this.securitiesDepositTransactionDate = securitiesDepositTransactionDate;
    }

    public String getSecuritiesDepositTransactionDate() {
        return securitiesDepositTransactionDate;
    }

    public void setSecuritiesWithdrawalTransaction(String securitiesWithdrawalTransaction) {
        this.securitiesWithdrawalTransaction = securitiesWithdrawalTransaction;
    }

    public String getSecuritiesWithdrawalTransaction() {
        return securitiesWithdrawalTransaction;
    }

    public void setSecuritiesWithdrawalTransactionSourceReference(org.museframework.bian.classes.Object securitiesWithdrawalTransactionSourceReference) {
        this.securitiesWithdrawalTransactionSourceReference = securitiesWithdrawalTransactionSourceReference;
    }

    public org.museframework.bian.classes.Object getSecuritiesWithdrawalTransactionSourceReference() {
        return securitiesWithdrawalTransactionSourceReference;
    }

    public void setSecuritiesWithdrawalTransactionWithdrawalType(String securitiesWithdrawalTransactionWithdrawalType) {
        this.securitiesWithdrawalTransactionWithdrawalType = securitiesWithdrawalTransactionWithdrawalType;
    }

    public String getSecuritiesWithdrawalTransactionWithdrawalType() {
        return securitiesWithdrawalTransactionWithdrawalType;
    }

    public void setSecuritiesWithdrawalTransactionDescription(String securitiesWithdrawalTransactionDescription) {
        this.securitiesWithdrawalTransactionDescription = securitiesWithdrawalTransactionDescription;
    }

    public String getSecuritiesWithdrawalTransactionDescription() {
        return securitiesWithdrawalTransactionDescription;
    }

    public void setSecuritiesWithdrawalTransactionAmount(String securitiesWithdrawalTransactionAmount) {
        this.securitiesWithdrawalTransactionAmount = securitiesWithdrawalTransactionAmount;
    }

    public String getSecuritiesWithdrawalTransactionAmount() {
        return securitiesWithdrawalTransactionAmount;
    }

    public void setSecuritiesWithdrawalTransactionDate(String securitiesWithdrawalTransactionDate) {
        this.securitiesWithdrawalTransactionDate = securitiesWithdrawalTransactionDate;
    }

    public String getSecuritiesWithdrawalTransactionDate() {
        return securitiesWithdrawalTransactionDate;
    }
}