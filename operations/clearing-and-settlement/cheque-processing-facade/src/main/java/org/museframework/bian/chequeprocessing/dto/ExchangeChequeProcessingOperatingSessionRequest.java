package org.museframework.bian.chequeprocessing.dto;

public class ExchangeChequeProcessingOperatingSessionRequest {
    private String chequeprocessingid;

    private org.museframework.bian.chequeprocessing.dto.cr.ChequeProcessingOperatingSession chequeProcessingOperatingSession;

    public void setChequeprocessingid(String chequeprocessingid) {
        this.chequeprocessingid = chequeprocessingid;
    }

    public String getChequeprocessingid() {
        return chequeprocessingid;
    }

    public void setChequeProcessingOperatingSession(org.museframework.bian.chequeprocessing.dto.cr.ChequeProcessingOperatingSession chequeProcessingOperatingSession) {
        this.chequeProcessingOperatingSession = chequeProcessingOperatingSession;
    }

    public org.museframework.bian.chequeprocessing.dto.cr.ChequeProcessingOperatingSession getChequeProcessingOperatingSession() {
        return chequeProcessingOperatingSession;
    }
}