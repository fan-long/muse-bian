/*An service arrangement which specifies the acceptance of deposits, accompanied by the modalities to deposit money. 


An arrangement in which a lender gives money or property to a borrower, and the borrower agrees to return the property or repay the money, usually along with interest, at some future point(s) in time. (ISO20022)
*/
package org.museframework.bian.classes;

public class DepositServiceArrangement {
    /*Type of an arranged deposit. 

The type of deposit transaction that can be applied to the account (e.g. customer deposit, internal credit, funding, ...)*/
    private String depositType;

    /*A limit imposed to the facility to deposit funds

e.g. minimum deposit of 500€, maximum of 5000 per year, maximum balance of 500 000€This is the actual "value" that has to be used in "the algorithm depicted by the "type". */
    private String depositLimit;

    /*Type of limit imposed on a deposit facility

e.g. maximum amount per deposit or per periodThis is "the algorithm"*/
    private String depositLimitType;

    public void setDepositType(String depositType) {
        this.depositType = depositType;
    }

    public String getDepositType() {
        return depositType;
    }

    public void setDepositLimit(String depositLimit) {
        this.depositLimit = depositLimit;
    }

    public String getDepositLimit() {
        return depositLimit;
    }

    public void setDepositLimitType(String depositLimitType) {
        this.depositLimitType = depositLimitType;
    }

    public String getDepositLimitType() {
        return depositLimitType;
    }
}