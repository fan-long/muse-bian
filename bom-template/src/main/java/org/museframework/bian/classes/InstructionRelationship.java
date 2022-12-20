/**/
package org.museframework.bian.classes;

public class InstructionRelationship {
    /*Type of relationship between payment instructions.

e.g. "is original": the payment instruction that was the start of the chain of instructions to intermediate payment service providers
e.g. "is fee for": relationship from a fee to the instruction it is a fee for
e.g.: "previous": links succession of instructions in a chain */
    private String instructionRelationshipType;

    public void setInstructionRelationshipType(String instructionRelationshipType) {
        this.instructionRelationshipType = instructionRelationshipType;
    }

    public String getInstructionRelationshipType() {
        return instructionRelationshipType;
    }
}