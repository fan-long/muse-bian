package org.museframework.bian.chequeprocessing.dto;

public class InitiateChequeProcessingOperatingSessionResponse {
    private org.museframework.bian.chequeprocessing.dto.cr.ChequeProcessingOperatingSession chequeProcessingOperatingSession;

    public void setChequeProcessingOperatingSession(org.museframework.bian.chequeprocessing.dto.cr.ChequeProcessingOperatingSession chequeProcessingOperatingSession) {
        this.chequeProcessingOperatingSession = chequeProcessingOperatingSession;
    }

    public org.museframework.bian.chequeprocessing.dto.cr.ChequeProcessingOperatingSession getChequeProcessingOperatingSession() {
        return chequeProcessingOperatingSession;
    }
}