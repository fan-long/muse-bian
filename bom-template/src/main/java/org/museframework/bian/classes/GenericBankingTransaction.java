/*Event of exchanging or movement of items or rights.*/
package org.museframework.bian.classes;

public class GenericBankingTransaction {
    /*Base currency of transaction. */
    private String baseCurrency;

    /*Amount of banking transaction.*/
    private String amount;

    /*The status of transaction.*/
    private String status;

    /**/
    private String dateType;

    /**/
    private String date;

    /**/
    private String priority;

    /**/
    private String type;

    /**/
    private String description;

    /**/
    private String appliedFee;

    /**/
    private String appliedRate;

    public void setBaseCurrency(String baseCurrency) {
        this.baseCurrency = baseCurrency;
    }

    public String getBaseCurrency() {
        return baseCurrency;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    public String getAmount() {
        return amount;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getStatus() {
        return status;
    }

    public void setDateType(String dateType) {
        this.dateType = dateType;
    }

    public String getDateType() {
        return dateType;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getDate() {
        return date;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }

    public String getPriority() {
        return priority;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setAppliedFee(String appliedFee) {
        this.appliedFee = appliedFee;
    }

    public String getAppliedFee() {
        return appliedFee;
    }

    public void setAppliedRate(String appliedRate) {
        this.appliedRate = appliedRate;
    }

    public String getAppliedRate() {
        return appliedRate;
    }
}