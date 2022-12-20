package org.museframework.bian.chequeprocessing.dto;

public class UpdateChequeExceptionHandlingResponse {
    private org.museframework.bian.chequeprocessing.dto.bq.ChequeExceptionHandling chequeExceptionHandling;

    public void setChequeExceptionHandling(org.museframework.bian.chequeprocessing.dto.bq.ChequeExceptionHandling chequeExceptionHandling) {
        this.chequeExceptionHandling = chequeExceptionHandling;
    }

    public org.museframework.bian.chequeprocessing.dto.bq.ChequeExceptionHandling getChequeExceptionHandling() {
        return chequeExceptionHandling;
    }
}