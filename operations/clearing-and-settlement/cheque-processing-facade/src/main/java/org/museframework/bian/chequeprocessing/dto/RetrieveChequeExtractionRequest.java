package org.museframework.bian.chequeprocessing.dto;

public class RetrieveChequeExtractionRequest {
    private String chequeprocessingid;

    private String chequeextractionid;

    public void setChequeprocessingid(String chequeprocessingid) {
        this.chequeprocessingid = chequeprocessingid;
    }

    public String getChequeprocessingid() {
        return chequeprocessingid;
    }

    public void setChequeextractionid(String chequeextractionid) {
        this.chequeextractionid = chequeextractionid;
    }

    public String getChequeextractionid() {
        return chequeextractionid;
    }
}