/*The product features/services available with a financical facility*/
package org.museframework.bian.corbanope.dto.bq;

public class Reconciliation {
    /*Reference to the correspondent reconciliation task*/
    private org.museframework.bian.classes.Object correspondentBankReconciliationTaskReference;

    /*Work documentation, accounts and transaction details produced and referenced during the reconciliation*/
    private String correspondentBankReconciliationTaskWorkProducts;

    /*Description of the resolution tasks agreed to reconcile*/
    private String correspondentBankReconciliationTaskResult;

    public void setCorrespondentBankReconciliationTaskReference(org.museframework.bian.classes.Object correspondentBankReconciliationTaskReference) {
        this.correspondentBankReconciliationTaskReference = correspondentBankReconciliationTaskReference;
    }

    public org.museframework.bian.classes.Object getCorrespondentBankReconciliationTaskReference() {
        return correspondentBankReconciliationTaskReference;
    }

    public void setCorrespondentBankReconciliationTaskWorkProducts(String correspondentBankReconciliationTaskWorkProducts) {
        this.correspondentBankReconciliationTaskWorkProducts = correspondentBankReconciliationTaskWorkProducts;
    }

    public String getCorrespondentBankReconciliationTaskWorkProducts() {
        return correspondentBankReconciliationTaskWorkProducts;
    }

    public void setCorrespondentBankReconciliationTaskResult(String correspondentBankReconciliationTaskResult) {
        this.correspondentBankReconciliationTaskResult = correspondentBankReconciliationTaskResult;
    }

    public String getCorrespondentBankReconciliationTaskResult() {
        return correspondentBankReconciliationTaskResult;
    }
}