package org.museframework.bian.atmnetope.dto;

public class RetrieveFinancialDocumentHandlingResponse {
    private org.museframework.bian.atmnetope.dto.bq.FinancialDocumentHandling financialDocumentHandling;

    public void setFinancialDocumentHandling(org.museframework.bian.atmnetope.dto.bq.FinancialDocumentHandling financialDocumentHandling) {
        this.financialDocumentHandling = financialDocumentHandling;
    }

    public org.museframework.bian.atmnetope.dto.bq.FinancialDocumentHandling getFinancialDocumentHandling() {
        return financialDocumentHandling;
    }
}