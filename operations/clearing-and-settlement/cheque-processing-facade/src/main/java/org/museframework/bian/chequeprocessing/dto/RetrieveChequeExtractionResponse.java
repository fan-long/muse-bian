package org.museframework.bian.chequeprocessing.dto;

public class RetrieveChequeExtractionResponse {
    private org.museframework.bian.chequeprocessing.dto.bq.ChequeExtraction chequeExtraction;

    public void setChequeExtraction(org.museframework.bian.chequeprocessing.dto.bq.ChequeExtraction chequeExtraction) {
        this.chequeExtraction = chequeExtraction;
    }

    public org.museframework.bian.chequeprocessing.dto.bq.ChequeExtraction getChequeExtraction() {
        return chequeExtraction;
    }
}