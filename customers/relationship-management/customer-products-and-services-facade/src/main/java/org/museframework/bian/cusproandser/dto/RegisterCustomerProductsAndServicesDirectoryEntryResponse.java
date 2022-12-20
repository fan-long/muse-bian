package org.museframework.bian.cusproandser.dto;

public class RegisterCustomerProductsAndServicesDirectoryEntryResponse {
    private org.museframework.bian.cusproandser.dto.cr.CustomerProductsAndServicesDirectoryEntry customerProductsAndServicesDirectoryEntry;

    public void setCustomerProductsAndServicesDirectoryEntry(org.museframework.bian.cusproandser.dto.cr.CustomerProductsAndServicesDirectoryEntry customerProductsAndServicesDirectoryEntry) {
        this.customerProductsAndServicesDirectoryEntry = customerProductsAndServicesDirectoryEntry;
    }

    public org.museframework.bian.cusproandser.dto.cr.CustomerProductsAndServicesDirectoryEntry getCustomerProductsAndServicesDirectoryEntry() {
        return customerProductsAndServicesDirectoryEntry;
    }
}