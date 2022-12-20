package org.museframework.bian.conadvser.dto;

public class UpdateFinancialPlanningResponse {
    private org.museframework.bian.conadvser.dto.bq.FinancialPlanning financialPlanning;

    public void setFinancialPlanning(org.museframework.bian.conadvser.dto.bq.FinancialPlanning financialPlanning) {
        this.financialPlanning = financialPlanning;
    }

    public org.museframework.bian.conadvser.dto.bq.FinancialPlanning getFinancialPlanning() {
        return financialPlanning;
    }
}