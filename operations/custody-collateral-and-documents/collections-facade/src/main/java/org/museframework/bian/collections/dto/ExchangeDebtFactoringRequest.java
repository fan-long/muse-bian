package org.museframework.bian.collections.dto;

public class ExchangeDebtFactoringRequest {
    private String collectionsid;

    private String debtfactoringid;

    private org.museframework.bian.collections.dto.bq.DebtFactoring debtFactoring;

    public void setCollectionsid(String collectionsid) {
        this.collectionsid = collectionsid;
    }

    public String getCollectionsid() {
        return collectionsid;
    }

    public void setDebtfactoringid(String debtfactoringid) {
        this.debtfactoringid = debtfactoringid;
    }

    public String getDebtfactoringid() {
        return debtfactoringid;
    }

    public void setDebtFactoring(org.museframework.bian.collections.dto.bq.DebtFactoring debtFactoring) {
        this.debtFactoring = debtFactoring;
    }

    public org.museframework.bian.collections.dto.bq.DebtFactoring getDebtFactoring() {
        return debtFactoring;
    }
}