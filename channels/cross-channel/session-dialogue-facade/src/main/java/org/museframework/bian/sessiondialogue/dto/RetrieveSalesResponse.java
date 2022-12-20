package org.museframework.bian.sessiondialogue.dto;

public class RetrieveSalesResponse {
    private org.museframework.bian.sessiondialogue.dto.bq.Sales sales;

    public void setSales(org.museframework.bian.sessiondialogue.dto.bq.Sales sales) {
        this.sales = sales;
    }

    public org.museframework.bian.sessiondialogue.dto.bq.Sales getSales() {
        return sales;
    }
}