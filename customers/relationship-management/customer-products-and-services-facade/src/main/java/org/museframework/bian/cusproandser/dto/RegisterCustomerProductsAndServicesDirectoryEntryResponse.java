package org.museframework.bian.cusproandser.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class RegisterCustomerProductsAndServicesDirectoryEntryResponse {
    @MetaField(ref=true)
    private org.museframework.bian.cusproandser.dto.cr.CustomerProductsAndServicesDirectoryEntry customerProductsAndServicesDirectoryEntry;

    public void setCustomerProductsAndServicesDirectoryEntry(org.museframework.bian.cusproandser.dto.cr.CustomerProductsAndServicesDirectoryEntry customerProductsAndServicesDirectoryEntry) {
        this.customerProductsAndServicesDirectoryEntry = customerProductsAndServicesDirectoryEntry;
    }

    public org.museframework.bian.cusproandser.dto.cr.CustomerProductsAndServicesDirectoryEntry getCustomerProductsAndServicesDirectoryEntry() {
        return customerProductsAndServicesDirectoryEntry;
    }
}