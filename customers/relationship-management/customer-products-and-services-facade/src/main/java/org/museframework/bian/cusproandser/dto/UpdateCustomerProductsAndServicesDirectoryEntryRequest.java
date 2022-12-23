package org.museframework.bian.cusproandser.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class UpdateCustomerProductsAndServicesDirectoryEntryRequest {
    @MetaField
    private String customerproductsandservicesid;

    @MetaField(ref=true)
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