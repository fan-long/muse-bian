package org.museframework.bian.poiofser.dto;

public class ExecuteCashPositionResponse {
    private org.museframework.bian.poiofser.dto.bq.CashPosition cashPosition;

    public void setCashPosition(org.museframework.bian.poiofser.dto.bq.CashPosition cashPosition) {
        this.cashPosition = cashPosition;
    }

    public org.museframework.bian.poiofser.dto.bq.CashPosition getCashPosition() {
        return cashPosition;
    }
}