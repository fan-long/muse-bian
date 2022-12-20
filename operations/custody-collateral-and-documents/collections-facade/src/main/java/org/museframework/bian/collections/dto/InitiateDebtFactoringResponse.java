package org.museframework.bian.collections.dto;

public class InitiateDebtFactoringResponse {
    private org.museframework.bian.collections.dto.bq.DebtFactoring debtFactoring;

    public void setDebtFactoring(org.museframework.bian.collections.dto.bq.DebtFactoring debtFactoring) {
        this.debtFactoring = debtFactoring;
    }

    public org.museframework.bian.collections.dto.bq.DebtFactoring getDebtFactoring() {
        return debtFactoring;
    }
}