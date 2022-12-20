/*A specific credit profile or credit report stating the creditability of a specific banking relation.

A credit position can impact decisions with regard to accept/reject offerings or pricing of product agreements. */
package org.museframework.bian.classes;

public class CreditPosition {
    /*The attribute value of Credit Position Type, specifies the kind of Credit Position for this occurrence of Credit Position.

The concept "Credit Position Type" is A Classification Hierarchy that distinguishes between Credit Positions according to "some" viewpoint. 

Viewpoints can be imposed by regulations, managerial ratios, ...*/
    private org.museframework.bian.enumerations.Creditpositiontypevalues creditPositionType;

    /*A calculated minimum or maximum credit position expressed in an amount or ratio.
*/
    private String creditLimitValue;

    /*A judgement of a credit position*/
    private Assessment creditPositionEvaluation;

    public void setCreditPositionType(org.museframework.bian.enumerations.Creditpositiontypevalues creditPositionType) {
        this.creditPositionType = creditPositionType;
    }

    public org.museframework.bian.enumerations.Creditpositiontypevalues getCreditPositionType() {
        return creditPositionType;
    }

    public void setCreditLimitValue(String creditLimitValue) {
        this.creditLimitValue = creditLimitValue;
    }

    public String getCreditLimitValue() {
        return creditLimitValue;
    }

    public void setCreditPositionEvaluation(Assessment creditPositionEvaluation) {
        this.creditPositionEvaluation = creditPositionEvaluation;
    }

    public Assessment getCreditPositionEvaluation() {
        return creditPositionEvaluation;
    }
}