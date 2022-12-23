package org.museframework.bian.productdirectory.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class UpdateProductDirectoryEntryRequest {
    @MetaField
    private String productdirectoryid;

    @MetaField(ref=true)
    private org.museframework.bian.productdirectory.dto.cr.ProductDirectoryEntry productDirectoryEntry;

    public void setProductdirectoryid(String productdirectoryid) {
        this.productdirectoryid = productdirectoryid;
    }

    public String getProductdirectoryid() {
        return productdirectoryid;
    }

    public void setProductDirectoryEntry(org.museframework.bian.productdirectory.dto.cr.ProductDirectoryEntry productDirectoryEntry) {
        this.productDirectoryEntry = productDirectoryEntry;
    }

    public org.museframework.bian.productdirectory.dto.cr.ProductDirectoryEntry getProductDirectoryEntry() {
        return productDirectoryEntry;
    }
}