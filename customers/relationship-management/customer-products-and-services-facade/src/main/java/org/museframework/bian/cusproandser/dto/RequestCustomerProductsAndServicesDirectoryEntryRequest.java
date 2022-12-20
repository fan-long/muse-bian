package org.museframework.bian.cusproandser.dto;

public class RequestCustomerProductsAndServicesDirectoryEntryRequest {
    private String customerproductsandservicesid;

    private org.museframework.bian.cusproandser.dto.cr.CustomerProductsAndServicesDirectoryEntry customerProductsAndServicesDirectoryEntry;

    public void setCustomerproductsandservicesid(String customerproductsandservicesid) {
        this.customerproductsandservicesid = customerproductsandservicesid;
    }

    public String getCustomerproductsandservicesid() {
        return customerproductsandservicesid;
    }

    public void setCustomerProductsAndServicesDirectoryEntry(org.museframework.bian.cusproandser.dto.cr.CustomerProductsAndServicesDirectoryEntry customerProductsAndServicesDirectoryEntry) {
        this.customerProductsAndServicesDirectoryEntry = customerProductsAndServicesDirectoryEntry;
    }

    public org.museframework.bian.cusproandser.dto.cr.CustomerProductsAndServicesDirectoryEntry getCustomerProductsAndServicesDirectoryEntry() {
        return customerProductsAndServicesDirectoryEntry;
    }
}