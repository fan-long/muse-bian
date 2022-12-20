/*Instruction to fulfill a Letter of Credit Arrangement*/
package org.museframework.bian.classes;

public class LetterOfCreditInstruction {
    /**/
    private org.museframework.bian.enumerations.Letterofcreditinstructiontypevalues letterOfCreditInstructionType;

    public void setLetterOfCreditInstructionType(org.museframework.bian.enumerations.Letterofcreditinstructiontypevalues letterOfCreditInstructionType) {
        this.letterOfCreditInstructionType = letterOfCreditInstructionType;
    }

    public org.museframework.bian.enumerations.Letterofcreditinstructiontypevalues getLetterOfCreditInstructionType() {
        return letterOfCreditInstructionType;
    }
}