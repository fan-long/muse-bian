package org.museframework.bian.chequeprocessing.dto;

public class UpdateChequeExceptionHandlingRequest {
    private String chequeprocessingid;

    private String chequeexceptionhandlingid;

    private org.museframework.bian.chequeprocessing.dto.bq.ChequeExceptionHandling chequeExceptionHandling;

    public void setChequeprocessingid(String chequeprocessingid) {
        this.chequeprocessingid = chequeprocessingid;
    }

    public String getChequeprocessingid() {
        return chequeprocessingid;
    }

    public void setChequeexceptionhandlingid(String chequeexceptionhandlingid) {
        this.chequeexceptionhandlingid = chequeexceptionhandlingid;
    }

    public String getChequeexceptionhandlingid() {
        return chequeexceptionhandlingid;
    }

    public void setChequeExceptionHandling(org.museframework.bian.chequeprocessing.dto.bq.ChequeExceptionHandling chequeExceptionHandling) {
        this.chequeExceptionHandling = chequeExceptionHandling;
    }

    public org.museframework.bian.chequeprocessing.dto.bq.ChequeExceptionHandling getChequeExceptionHandling() {
        return chequeExceptionHandling;
    }
}