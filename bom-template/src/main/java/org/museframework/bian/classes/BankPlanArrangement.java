/*An Arrangement within the Bank Plan Agreement*/
package org.museframework.bian.classes;

public class BankPlanArrangement {
    /**/
    private org.museframework.bian.enumerations.Arrangementtypevalues bankPlanArrangementType;

    public void setBankPlanArrangementType(org.museframework.bian.enumerations.Arrangementtypevalues bankPlanArrangementType) {
        this.bankPlanArrangementType = bankPlanArrangementType;
    }

    public org.museframework.bian.enumerations.Arrangementtypevalues getBankPlanArrangementType() {
        return bankPlanArrangementType;
    }
}