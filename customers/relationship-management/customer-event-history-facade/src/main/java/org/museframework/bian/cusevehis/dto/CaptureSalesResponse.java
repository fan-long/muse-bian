package org.museframework.bian.cusevehis.dto;

public class CaptureSalesResponse {
    private org.museframework.bian.cusevehis.dto.bq.Sales sales;

    public void setSales(org.museframework.bian.cusevehis.dto.bq.Sales sales) {
        this.sales = sales;
    }

    public org.museframework.bian.cusevehis.dto.bq.Sales getSales() {
        return sales;
    }
}