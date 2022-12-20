package org.museframework.bian.contacthandler.dto;

public class UpdateHistoryResponse {
    private org.museframework.bian.contacthandler.dto.bq.History history;

    public void setHistory(org.museframework.bian.contacthandler.dto.bq.History history) {
        this.history = history;
    }

    public org.museframework.bian.contacthandler.dto.bq.History getHistory() {
        return history;
    }
}