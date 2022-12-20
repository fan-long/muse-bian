package org.museframework.bian.productdirectory.dto;

public class RegisterProductDirectoryEntryResponse {
    private org.museframework.bian.productdirectory.dto.cr.ProductDirectoryEntry productDirectoryEntry;

    public void setProductDirectoryEntry(org.museframework.bian.productdirectory.dto.cr.ProductDirectoryEntry productDirectoryEntry) {
        this.productDirectoryEntry = productDirectoryEntry;
    }

    public org.museframework.bian.productdirectory.dto.cr.ProductDirectoryEntry getProductDirectoryEntry() {
        return productDirectoryEntry;
    }
}