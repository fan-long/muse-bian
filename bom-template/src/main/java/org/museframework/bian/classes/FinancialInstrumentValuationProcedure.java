/*A procedure that provides a range of financial asset valuation services/worksteps*/
package org.museframework.bian.classes;

public class FinancialInstrumentValuationProcedure {
    /**/
    private Workstep financialInstrumentValuationProcedureWorkstep;

    /**/
    private org.museframework.bian.enumerations.Financialinstrumentvaluationprocedureworksteptype financialInstrumentValuationProcedureWorkstepType;

    public void setFinancialInstrumentValuationProcedureWorkstep(Workstep financialInstrumentValuationProcedureWorkstep) {
        this.financialInstrumentValuationProcedureWorkstep = financialInstrumentValuationProcedureWorkstep;
    }

    public Workstep getFinancialInstrumentValuationProcedureWorkstep() {
        return financialInstrumentValuationProcedureWorkstep;
    }

    public void setFinancialInstrumentValuationProcedureWorkstepType(org.museframework.bian.enumerations.Financialinstrumentvaluationprocedureworksteptype financialInstrumentValuationProcedureWorkstepType) {
        this.financialInstrumentValuationProcedureWorkstepType = financialInstrumentValuationProcedureWorkstepType;
    }

    public org.museframework.bian.enumerations.Financialinstrumentvaluationprocedureworksteptype getFinancialInstrumentValuationProcedureWorkstepType() {
        return financialInstrumentValuationProcedureWorkstepType;
    }
}