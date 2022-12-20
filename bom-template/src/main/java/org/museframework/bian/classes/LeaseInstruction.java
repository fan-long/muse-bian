/*An instruction to fulfil a leasing arrangement */
package org.museframework.bian.classes;

public class LeaseInstruction {
    /**/
    private String leasingInstructionType;

    public void setLeasingInstructionType(String leasingInstructionType) {
        this.leasingInstructionType = leasingInstructionType;
    }

    public String getLeasingInstructionType() {
        return leasingInstructionType;
    }
}