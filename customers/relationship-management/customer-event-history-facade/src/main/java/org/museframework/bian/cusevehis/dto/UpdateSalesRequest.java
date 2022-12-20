package org.museframework.bian.cusevehis.dto;

public class UpdateSalesRequest {
    private String customereventhistoryid;

    private String salesid;

    private org.museframework.bian.cusevehis.dto.bq.Sales sales;

    public void setCustomereventhistoryid(String customereventhistoryid) {
        this.customereventhistoryid = customereventhistoryid;
    }

    public String getCustomereventhistoryid() {
        return customereventhistoryid;
    }

    public void setSalesid(String salesid) {
        this.salesid = salesid;
    }

    public String getSalesid() {
        return salesid;
    }

    public void setSales(org.museframework.bian.cusevehis.dto.bq.Sales sales) {
        this.sales = sales;
    }

    public org.museframework.bian.cusevehis.dto.bq.Sales getSales() {
        return sales;
    }
}