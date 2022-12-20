package org.museframework.bian.chequeprocessing.dto;

public class RetrieveChequeExceptionHandlingRequest {
    private String chequeprocessingid;

    private String chequeexceptionhandlingid;

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
}