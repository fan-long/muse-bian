/*The role of an account in a payment instruction */
package org.museframework.bian.classes;

public class InstructionAccountRole {
    /*The use made of an account in an instruction.*/
    private String accountInstructionRole;

    /*Reference to the instruction that makes use of the account.*/
    private String instructionReference;

    /*Reference to the account used in the instruction.*/
    private String instructionAccountReference;

    public void setAccountInstructionRole(String accountInstructionRole) {
        this.accountInstructionRole = accountInstructionRole;
    }

    public String getAccountInstructionRole() {
        return accountInstructionRole;
    }

    public void setInstructionReference(String instructionReference) {
        this.instructionReference = instructionReference;
    }

    public String getInstructionReference() {
        return instructionReference;
    }

    public void setInstructionAccountReference(String instructionAccountReference) {
        this.instructionAccountReference = instructionAccountReference;
    }

    public String getInstructionAccountReference() {
        return instructionAccountReference;
    }
}