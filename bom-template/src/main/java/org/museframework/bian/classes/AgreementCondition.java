/*Condition is a premise upon which the fulfillment of an agreement depends 

Condition is applied to an instance of an agreement. */
package org.museframework.bian.classes;

public class AgreementCondition {
    /**/
    private org.museframework.bian.enumerations.Agreementconditiontypevalues agreementConditionType;

    /**/
    private Condition conditionReference;

    /**/
    private Agreement agreementReference;

    public void setAgreementConditionType(org.museframework.bian.enumerations.Agreementconditiontypevalues agreementConditionType) {
        this.agreementConditionType = agreementConditionType;
    }

    public org.museframework.bian.enumerations.Agreementconditiontypevalues getAgreementConditionType() {
        return agreementConditionType;
    }

    public void setConditionReference(Condition conditionReference) {
        this.conditionReference = conditionReference;
    }

    public Condition getConditionReference() {
        return conditionReference;
    }

    public void setAgreementReference(Agreement agreementReference) {
        this.agreementReference = agreementReference;
    }

    public Agreement getAgreementReference() {
        return agreementReference;
    }
}