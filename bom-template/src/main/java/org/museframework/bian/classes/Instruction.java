/*A request to do something. */
package org.museframework.bian.classes;

public class Instruction {
    /**/
    private String instructionDate;

    /*A characteristic of instruction which refers to the LifecycleStatus of instruction (e.g., requested, executed, fulfilled, etc.); */
    private String instructionStatus;

    /*An identifier that allows to uniquely refer to an instance of an Instruction.
*/
    private String instructionIdentifier;

    /*Classification Value classifying the instruction according to the "type of action" to be applied to a subject matter.

examples: payment instruction, withdrawal instruction, blocking instruction, accounting instruction, sending instruction, purchase instruction blocked deposit, a blocked securities portfolio, pawn, etc.*/
    private org.museframework.bian.enumerations.Instructiontypevalues instructionType;

    /**/
    private String instructionResult;

    /**/
    private String instructionDescription;

    /**/
    private Log instructionLog;

    /**/
    private String instructionPurpose;

    public void setInstructionDate(String instructionDate) {
        this.instructionDate = instructionDate;
    }

    public String getInstructionDate() {
        return instructionDate;
    }

    public void setInstructionStatus(String instructionStatus) {
        this.instructionStatus = instructionStatus;
    }

    public String getInstructionStatus() {
        return instructionStatus;
    }

    public void setInstructionIdentifier(String instructionIdentifier) {
        this.instructionIdentifier = instructionIdentifier;
    }

    public String getInstructionIdentifier() {
        return instructionIdentifier;
    }

    public void setInstructionType(org.museframework.bian.enumerations.Instructiontypevalues instructionType) {
        this.instructionType = instructionType;
    }

    public org.museframework.bian.enumerations.Instructiontypevalues getInstructionType() {
        return instructionType;
    }

    public void setInstructionResult(String instructionResult) {
        this.instructionResult = instructionResult;
    }

    public String getInstructionResult() {
        return instructionResult;
    }

    public void setInstructionDescription(String instructionDescription) {
        this.instructionDescription = instructionDescription;
    }

    public String getInstructionDescription() {
        return instructionDescription;
    }

    public void setInstructionLog(Log instructionLog) {
        this.instructionLog = instructionLog;
    }

    public Log getInstructionLog() {
        return instructionLog;
    }

    public void setInstructionPurpose(String instructionPurpose) {
        this.instructionPurpose = instructionPurpose;
    }

    public String getInstructionPurpose() {
        return instructionPurpose;
    }
}