package org.museframework.bian.sessiondialogue.dto;

public class UpdateHistoryResponse {
    private org.museframework.bian.sessiondialogue.dto.bq.History history;

    public void setHistory(org.museframework.bian.sessiondialogue.dto.bq.History history) {
        this.history = history;
    }

    public org.museframework.bian.sessiondialogue.dto.bq.History getHistory() {
        return history;
    }
}