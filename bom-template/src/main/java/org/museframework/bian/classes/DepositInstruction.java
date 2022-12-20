/*A financial instruction to fulfill a deposit service arrangement.

An instruction to place money on an account.*/
package org.museframework.bian.classes;

public class DepositInstruction {
    /*Reference to how, by whom and in what "materialization" the deposit is performed? 

e.g. by cheque, in cash
*/
    private String depositSourceReference;

    /*Type of an applied deposit

e.g. conditional awaiting confirmation of a cheque*/
    private String depositType;

    /*Information about the purpose or other reference information accompanying the deposit
*/
    private String depositMessage;

    /*the deposited amount*/
    private String depositAmount;

    /*The Date on which the deposit is initiated*/
    private String depositInstructionDate;

    public void setDepositSourceReference(String depositSourceReference) {
        this.depositSourceReference = depositSourceReference;
    }

    public String getDepositSourceReference() {
        return depositSourceReference;
    }

    public void setDepositType(String depositType) {
        this.depositType = depositType;
    }

    public String getDepositType() {
        return depositType;
    }

    public void setDepositMessage(String depositMessage) {
        this.depositMessage = depositMessage;
    }

    public String getDepositMessage() {
        return depositMessage;
    }

    public void setDepositAmount(String depositAmount) {
        this.depositAmount = depositAmount;
    }

    public String getDepositAmount() {
        return depositAmount;
    }

    public void setDepositInstructionDate(String depositInstructionDate) {
        this.depositInstructionDate = depositInstructionDate;
    }

    public String getDepositInstructionDate() {
        return depositInstructionDate;
    }
}