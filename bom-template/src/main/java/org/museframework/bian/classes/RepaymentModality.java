/*The specification of the set of parameters used to calculate a repayment amount.*/
package org.museframework.bian.classes;

public class RepaymentModality {
    /*Timing modality for repayment.*/
    private String repaymentSchedule;

    /**/
    private org.museframework.bian.enumerations.Modalitytypevalues repaymentModalityType;

    public void setRepaymentSchedule(String repaymentSchedule) {
        this.repaymentSchedule = repaymentSchedule;
    }

    public String getRepaymentSchedule() {
        return repaymentSchedule;
    }

    public void setRepaymentModalityType(org.museframework.bian.enumerations.Modalitytypevalues repaymentModalityType) {
        this.repaymentModalityType = repaymentModalityType;
    }

    public org.museframework.bian.enumerations.Modalitytypevalues getRepaymentModalityType() {
        return repaymentModalityType;
    }
}