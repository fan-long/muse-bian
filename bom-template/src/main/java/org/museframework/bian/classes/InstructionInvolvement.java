/**/
package org.museframework.bian.classes;

public class InstructionInvolvement {
    /**/
    private org.museframework.bian.enumerations.Instructioninvolvementtypevalues instructionInvolvementType;

    /**/
    private Party partyReference;

    /**/
    private Instruction instructionReference;

    public void setInstructionInvolvementType(org.museframework.bian.enumerations.Instructioninvolvementtypevalues instructionInvolvementType) {
        this.instructionInvolvementType = instructionInvolvementType;
    }

    public org.museframework.bian.enumerations.Instructioninvolvementtypevalues getInstructionInvolvementType() {
        return instructionInvolvementType;
    }

    public void setPartyReference(Party partyReference) {
        this.partyReference = partyReference;
    }

    public Party getPartyReference() {
        return partyReference;
    }

    public void setInstructionReference(Instruction instructionReference) {
        this.instructionReference = instructionReference;
    }

    public Instruction getInstructionReference() {
        return instructionReference;
    }
}