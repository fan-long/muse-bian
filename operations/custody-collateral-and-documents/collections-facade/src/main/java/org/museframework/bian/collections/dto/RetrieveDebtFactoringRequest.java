package org.museframework.bian.collections.dto;

public class RetrieveDebtFactoringRequest {
    private String collectionsid;

    private String debtfactoringid;

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
}